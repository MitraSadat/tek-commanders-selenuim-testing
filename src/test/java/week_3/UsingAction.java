package week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.Keys.TAB;

public class UsingAction {

    static String url = "https://retail.tekschool-students.com/selenium/inputs";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.get(url);

        WebElement text = driver.findElement(By.name("text"));
        WebElement email = driver.findElement(By.name("email"));
        WebElement pass = driver.findElement(By.name("password"));

        action.click(text).perform();

        for( char character : "simple text".toCharArray()){
            action.sendKeys(String.valueOf(character)).perform();
            Thread.sleep(100);
        }

        Thread.sleep(2000);

//        action.keyDown(Keys,TAB).perform();




    }
}
