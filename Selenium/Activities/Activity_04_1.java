package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_04_1 {

    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");

        String Title = driver.getTitle();
        System.out.println("Title of the Page :" + Title);

        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
        System.out.println("Heading is :" + driver.getTitle());
        
        driver.quit();
    }
}
