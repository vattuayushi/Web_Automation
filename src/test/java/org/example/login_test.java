package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login_test {
    @Test
    public void login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        /* we will login with valid credentials so for that
        need to find locators (elements)  on web page and will do the required action
        now we will find the locators for  - username , password , click on submit */

        //  here I am going to login page and searching for locater of username

        WebElement username = driver.findElement(By.id("user-name"));
        // now we have found the username element and now we will enter the username value
        username.sendKeys("standard_user");



        // Here i am going to login page and searching for locater of password

        WebElement password = driver.findElement(By.id("password"));

        // now we have found the password element and now we will enter password value
        password.sendKeys("secret_sauce");

        // entered the credentials and now we will click on login button

        WebElement button = driver.findElement(By.id("login-button"));
        button.click();



        // Now we will click on the sauce labs Bagpack link. Now Clicking on this click link we take us on another page.
        driver.findElement(By.linkText("Sauce Labs Backpack")).click();

        String result_expected = "Sauce Labs Backpack";

        String actual = driver.findElement(By.xpath("//div[@data-test=\"inventory-item-name\"]")).getText();

        Assert.assertEquals(actual, result_expected);


        // This is how we handle alert
        //Thread.sleep(5000);
        // Handle Alert
        //Alert al = driver.switchTo().alert();
        //al.accept();

        driver.findElement(By.id("add-to-cart")).click();


        driver.findElement(By.className("shopping_cart_badge")).click();
        driver.findElement(By.id("checkout")).click();
        // driver.findElement(By.xpath("//button[@data-test=\"checkout\"]")).click();


        //div[@data-test="inventory-item-desc"]
        //div[text()='Sauce Labs Backpack']
        //div[text()='Sauce Labs Backpack']/../../div[@data-test="inventory-item-desc"]





        //Thread.sleep(10000);
        //driver.close();
        //button[text() = "Add to cart"]

    }
}
