
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Menu;

public class menuDAO {

    public List<Menu> getMenuAll() {
        List<Menu> list = new ArrayList<>();
        String sql = "SELECT * FROM menu";
        
<<<<<<< HEAD
        // Use try-with-resources to manage resources
=======
      
>>>>>>> 39d0ee0 (aa)
        try (Connection connection = DBContext.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int menuid = rs.getInt("menuid");
                String menuname = rs.getString("menuname");
                String menudescription = rs.getString("menudescription");
                Menu m = new Menu(menuid, menuname, menudescription);
                list.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
<<<<<<< HEAD
        return list;
    }
    public Menu  getMenuById(int menuid) {
    	String sql = "select * from `menu`"+
    "where `menuid` = ?";
=======
        
        return list;
    }
    public Menu  getMenuById(int menuid) {
    	String sql = "select * from 'menu'"+
    "where 'id' = ?";
>>>>>>> 39d0ee0 (aa)
    	try {Connection connection = DBContext.getConnection();
    		PreparedStatement ps = connection.prepareStatement(sql);
    		ps.setInt(1,menuid);
    		ResultSet rs = ps.executeQuery();
    		if(rs.next()) {
    			String menuname, menudescription;
    			menuname = rs.getString("menuname");
    			menudescription = rs.getString("menudescription");
    			Menu m = new Menu(menuid,menuname,menudescription);
    			return m; 
    		}
    		
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	return null;
    }
    public void insert(String menuname,String menudescription) {
    	String sql ="INSERT INTO `menu`( `menuname`, `menudescription`) VALUES (?,?)";
    	try {Connection connection = DBContext.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1,menuname);
		ps.setString(2,menudescription);
		ps.executeUpdate();
		

    		
    	}catch(SQLException e) {
    		e.printStackTrace();

    	}
    }
    
    public void update(Menu m) {
<<<<<<< HEAD
    	String sql ="update  `menu`  \r\n"+
    		    "set `menuname` = ?, `menudescription` = ? \r\n"
    			+"where menuid = ?;";
=======
    	String sql ="update  'menu'  \r\n"+
    		    "set 'menuname' = ?, 'menudescription' = ? \r\n"
    			+"where id = ?;";
>>>>>>> 39d0ee0 (aa)
    		    	try {Connection connection = DBContext.getConnection();
    				PreparedStatement ps = connection.prepareStatement(sql);
    				ps.setString(1,m.getMenuname());
    				ps.setString(2,m.getMenudescription());
    				ps.setInt(3,m.getMenuid());
    				ps.executeUpdate();
    				
    		    	}catch(SQLException e) {
    		    		e.printStackTrace();

    		    	}
    }
    public void delete(int menuid) {
<<<<<<< HEAD
    	String  sql = "delete from `menu`\r\n"
    			+"where `menuid`=?;";
=======
    	String  sql = "delete from 'menu'\r\n"
    			+"where 'id'=?;";
>>>>>>> 39d0ee0 (aa)
    	try {
    		Connection connection = DBContext.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1,menuid);
			ps.executeUpdate();
    	}catch(SQLException e) {
    		e.printStackTrace();

    	}
    }
    public Menu getMenuByName(String menuname) {
        String sql = "SELECT * FROM Menu WHERE menuname = ?";
        try (Connection connection = DBContext.getConnection();
        		PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, menuname);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Menu(rs.getInt("menuid"), rs.getString("menuname"), rs.getString("menudescription"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    public static void main(String[] args) {
//		menuDAO dao = new menuDAO();
//		Menu m = new Menu("b","a");
//		dao.insert(m);
//		List<Menu> cate = dao.getMenuAll();
//		for (Menu categories : cate) {
//			System.out.println(categories);
//		}
//
//	}
    
}