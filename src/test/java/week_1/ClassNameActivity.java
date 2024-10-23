package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameActivity {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://retail.tekschool-students.com/");

        By tekschoolLocator = By.className("top-nav__logo");

        WebElement tekschoolElement = driver.findElement(tekschoolLocator);

        System.out.println(tekschoolElement.getText());

        driver.quit();

    }
}
