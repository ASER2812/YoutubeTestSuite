package com.example.youtubetestsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UTPanel extends TestSuiteRun{
    @BeforeMethod(groups = "panel")
    private void setPanel() throws InterruptedException {
        driver.get("https://www.youtube.com/feed/trending");
        Thread.sleep(2000);
    }
    @Test(priority = 0 , groups = "panel")
    public void previewTest() throws InterruptedException {
        WebElement videoPanel = driver.findElement(By.id("mouseover-overlay"));
        Thread.sleep(1000);


        Actions actions = new Actions(driver);
        actions.moveToElement(videoPanel).perform();

        System.out.println("Preview Test Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 1 , groups = "panel")
    public void openVideoTest() throws InterruptedException {
        WebElement videoPanel = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[2]/div[3]/ytd-shelf-renderer/div[1]/div[2]/ytd-expanded-shelf-contents-renderer/div/ytd-video-renderer[1]/div[1]/ytd-thumbnail"));
        videoPanel.click();

        Thread.sleep(1000);

        String expectedTitle = "https://www.youtube.com/watch?v=29ECwExc-_M";
        Assert.assertEquals(driver.getCurrentUrl(), expectedTitle, "URL does not match HomePage expectation");


        System.out.println("Open Video Test Passed");
        Thread.sleep(2000);
    }
    @Test(priority = 2 , groups = "panel")
    public void addToQueueTest() throws InterruptedException {

        WebElement videoPanel = driver.findElement(By.id("mouseover-overlay"));
        Thread.sleep(1000);


        Actions actions = new Actions(driver);
        actions.moveToElement(videoPanel).perform();
        WebElement addtoQueue = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[2]/div[3]/ytd-shelf-renderer/div[1]/div[2]/ytd-expanded-shelf-contents-renderer/div/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/div[3]/ytd-thumbnail-overlay-toggle-button-renderer[2]"));
        addtoQueue.click();
        Thread.sleep(1000);


        System.out.println("Add to Queue Test Passed");
        Thread.sleep(2000);
    }

}
