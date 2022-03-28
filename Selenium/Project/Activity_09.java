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

public class Activity_09 {

    WebDriver driver;


    @BeforeClass
    public void beforeMethod(){
        driver = new FirefoxDriver();
        //open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "root", "pa$$w0rd" }};
    }

    @Test(dataProvider = "Authentication")
    public void completeLesson(String Username , String password){
        //find the navigation bar
        driver.findElement(By.className("main-navigation"));
        //click All courses
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[2]/a")).click();
        //click the third Course;
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[3]/article/div[2]/p[2]/a")).click();
        //click login
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/div/div/div[1]/div[3]/div/div/span/a")).click();
        //enter the details
        WebElement usernameField = driver.findElement(By.id("user_login"));
        WebElement passwordField = driver.findElement(By.id("user_pass"));
        //Enter values
        usernameField.sendKeys(Username);
        passwordField.sendKeys(password);
        //click login
        WebElement loginButton = driver.findElement(By.cssSelector("#wp-submit"));
        loginButton.click();

        //click course content
         driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[2]/div[1]/a/div[2]")).click();

        String Title = driver.getTitle();
        System.out.println("the title of the page : " + Title);
        //Verify the Title of the course
        Assert.assertEquals("Analyze Content & Develop Writing Strategies – Alchemy LMS", Title);
        //click the mark button
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[4]/div[2]/form/input[4]")).click();
    }
    @AfterClass
    public void afterMethod(){
        //close the browser
        driver.quit();
    }
}
