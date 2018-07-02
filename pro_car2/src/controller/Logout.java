package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 로그아웃
 * 
 * @author hyunmoYang
 */
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String id = (String)session.getAttribute("logId");
		
		if(session!=null){
			session.invalidate();
			session = null;
		} 
		response.sendRedirect("index.jsp");
	} // end of service
	
} // end of class
