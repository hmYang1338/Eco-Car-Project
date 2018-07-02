package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import car.dao.AddressDao;

/**
 * addr 목록 출력
 * 
 * @author hyunmoYang
 */
public class GetAddrList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		request.setAttribute("addrList", AddressDao.getAllList());
		request.getRequestDispatcher("search.jsp").forward(request, response);
	} // end of service
	
} // end of class

