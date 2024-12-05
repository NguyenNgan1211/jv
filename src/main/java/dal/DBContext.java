package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    private static Connection conn;

    public static Connection getConnection() {
        String user = "root";
        String pass = "";  // Update this if there's a root password in MySQL
<<<<<<< HEAD
        String url = "jdbc:mysql://localhost:3307/qlsv";  // Ensure correct port number
=======
        String url = "jdbc:mysql://localhost:3306/qlsv";  // Ensure correct port number
        
>>>>>>> 39d0ee0 (aa)

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
<<<<<<< HEAD
            // System.out.println("Connection successful!");
=======
             System.out.println("Connection successful!");
>>>>>>> 39d0ee0 (aa)
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found. Make sure 'mysql-connector-java' is added to your project libraries.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database. Possible reasons:");
            System.out.println("- Incorrect URL, username, or password");
            System.out.println("- MySQL server is not running in XAMPP");
            System.out.println("- Database 'qlsv' does not exist");
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        Connection connection = DBContext.getConnection();
        if (connection != null) {
            System.out.println("Connected to the database.");
        } else {
            System.out.println("Connection failed.");
        }
    }
}
