package week_1;

import org.openqa.selenium.edge.EdgeDriver;

public class Activity_1 {

    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://www.bbc.com/");

        String title = driver.getTitle();

        System.out.println(title);

        driver.quit();


    }

}
