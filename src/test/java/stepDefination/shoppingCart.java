package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shoppingCart {

	ChromeDriver driver;
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		driver = new ChromeDriver();
	//	wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	}
	
	@When("User clicks on add in cart button")
	public void user_clicks_on_add_in_cart_button() {
		driver.findElement(By.id("add-to-cart-button")).click();
	}

	@When("User clicks move to carts")
	public void user_clicks_move_to_carts() {
		driver.findElement(By.id("attach-sidesheet-view-cart-button")).click();
	}

	@When("User should click on proceed on checkout")
	public void user_should_click_on_proceed_on_checkout() {
		driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
	}
	
	@Then("verify details of the product in cart")
	public void verify_details_of_the_product_in_cart() {
		boolean check=driver.findElement(By.xpath("//*[@id=\"sc-active-9bc320bd-ab6a-43a4-929b-34df20f5fb71\"]/div[4]/div/div[3]/ul/li[1]/span/a")).isDisplayed();
	    Assert.assertEquals(true, check);
	}
	
	@When("User increments quantity of product")
	public void user_increments_quantity_of_product() {
		Select dropTest1= new Select(driver.findElement(By.id("quantity")));
		dropTest1.selectByValue("2");
	}
	
	@Then("quantity should be increased")
	public void quantity_should_be_increased() {
		String check=driver.findElement(By.xpath("//*[@id=\"sc-active-C9bc320bd-ab6a-43a4-929b-34df20f5fb71\"]/div[4]/div/div[3]/div[1]/span[1]/span/span[1]/span/span/span/span/span[2]")).getText();
	    Assert.assertEquals("2", check);
	}
	
	@Given("User should select different product")
	public void user_should_select_different_product() {
		driver.findElement(By.id("MAIN-SEARCH_RESULTS-3")).click();
	}
	
	@When("User closes the browser")
	public void user_closes_the_browser() {
	    driver.close();
	}

	@When("User opens website again")
	public void user_opens_website_again() {
	    driver.get("https://www.amazon.com/");
	}

	@When("User checks the cart")
	public void user_checks_the_cart() {
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
	}

	@Then("Cart should contain products")
	public void cart_should_contain_products() {
		boolean check=driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div[1]/h1")).isDisplayed();
	    Assert.assertEquals(true, check);
	}
	
	@When("Delete all the products in the cart")
	public void delete_all_the_products_in_the_cart() {
		driver.findElement(By.xpath("//*[@id=\"sc-active-1da9886b-150c-454e-8c79-348fd301de0c\"]/div[4]/div/div[3]/div[1]/span[2]/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\"sc-active-74f33f8e-a92a-4f19-b200-5e4104c38787\"]/div[4]/div/div[3]/div[1]/span[2]/span/input")).click();
	}
	
	@Then("Cart should be empty")
	public void cart_should_be_empty() {
		String check=driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div/h1")).getText();
	    Assert.assertEquals("Your Amazon Cart is empty.", check);
	}
	
	
	@After
	public void close() {
		driver.close();
	}
}
