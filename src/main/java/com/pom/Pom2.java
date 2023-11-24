package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
    WebDriver driver;

    @FindBy(id = "location")
    WebElement location;

    @FindBy(id = "hotels")
    WebElement selectHotels;
    @FindBy(id = "room_type")
    WebElement roomType;

    @FindBy(id = "room_nos")
    WebElement roomNos;

    @FindBy(id ="datepick_in")
    WebElement checkIn;

    @FindBy(id = "datepick_out")
    WebElement checkOut;

    @FindBy(id = "adult_room")
    WebElement adultsNos;

    @FindBy(id = "child_room")
    WebElement childNos;

    @FindBy(id = "Submit")
    WebElement searchBtn;

    public Pom2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public WebElement getLocation() {
        return location;
    }

    public WebElement getSelectHotels() {
        return selectHotels;
    }

    public WebElement getRoomType() {
        return roomType;
    }

    public WebElement getRoomNos() {
        return roomNos;
    }

    public WebElement getCheckIn() {
        return checkIn;
    }

    public WebElement getCheckOut() {
        return checkOut;
    }

    public WebElement getAdultsNos() {
        return adultsNos;
    }

    public WebElement getChildNos() {
        return childNos;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }
}
