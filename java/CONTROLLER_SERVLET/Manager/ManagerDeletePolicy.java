package CONTROLLER_SERVLET.Manager;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO_SERVICE.CRUD.DeleteDAO;

/**
 * Servlet implementation class ManagerDeletePolicy
 */
public class ManagerDeletePolicy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ManagerDeletePolicy() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Delete Policy");

		try {
			DeleteDAO.deletePolicyId(request.getParameter("policyId"));
			request.getRequestDispatcher("Manager_Home.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
