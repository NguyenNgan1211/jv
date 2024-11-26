
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.News;

public class newsDAO {

    public List<News> getNewsAll() {
        List<News> list = new ArrayList<>();
        String sql = "SELECT * FROM news";
        
        // Use try-with-resources to manage resources
        try (Connection connection = DBContext.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int newsid = rs.getInt("newsid");
                String newstitle = rs.getString("newstitle");
                String newscontent = rs.getString("newscontent");
                int authorid = rs.getInt("authorid");
                int menuid = rs.getInt("menuid");
                String image = rs.getString("image");
                News m = new News(newsid, newstitle, newscontent,authorid,menuid,image);
                list.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static void main(String[] args) {
    	newsDAO dao = new newsDAO();
		List<News> cate = dao.getNewsAll();
		for (News news : cate) {
			System.out.println(news);
		}

	}
    
}