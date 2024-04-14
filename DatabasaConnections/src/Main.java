import java.sql.*;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try{
            connection = helper.getConnection();
            String sql="update city set population=80000 where id =4081";
            //String sql="delete from city where id =4081";
            statement=connection.prepareStatement(sql);
            int result=statement.executeUpdate();
            System.out.println("güncelleme gerçekleşti");
        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }

    }
    public static void SelectDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try{
            connection = helper.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("insert into city(Name,CountryCode,District,Population)values('Düzce','Tur','Düzce',50000)");
            ArrayList<Country> countries=new ArrayList<Country>();
            while(resultSet.next()){//next komutu teker teker gez anlamındadır
                countries.add(new Country(resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));

            }

        }catch(SQLException exception){
            helper.showErrorMessage(exception);

        }
        finally {
                connection.close();

        }
    }
    public static void InsertDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try{
            connection = helper.getConnection();
            statement=connection.prepareStatement("insert into city(Name,CountryCode,District,Population)values('Düzce','Tur','Düzce',50000)");
            int result=statement.executeUpdate();
        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
    }
}