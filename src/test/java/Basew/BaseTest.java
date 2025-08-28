package Basew;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	public Properties prop;

	@BeforeClass(groups = { "Smoke", "reset" })
	@Parameters({"browser" })
	public void setup(String br) throws IOException {
		
		FileReader file =new FileReader("./src/main/resources/config.properties");
		 prop=new Properties();
		prop.load(file);

		WebDriverManager.chromedriver().setup();
		switch(br.toLowerCase()) {
		case "chrome":
			driver= new ChromeDriver();
		break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser name..");
			return;
		}

//		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@BeforeMethod
	public void setupMethod() {
		// Runs before each test
		driver.get("https://www.automationexercise.com/"); // Open login page
	}

	@AfterMethod
	public void tearDownMethod() {
	    if (driver != null) {
	        try {
	            driver.manage().deleteAllCookies();
	        } catch (Exception e) {
	            System.out.println("No session to clear");
	        }
	    }
	}

	@AfterClass()
	public void teardown() {
		driver.quit();
	}
	
	public String  captureScreen(String tname) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		 File srcFile  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
			File targetFile = new File(targetFilePath);
			srcFile.renameTo(targetFile);
			return targetFilePath;
		 
	}
	
}
