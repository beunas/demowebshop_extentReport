package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccountPage extends TestHelperUtility {
    WebDriver driver;
    public UserAccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    /**Page Elements**/
    private final String _userName = "//div[@class='header-links']//a[@class='account']";
    @FindBy(xpath = _userName)
    private WebElement userName;


    /**User action methods**/
    public String getUserAccountEmail(){
        String email = page.getElementText(userName);
        return email;
    }
}
