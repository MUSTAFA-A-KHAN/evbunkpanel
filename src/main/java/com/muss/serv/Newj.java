package com.muss.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Newj")


public class Newj extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String Admin_Name = request.getParameter("Admin_Name");
		String Address = request.getParameter("Address");
		String Email = request.getParameter("Email");
		String City = request.getParameter("City");
		String ID = request.getParameter("ID");
		String Username = request.getParameter("Username");
		String Mobile = request.getParameter("Mobile");
		String password = request.getParameter("password");
		;
		System.out.println("Email "+Email);
		System.out.println("Admin name"+Admin_Name);
		System.out.println("Address"+Address);
		System.out.println("City"+City);
		System.out.println("ID"+ID);
		System.out.println("Username"+Username);
		System.out.println("Mobile"+Mobile);
		System.out.println("password"+password);
		
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","sabrina");
			System.out.println("connection created");
			PreparedStatement st=con.prepareStatement("insert into Admin (name,Adress,Email,city,IDProof,mobile,username,password) values(?,?,?,?,?,?,?,?)");
			st.setString(1, Admin_Name);
			st.setString(2, Address);
			st.setString(3, Email);
			st.setString(4, City);
			st.setString(5 ,ID);
			st.setString(6, Mobile);
			st.setString(7, Username);
			st.setString(8, password);
			st.executeUpdate();
			con.close();
			System.out.print("closed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		response.sendRedirect("register.html");
		pw.close();
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}
