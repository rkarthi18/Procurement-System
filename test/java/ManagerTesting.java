import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import DAO_SERVICE.CRUD.RetreiveDAO;
import DAO_SERVICE.Common.GeneratePrimaryKey;
import POJO_MODEL.Employee;

public class ManagerTesting {

	@Test
	public void testLoginManager() throws ClassNotFoundException, SQLException {
		Employee employee = RetreiveDAO.validateLogin("manager", "manager");

		assertNotNull(employee);
	}
	
	@Test
	public void testGeneratingPolicyId() throws ClassNotFoundException, SQLException {
		String policyId = GeneratePrimaryKey.generatePolicyId();

		assertNotNull(policyId);
	}
	
	

	@Test
	public void testLoginManagerFail() throws ClassNotFoundException, SQLException {
		Employee employee = RetreiveDAO.validateLogin("manager", "none");

		assertNotNull(employee);
	}
	
	@Test
	public void testLoginManagerFail2() throws ClassNotFoundException, SQLException {
		Employee employee = RetreiveDAO.validateLogin("none", "none");

		assertNotNull(employee);
	}

}
