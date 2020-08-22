import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import DAO_SERVICE.CRUD.RetreiveDAO;
import DAO_SERVICE.Common.GeneratePrimaryKey;
import POJO_MODEL.Employee;

public class ProcurementStaffTesting {

	@Test
	public void testLoginProcurementStaff() throws ClassNotFoundException, SQLException {
		Employee employee = RetreiveDAO.validateLogin("staff", "staff");

		assertNotNull(employee);
	}
	
	@Test
	public void testGeneratingOrderId() throws ClassNotFoundException, SQLException {
		String orderId = GeneratePrimaryKey.generateOrderId();

		assertNotNull(orderId);
	}

	@Test
	public void testLoginProcurementStaffFail() throws ClassNotFoundException, SQLException {
		Employee employee = RetreiveDAO.validateLogin("staff", "none");

		assertNotNull(employee);
	}
	
	@Test
	public void testLoginProcurementStaffFail2() throws ClassNotFoundException, SQLException {
		Employee employee = RetreiveDAO.validateLogin("none", "none");

		assertNotNull(employee);
	}

}
