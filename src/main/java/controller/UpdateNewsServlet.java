package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Menu;
import model.News;

import java.io.IOException;

import dal.menuDAO;
import dal.newsDAO;

/**
 * Servlet implementation class UpdateNewsServlet
 */
public class UpdateNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("newsid");
		int newsid = Integer.parseInt(id);
		newsDAO cd = new newsDAO();
		News m = cd.getNewsById(newsid);
		 System.out.println("Retrieved news: " + m);
		request.setAttribute("news2",m);
		request.getRequestDispatcher("/admin/updateNews.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("newsid");
		newsDAO cd = new newsDAO();
		String newstitle = request.getParameter("newstitle");
		String newscontent = request.getParameter("newscontent");
		String image = request.getParameter("image");
		String meid = request.getParameter("menuid");
		String auid = request.getParameter("authorid");

		int authorid,menuid,newsid;
		menuid = Integer.parseInt(meid);
		authorid = Integer.parseInt(auid);
		newsid = Integer.parseInt(id);
		System.out.println("id" + newsid);
		News m = new News(newsid,newstitle,newscontent,authorid,menuid,image);
		cd.update(m);
		response.sendRedirect("news");
	}

}
