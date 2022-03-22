package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_03 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/simple-form");

        String title = driver.getTitle();
        System.out.println("Title of the page :" + title);

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Monica");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Golani");

        driver.findElement(By.id("email")).sendKeys("test@example.com");

        driver.findElement(By.id("number")).sendKeys("1234567890");

        driver.findElement(By.cssSelector(".green")).click();

        driver.quit();
    }
}
