package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import javax.swing.plaf.synth.SynthTextAreaUI;

public class Activity_02 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("the title of the page :" + title);

        WebElement idlocator = driver.findElement(By.id("about-link"));
        System.out.println("Text in Element :" + idlocator.getText());

        WebElement ClassLocator = driver.findElement(By.className("green"));
        System.out.println("Text in the element :" + ClassLocator.getText());

        WebElement CssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in the element :" + CssLocator.getText());

        WebElement LinkLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in the element :" +LinkLocator.getText());

        driver.close();


    }
}
