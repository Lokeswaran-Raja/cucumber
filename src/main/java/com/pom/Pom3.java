package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
    WebDriver driver;

    @FindBy(id = "radiobutton_0")
    WebElement radioBtn;

    @FindBy(id = "continue")
    WebElement continueBtn;

    public Pom3(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getRadioBtn() {
        return radioBtn;
    }

    public WebElement getContinueBtn() {
        return continueBtn;
    }
}
