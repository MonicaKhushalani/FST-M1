package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;


public class Activity_06_1 {

    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-controls");

        WebElement Checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
        WebElement toggleCheckbox = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));

        toggleCheckbox.click();

        wait.until(ExpectedConditions.invisibilityOf(Checkbox));

        toggleCheckbox.click();

        wait.until(ExpectedConditions.visibilityOf(Checkbox));

        driver.quit();


    }
}
