package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverCreator {
    public WebDriver createBrowser(String browser) {
        WebDriver driver;

        if(browser.equals("chrome")) {
        	System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\drivers\\chromedriver.exe");
        	driver = new ChromeDriver();
        } else {
        	System.setProperty("webdriver.gecko.driver", "C:\\Eclipse\\drivers\\geckodriver.exe");
        	driver = new FirefoxDriver();
        }
        return driver;
    }
}


