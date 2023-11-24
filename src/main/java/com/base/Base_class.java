package com.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Base_class {

    public static WebDriver driver;

    public static Actions act;

    public static Robot robot;

    public static void url( WebDriver driver,String value){
        driver.get(value);

    }

    public  static void maxi(WebDriver driver){
        driver.manage().window().maximize();
    }

    public static void input(WebElement ref, String value){
        ref.sendKeys(value);
    }

    public static void tab(WebElement ref){
        ref.click();
    }

    public static void selectIndex(WebElement ref,int num){
        Select s=new Select(ref);
        s.selectByIndex(num);
    }

    public static void selectValue(WebElement ref,String value){
        Select s=new Select(ref);
        s.selectByValue(value);
    }
    public static void selectVisible(WebElement ref,String value){
        Select s=new Select(ref);
        s.selectByVisibleText(value);
    }

    public static void moveToElement(WebElement ref){
        act=new Actions(driver);
        act.moveToElement(ref).perform();
    }

    public static void dragAndDrop(WebElement drag, WebElement drop){
        act=new Actions(driver);
        act.dragAndDrop(drag,drop).perform();
    }

    public static void contextClick(){
        act=new Actions(driver);
        act.contextClick().perform();
    }

    public static void acceptAlert(){


        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static void dismissAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public static void inputAlert(String value){


        Alert alert = driver.switchTo().alert();
        alert.sendKeys(value);

    }




    public static void enterRobot() {

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void copyRobot() {

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
    }

    public static void switchFrame(WebElement ref){
        driver.switchTo().frame(ref);
    }

    public static void parentFrame(){
        driver.switchTo().parentFrame();
    }

    public static void defaultFrame(){
        driver.switchTo().defaultContent();
    }

    public static void screenshot(WebDriver driver,String value) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Cucum\\snap\\"+value);
        FileUtils.copyFile(screenshotAs,destination);

    }





}
