package org.demoWebShop.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class WaitUtility {
    public static final long PAGE_LOAD_WAIT=20;
    public static  final long EXPLICIT_WAIT=50;
public enum LocatorType{
    Id,Name,Xpath,ClassName,CssSelector,TagName,LinkText,PartialLinkText;
}
    public void  waitForElementToBeVisible(WebDriver driver,String target,Enum locatorType){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        if (locatorType.equals(LocatorType.Id)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(target)));
        }
        else if (locatorType.equals(LocatorType.ClassName)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(target)));
        }
        else if(locatorType.equals(LocatorType.CssSelector)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(target)));
        }
        else if (locatorType.equals(LocatorType.TagName)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(target)));
        }
        else if (locatorType.equals(LocatorType.LinkText)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(target)));
        }
        else if (locatorType.equals(LocatorType.PartialLinkText)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(target)));
        }
        else if (locatorType.equals(LocatorType.Xpath)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(target)));
        }
        else if (locatorType.equals(LocatorType.Name)){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(target)));
        }
        else{
            try {
                throw new Exception("Invalid Locator");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void waitForElementToBeClickable(WebDriver driver,String target,Enum locatorType){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        if (locatorType.equals(LocatorType.Id)){
            wait.until(ExpectedConditions.elementToBeClickable(By.id(target)));
        }
        else if (locatorType.equals(LocatorType.ClassName)){
            wait.until(ExpectedConditions.elementToBeClickable(By.className(target)));
        }
        else if (locatorType.equals(LocatorType.CssSelector)){
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(target)));
        }
        else if (locatorType.equals(LocatorType.TagName)){
            wait.until(ExpectedConditions.elementToBeClickable(By.tagName(target)));
        }
        else if (locatorType.equals(LocatorType.LinkText)){
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText(target)));
        }
        else if (locatorType.equals(LocatorType.PartialLinkText)){
            wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(target)));
        }
        else if (locatorType.equals(LocatorType.Xpath)){
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(target)));
        }
        else if (locatorType.equals(LocatorType.Name)){
            wait.until(ExpectedConditions.elementToBeClickable(By.name(target)));
        }
        else{
            try {
                throw new Exception("Invalid Locator");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void waitForElementToBeSelected(WebDriver driver,String target,Enum locatorType){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        if (locatorType.equals(LocatorType.Id)){
            wait.until(ExpectedConditions.elementToBeSelected(By.id(target)));
        }
        else if (locatorType.equals(LocatorType.ClassName)){
            wait.until(ExpectedConditions.elementToBeSelected(By.className(target)));
        }
        else if (locatorType.equals(LocatorType.CssSelector)){
            wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector(target)));
        }
        else if (locatorType.equals(LocatorType.TagName)){
            wait.until(ExpectedConditions.elementToBeSelected(By.tagName(target)));
        }
        else if (locatorType.equals(LocatorType.LinkText)){
            wait.until(ExpectedConditions.elementToBeSelected(By.linkText(target)));
        }
        else if (locatorType.equals(LocatorType.PartialLinkText)){
            wait.until(ExpectedConditions.elementToBeSelected(By.partialLinkText(target)));
        }
        else if (locatorType.equals(LocatorType.Xpath)){
            wait.until(ExpectedConditions.elementToBeSelected(By.xpath(target)));
        }
        else if (locatorType.equals(LocatorType.Name)){
            wait.until(ExpectedConditions.elementToBeSelected(By.name(target)));
        }
        else{
            try {
                throw new Exception("Invalid Locator");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void waitFrameToBeAvailableAndSwitchToIt(WebDriver driver,String target,Enum locatorType){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        if (locatorType.equals(LocatorType.Id)){
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(target)));
        }
        else if (locatorType.equals(LocatorType.ClassName)){
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(target)));
        }
        else if (locatorType.equals(LocatorType.CssSelector)){
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(target)));
        }
        else if (locatorType.equals(LocatorType.TagName)){
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName(target)));
        }
        else if (locatorType.equals(LocatorType.LinkText)){
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.linkText(target)));
        }
        else if (locatorType.equals(LocatorType.PartialLinkText)){
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.partialLinkText(target)));
        }
        else if (locatorType.equals(LocatorType.Xpath)){
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(target)));
        }
        else if (locatorType.equals(LocatorType.Name)){
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name(target)));
        }
        else{
            try {
                throw new Exception("Invalid Locator");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
