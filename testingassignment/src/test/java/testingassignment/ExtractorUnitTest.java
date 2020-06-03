package testingassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ExtractorUnitTest {

	@Test
	public void getTitleNull() {
		String name = "Mr. Jhon Lenon";
		NameExtractor ext = new NameExtractor(name);
		Assert.assertEquals("Mr", ext.getTitle());
	}

}
