package testingassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeUnitTest {

	@Test
	public void employeeEmptyAgeTest() {
		Employee emp = new Employee("Uzair");
		Assert.assertEquals(0, emp.getEmployeeAge());
	}

}
