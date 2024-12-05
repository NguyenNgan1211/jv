package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.user; 

public class loginDAO {
	Connection conn = null;
	PreparedStatement ps =null;
	ResultSet rs = null;
    public user login(String username, String password) {
        String query = "SELECT * FROM user WHERE username = ? AND password = ?";

        
        try {
<<<<<<< HEAD
            conn = new DBContext().getConnection(); 
=======
            new DBContext();
			conn = DBContext.getConnection(); 
>>>>>>> 39d0ee0 (aa)
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            
            rs = ps.executeQuery();
            
            while (rs.next()) {
                return new user(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getInt(6)
                );
            }
        } catch (Exception e) {
            e.printStackTrace(); 
        } 


      
        return null; 
    }

   
    public user checkUserExist(String username) {
        String query = "SELECT * FROM [user] WHERE [username] = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
<<<<<<< HEAD
            conn = new DBContext().getConnection(); 
=======
            new DBContext();
			conn = DBContext.getConnection(); 
>>>>>>> 39d0ee0 (aa)
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                return new user(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getInt(6)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null;
    }
}
