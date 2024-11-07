package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageObject {

    //without using pagefactory
    //constructor - to initialize webdriver
    //locator - Type will be BY not an Webelement
    //action -sendkeys,click
    WebDriver driver;
    pageObject()
    {
        this.driver=driver;
    }
    By username_loc= By.xpath("//input[@uname='Username']");
    By password_loc=By.id("Password");

    public void Username(String name)
    {
        driver.findElement(username_loc).sendKeys(name);
    }

    public void setPassword_loc(String Password) {
        driver.findElement(password_loc).sendKeys(Password);
    }

    //Main code
    public static void main(String[] args) {
        WebDriver driver;
        pageObject p=new pageObject();
        p.Username("hello");

    }
}
