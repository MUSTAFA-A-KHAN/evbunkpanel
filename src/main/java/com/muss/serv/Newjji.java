package com.muss.serv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Newjji
 */
@WebServlet("/Newjji")
public class Newjji extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Newjji() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String Username=request.getParameter("Email");
		String password=request.getParameter("password");
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","sabrina");
			System.out.println("connection created");
			PreparedStatement st=con.prepareStatement("select * from Admin where username=? and password=?");
			
			st.setString(1, Username);
			st.setString(2, password);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				response.sendRedirect("home.html");
			}
			else {
				response.sendRedirect("new.html");
			}
			
			con.close();
			System.out.print("closed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		
		
	}

}
