package root.db;
import java.io.* ;
import java.sql.*;

public class jdbcTrial {
    public static void main(String[] args) {

        //Connection conn = null;

        Connection c;
        Statement s;

            try{
                Class.forName("com.mysql.jdbc.Driver");
                c =DriverManager.getConnection("jdbc:mysql:///testdb","chilly","AlluDasaviour123");

                s =c.createStatement();


            }catch(Exception e){
                System.out.println(e);
            }

    }
}
