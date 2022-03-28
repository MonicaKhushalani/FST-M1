package LMS_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;

public class Activity_06 {

    WebDriver driver;

    @BeforeClass
    public void beforeMethod(){
        driver = new FirefoxDriver();
        //open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void anotherPage(){
        //find the navigation bar
        driver.findElement(By.className("main-navigation"));
        //click the Account
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div/nav/div/ul/li[5]/a")).click();
//Get the Title of the page
        String Title = driver.getTitle();
        System.out.println("The title of the page: " + Title);
//Assertion
        Assert.assertEquals("My Account – Alchemy LMS",Title);
        //Find the login button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div[2]/div[2]/div[2]/a")).click();
    }
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "root", "pa$$w0rd" }};
    }
    @Test(dataProvider = "Authentication")
    public void loginTest(String Username , String password){
        WebElement usernameField = driver.findElement(By.id("user_login"));
        WebElement passwordField = driver.findElement(By.id("user_pass"));
        //Enter values
              usernameField.sendKeys(Username);
              passwordField.sendKeys(password);
        //click login
        WebElement loginButton = driver.findElement(By.cssSelector("#wp-submit"));
        loginButton.click();
        //Assert Message
        String loginMessage = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[1]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/h1")).getText();
        System.out.println(loginMessage);
        Assert.assertEquals("My Account", loginMessage);
    }

    @AfterClass
    public void afterMethod(){
        //close the browser
        driver.quit();
    }
}
