package week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorActivity {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("a.top-nav__btn")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input#email")).sendKeys("example@gmail.com");

        driver.findElement(By.cssSelector("input#password")).sendKeys("password@123");

        driver.findElement(By.cssSelector("button.w-full")).click();

        Thread.sleep(2000);

        WebElement errorElement = driver.findElement(By.cssSelector("div.error"));
        System.out.println(errorElement.getText());

        driver.quit();
    }
}
