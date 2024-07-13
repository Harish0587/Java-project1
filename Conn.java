package travel.booking.management1;
import java.sql.*;  
public class Conn{
    Connection c;
    Statement s ;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///travelbookingmanagement","root","hari2003");
            s=c.createStatement();  
        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }  
    }  
}  
