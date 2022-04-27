/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cars.automationtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 *
 * @author Falguni
 */
public class Testsignup {

    private WebDriver driver;
    private String baseUrl;

    public Testsignup() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testsign() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.cars.com/");
        //Thread.sleep(10000);

        driver.findElement(By.linkText("Sign Up")).click();
        Thread.sleep(10000);
        driver.findElement(By.id("user_first_name")).sendKeys("Falguni");
        driver.findElement(By.id("user_last_name")).sendKeys("Patel");
        driver.findElement(By.id("user_email")).sendKeys("falguniusa9516@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("Falguni@3101984");
        driver.findElement(By.id("user_confirm_password")).sendKeys("Falguni@3101984");
        Thread.sleep(10000);
        driver.findElement(By.id("user_confirm_password")).sendKeys(Keys.ENTER);

        //  driver.findElement(By.cssSelector("sds-button")).click();
    }
}
