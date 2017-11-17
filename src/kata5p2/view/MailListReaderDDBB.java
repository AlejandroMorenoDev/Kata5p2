/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata5p2.view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import kata5p2.model.Mail;


/**
 *
 * @author amct2
 */
public class MailListReaderDDBB {
    
    
    
        
    public static ArrayList <Mail> read() throws SQLException, ClassNotFoundException{      
        ArrayList <Mail> emails = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\amct2\\Desktop\\asdad\\IS2\\Kata5\\KATAS.DB");
        String query = "SELECT * FROM MAIL";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            if(!rs.getString("Mail").contains("@")){
                continue;
            }
            Mail m = new Mail(rs.getString("Mail"));
            emails.add(m);
        }
        
        return emails;
     }
   

    
    
    
    
    
}
