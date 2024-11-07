package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class amazon {
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
        driver.get("https://www.amazon.in/");
        driver.getTitle();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_ya_signin']")).click();
        driver.findElement(By.className("a-input-text")).sendKeys("8500792965");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Sahasa@22");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        //driver.switchTo().alert().dismiss();
        Actions actions = new Actions(driver);
        //actions.moveToElement(
        driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("Mint");
        driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys(Keys.ENTER
        );


        List<WebElement> products = driver.findElements(By.cssSelector("span[class='a-size-base-plus a-color-base a-text-normal']"));
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getText());
            String symbol = driver.findElements(By.xpath("//span[@class='a-price-symbol']")).get(i).getText();
            String cost = driver.findElements(By.xpath("//span[@class='a-price-whole']")).get(i).getText();
            System.out.println(symbol + cost);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5));
//        WebElement mint = driver.findElement(By.xpath("//button[text()=\"Add to cart\"]"));
//

            if (products.equals("Fresh Mint Leaves, 100g")) {
                //actions.moveToElement(products.get(i).findElement(By.xpath("//button[text()=\"Add to cart\"]")).click());

                actions.moveToElement(driver.findElement(By.cssSelector("span[class='a-size-base-plus a-color-base a-text-normal']")));

                WebElement mint = driver.findElement(By.xpath("//button[text()=\"Add to cart\"]"));
                //wait.until(ExpectedConditions.elementToBeClickable(mint));
                mint.click();
            } else
                System.out.println("No search found");
        }
    }
    @AfterTest
    public void close(){
  //      driver.quit();
    }
    @Test
    public void scrollaction()
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,3000);");
        TakesScreenshot ts=(TakesScreenshot) driver;
        File sourcefile=ts.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");

        sourcefile.renameTo(targetfile);


    }
}

