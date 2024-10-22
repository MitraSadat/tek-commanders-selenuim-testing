package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Activity_1 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://retail.tekschool-students.com/");

        String title = driver.getTitle();

        System.out.println(title);


        By signInLink = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLink);
        signInElement.click();

        By createAccountButton = By.id("newAccountBtn");
        WebElement createNewAccount = driver.findElement(createAccountButton);
        createNewAccount.click();

        driver.quit();

    }

}
