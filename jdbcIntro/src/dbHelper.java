import java.sql.DriverManager;
import java.sql.SQLException;

public class dbHelper {
    private String username="root";
    private String password="12345";
    private String dburl="jdbc:mqsql://localhost//:3306/world";
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dburl,username,password);

    }
    public void getmessage(){
        System.out.println("error:"+exception.getMessage());
        System.out.println("error code:"+exception.getErrorCode());
    }
}
