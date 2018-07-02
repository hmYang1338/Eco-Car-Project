package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import car.dao.MemberDao;

/**
 * 회원가입
 * 
 * @author hyunmoYang
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw1");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		if((id!=null)&&(pw!=null)&&(name!=null)&&(email!=null)){
			int result = MemberDao.insertMember(id, pw, name, email);
			if(result==0){
				response.sendRedirect("index.jsp");
			} else {
				response.sendRedirect("login.html");
			}
		} else {
			response.sendRedirect("index.jsp");
		}
	} // end of service
	
} // end of class
