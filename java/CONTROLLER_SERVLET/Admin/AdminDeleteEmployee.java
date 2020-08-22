package CONTROLLER_SERVLET.Admin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import DAO_SERVICE.CRUD.DeleteDAO;

/**
 * Servlet implementation class AdminDeleteEmployee
 */
public class AdminDeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminDeleteEmployee() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Delete Employee");

		System.out.println(request.getParameter("employeeId"));

		try {
			DeleteDAO.deleteEmployeeId(request.getParameter("employeeId"));

			JOptionPane pane = new JOptionPane(
					"Successfully deleted employee with id " + request.getParameter("employeeId"),
					JOptionPane.OK_OPTION);
			JDialog dialog = pane.createDialog("Status");
			dialog.setAlwaysOnTop(true);
			dialog.show();

			request.getRequestDispatcher("Admin_register_employee.jsp").forward(request, response);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
