package week_3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String url = "https://retail.tekschool-students.com/selenium/javascript-alerts";

        driver.get(url);
        driver.manage().window().maximize();

        WebElement alertBtn = driver.findElement(By.id("confirmBtn"));
        alertBtn.click();

        Thread.sleep(2000);

        Alert simpleAlert = driver.switchTo().alert();

        System.out.println(simpleAlert.getText());

        simpleAlert.accept();

        driver.quit();




    }
}
