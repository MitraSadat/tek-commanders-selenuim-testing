package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        WebElement search = driver.findElement(By.id("searchInput"));
        search.sendKeys("phone");

        WebElement searchBtn = driver.findElement(By.id("searchBtn"));
        searchBtn.click();

        Thread.sleep(4000);

        By allLocators = By.className("products__layout");
        List<WebElement> searchElements = driver.findElements(allLocators);

        int searchItemNumber = searchElements.size();

        System.out.println(searchItemNumber);

        if (searchItemNumber == 3) {
            System.out.println("The number of searched items is equal to three");
        } else {
            System.out.println("More than three items displayed");
        }
        driver.quit();



    }
}
