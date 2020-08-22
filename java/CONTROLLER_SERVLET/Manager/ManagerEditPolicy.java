package CONTROLLER_SERVLET.Manager;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO_SERVICE.CRUD.UpdateDAO;

/**
 * Servlet implementation class ManagerEditPolicy
 */
public class ManagerEditPolicy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ManagerEditPolicy() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Edit policy");
		System.out.println(request.getParameter("policy"));
		try {
			UpdateDAO.UpdatePolicyById(request.getParameter("policyId"), request.getParameter("policy"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher("Manager_Home.jsp").forward(request, response);
	}

}
