//package bankmanagement;
//
//import java.sql.*;  
//
//public class Conn{
//    Connection c;
//    Statement s;
//    public Conn(){  
//        try{  
//            Class.forName("com.mysql.cj.jdbc.Driver");  
//            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","Snehaa016030");    
//            s =c.createStatement();    
//        }catch(Exception e){ 
//            System.out.println(e);
//        }  
//    }  
//} 

package bankmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    public Connection conn;
    public Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "Snehaa01603!");
            s = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

