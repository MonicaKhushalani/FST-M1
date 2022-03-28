package LMS_project;

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
    public void beforeMethod(){

        driver = new FirefoxDriver();
        //open the Browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void firstInfoBox(){
        WebElement FirstBoxTitle = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/h3"));

        Assert.assertEquals(FirstBoxTitle.getText(), "Actionable Training");

    }


    @AfterClass
    public void afterMethod(){
        driver.quit();
    }
}
