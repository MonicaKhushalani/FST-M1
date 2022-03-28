package LMS_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity_08 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod(){
        driver = new FirefoxDriver();
        //open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void contactAdmin(){
        //find the navigation bar
        driver.findElement(By.className("main-navigation"));
        //click the Contact
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[4]/a")).click();
//Get the Title of the page
        String Title = driver.getTitle();
        System.out.println("The title of the page: " + Title);
        //Find the contact form fields (Full Name, email,message)
        driver.findElement(By.xpath("//input[@id = 'wpforms-8-field_0']")).sendKeys("Monica K");
        driver.findElement(By.xpath("//input[@id = 'wpforms-8-field_1']")).sendKeys("test@example.com");
        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");
        driver.findElement(By.xpath("//button[@id = 'wpforms-submit-8']")).click();

        //Read and print the Message

        String Message = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div[2]/div[2]/div[2]/p")).getText();

        System.out.println("The Displayed message : " + Message);

        Assert.assertTrue(Message.contains("Thanks for contacting us! We will be in touch with you shortly."));
    }


    @AfterClass
    public void afterMethod(){
        //close the browser
        driver.quit();
    }
}
