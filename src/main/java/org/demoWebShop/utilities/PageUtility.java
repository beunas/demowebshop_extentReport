package org.demoWebShop.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;
import java.util.Set;

public class PageUtility {

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void enterText(WebElement element, String value) {
        element.sendKeys(value);
    }
    public String getPageTitle(WebDriver driver){
       return driver.getTitle();
    }

    public String getElementText(WebElement element) {
        return element.getText();
    }

    public String getAttributeValue(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    public String getTagName(WebElement element) {
        return element.getTagName();
    }

    public Point getLocation(WebElement element) {
        return element.getLocation();
    }

    public Dimension getDimensions(WebElement element) {
        return element.getSize();
    }

    public boolean isSelected(WebElement element) {
        return element.isSelected();
    }

    public boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public boolean isEnabled(WebElement element) {
        return element.isEnabled();
    }

    public void clearValue(WebElement element) {
        element.clear();
    }

    public void selectDropDownByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public void deSelectDropDownByText(WebElement element, String value) {
        Select select = new Select(element);
        select.deselectByVisibleText(value);
    }

    public void selectDropDownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public void deSelectDropDownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.deselectByValue(value);
    }

    public void selectDropDownByIndex(WebElement element, int value) {
        Select select = new Select(element);
        select.selectByIndex(value);
    }
    public void deSelectDropDownByIndex(WebElement element, int value) {
        Select select = new Select(element);
        select.deselectByIndex(value);
    }

    public List<WebElement> dropDownValuesOptions(WebElement element) {
        Select select = new Select(element);
        return select.getOptions();
    }
    public void selectDropDownByisMultiple(WebElement element) {
        Select select = new Select(element);
        select.isMultiple();
    }
    public void dropDownDeSelectall(WebElement element) {
        Select select = new Select(element);
        select.deselectAll();
    }

    public void acceptAlert(WebDriver driver) {
       Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void enterTextOnAlert(WebDriver driver, String value) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(value);
    }
    public void confirmationAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
    }
    public String getAlertText(WebDriver driver) {
        Alert alert=driver.switchTo().alert();
        return alert.getText();
    }

    public void doubleClickOnElement(WebDriver driver,WebElement element) {
        Actions actions = new Actions(driver);
        actions.doubleClick(element).build().perform();
    }
    public void rightClickOnElement(WebDriver driver,WebElement source) {
        Actions actions = new Actions(driver);
        actions.contextClick(source).build().perform();
    }
    public void dragAndDropOnTarget(WebDriver driver,WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();
    }
    public void dragAndDropToaPosition(WebDriver driver,WebElement source, int x, int y) {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(source, x, y).build().perform();
    }
    public void moveToAnElement(WebDriver driver,WebElement source, int x, int y) {
        Actions actions = new Actions(driver);
        actions.moveToElement(source, x, y).build().perform();
    }

    public void mouseHoverToAnElement(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void navigateToApplication(WebDriver driver,String url)
    {
        driver.navigate().to(url);
    }
    public void navigateForwardApplication(WebDriver driver)
    {
        driver.navigate().forward();
    }
    public void navigateBackApplication(WebDriver driver)
    {
        driver.navigate().back();
    }
    public void navigateRefreshApplication(WebDriver driver)
    {
        driver.navigate().refresh();
    }
    public void switchToframeByIndex(WebDriver driver, int i) {
        Frame frame = new Frame();
        driver.switchTo().frame(i);
    }

    public void switchToframeByNameOrId(WebDriver driver, String value) {
        Frame frame = new Frame();
        driver.switchTo().frame(value);
    }

    public void switchToframeByWebElement(WebDriver driver, WebElement element) {
        Frame frame = new Frame();
        driver.switchTo().frame(element);
    }
    public String getWindowHandleId(WebDriver driver){
        return driver.getWindowHandle();
    }

    public Set<String> getWindowHandlesId(WebDriver driver){
        return driver.getWindowHandles();
    }


}


