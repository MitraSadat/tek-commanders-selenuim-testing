package week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingSelect {

    static String url = "https://retail.tekschool-students.com/selenium/dropdown";

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get(url);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement languageElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.name("language")));
        languageElement.click();



        Select languageDropDown = new Select(languageElement);

        languageDropDown.selectByVisibleText("Java");

        System.out.println(languageDropDown.getFirstSelectedOption().getText());

        driver.quit();

    }
}
