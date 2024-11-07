package org.example;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class actionsClass {
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
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.getTitle();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    }
}
