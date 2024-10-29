package week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathActivity {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        WebElement search = driver.findElement(By.xpath("//input[@class='search__input']"));
        search.sendKeys("keyboard");

        driver.findElement(By.xpath("//button[@class='search__btn']")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//img[@alt='NPET K10 Gaming Keyboard']")).click();

        Thread.sleep(1000);

        WebElement titleElements = driver.findElement(By.xpath("//h1[@class='product__name']"));
        System.out.println(titleElements.getText());

        Thread.sleep(3000);

        driver.quit();

    }
}
