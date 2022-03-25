package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_11_3 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String title = driver.getTitle();
        //print the title
        System.out.println("The title of the page :" + title);
        //click the Prompt Alert
        driver.findElement(By.id("prompt")).click();
        //store the alert in a variable
        Alert promptAlert = driver.switchTo().alert();
        //get the text
        String promptAlertText = promptAlert.getText();
        System.out.println("The text is :" + promptAlertText);
        //send the value
        promptAlert.sendKeys("Yes, you are!");
        //click on the oK button
        promptAlert.accept();
        //close the browser
        driver.quit();

    }
}
