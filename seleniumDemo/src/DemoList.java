import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import seleniumDemo.ListDemo1;

@Listeners(ListDemo1.class)
public class DemoList {
	@Test
	public void m1() {
		Reporter.log("hiii", true);
	}
	@Test
public void m2() {
		Reporter.log("hii", true);
		Assert.fail();
	}
}
