package com.example.youtubetestsuite;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class MainPageUT extends run_Suite {

    @Test (priority = 0)
    public void searchBarTest() throws InterruptedException {
        WebElement searchBar = driver.findElement(By.name("search_query"));
        searchBar.click();
        searchBar.sendKeys("gangnam style");
        Thread.sleep(1000);
        searchBar.submit();

        WebElement videoLink = driver.findElement(By.linkText("PSY - GANGNAM STYLE(강남스타일) M/V"));
        videoLink.click();

        Thread.sleep(2000);
        String expectedTitle = "https://www.youtube.com/watch?v=9bZkp7q19f0";
        Assert.assertEquals(driver.getCurrentUrl(), expectedTitle, "URL does not match HomePage expectation");

        Thread.sleep(1000);
        System.out.println("SearchTest passed");
    }
    @Test (priority = 1)
    public void YTLogoTest() throws InterruptedException {

        WebElement logo = driver.findElement(By.id("logo-icon"));
        Thread.sleep(1000);
        logo.click();

        String expectedTitle = "https://www.youtube.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedTitle, "URL does not match HomePage expectation");

        Thread.sleep(3000);
        System.out.println("YTLogoTest passed");
    }

    @Test(priority = 2, groups = "reset")
    public void sidebarMenuTest() throws InterruptedException {
        WebElement menuButton = driver.findElement(By.id("guide-button"));
        menuButton.click();
        Thread.sleep(2000);

        WebElement youPagebutton = driver.findElement(By.linkText("You"));
        youPagebutton.click();
        Thread.sleep(3000);

        String expectedTitle = "https://www.youtube.com/feed/you";
        Assert.assertEquals(driver.getCurrentUrl(), expectedTitle, "URL does not match HomePage expectation");

        System.out.println("sidebarMenuTest Passed");
    }
}
