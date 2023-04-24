package Utility.com;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilclass {
	public static WebDriver driver;
public static void Screenshort(WebDriver driver, String inamge) throws IOException {
	TakesScreenshot sc=((TakesScreenshot)driver);
	File sou=sc.getScreenshotAs(OutputType.FILE);
	File dest=new File("G:\\A Projects\\OrangeHR.com\\Pic");
	FileHandler.copy(sou, dest);
}
}
