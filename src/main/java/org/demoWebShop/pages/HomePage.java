package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends TestHelperUtility {
    WebDriver driver;

    /**page constructor**/
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /**Page elements**/
    private final String _loginMenu="//a[@class='ico-login']";
    @FindBy(xpath =_loginMenu ) private WebElement loginMenu;

    private final String _registerMenu="ico-register";
    @FindBy(className =_registerMenu ) private WebElement registerMenu;

    private final String _allMenus="//ul[@class='top-menu']//li//a";
    @FindBy(xpath =_allMenus ) private List<WebElement> allMenus;

    /**User action methods**/

    public String getHomePageTitle() {
        String title = page.getPageTitle(driver);
        return title;
    }

    public LoginPage clickOnLoginMenu() {
        page.clickOnElement(loginMenu);
        return new LoginPage(driver);
    }
    public RegisterPage clickOnRegisterMenu() {
        page.clickOnElement(registerMenu);
        return new RegisterPage(driver);
    }

    public ProductListPage clickOnProductMenu(String text) {
        for (int i = 0; i < allMenus.size(); i++) {
            String value = allMenus.get(i).getText();
            if (value.equals(text)) {
                page.clickOnElement(allMenus.get(i));
                break;
            }
        }
        return new ProductListPage(driver);
    }
}
