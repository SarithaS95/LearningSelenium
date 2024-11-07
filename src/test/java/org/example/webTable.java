package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class webTable {
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
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();
        int rows = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int columns = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part="]/td[";
        String third_part="]";

        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                String dynamic_xpath = first_part + i + second_part + j + third_part;
                String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(data);

                if(data.contentEquals("Helen Bennett"))
                {
                    String country=dynamic_xpath+"/following-sibling::td";
                    String company=dynamic_xpath+"/preceding-sibling::td";
                    System.out.println("******************************************************");
                    System.out.println("country   "+driver.findElement(By.xpath(country)).getText());
                    System.out.println("company   "+driver.findElement(By.xpath(company)).getText());


                }

            }
        }
    }
}






