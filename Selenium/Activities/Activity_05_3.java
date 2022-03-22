package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_05_3 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");

        String title = driver.getTitle();
        System.out.println("Title of the page :" + title);

        WebElement InputText = driver.findElement(By.xpath("//input[@type = 'text']"));
        System.out.println("The Checkbox is Enabled : " + InputText.isEnabled());

        driver.findElement(By.id("toggleInput")).click();

        System.out.println("The checkbox is Enabled: " + InputText.isEnabled());

        driver.quit();

    }
}
