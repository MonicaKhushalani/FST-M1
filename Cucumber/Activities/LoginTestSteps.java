package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTestSteps {
    WebDriver driver;
    WebDriverWait wait ;

    @Given("^User is on Login page$")
    public void UserOnLoginPage(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //open the browser
         driver.get("https://www.training-support.net/selenium/login-form");
    }
    @When("^User enters username and password$")
    public void UsernamePassword(){
        WebElement UserName = driver.findElement(By.id("username"));
        WebElement PassWord = driver.findElement(By.id("password"));
        UserName.sendKeys("admin");
        PassWord.sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password)  {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("^Read the page title and confirmation message$")
    public  void ReadTheTitle(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
        String Title = driver.getTitle();
        String Message = driver.findElement(By.id("action-confirmation")).getText();
        //print Title and message
        System.out.println("The Title of the Page :" + Title);
        System.out.println("The message displayed is :" + Message);

        if(Message.contains("admin")) {
            Assert.assertEquals(Message, "Welcome Back, admin");
        } else {
            Assert.assertEquals(Message, "Invalid Credentials");
        }
    }
    @And("^Close the Browser$")
    public void closeBrowser() {
        //Close browser
        driver.close();}

}
