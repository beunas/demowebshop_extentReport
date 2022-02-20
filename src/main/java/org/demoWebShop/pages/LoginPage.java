package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestHelperUtility {
    WebDriver driver;

    /**page constructor**/

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**Page elements**/

    private final String _email="//input[@id='Email']";
    @FindBy(xpath = _email) private WebElement email;

    private final String _password="//input[@id='Password']";
    @FindBy(xpath = _password) private WebElement password;

    private final String _loginButton="//input[@class='button-1 login-button']";
    @FindBy(xpath = _loginButton) private WebElement loginButton;

    /**User action methods**/

    public void enterUserName(String uname){
        page.enterText(email,uname);
    }
    public void enterPassword(String pswd){
        page.enterText(password,pswd);
    }

    public UserAccountPage clickOnLoginButton() {
        page.clickOnElement(loginButton);
        return new UserAccountPage(driver);
    }


}
