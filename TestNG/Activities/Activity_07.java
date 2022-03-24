package FST_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity_07 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @DataProvider(name = "Authentication")
    public static Object[][] credential(){
        return new Object[][]{
                {"admin","password"}
        };
    }
    @Test(dataProvider = "Authentication")
    public void testMethod(String username , String password){
        WebElement usernameText = driver.findElement(By.id("username"));
        WebElement passwordText = driver.findElement(By.id("password"));
        //Enter values
        usernameText.sendKeys(username);
        passwordText.sendKeys(password);
        //login
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //assertion
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");

    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
