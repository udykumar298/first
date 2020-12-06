import java.io.IOException;
import java.sql.*;
public class demo {
    public static  void main(String [] args){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/vijay", "postgres", "abcd");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from person;");
                    while (rs.next())
                        System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4)+ " " + rs.getString(5));
            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());}
    }
}
