package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4 {
    WebDriver driver;

    @FindBy(id="first_name")
    WebElement firstName;

    @FindBy(id="last_name")
    WebElement lastName;

    @FindBy(id="address")
    WebElement billAddress;

    @FindBy(id="cc_num")
    WebElement creditCardNo;

    @FindBy(id="cc_type")
    WebElement cardType;

    @FindBy(id="cc_exp_month")
    WebElement expiryDateMnth;

    @FindBy(id="cc_exp_year")
    WebElement expiryDateYear;

    @FindBy(id="cc_cvv")
    WebElement cvvNo;

    @FindBy(id="book_now")
    WebElement bookNow;

    public Pom4(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getBillAddress() {
        return billAddress;
    }

    public WebElement getCreditCardNo() {
        return creditCardNo;
    }

    public WebElement getCardType() {
        return cardType;
    }

    public WebElement getExpiryDateMnth() {
        return expiryDateMnth;
    }

    public WebElement getExpiryDateYear(){ return expiryDateYear;}

    public WebElement getCvvNo() {
        return cvvNo;
    }

    public WebElement getBookNo() {
        return bookNow;
    }
}
