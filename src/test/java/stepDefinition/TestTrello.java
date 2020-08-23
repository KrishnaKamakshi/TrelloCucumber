package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

public class TestTrello {
    WebDriver browser;


    @Given("^Open chrome browser and start application$")
    public void open_chrome_browser_and_start_application() throws Throwable{
        System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.trello.com");
    }

    @When("^I login into the application using \"(.*?)\" and \"(.*?)\"$")
    public void i_login_into_the_application_using_username_and_password(String uname, String pass) throws Throwable {
       browser.findElement(By.xpath("//a[@href='/login']")).click();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       browser.findElement(By.xpath("//input[@id='user']")).sendKeys(uname);
       browser.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
       browser.findElement(By.xpath("//input[@type='submit']")).click();


    }

    @Then("^Validate if there are no boards present$")
    public void validate_if_there_are_no_boards_present() throws Throwable {
        browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        browser.findElement(By.xpath("//button[@class='_3UeOvlU6B5KUnS']")).click();
        Assert.assertEquals(browser.findElement(By.xpath("//span[contains(text(),'Create new board')]")).getText(),"Create new board");

    }

    @Then("^Create a new board$")
    public void create_a_new_board() throws Throwable {
        browser.findElement(By.xpath("//span[contains(text(),'Create new board')]")).click();
        browser.findElement(By.xpath("//input[@placeholder='Add board title']")).sendKeys("ManTestBoard");
        browser.findElement(By.xpath("//span[@class='icon-sm icon-down subtle-chooser-trigger-dropdown-icon light']")).click();
        browser.findElement(By.xpath("//span[contains(text(),'Public')]")).click();
        browser.findElement(By.xpath("//input[@class='js-confirm full primary']")).click();
        browser.findElement(By.xpath("//span[contains(text(),'Create Board')]")).click();
        browser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


    }

    @Then("^Add a new card$")
    public void Add_a_new_card() throws Throwable {
        browser.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys("ManTestList");
        browser.findElement(By.xpath("//input[@class='primary mod-list-add-button js-save-edit']")).click();
        browser.findElement(By.xpath("//span[@class='js-add-a-card']")).click();
        browser.findElement(By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']")).sendKeys("ManFirstCard");
        browser.findElement(By.xpath("//input[@value='Add Card']")).click();
        browser.close();
    }
}
