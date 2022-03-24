package FST_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;

public class Activity_05 {

    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void beforeMethod(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test(groups = {"HeaderTests", "ButtonTests"})
    public void titleTest(){

        String title = driver.getTitle();
        System.out.println("The title of the page : " + title);
        Assert.assertEquals(title, "Target Practice");
    }
    @Test(dependsOnMethods = {"titleTest"}, groups = {"HeaderTests"})
    public void HeaderTest1(){
        WebElement header3 = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals("Third header", header3.getText());
    }
    @Test(dependsOnMethods = {"titleTest"}, groups = {"HeaderTests"})
    public void HeaderTest2(){
        WebElement header5 = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
    }
    @Test (dependsOnMethods = {"titleTest"}, groups = {"ButtonTests"})
    public void ButtonTest1() {
        WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
        Assert.assertEquals(button1.getText(), "Olive");
    }
    @Test (dependsOnMethods = {"titleTest"}, groups = {"ButtonTests"})
    public void ButtonTest2() {
        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
    }

    @AfterTest(alwaysRun = true)
    public void afterMethod(){
        driver.quit();
    }
}
