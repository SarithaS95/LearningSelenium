package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class datepicker {
    WebDriver driver;

    @BeforeTest
    public void preReq() {
        EdgeOptions option = new EdgeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        option.addArguments("--guest");
        driver = new EdgeDriver(option);
    }

    @Test
    public void dynamic() {
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.getTitle();
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
      //  driver.switchTo().frame( By.xpath("//*[@id='demo-frame']");
       driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/03/2024");
    }


     }

