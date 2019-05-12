package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ApplicationTest 
  {
	WebDriver driver;
	//@Test (for)  
	/*@Given("a Dashboard link to me")
	public void dahsboardLink() {
		System.setProperty("webdriver.chrome.driver", "path to chrome");
		 driver = new ChromeDriver();
		 driver.get("https://www.xyz.com");
		
		
	}
	
	@When("a Dashboard link to me")
	public void applicationLogIn(){
		driver.findElement(By.id("")).sendKeys("Username");
		driver.findElement(By.xpath(".//input[@id='passwor']'")).sendKeys("password");
		driver.findElement(By.id("username")).submit();
	}
	
	
	public void verifytitle(String title) {
		String t=driver.getTitle();
		
		Assert.assertEquals(title, t);
	}*/
	int x,y;
	int add=0;
	@Given("^two numbers to add$")
	public void two_numbers_to_add() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   x=10;
	   y=20;
	}

	@When("^I perfomr add operation$")
	public void i_perfomr_add_operation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   add=x+y;
	}

	@Then("^result should show the additon of numbers$")
	public void result_should_show_the_additon_of_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Result of "+x+" and "+y+" = "+add);
	}
	

@Given("^Google Url \"([^\"]*)\"$")
public void google_Url(String arg1) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jhimit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get(arg1);
}

@When("^I search \"([^\"]*)\" to the page$")
public void i_search_to_the_page(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath(new Library().readXpathFromExcel())).sendKeys(arg1);
   driver.findElement(By.name("q")).submit();
}

@Then("^It should show search result page$")
public void it_should_show_search_result_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   Assert.assertTrue("Couldn't get the apple search result page",driver.getTitle().contains("apple"));
}

  }
