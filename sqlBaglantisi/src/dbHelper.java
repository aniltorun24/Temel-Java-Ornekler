import java.sql.DriverManager;
import java.sql.SQLException;

public class dbHelper {
    private String username="root";
    private String password="12345";
    private String dbUrl="jdbc:mysql://localhost:3306/world";
    public Connection getConnection()throws SQLException{
        return DriverManager.getConnection(dbUrl,username,password);
    }


}
