package LMS_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_05 {

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
//Get the Titl eof the page
       String Title = driver.getTitle();
       System.out.println("The title of the page: " + Title);
//Assertion
        Assert.assertEquals("My Account – Alchemy LMS",Title);

    }

    @AfterClass
    public void afterMethod(){
        //close the browser
        driver.quit();
    }
}
