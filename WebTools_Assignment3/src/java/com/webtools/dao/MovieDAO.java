/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtools.dao;

import com.webtools.beans.MovieBean;
import com.webtools.utility.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author richa
 */
public class MovieDAO {
    
    MySqlConnection conn = new MySqlConnection();
    
    
    public boolean searchMovie(String keyword)
    {
    
    
    
        return false;
    }
    
    public boolean addMovie(MovieBean mb)
    {
       Connection con= conn.getConnection();
       String query ="INSERT INTO movies VALUES(?,?,?,?,?)";
    
       boolean status = false;
        
        try
		{
			String title=mb.getMovieTitle();
			String actor=mb.getMovieActor();
			String actress=mb.getMovieActress();
			String genre=mb.getMovieGenre();
			int year=mb.getMovieYear();
			
			System.out.println(title+actor+actress+genre+year);
			
			
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, title);
			pst.setString(2, actor);
			pst.setString(3, actress);
			pst.setString(4, genre);
			pst.setInt(5, year);
			System.out.println(query);
			pst.execute();
			
                        status =true;
			con.close();
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			status= false;
		}
		
		return status;
    }
    
}
