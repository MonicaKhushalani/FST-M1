package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_05_1 {
    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");

        String title = driver.getTitle();
        System.out.println("Title of the page :" + title);

        WebElement checkBox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        System.out.println("The Checkbox is Displayed : " + checkBox.isDisplayed());

        driver.findElement(By.id("toggleCheckbox")).click();

        System.out.println("The checkbox is Displayed: " + checkBox.isDisplayed());

        driver.quit();

    }
}
