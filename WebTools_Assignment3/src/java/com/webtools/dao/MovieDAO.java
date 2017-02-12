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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class MovieDAO {
    
    MySqlConnection conn = new MySqlConnection();
    
    
    public ArrayList<MovieBean> searchMovie(String keyword, String choice)
    {
    
        String query="";
        if("title".equals(choice))
        {
        query ="SELECT * FROM movies WHERE title like ?;";
        }
        else if("actor".equals(choice))
        {
        query ="SELECT * FROM movies WHERE actor like ?;";
        }
        else if("actress".equals(choice))
        {
        query ="SELECT * FROM movies WHERE actress like ?;";
    
        }
        
        //String query ="SELECT * FROM movies WHERE title like ? or actor like ? or actress like ?;";
        ArrayList<MovieBean> outList = new ArrayList<>();
        
        try{
            
            if("".equals(query))
            {
            
                System.out.println("Error Empty search query");   
            }
            else{
            
            
        Connection con= conn.getConnection();
            PreparedStatement pst=con.prepareStatement(query);
        
           // pst.setString(1, keyword);
            pst.setString(1, "%" + keyword + "%");

			

			// execute select SQL stetement
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				String title = rs.getString("title");
				String actor = rs.getString("actor");
                                String actress = rs.getString("actress");
                                String genre = rs.getString("genre");
                                int year = rs.getInt("year");

				System.out.println("title : " + title);
				System.out.println("actor : " + actor);
                                System.out.println("actress : " + actress);
                                System.out.println("genre : " + genre);
                                System.out.println("year : " + year);
                                
                                MovieBean mb = new MovieBean();
                                mb.setMovieTitle(title);
                                mb.setMovieActor(actor);
                                mb.setMovieActress(actress);
                                mb.setMovieGenre(genre);
                                mb.setMovieYear(year);
                                
                                outList.add(mb);
                                
			}

                
            }
            
        
        
        }catch(Exception ex)
        {
            System.out.println("Exception occurred in searchMovie()");
            ex.printStackTrace();
        
        }
        /*
        notes = notes
    .replace("!", "!!")
    .replace("%", "!%")
    .replace("_", "!_")
    .replace("[", "![");
PreparedStatement pstmt = con.prepareStatement(
        "SELECT * FROM analysis WHERE notes LIKE ? ESCAPE '!'");
pstmt.setString(1, notes + "%");
        
        or a suffix-match:

pstmt.setString(1, "%" + notes);
or a global match:

pstmt.setString(1, "%" + notes + "%");
        
        */
        
        return outList;
    }
    
    public boolean addMovie(MovieBean mb)
    {
       
       String query ="INSERT INTO movies VALUES(?,?,?,?,?)";
    
       boolean status = false;
        
        try
		{
	Connection con= conn.getConnection();
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
			System.out.println("Exception occurred in addMovie()");
                    e.printStackTrace();
			status= false;
		}
		
		return status;
    }
    
}
