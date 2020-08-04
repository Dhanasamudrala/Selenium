package seleniumDemo;

import org.qsp.testngdemo.test;
import org.testng.Reporter;

public class Demo2 {
	@test(groups= "fuctional")
	public void m1() {
		Reporter.log("hiiii...1",true);
	}
	@test(groups= "Integration" )  depends on groups("functional")
	public void m2() {
		Reporter.log("hiiii...2",true);
	}
	@test(groups="fuctional")
	public void m3() {
		Reporter.log("hiiii...3",true);
	}
	@test(groups="Integration" )depends on groups("functional"); 
	public void m4() {
		Reporter.log("hiiii...4",true);
	}
	@test(groups="fuctional") 
	public void m5() {
		Reporter.log("hiiii...5",true);
	}
	@test(groups="Integration") 
	public void m6() {
		Reporter.log("hiiii...6",true);
	}





}
