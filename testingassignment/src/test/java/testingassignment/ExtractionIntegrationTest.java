package testingassignment;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ExtractionIntegrationTest {

	@Test
	public void testTitleExtraction() {
		Employee emp = new Employee("Mr. John Lenon");
		NameExtractor ext = new NameExtractor(emp.getEmployeeName());
		
		Assert.assertEquals("Mr", ext.getTitle());
	}
	@Test
	public void testNameExtraction() {
		Employee emp = new Employee("Mr. John Lenon");
		NameExtractor ext = new NameExtractor(emp.getEmployeeName());
		Assert.assertTrue(ext.getFirstName().contentEquals("John"));
	}

}
