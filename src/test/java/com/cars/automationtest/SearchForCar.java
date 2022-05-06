/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cars.automationtest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Owner
 */
public class SearchForCar {

    private WebDriver driver;
    private String baseUrl;

    public SearchForCar() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
         System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.cars.com/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void carSearchTest() throws Exception  {
        driver.get(baseUrl);
        Select sc = new Select(driver.findElement(By.name("stock_type")));
        sc.selectByIndex(3);
        Thread.sleep(2000);
        
        Select sc2 = new Select(driver.findElement(By.id("makes")));
        sc2.selectByVisibleText("Lexus");
        Thread.sleep(2000);
        
        Select sc3 = new Select(driver.findElement(By.id("models")));
        sc3.selectByIndex(41);
        Thread.sleep(2000);
        
        Select sc4 = new Select(driver.findElement(By.name("list_price_max")));
        sc4.selectByIndex(16);
        Thread.sleep(2000);
        
        Select sc5 = new Select(driver.findElement(By.id("make-model-maximum-distance")));
        sc5.selectByVisibleText("50 miles");
        Thread.sleep(2000);
        
        driver.findElement(By.id("make-model-zip")).clear();
        driver.findElement(By.id("make-model-zip")).sendKeys("60169");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"by-make-tab\"]/div/div[7]/button")).click();
        Thread.sleep(3000);
        
        
       // driver.findElement(By.id("881e9798-3ee2-4fbd-9ed0-8c28d080007a")).click();
       // Thread.sleep(10000);
        driver.close();
        
        

    }
    @Test
    public void researchAndReviewTest() throws InterruptedException{
        driver.get(baseUrl);
        driver.manage().window().maximize();
       
        driver.findElement(By.xpath("//*[@id=\"mobile-menu-section\"]/ul[1]/li[2]/a")).click();
         JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 600)");
        Thread.sleep(2000);
        
         //driver.findElement(By.id("make-select")).click();
        Select sc = new Select(driver.findElement(By.id("make-select")));
        sc.selectByIndex(38);
        Thread.sleep(2000);
       
        Select sc1 = new Select(driver.findElement(By.name("model")));
        sc1.selectByVisibleText("LX 570");
        Thread.sleep(2000);
        
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 600)");
        Select sc2 = new Select(driver.findElement(By.name("year")));
        sc2.selectByIndex(3);
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"by-search-tab\"]/div/div/div[4]/button")).click();
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 600)");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"ae-main-content\"]/div[2]/div[2]/a")).click();
        
        
        
        
       
        
        
    }
    }
