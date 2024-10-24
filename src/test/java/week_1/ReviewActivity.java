package week_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ReviewActivity {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.quit();

        EdgeDriver edriver = new EdgeDriver();

        edriver.manage().window().maximize();
        edriver.get("https://retail.tekschool-students.com/");
        System.out.println(edriver.getTitle());

        Thread.sleep(2000);

        edriver.quit();




    }
}
