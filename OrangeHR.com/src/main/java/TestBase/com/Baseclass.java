package TestBase.com;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	public static WebDriver driver;
    public static Properties props;
    
    public Baseclass()  {
    	try {
    		props=new Properties();
    	FileInputStream file=new FileInputStream("G:\\A Projects\\OrangeHR.com\\src\\main\\java\\Config\\com\\Config.properties");
    	props.load(file);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
    	catch (Exception e) {
			// TODO: handle exception
		}}
 @SuppressWarnings("deprecation")
public void startup() {
//    	WebDriverManager.chromedriver().setup();
	 System.setProperty("webdriver.chrome.driver","C:\\installar\\chromedriver_win32\\chromedriver.exe");
    	driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.get(props.getProperty("Url"));
    	
    } 
 @BeforeSuite
 public void test() {
 	
 }
  

@AfterSuite
public void Closedb() {
	driver.close();
}  }