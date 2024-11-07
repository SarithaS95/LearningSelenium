package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class dynamicDropdown {
    WebDriver driver;
    @BeforeTest
    public void preReq() {
        EdgeOptions option = new EdgeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        option.addArguments("--guest");
        driver = new EdgeDriver(option);
    }
    @Test
    public void dynamic(){
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.getTitle();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        List<WebElement> products=driver.findElements(By.xpath("//h4[@class='product-name']"));
        for(WebElement product:products)
        {
            String name= Arrays.toString(product.getText().split(" "));
            System.out.println("Products "+name);
            if (product.equals("Brinjal"))
            {
                driver.findElement(By.cssSelector("a.increment")).click();
                driver.findElement(By.xpath("//div[@class='product-action']")).click();
            }
            System.out.println("Clicked on product");
        }
    }


}
