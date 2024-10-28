package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://dev.retail.tekschool-students.com/");

        Thread.sleep(3000);

        By signIn = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signIn);
        signInElement.click();

        Thread.sleep(1000);

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("wrong@gmail.com");

        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("passwordWrong");
        Thread.sleep(1000);

        By login = By.className("ant-btn-primary");
        WebElement loginElement = driver.findElement(login);
        loginElement.click();

        Thread.sleep(2000);

//        By errorLocator = By.className("ant-alert-message");
//        WebElement errorElement = driver.findElement(errorLocator);
//        System.out.println(errorElement.getText());

        driver.quit();
    }
}
