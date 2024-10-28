package week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Activity1 {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        WebElement search = driver.findElement(By.id("searchInput"));
        search.sendKeys("TV");

        WebElement searchBtn = driver.findElement(By.id("searchBtn"));
        searchBtn.click();

        Thread.sleep(1000);

        By tvLocator = By.xpath("/html/body/div/div/div/div[3]/div/div/img");
        WebElement tvElements = driver.findElement(tvLocator);
        tvElements.click();

        Thread.sleep(1000);

        By titleLocator = By.xpath("/html/body/div/div/div/div[3]/div/div/div[2]/h1");
        WebElement titleElements = driver.findElement(titleLocator);
        System.out.println(titleElements.getText());

        Thread.sleep(3000);

        driver.quit();

    }
}
