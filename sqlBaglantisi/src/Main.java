import java.sql.*;

public class Main {

    public static void main(String[] args) throw SQLexception {
        Connection connection=null;
        PreparedStatement statement=null;
        try{
            statement=connection.prepareStatement("insert into world values   ");

        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }finally{
            connection.close();
            statement.close();
        }

}








public static void select()throws SQLException{
    Connection connection=null;
    dbHelper dbHelper=new dbHelper();
    Statement statement=null;
    ResultSet resultSet;
    try{
        dbHelper.getConnection();
        statement=connection.createStatement();
        resultSet=statement.executeQuery("select * from world where country='turkey'");
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }

    }
    catch (SQLException  exception){
        System.out.println(exception.getMessage());
    }finally{
        connection.close();
    }
}
}
