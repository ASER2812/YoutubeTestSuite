package com.example.youtubetestsuite;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class UTLogin extends TestSuiteRun {
    String username = "lasermage2812";

    @BeforeMethod(groups = "login")
    private void setPanel() throws InterruptedException {
        driver.get("https://www.youtube.com");
        Thread.sleep(2000);
    }
    @Test(priority = 0 , groups = "login")
    public void loginTest() throws InterruptedException {
        WebElement login = driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape"));
        login.click();
        Thread.sleep(1000);

        WebElement usernameBox = driver.findElement(By.id("identifierId"));
        usernameBox.sendKeys(username);

        WebElement nextButton = driver.findElement(By.id("identifierNext"));
        nextButton.click();

        Thread.sleep(4000);

        String expectedTitle = "https://accounts.google.com/v3/signin/rejected?continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3Dhttps%";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(expectedTitle), "URL does not match that of a login" + currentUrl);

        System.out.println("Login test passed");
    }

}
