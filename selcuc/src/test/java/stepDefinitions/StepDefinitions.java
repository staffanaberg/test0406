package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	WebDriver driver;
	
	@Before
	public void setUp() {
		System.out.println("Do something first");
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\drivers\\chromedriver.exe");

	    driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("I want to navigate to Mailchimp")
	public void i_want_to_write_a_step_with_name1() throws InterruptedException {

	     driver.get("https://login.mailchimp.com/signup/");
	 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("calle@hejsanhoppsan.se");
	    WebElement user = driver.findElement(By.id("new_username"));
	    user.sendKeys("callehejsan");
	    WebElement pass = driver.findElement(By.id("new_password"));
	    pass.sendKeys("A1!se238be");
	    Thread.sleep(2000);
	    WebElement cookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
	    cookies.click();
	    Thread.sleep(2000);
	    WebElement create = driver.findElement(By.id("create-account"));
	    create.click();
	    
	    Thread.sleep(5000);  // Let the user actually see something!
	  
	    assertEquals(true, driver.findElement(By.xpath("//*[@id=\"slot-preShell\"]/div/div[1]/img")).isDisplayed());
	    
	    
	  
	    driver.quit();
	
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
	}
	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		// Write code here that turns the phrase above into concrete actions
	}

}
