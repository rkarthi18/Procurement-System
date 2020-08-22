import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import DAO_SERVICE.CRUD.RetreiveDAO;
import DAO_SERVICE.Common.GeneratePrimaryKey;
import POJO_MODEL.Employee;

public class SiteManagerTesting {

	@Test
	public void testLoginSiteManager() throws ClassNotFoundException, SQLException {
		Employee employee = RetreiveDAO.validateLogin("alpha", "alpha");

		assertNotNull(employee);
	}

	@Test
	public void testGeneratingApprovalId() throws ClassNotFoundException, SQLException {
		String approvalId = GeneratePrimaryKey.generateApprovalId();

		assertNotNull(approvalId);
	}
	
	@Test
	public void testLoginSiteManagerFail() throws ClassNotFoundException, SQLException {
		Employee employee = RetreiveDAO.validateLogin("alpha", "none");

		assertNotNull(employee);
	}
	
	@Test
	public void testLoginSiteManagerFail2() throws ClassNotFoundException, SQLException {
		Employee employee = RetreiveDAO.validateLogin("none", "none");

		assertNotNull(employee);
	}

}
