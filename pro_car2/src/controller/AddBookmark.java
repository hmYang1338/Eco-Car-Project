package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import car.dao.BookmarkDao;

/**
 * 북마크 추가 서비스
 * 
 * @author hyunmoYang
 */
public class AddBookmark extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String sId = (String) request.getParameter("sId");
		
		if (session != null) {		// 세션 존재 여부
			String logId = (String) session.getAttribute("logId");
			
			if (logId != null) {	// 세션 id 확인, 정상 로그인
				int overlap = BookmarkDao.removeOverlap(logId, sId);

				if (overlap != 1) {	// 중복값 존재하는지 확인
					int result = BookmarkDao.insert(logId.trim(), sId.trim());
					response.getWriter().println(result);
				} else {
					response.getWriter().println(0);
				}
			} else {
				response.getWriter().println(2);
			}
		} else {
			response.getWriter().println(2);
		}
	} // end of service
	
} // end of class
