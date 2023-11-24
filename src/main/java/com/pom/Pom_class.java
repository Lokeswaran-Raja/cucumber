package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {

    WebDriver driver;

    @FindBy(id="username")
    private WebElement username;

    @FindBy(id="password")
    private WebElement pass;

    @FindBy(xpath = "//input[@id='login']")
    private WebElement loginBtn;

    public Pom_class(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPass() {
        return pass;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }
}
