package mavenexample.sdet;



import org.testng.Assert;
import org.testng.annotations.Test;

import mavenexamplecom.sdet.App;


public class AppTest {
	
	
	@Test
	public void testLogin1() {
		App app=new App();
		Assert.assertEquals(0, app.userLogin("vamsi", "1234") );
	}
	
	@Test
	public void testLogin2() {
		App app=new App();
		Assert.assertEquals(1, app.userLogin("vamsi", "123") );
	}
	
}
