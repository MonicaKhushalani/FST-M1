package LMS_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_04 {

    WebDriver driver;

    @BeforeClass
    public void beforeMethod(){

        driver = new FirefoxDriver();
        //open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void secondPopularCourse(){

        WebElement SecondCourse = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3"));
        //Assertion
        Assert.assertEquals(SecondCourse.getText(), "Email Marketing Strategies");
    }

    @AfterClass
    public void afterMethod(){
        //close the browser
        driver.quit();
    }
}
