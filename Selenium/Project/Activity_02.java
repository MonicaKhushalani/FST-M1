package LMS_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_02 {

    WebDriver driver;

    @BeforeClass
    public void beforeMethod(){

        driver = new FirefoxDriver();
        //open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void verifyWebsiteHeading(){
    //find the Heading
    String Heading = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[1]/div[2]/section/div[2]/div[2]/div[2]/div/div/div/div/div[1]/h1")).getText();
    //Assertion
        Assert.assertTrue(Heading.contains("Learn from Industry Experts"));

    }

    @AfterClass
    public void afterMethod(){
        //close the browser
        driver.quit();
    }

}
