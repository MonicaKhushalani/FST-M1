package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_04_2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");

        String Title = driver.getTitle();
        System.out.println("Title of the page :" + Title);

        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        firstName.sendKeys("Monica");

        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        lastName.sendKeys("Golani");

        WebElement email = driver.findElement(By.xpath("//input[@id = 'email']"));
        firstName.sendKeys("text@example.com");

        WebElement number = driver.findElement(By.xpath("//input[@id = 'number']"));
        number.sendKeys("1234567890");

        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();

        driver.quit();
    }
}
