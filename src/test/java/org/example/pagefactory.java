package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class pagefactory {
    WebDriver driver;
    pagefactory(){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='Username']")
    WebElement Username;

    @FindBy(how= How.XPATH,using = "//input[@pws='Password']")
    WebElement Password;

    @FindBy(tagName = "a")
    List<WebElement> links;

    public void setUsername(String name) {
        Username.sendKeys(name);
    }
    public void setPassword(String password) {
        Password.sendKeys(password);
    }

    public static void main(String[] args) {
        pagefactory pf=new pagefactory();
        pf.setUsername("Saritha");

    }
    }
