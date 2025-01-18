
import java.sql.Connection;
// Database Connection
public class db {
    
    
    public static Connection mycon(){
    
    Connection con = null;
    
    try {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        con = DriverManager.getConnection("jdbc:mysql://170.0.0.1/:3306/Login","root","");
    
    } catch (ClassNotFoundException  e){
        System.out.println(e);
    }
   
     return con;   
    }
            
}
