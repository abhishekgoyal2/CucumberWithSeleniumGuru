package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	 @Given("^Open the Firefox and launch the application$")				
	    public void open_the_Firefox_and_launch_the_application() throws Throwable							
	    {		
	        System.out.println("This Step open the Firefox and launch the application.");	
		 driver= new FirefoxDriver();					
	       driver.manage().window().maximize();			
	       driver.get("http://demo.guru99.com/v4");	
					
	    }		

	 @When("^Enter the Username User(\\d+)and Password password(\\d+)$")				
	    public void enter_the_Username_and_Password() throws Throwable 							
	    {		
	       System.out.println("This step enter the Username and Password on the login page.");	
	       driver.findElement(By.name("uid")).sendKeys("username");							
	       driver.findElement(By.name("password")).sendKeys("password");	
	    }		

	    @Then("^Reset the credential$")					
	    public void Reset_the_credential() throws Throwable 							
	    {    		
	        System.out.println("This step click on the Reset button.");	
	        driver.findElement(By.name("btnReset")).click();		
	    }		

//	    @Then("^close the browser$")
//	    public void close_the_browser() throws Throwable {
//	        // Write code here that turns the phrase above into concrete actions
//	    	driver.quit();
////	        throw new PendingException();
//	    }

	}
	

