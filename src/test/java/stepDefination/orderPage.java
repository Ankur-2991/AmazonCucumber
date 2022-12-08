package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orderPage {

	ChromeDriver driver;
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", 
				"chromedriver.exe"); 
		driver = new ChromeDriver();
	//	wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}

	@When("Clicks on Your Order page")
	public void clicks_on_your_order_page() {
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a")).click();
	}

	@Then("User should be directed to Order page")
	public void user_should_be_directed_to_order_page() {
		String url=driver.getCurrentUrl();
	    Assert.assertEquals("https://www.amazon.com/gp/your-account/order-history?ref_=ya_d_c_yo", url);
	}

	@When("Select this year from dropdown")
	public void select_this_year_from_dropdown() {
		Select dropTest1= new Select(driver.findElement(By.id("time-filter")));
		dropTest1.selectByVisibleText("year-2022");
	}

	@Then("User should be displayed past orders from this year")
	public void user_should_be_displayed_past_orders_from_this_year() {
		String check=driver.findElement(By.xpath("//*[@id=\"ordersContainer\"]/div[2]/div")).getText();
	    Assert.assertEquals("You have not placed any orders in 2022.", check);
	}
	
	@When("Select Archived order from dropdown")
	public void select_archived_order_from_dropdown() {
		Select dropTest1= new Select(driver.findElement(By.id("time-filter")));
		dropTest1.selectByVisibleText("archived");
	}

	@Then("User should be displayed Archived orders")
	public void user_should_be_displayed_archived_orders() {
		String check=driver.findElement(By.xpath("/*[@id=\"yourOrdersContent\"]/div[3]/div/h1")).getText();
	    Assert.assertEquals("Archived Orders", check);
	}
	
	@When("Select Buy Again")
	public void select_buy_again() {
		driver.findElement(By.linkText("Buy Again")).click();
	}

	@Then("User should be products under buy again tab")
	public void user_should_be_products_under_buy_again_tab() {
		String url=driver.getCurrentUrl();
	    Assert.assertEquals("https://www.amazon.com/gp/buyagain?ref_=ppx_yo2ov_dt_b_tb_buy_again", url);
	}
	
	@When("Select Not Yet Shipped")
	public void select_not_yet_shipped() {
		driver.findElement(By.linkText("Not Yet Shipped")).click();
	}

	@Then("User should be products under Not Yet Shipped tab")
	public void user_should_be_products_under_not_yet_shipped_tab() {
		String url=driver.getCurrentUrl();
	    Assert.assertEquals("https://www.amazon.com/gp/your-account/order-history/ref=ppx_yo_dt_b_oo_view_all_bap_c?ie=UTF8&orderFilter=open", url);
	}
	
	@When("Select Cancelled Order")
	public void select_cancelled_order() {
		driver.findElement(By.linkText("Cancelled Orders")).click();
	}

	@Then("User should be products under Cancelled Order tab")
	public void user_should_be_products_under_cancelled_order_tab() {
		String url=driver.getCurrentUrl();
	    Assert.assertEquals("https://www.amazon.com/gp/your-account/order-history/ref=ppx_yo_dt_b_cancelled_orders?ie=UTF8&orderFilter=cancelled", url);
	}
	
	
	
	@After
	public void close() {
		driver.close();
	}
}
