package FST_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity_02 {

    WebDriver driver;

    @BeforeClass

    public void beforeMethod(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
       public void test01(){
        //Find the Title
        String Title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + Title);
        //Assertion for page title
        Assert.assertEquals("Target Practice", Title);

    }
    @Test
      public void test02(){
        WebElement BlackButton = driver.findElement(By.xpath("//button[contains(text(),'Black')]"));
        String BlackButtonText = BlackButton.getText();
        Assert.assertEquals("Blue",BlackButtonText);
    }
    @Test(enabled = false)
    public void test03(){
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }
    @Test
    public void test04(){
        throw new SkipException("Skipping test case");
    }

    @AfterClass
    public void afterMethod(){
        driver.quit();
    }
}
