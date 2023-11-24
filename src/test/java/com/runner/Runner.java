package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Cucum\\src\\test\\FeatureFolder\\Adactin.feature",glue = "com.step", dryRun = false )
public class Runner {
    public static WebDriver driver;

    @BeforeClass
    public static void start(){
        driver = new ChromeDriver();
    }


}
