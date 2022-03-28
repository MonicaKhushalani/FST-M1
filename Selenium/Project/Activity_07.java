package LMS_project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;



public class Activity_07 {

    WebDriver driver;

    @BeforeClass
    public void beforeMethod(){
        driver = new FirefoxDriver();
        //open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void noOfCourses(){
        //find the navigation bar
        driver.findElement(By.className("main-navigation"));
        //click All courses
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[2]/a")).click();
        //Find the Heading
        String Heading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[1]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/h1")).getText();

        System.out.println("The heading of the page: " + Heading);
        //Assertion
        Assert.assertTrue(Heading.contains("All Courses"));
        // Find the No.of courses
        //List<WebElement> Courses = driver.findElements(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div"));
        List<WebElement> Courses = driver.findElements(By.xpath("//*[text() = 'See more...']"));
        Integer CourseCount = Courses.size();//
        System.out.println(("The count of courses are :" + CourseCount));

        }


    @AfterClass
    public void afterMethod(){
        //close the browser
        driver.quit();
    }
}
