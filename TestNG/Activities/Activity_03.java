package FST_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_03 {

    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @Test
    public void testcase(){
        WebElement userName = driver.findElement(By.id("username"));
        WebElement passWord = driver.findElement(By.id("password"));

        //Enter Credential
        userName.sendKeys("admin");
        passWord.sendKeys("password");
        //click login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //store the login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        //assertion
        Assert.assertEquals("Welcome Back, admin",loginMessage);

    }

    @AfterClass
    public void afterMethod(){
        driver.quit();
    }
}