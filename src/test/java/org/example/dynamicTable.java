package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamicTable {
    WebDriver driver;

    @BeforeTest
    public void preReq() {
        EdgeOptions option = new EdgeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        option.addArguments("--guest");
        driver = new EdgeDriver(option);
    }

    @Test
    public void login() {
        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Admin");
        driver.findElement(By.id("password")).sendKeys("Password@123");
        driver.findElement(By.id("log-in")).click();

    }
}
