package week_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Activity_1 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.bbc.com/");

        String title = driver.getTitle();

        System.out.println(title);

        driver.quit();


    }

}
