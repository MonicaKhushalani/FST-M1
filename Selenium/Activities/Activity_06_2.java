package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_06_2 {

    public  static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/ajax");
        String Title = driver.getTitle();
        System.out.println("The Title of the page is :" + Title);

        driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));

        String HelloText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(HelloText);

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        String LateText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(LateText);

        driver.quit();

    }
}
