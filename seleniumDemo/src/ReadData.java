import org.testng.Reporter;
import org.testng.annotations.Test;

import seleniumDemo.ReadDemo;

public class ReadData {
	@Test(dataProviderClass = ReadDemo.class, dataProvider = "getData")
	public void m1(String un,String pw) {
		Reporter.log(un+" " +pw, true);
	}
	

}
