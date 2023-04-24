package Pom.com;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.com.Baseclass;

public class Loginpage extends Baseclass{

	public Loginpage() throws IOException {
	 PageFactory.initElements(driver, this);
	}
@FindBy(xpath ="//input[@placeholder='Username']")
WebElement usrid;
@FindBy(xpath ="//input[@placeholder='Password']")
WebElement Pass;
@FindBy(xpath ="//button[@type='submit']")
WebElement login;
@FindBy(xpath ="//button[@type='submit']")
WebElement hmpage;
@FindBy(xpath ="//a[@href=\"/web/index.php/admin/viewAdminModule\"]")
WebElement Admin ;

public void Loginp(String nm, String pwd) throws InterruptedException {
	Thread.sleep(2000);
	usrid.sendKeys(nm);
	Pass.sendKeys(pwd);
	login.click();
}
public void Loginp(String Name) {
WebElement Ele=driver.findElement(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]"));
Ele.getText();
System.out.println(Ele.getText());
}
}

