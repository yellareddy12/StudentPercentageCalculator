package com.t;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class student
 */
@WebServlet("/student")
public class student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int a=Integer.parseInt(request.getParameter("tbnumber"));
			int b=Integer.parseInt(request.getParameter("tbnum1"));
			int c=Integer.parseInt(request.getParameter("tbnum2"));
			int avg=(a+b+c)/3;
			if(a>=35&&b>=35&&c>=35) {
				request.setAttribute("result","pass");
		if(avg>=75) {
				request.setAttribute("grade","A");
			}else if(avg<=74 &&avg>=35) {
				request.setAttribute("grade","B");
			}else {
				request.setAttribute("grade","fail");
			}
		}
			else {
				request.setAttribute("result","fail");
				request.setAttribute("grade","fail");
			}
			
			RequestDispatcher p=request.getRequestDispatcher("result.jsp");
			p.forward(request, response);
	}
	

}
