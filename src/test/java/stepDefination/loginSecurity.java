package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSecurity {

	ChromeDriver driver;
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", 
				"chromedriver.exe"); 
		driver = new ChromeDriver();
	//	wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
	@When("User click on login and security tab")
	public void user_click_on_login_and_security_tab() {
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a")).click();
	}

	@Then("User is directed to login and security page")
	public void user_is_directed_to_login_and_security_page() {
		String check=driver.findElement(By.id("ap_cnep_header")).getText();
	    Assert.assertEquals("Login & security", check);
	}
	
	@When("User clicks on edit besides the name field")
	public void user_clicks_on_edit_besides_the_name_field() {
		driver.findElement(By.id("auth-cnep-edit-name-button")).click();
	}

	@When("User is directed to change the name page")
	public void user_is_directed_to_change_the_name_page() {
		String check=driver.findElement(By.id("ap_cnep_header")).getText();
	    Assert.assertEquals("Change your name", check);		
	}

	@When("Change the name and clicks save")
	public void change_the_name_and_clicks_save() {
		driver.findElement(By.id("ap_customer_name")).sendKeys("Rohit Garg");
		driver.findElement(By.id("cnep_1C_submit_button")).click();
	}

	@Then("Name is changed on the Account")
	public void name_is_changed_on_the_account() {
		boolean check=driver.findElement(By.id("auth-success-message-box")).isDisplayed();
	    Assert.assertEquals(true, check);		
	}
	
	@When("User clicks on edit besides the password field")
	public void user_clicks_on_edit_besides_the_password_field() {
		driver.findElement(By.id("auth-cnep-edit-password-button")).click();
	}

	@When("User is directed to change the password page")
	public void user_is_directed_to_change_the_password_page() {
		String check=driver.findElement(By.id("ap_cnep_header")).getText();
	    Assert.assertEquals("Change password", check);
	}

	@When("Change the password and clicks save")
	public void change_the_password_and_clicks_save() {
		driver.findElement(By.id("ap_password")).sendKeys("B@nsalankur834");
		driver.findElement(By.id("ap_password_new")).sendKeys("ankurB@nsal834");
		driver.findElement(By.id("ap_password_new_check")).sendKeys("ankurB@nsal834");
		driver.findElement(By.id("cnep_1D_submit_button")).click();
		
	}

	@Then("password is changed on the Account")
	public void password_is_changed_on_the_account() {
		boolean check=driver.findElement(By.id("auth-success-message-box")).isDisplayed();
	    Assert.assertEquals(true, check);
	}

	
	@After
	public void close() {
		driver.close();
	}
}
