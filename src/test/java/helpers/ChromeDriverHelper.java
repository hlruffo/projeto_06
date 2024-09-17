package helpers;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverHelper {
	public static ChromeDriver create(String link) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
		driver.get(link);
		return driver;
	}
}
