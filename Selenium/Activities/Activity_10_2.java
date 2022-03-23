package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity_10_2 {

    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        //open Browser
        driver.get("https://www.training-support.net/selenium/input-events");
        String Title = driver.getTitle();
        System.out.println("The Title of the page :" + Title);

        WebElement pressedKey = driver.findElement(By.id("keyPressed"));
//Action1
        Action actionSequence1 = actions.sendKeys("M").build();
        actionSequence1.perform();
         String pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText);

        //Action2

        Action actionSequence2 = actions
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        actionSequence2.perform();
        pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText);

        //close the browser
        driver.quit();
}}

