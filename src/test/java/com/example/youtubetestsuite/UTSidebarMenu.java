package com.example.youtubetestsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UTSidebarMenu extends TestSuiteRun{
    @Test(priority = 0, groups = "reset")
    public void sidebarMenuTest() throws InterruptedException {
        WebElement menuButton = driver.findElement(By.id("guide-button"));
        menuButton.click();
        Thread.sleep(2000);

        WebElement youPageButton = driver.findElement(By.linkText("You"));
        youPageButton.click();
        Thread.sleep(3000);

        String expectedTitle = "https://www.youtube.com/feed/you";
        Assert.assertEquals(driver.getCurrentUrl(), expectedTitle, "URL does not match HomePage expectation");

        System.out.println("sidebarMenuTest Passed");
    }
}
