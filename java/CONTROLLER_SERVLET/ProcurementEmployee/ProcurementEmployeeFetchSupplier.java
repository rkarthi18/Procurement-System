package CONTROLLER_SERVLET.ProcurementEmployee;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO_SERVICE.CRUD.RetreiveDAO;
import POJO_MODEL.Supplier;

/**
 * Servlet implementation class ProcurementEmployeeFetchSupplier
 */
public class ProcurementEmployeeFetchSupplier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProcurementEmployeeFetchSupplier() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Fetch Supplier");

		HttpSession session = request.getSession();
		try {
			Supplier supplier = RetreiveDAO.getSingleSupplierById(request.getParameter("supplierId"));
			session.setAttribute("fetchedSupplier", supplier);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("ProcurementStaff_MakeOrder.jsp").forward(request, response);
	}

}
