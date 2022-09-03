package com.muss.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() { 
    	
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	System.out.println("do Post of login");

		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);	// TODO Auto-generated method stub

		}
		@Override
		public void destroy() {
			System.out.println("destroy called");
		}
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.doGet(request, response);
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<form name=\"newloginform\" method=\"post\" action=\"loginservlet\">\r\n"
					+ "\r\n"
					+ "	 Usernameinlogin:<input type=\"text\" name=\"username\"/><br>\r\n"
					+ "	 Passwordin login:<input type=\"password\" name=\"password\"/> <br>\r\n"
					+ "	<input type=\"submit\" value=\"sessionout\"/>\r\n"
					+ "</form>");
			System.out.println("dogetcalled");
			
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
		
		
	}


