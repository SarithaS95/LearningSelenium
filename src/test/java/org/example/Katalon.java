package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Katalon {
    @Description("Testcase1")
    @Test
        public void KatalonLogin() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--guest");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
        //implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));


        driver.findElement(By.id("btn-make-appointment")).click();
        //Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        String name = driver.findElement(By.xpath("//input[@aria-describedby=\"demo_username_label\"]")).getText();
        String password = driver.findElement(By.xpath("//input[@aria-describedby=\"demo_password_label\"]")).getText();
        System.out.println(name);
        System.out.println(password);
        //Thread.sleep(2000);
        System.out.println(driver.getTitle());

        driver.findElement(By.id("txt-username")).sendKeys(name);
        driver.findElement(By.id("txt-password")).sendKeys(password);
        driver.findElement(By.id("btn-login")).click();
        WebElement errmsg = driver.findElement(By.xpath("//input[@aria-describedby=\"demo_username_label\"] "));
        String Error = errmsg.getText();
        System.out.println(Error);

        }
}

