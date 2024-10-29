package week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathActivity2 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        WebElement singin = driver.findElement(By.xpath("//a[text()='Sign in']"));
        singin.click();

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("mohammad2536@gmail.com");
        Thread.sleep(1000);

        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("Password@123");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//Button[text()='Login']")).click();

        Thread.sleep(3000);

        WebElement logout = driver.findElement(By.xpath("//Button[text()='Log out']"));

        if(logout.isDisplayed()) System.out.println("logged in");
        else System.out.println("not logged in");

        driver.quit();

    }
}
