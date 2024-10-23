package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextActivity {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.bbc.com");

        By businessInLink = By.id("Business");
        WebElement businessElement = driver.findElement(businessInLink);
        businessElement.click();

        By textLocator = By.className("juQBdA");
        WebElement textElement = driver.findElement(textLocator);
        System.out.println(textElement.getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
