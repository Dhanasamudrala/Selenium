package seleniumDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demotsng2 {
	@Test(groups ="functional")
	public void m1() {
		Reporter.log("hiii..1", true);
	}
	
	@Test(groups ="Integration" , dependsOnGroups ="fuctional" )
	public void m2() {
		Reporter.log("hiii..2", true);
	}
	
	@Test(groups ="functional")
	public void m3() {
		Reporter.log("hiii..3", true);
	}
	
	@Test(groups ="Integration" , dependsOnGroups ="fuctional" )
	public void m4() {
		Reporter.log("hiii..4", true);
	}
	
	@Test(groups ="functional")
	public void m5() {
		Reporter.log("hiii..5", true);
	}
	
	@Test(groups ="unit")
	public void m6() {
		Reporter.log("hiii..6", true);
	}
	

}
