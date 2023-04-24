package Testsrc.com;

import java.io.IOException;

import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pom.com.Loginpage;
import TestBase.com.Baseclass;
import Utility.com.Utilclass;

public class HomeTest extends Baseclass {
	Loginpage hm;
	
	public HomeTest() throws IOException {
		super();	
	}

@BeforeMethod
public void Start() throws IOException  {
	   startup();
	hm=new Loginpage();
}
@Test
public void login() throws InterruptedException {
	hm.Loginp(props.getProperty("Userid"),props.getProperty("Password"));
}

@AfterMethod
public void teardown(ITestResult Result) throws IOException {
   if(ITestResult.FAILURE==Result.getStatus()) {
	  Utilclass.Screenshort(driver, Result.getName());
   }
}

}
