package CONTROLLER_SERVLET.Manager;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO_SERVICE.CRUD.InsertDAO;
import DAO_SERVICE.Common.GeneratePrimaryKey;
import POJO_MODEL.Policy;

/**
 * Servlet implementation class ManagerAddPolicy
 */
public class ManagerAddPolicy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ManagerAddPolicy() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Add policy");
		String policyId;
		try {
			policyId = GeneratePrimaryKey.generatePolicyId();

			InsertDAO.insertNewPolicy(new Policy(policyId, request.getParameter("policy")));

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
