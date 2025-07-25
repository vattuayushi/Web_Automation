package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String expectedUrl = "https://www.facebook.com/";


        driver.get("https://www.facebook.com");

        String actualTitle = driver.getTitle();
        System.out.println("Actual Title:" + actualTitle);

        String actualUrl = driver.getCurrentUrl();
        System.out.println("Actual Url :" + actualUrl);

        if (actualUrl.equals(expectedUrl))
            System.out.println("validated");
        else
            System.out.println("invalid");


        //Thread.sleep(5000);

        driver.close();

    }
}
