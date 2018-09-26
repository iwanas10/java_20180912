package Rest;

import sun.security.util.Password;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static final String URL= "jdbc:mysql://127.0.0.1:3306/kaunascodingschool";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    public static Connection createConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        }catch (SQLException e) {
            e.printStackTrace();

        }
        return connection;
    }

}
