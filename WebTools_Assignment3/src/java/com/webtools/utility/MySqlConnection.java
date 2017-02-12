/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtools.utility;

/**
 *
 * @author richa
 */
import java.sql.*;

public class MySqlConnection {
    
    
    public Connection getConnection()
	{
            Connection con =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/moviedb", "root", "");

            
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ClassNotFound or SQLException occured:"+e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
        
        
        
        }
    

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/moviedb", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from movies");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) +"  "+ rs.getString(4) + "  "+ rs.getInt(5)) ;
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
