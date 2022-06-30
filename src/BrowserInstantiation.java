import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInstantiation {

	public static void main(String[] args) {
		
		//How to launch a browser using Chrome
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver training = new ChromeDriver();
		 * training.get("https://www.amazon.in/");
		 */
		
		//To launch a browser using firefox
		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\geckodriver.exe"
		 * ); WebDriver driver = new FirefoxDriver();
		 * driver.get("https://github.com/mozilla/geckodriver/releases/");
		 */
		
		//To launch a browser using Ms Edge
		
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 //ChromeDriver driver = new ChromeDriver();
		 //driver.get("https://www.amazon.in/");
		 driver.navigate().to("https://www.amazon.in/");
		// driver.navigate().
		

	}

}
