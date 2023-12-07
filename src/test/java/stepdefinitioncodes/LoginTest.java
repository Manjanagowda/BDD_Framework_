package stepdefinitioncodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest{
	WebDriver driver;

	@Given("Navigate to login page")
	public void navigate_to_login_page() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://rahulshettyacademy.com/client/");
	}
	
	@When("Enter email id {string}")
	public void enter_email_id(String string) {
		driver.findElement(By.id("userEmail")).sendKeys(string);
	    
	}
	
	@When("Enter the Password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.id("userPassword")).sendKeys(string);
	}
	
	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("login")).click();
	}
	
	@Then("Verify home page displayed or not {string}")
	public void verify_home_page_displayed_or_not(String string) throws InterruptedException {
		   Thread.sleep(10000);
		   String str = driver.findElement(By.xpath("//button[@routerlink=\"/dashboard/\"]")).getText();
		   System.out.println(str.equals(string));
	}



}
