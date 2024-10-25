package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signIn = By.id("signinLink");
        WebElement signInElement = driver.findElement(signIn);
        signInElement.click();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("wrong@gmail.com");

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("passwordWrong");

        By login = By.id("loginBtn");
        WebElement loginElement = driver.findElement(login);
        loginElement.click();

        Thread.sleep(2000);

        By errorLocator = By.className("error");
        WebElement errorElement = driver.findElement(errorLocator);
        System.out.println(errorElement.getText());

        driver.quit();
    }
}
