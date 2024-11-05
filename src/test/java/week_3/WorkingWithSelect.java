package week_3;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WorkingWithSelect {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String url = "https://retail.tekschool-students.com/selenium/dropdown";

        driver.get(url);

        WebElement languageOptions = driver.findElement(By.cssSelector("select#programmingLanguageSelect"));

        Select languageDropDown = new Select(languageOptions);

        Thread.sleep(1000);

        languageDropDown.selectByVisibleText("PHP");

        Thread.sleep(1000);

        languageDropDown.selectByVisibleText("Java");

        List<WebElement> languages = languageDropDown.getOptions();

        for (WebElement language : languages){

            System.out.println(language.getText());
        }

        driver.close();

    }
}
