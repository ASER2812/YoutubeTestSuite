package com.example.youtubetestsuite;

import org.checkerframework.checker.signature.qual.ClassGetName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UTSidebarMenu extends TestSuiteRun{
    @Test(priority = 0)
    public void HomeButtonTest() throws InterruptedException {
        WebElement menuButton = driver.findElement(By.id("guide-button"));
        menuButton.click();
        Thread.sleep(1000);

        WebElement youPageButton = driver.findElement(By.linkText("Home"));
        youPageButton.click();
        Thread.sleep(2000);

        String expectedTitle = "https://www.youtube.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedTitle, "URL does not match HomePage expectation");

        System.out.println("HomeButtonTest Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 1, groups = "reset")
    public void ShortsButtonTest() throws InterruptedException {
        WebElement menuButton = driver.findElement(By.id("guide-button"));
        menuButton.click();
        Thread.sleep(1000);

        WebElement youPageButton = driver.findElement(By.linkText("Shorts"));
        youPageButton.click();
        Thread.sleep(2000);

        String expectedTitle = "https://www.youtube.com/shorts";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(expectedTitle), "URL does not match that a Shorts video: " + currentUrl);

        System.out.println("ShortsButtonTest Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 2, groups = "reset")
    public void SubscriptionsButtonTest() throws InterruptedException {
        WebElement menuButton = driver.findElement(By.id("guide-button"));
        menuButton.click();
        Thread.sleep(1000);

        WebElement youPageButton = driver.findElement(By.linkText("Subscriptions"));
        youPageButton.click();

        Thread.sleep(2000);
        String expectedTitle = "https://www.youtube.com/feed/subscriptions";
        Assert.assertEquals(driver.getCurrentUrl(), expectedTitle, "URL does not match HomePage expectation");

        System.out.println("SubscriptionsButtonTest Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 3, groups = "reset")
    public void YouButtonTest() throws InterruptedException {
        WebElement menuButton = driver.findElement(By.id("guide-button"));
        menuButton.click();
        Thread.sleep(1000);

        WebElement youPageButton = driver.findElement(By.linkText("You"));
        youPageButton.click();
        Thread.sleep(2000);

        String expectedTitle = "https://www.youtube.com/feed/you";
        Assert.assertEquals(driver.getCurrentUrl(), expectedTitle, "URL does not match HomePage expectation");

        Thread.sleep(2000);
        System.out.println("YouButtonTest Passed");
    }
    @Test(priority = 4, groups = "reset")
    public void HistoryButtonTest() throws InterruptedException {
        WebElement menuButton = driver.findElement(By.id("guide-button"));
        menuButton.click();
        Thread.sleep(1000);

        WebElement youPageButton = driver.findElement(By.linkText("History"));
        youPageButton.click();
        Thread.sleep(2000);

        String expectedTitle = "https://www.youtube.com/feed/history";
        Assert.assertEquals(driver.getCurrentUrl(), expectedTitle, "URL does not match HomePage expectation");

        Thread.sleep(2000);
        System.out.println("HistoryButtonTest Passed");
    }
}
