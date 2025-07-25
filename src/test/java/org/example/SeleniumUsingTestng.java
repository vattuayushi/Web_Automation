package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumUsingTestng {
    @Test(description = "Validating URL")
    public void validateUrl() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com/");
        String actualUrl = driver.getCurrentUrl();
        System.out.println( "Actual Url: " + actualUrl);

        String expectedURL = "https://www.facebook.com/";
        assert actualUrl.equals(expectedURL);

        driver.close();

    }

}
