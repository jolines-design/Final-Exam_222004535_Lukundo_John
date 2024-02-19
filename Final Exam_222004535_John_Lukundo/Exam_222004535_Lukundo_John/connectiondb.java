import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class connectiondb {
    public static Connection connect(){
    
        Connection conn=null;
        
        try{
            
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
             
             Component rootPane=null;
             
             System.out.println("Connected to the database!");
             

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
            
        return conn;
        }
}
