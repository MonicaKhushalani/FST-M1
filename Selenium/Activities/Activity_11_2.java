package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_11_2 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String title = driver.getTitle();
        //print the title
        System.out.println("The title of the page :" + title);
        //click the Confirm Alert
        driver.findElement(By.id("confirm")).click();
        // Store the alert in a variable
        Alert confirmAlert = driver.switchTo().alert();
        //get the Title
        String confirmAlertText = confirmAlert.getText();
        System.out.println(" the Text is :" + confirmAlertText);
        // Click the OK button on the alert
        confirmAlert.accept();
        // click on cancel button
        //confirmAlert.dismiss();
        //close the browser
        driver.quit();

    }
}
