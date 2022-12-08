package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class guestUserSearch {

	ChromeDriver driver;
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", 
				"chromedriver.exe"); 
		driver = new ChromeDriver();
	//	wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
	@When("Click on all button")
	public void click_on_all_button() {
		driver.findElement(By.id("nav-hamburger-menu")).click();
	}

	@When("Select comptuer from side menu")
	public void select_comptuer_from_side_menu() {
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[8]")).click();
	}

	@When("Select computer components from side menu")
	public void select_computer_components_from_side_menu() {
		driver.findElement(By.linkText("Computer Components")).click();
	}

	@Then("Result page should be displayed")
	public void result_page_should_be_displayed() {
		String check=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/span/div/div/span")).getText();
	    Assert.assertEquals("RESULTS", check);
	}
	
	@When("User should select any product")
	public void user_should_select_any_product() {
		driver.findElement(By.id("MAIN-SEARCH_RESULTS-1")).click();
	}

	@When("User should be able to click on Buy Now button")
	public void user_should_be_able_to_click_on_buy_now_button() {
		driver.findElement(By.id("buy-now-button")).click();
	}

	@Then("User should be directed to checkout page")
	public void user_should_be_directed_to_checkout_page() {
		boolean check=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[3]/h1")).isDisplayed();
	    Assert.assertEquals(true, check);
	}
	
	@When("^Click on search and enter (.*)$")
	public void click_on_search_and_enter_keywords(String keyword) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(keyword);
	}
	
	
	@When("Click on search button")
	public void click_on_search_button() {
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("User should be directed to result page")
	public void user_should_be_directed_to_result_page() {
		String check=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div")).getText();
	    Assert.assertEquals("RESULTS", check);
	}
	
	@When("enter computer and Click on search button")
	public void enter_computer_and_click_on_search_button() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer");
	}
	
	@Then("Details of the product should be displayed")
	public void details_of_the_product_should_be_displayed() {
		boolean check=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).isDisplayed();
	    Assert.assertEquals(true, check);
		
	}
	
	@When("Check number of product of displayed")
	public void check_number_of_product_of_displayed() {
		String check=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]")).getText();
	    Assert.assertEquals("1-16 of over 10,000 results for", check);
	}
	
	@Then("click on next button to check next page")
	public void click_on_next_button_to_check_next_page() {
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[29]/div/div/span/a[3]")).click();
	}

	@Then("Check number of product of displayed on second page")
	public void check_number_of_product_of_displayed_on_second_page() {
		String check=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]")).getText();
	    Assert.assertEquals("17-32 of over 10,000 results for", check);
	    
	}
	
	
	
	@After
	public void close() {
		driver.close();
	}
}
