package com.muss.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
/*	public void init(ServletConfig config,HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		String url;
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			url="jdbc:mysql://localhost:3306/spring";
			con=DriverManager.getConnection(url);
			System.out.println("connection created");
			
			con.close();
			System.out.print("closed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		System.out.println("initcalled");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<h1> heyy</h1>");
		class dia{
			
		}
		
	
		
	}*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		
		String password=request.getParameter("password");
		System.out.println("username "+username);
		String url;
		System.out.println("email "+email);
		System.out.println("passowrd "+password);
		String query;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			url="l";
			query="select * from mustafatest";
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","sabrina");
			System.out.println("connection created");
			Statement stmt =con.createStatement();
			ResultSet rs= stmt.executeQuery(query);
			ResultSetMetaData rsmd =rs.getMetaData();
			int colcount=rsmd.getColumnCount();
			
			for(int i=1;i<=colcount;++i) 
				System.out.println(rsmd.getColumnLabel(colcount) + "\t\t");
				
			
			
			
			
			con.close();
			System.out.print("closed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		
		
		if(username.compareTo(password)==0)
		{
		
			username="invalid - ";
			System.out.println("username :" + username);
			PrintWriter out=response.getWriter();
			String responsee="<html>";
			responsee+=username;
			responsee+=password;
			out.println(responsee);
		}
		
		
		System.out.println("password :" + password);
		System.out.println("dopost called");
		request.getRequestDispatcher(getServletInfo());
		
		
		PrintWriter out=response.getWriter();
		String responsee="<html>";
		responsee+=username;
		responsee+=password;
		out.println(responsee);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
				response.setContentType("text/html");
		out.println("<form name=\"newloginform\" method=\"post\" action=\"loginservlet\">\r\n"
				+ "\r\n"
				
				+ "	<input type=\"submit\" value=\"backtologinservlet\"/>\r\n"
				+ "</form>");
		System.out.println("dogetcalled");
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		
		String password=request.getParameter("password");
		System.out.println("email"+email);
		System.out.println("password"+password);
		String Admin_Name=request.getParameter("Admin Name");
		String Address=request.getParameter("Address");
		String City=request.getParameter("City");
		String ID_proof=request.getParameter("ID proof");
		String Username=request.getParameter("Username");
		String Email_Id=request.getParameter("Email Id");
		String Mobile_Number=request.getParameter("Mobile Number");
		String Enter_Password=request.getParameter("Enter Password");
		System.out.println(Admin_Name);
		System.out.println(Address);
		System.out.println("city"+ City);
		
		
		
		
		
	
	}
	

}
