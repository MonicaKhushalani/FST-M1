package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_11_1 {

    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String title = driver.getTitle();
        //print the title
        System.out.println("The title of the page :" + title);
        //click the simple Alert
        driver.findElement(By.id("simple")).click();
        // Store the alert in a variable
        Alert simpleAlert = driver.switchTo().alert();
        //get text and print
        String alertText = simpleAlert.getText();
        System.out.println("the Text is :" + alertText);
        // Click the OK button on the alert
        simpleAlert.accept();
        //close the browser
        driver.close();
    }
}
