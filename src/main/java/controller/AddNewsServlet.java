package controller;
import dal.newsDAO;
import model.News;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dal.menuDAO;

/**
 * Servlet implementation class AddNewsServlet
 */
public class AddNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		newsDAO cd = new newsDAO();
		
	String newstitle = request.getParameter("newstitle");
	String newscontent = request.getParameter("newscontent");
	String auid = request.getParameter("authorid");
	String meid = request.getParameter("menuid");
	int authorid, menuid;
	authorid = Integer.parseInt(auid);
	menuid = Integer.parseInt(meid);

	String image = request.getParameter("image");
		cd.insert(newstitle,newscontent,authorid,menuid,image);
		request.getRequestDispatcher("news").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
