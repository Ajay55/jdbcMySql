/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcmysql;

import java.sql.*;
import java.io.*;
public class JdbcMySql {

    
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","ajay55");
            Statement st=con.createStatement();
            st.executeUpdate("insert into new_table values(2,'dinesh','male')");
            System.out.println("success");
            con.close();
            }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
       
    }
    
}
