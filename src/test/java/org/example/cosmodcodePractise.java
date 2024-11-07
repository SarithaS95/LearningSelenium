package org.example;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class cosmodcodePractise {
    WebDriver driver;
    @BeforeTest
    public void login()
    {
     EdgeOptions option=new EdgeOptions();
     option.addArguments("--guest");
     option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
     driver=new EdgeDriver(option);
     driver.manage().window().maximize();
    }
    @Test
    @Description("Testcase- Printing web table with the condition ")
    public void tech()
    {
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        System.out.println(driver.getTitle());
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.titleIs("Automation Practice | WebTable – CosmoCode (Formerly TeachMeSelenium)"));
        int rows=driver.findElements(By.xpath("//table[@id=\"countries\"]/tbody/tr")).size();
        int col=driver.findElements(By.xpath("//table[@id=\"countries\"]/tbody/tr/td/h3")).size();
        String firstpath="//table[@id=\"countries\"]/tbody/tr[";
        String secondpath="]/td[";
        String thridpath="]";
        //table[@id="countries"]/tbody/tr[3]/td[4]
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=col;j++)
            {
                String path=firstpath+i+secondpath+j+thridpath;
                String data=driver.findElement(By.xpath(path)).getText();
                System.out.println("Full WebTable   "+ data);

                if(data.contentEquals("Euro"))
                {
                    String sibling=path+"/following-sibling::td";
                    String preceding=path+"/preceding::td";

                    System.out.println("*****************************************************");
                    System.out.println("Sibling"+driver.findElement(By.xpath(sibling)).getText());
                    System.out.println("Preceding"+driver.findElement(By.xpath(preceding)).getText());
                    String checkboxSelect=path+"/preceding::td[3]/input[@class=\"hasVisited\"]";
                    driver.findElement(By.xpath(checkboxSelect)).click();


                }


            }
        }



    }
}
