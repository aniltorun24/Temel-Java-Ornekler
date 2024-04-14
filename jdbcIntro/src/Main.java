import com.mysql.cj.protocol.a.SqlDateValueEncoder;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        dbHelper helper= new dbHelper();
        Statement statement= null;
        ResultSet resultSet;
        try{
            connection=helper.getConnection();
            String sql="update city set population =80000 where id=40810;"
            statement=connection.prepareStatement(sql);
            int result=statement.executeUpdate();
            System.out.println("kayıt gğncelendi");

    }}catch(SQLException exception){
        helper.getmessage();
    }
    finally{
        statement.close();
        connection.close();
    }

}
public static void add(){
    connection=helper.getConnection();
    statement=connection.createStatement();
    resultSet=statement.executeQuery("select* from world");//içerideki sql komutunu çalıştırmak için kullanılır
    ArrayList<country>countries=new ArrayList<country>();

    while (resultSet.next()){
        countries.add(new country(
                resultSet.getString("name"),
                resultSet.getString("code"),
                resultSet.getString("continent"),
                resultSet.getString("region")));

        System.out.println("bağlantı sağlandı");
}
}