package week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");

        By vedioGame = By.xpath("/html/body/div/div/div/div[3]/div/div[2]/div/div/div/div/div[2]/img");
        WebElement vedioGameElement = driver.findElement(vedioGame);
        vedioGameElement.click();

        Thread.sleep(2000);

        By playStation = By.xpath("/html/body/div/div/div/div[3]/div/div/p[1]");
        WebElement playStationElement = driver.findElement(playStation);
        System.out.println(playStationElement.getText());

        driver.quit();
    }
}
