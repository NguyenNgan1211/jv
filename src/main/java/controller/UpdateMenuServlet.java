package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dal.menuDAO;
import model.Menu;

<<<<<<< HEAD
/**
 * Servlet implementation class UpdateMenuServlet
 */
=======

>>>>>>> 39d0ee0 (aa)
public class UpdateMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMenuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("menuid");
		int menuid = Integer.parseInt(id);
		menuDAO cd = new menuDAO();
		Menu m = cd.getMenuById(menuid);
<<<<<<< HEAD
		 System.out.println("Retrieved Menu: " + m);
=======
>>>>>>> 39d0ee0 (aa)
		request.setAttribute("menu2",m);
		request.getRequestDispatcher("/admin/updateMenu.jsp").forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("menuid");
		menuDAO cd = new menuDAO();
		String menuname = request.getParameter("menuname");
		String menudescription = request.getParameter("menudescription");
		int menuid;
		menuid = Integer.parseInt(id);
<<<<<<< HEAD
		System.out.println("id" + id);
		Menu m = new Menu(menuid,menuname,menudescription);
		cd.update(m);
		response.sendRedirect("menu");
=======
		Menu m = new Menu(menuid,menuname,menudescription);
		cd.update(m);
		response.sendRedirect("MenuController");
>>>>>>> 39d0ee0 (aa)

	}

}
