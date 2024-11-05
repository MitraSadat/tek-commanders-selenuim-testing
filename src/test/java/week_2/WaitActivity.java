package week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitActivity {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement signInElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("a.top-nav__btn")));
        signInElement.click();

        WebElement emailElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("input#email")));
        emailElement.sendKeys("mohammad2536@gmail.com");

        WebElement passElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("input#password")));
        passElement.sendKeys("Password@123");

        WebElement loginElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("button.w-full")));
        loginElement.click();

        WebElement accountElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("a#accountLink")));
        accountElement.click();

        WebElement phoneElement = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("input#personalPhoneInput")));
        phoneElement.clear();
        phoneElement.sendKeys("12312312310");

        WebElement updateElement = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("button#personalUpdateBtn")));
        updateElement.click();

        WebElement messageElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("div.Toastify__toast-container")));
        System.out.println(messageElement.isDisplayed());

        driver.quit();
    }
}
