/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class ResearchAndReviewTest {

    private WebDriver driver;
    private String baseUrl;

    public ResearchAndReviewTest() {
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

    @Test
    public void researchAndReviewTest() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.cars.com/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
