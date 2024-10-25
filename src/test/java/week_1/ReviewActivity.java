package week_1;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class ReviewActivity {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.print("Please choose your browser chrome or edge? ");
        String userInput = input.next();

        WebDriver driver = null;

        if( userInput.equals("chrome")){
            driver = new ChromeDriver();
        }else if(userInput.equals("edge")){
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.quit();



    }
}
