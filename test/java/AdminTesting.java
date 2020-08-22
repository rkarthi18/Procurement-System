import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;


import DAO_SERVICE.CRUD.RetreiveDAO;
import DAO_SERVICE.CRUD.UpdateDAO;
import POJO_MODEL.Employee;
import POJO_MODEL.Site;

public class AdminTesting {

	@Test
	public void testLoginAdmin() throws ClassNotFoundException, SQLException {
		Employee employee = RetreiveDAO.validateLogin("admin", "admin");

		assertNotNull(employee);
	}
	

	
	@Test
	public void testSiteRetreive() throws ClassNotFoundException, SQLException {
		ArrayList<Site> siteList = RetreiveDAO.retreiveAllSite();

		assertNotNull(siteList);
	}
	

	
	@Test
	public void testUpdateEmployee() throws ClassNotFoundException, SQLException {
		Employee employee = new Employee();
		boolean result = UpdateDAO.UpdateEmployee(employee);
		assertEquals(false, result);
	}
	
	

	@Test
	public void testLoginAdminFail() throws ClassNotFoundException, SQLException {
		Employee employee = RetreiveDAO.validateLogin("admin", "none");

		assertNotNull(employee);
	}
	@Test
	public void testLoginAdminFail2() throws ClassNotFoundException, SQLException {
		Employee employee = RetreiveDAO.validateLogin("none", "none");

		assertNotNull(employee);
	}

}
