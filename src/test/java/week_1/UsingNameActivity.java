package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameActivity {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("example@gmail.com");

        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("example@123");

    }

}
