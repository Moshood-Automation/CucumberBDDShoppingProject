package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class Test_Steps {
	public WebDriver driver;
	public int random;
	
	@Given("^I am on the hompage$")
	public void i_am_on_the_hompage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//UNCOMMENT THE TWO LINES OF CODE BELOW TO RUN TEST IN INTERNET EXPLORER BROWSER
		//System.setProperty("webdriver.ie.driver", "\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		
		//UNCOMMENT THE TWO LINES OF CODE BELOW TO RUN TEST IN FIREFOX BROWSER		 
		//System.setProperty("webdriver.gecko.driver", "\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("http://carguruji.com/shop/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	}

	@And("^I click the sign in link$")
	public void i_click_the_sign_in_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.cssSelector("div.header_user_info")).click();
	}

	@And("^I see an auhentication banner$")
	public void i_see_an_auhentication_banner() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String ExpectedMessage = "AUTHENTICATION";
		String ActualMessage = driver.findElement(By.cssSelector("h1.page-heading")).getText();	  
	    Assert.assertEquals(ExpectedMessage, ActualMessage);
	    System.out.println(ActualMessage);
	    
	}

	@When("^I enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input#email")).sendKeys("mosh.agbosasa@yahoo.com");
	}

	@And("^I enter a  valid password$")
	public void i_enter_a_valid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete action
		driver.findElement(By.cssSelector("input#passwd")).sendKeys("Isaac");
	}
	    
	@When("^I click the sign in button$")
	public void i_click_the_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("button#SubmitLogin")).click();
	}

	@Then("^I should be logged in$")
	public void i_should_be_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String ExpectedMessage = "Sign out";
	    String ActualMessage = driver.findElement(By.cssSelector("a.logout")).getText();
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		System.out.println(ActualMessage);
	}
	
	@And("^I click the sign out link to log out$")
	public void i_click_the_sign_out_link_to_log_out() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("a.logout")).click();
	}
	
	 @And("^I enter an email address$")
	    public void i_enter_an_email_address() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	 //     THIS GENERATES RANDOM EMAIL ADDRESS
	  	  random = 1000000 + (int)(Math.random() * ((1000 - 1) + 1));
	  	  System.out.println(random);
	  	  driver.findElement(By.cssSelector("input#email_create")).sendKeys("mosh" + random + "@yahoo.com");
	}

	    @And("^I click the create an account button$")
	    public void i_click_the_create_an_account_button() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	      driver.findElement(By.cssSelector("button#SubmitCreate")).click();
	       
	    }
	    
	    @When("^I fill the personal information form$")
	    public void i_fill_the_personal_information_form() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	 driver.findElement(By.cssSelector("input#id_gender1")).click();
	   	     Thread.sleep(5000);
	   	     driver.findElement(By.cssSelector("input#customer_firstname")).sendKeys("mosh");
	   	     driver.findElement(By.cssSelector("input#customer_lastname")).sendKeys("agbosasa");
	   	     driver.findElement(By.cssSelector("input#passwd")).sendKeys("Isaac123");
	   	     
	   	     Select drpDay = new Select(driver.findElement(By.cssSelector("select#days")));
		     drpDay.selectByValue("10");
		     
		     Select drpMonth = new Select(driver.findElement(By.cssSelector("select#months")));
			 drpMonth.selectByIndex(01);
	        
		     Select drpYear = new Select(driver.findElement(By.cssSelector("select#years[class='form-control']")));
		  	 drpYear.selectByValue("1990");
	        
		  	 driver.findElement(By.cssSelector("input#newsletter")).click();
	    }

	    @And("^I click the register button$")
	    public void i_click_the_register_button() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	 driver.findElement(By.cssSelector("button#submitAccount")).click();
	    }

	    @Then("^i should be registered$")
	    public void i_should_be_registered() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	String ExpectedMessage = "Your account has been created.";
	    	String ActualMessage = driver.findElement(By.cssSelector("p.alert")).getText();
	  	    Assert.assertEquals(ExpectedMessage, ActualMessage);
	  	    System.out.println(ActualMessage);  
	    }
	    
	    @When("^I enter an \"([^\"]*)\"$")
	    public void i_enter_an(String email) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	driver.findElement(By.cssSelector("input#email")).sendKeys(email);
	    }

	    @And("^I enter a \"([^\"]*)\"$")
	    public void i_enter_a(String password) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	driver.findElement(By.cssSelector("input#passwd")).sendKeys(password);
	    }

	    @Then("^I should get an error message$")
	    public void i_should_get_an_error_message() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	String ErrorMessage = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol")).getText();
	        System.out.println(ErrorMessage);
	    }
	    
	    @And("^I enter a search keyword$")
	    public void I_enter_a_search_keyword() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("blouse");	       
	    }

	    @When("^I click the search button$")
	    public void I_click_the_search_button() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	driver.findElement(By.cssSelector("button.btn[name='submit_search']")).click();
	    }

	    @Then("^the searched item shoulbd be displayed$")
	    public void the_searched_item_shoulbd_be_displayed() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	boolean Image = driver.findElement(By.cssSelector("img.replace-2x[title='Blouse']")).isDisplayed();
	        Assert.assertTrue(Image);
	        Thread.sleep(5000);
	        System.out.print("Image is displayed");
	    }
	    
	    @When("^i click on my personal information button$")
	    public void i_click_on_my_personal_information_button() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        driver.findElement(By.cssSelector("#center_column > div > div:nth-child(1) > ul > li:nth-child(5) > a")).click();
	    }

	    @When("^I see YOUR PERSONAL INFORMATION banner$")
	    public void i_see_YOUR_PERSONAL_INFORMATION_banner() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	String ExpectedMessage = "YOUR PERSONAL INFORMATION";
	  	    String ActualMessage = driver.findElement(By.cssSelector("h1.page-subheading")).getText();
	  	    Assert.assertEquals(ExpectedMessage, ActualMessage);
	  	    System.out.println(ActualMessage);   
	    }

	    @When("^I enter my current password$")
	    public void i_enter_my_current_password() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	       driver.findElement(By.cssSelector("input#old_passwd")).sendKeys("Isaac123");  
	    }

	    @When("^I enter my new password$")
	    public void i_enter_my_new_password() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        driver.findElement(By.cssSelector("input#passwd")).sendKeys("Isaac");
	    }

	    @When("^I enter my password confirmation$")
	    public void i_enter_my_password_confirmation() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	       driver.findElement(By.cssSelector("input#confirmation")).sendKeys("Isaac");
	    }

	    @When("^I click the save button$")
	    public void i_click_the_save_button() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("button.btn[name='submitIdentity']")).click();
	    }

	    @Then("^my password/personal information should be changed/updated$")
	    public void my_password_personal_information_should_be_changed_updated() throws Throwable {
	    	// Write code here that turns the phrase above into concrete actions
	    	
	    	String ExpectedMessage = "Your personal information has been successfully updated.";
	        String ActualMessage =  driver.findElement(By.cssSelector("#center_column > div > p")).getText();
	        Assert.assertEquals(ExpectedMessage, ActualMessage);
	        Thread.sleep(5000);
	        System.out.println(ActualMessage);    
	    }
	    
	            
	    
       @After
       public void TearDown() {
       driver.close();
       //driver.quit();
    
        }
    
   


}
