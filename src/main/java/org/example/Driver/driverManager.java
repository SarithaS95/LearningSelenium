package org.example.Driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverManager {
    public static WebDriver driver;

    public static WebDriver getDriver(String BrowserName) {

        switch (BrowserName.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                EdgeOptions option = new EdgeOptions();
                option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                option.addArguments("--guest");
                driver = new EdgeDriver(option);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Enter proper browser to continue");
        }
        return driver;
    }
}

