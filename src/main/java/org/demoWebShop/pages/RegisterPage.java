package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends TestHelperUtility {
    WebDriver driver;
    public RegisterPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**Page elements**/

    private final String _genderRadioButton = "//input[@id='gender-male' or @id='gender-female']";
    @FindBy(xpath = _genderRadioButton) private List<WebElement> genderRadioButton;

    private final String _firstName = "FirstName";
    @FindBy(id = _firstName) private WebElement firstName;

    private final String _lastName = "LastName";
    @FindBy(id = _lastName) private WebElement lastName;

    private final String _email = "Email";
    @FindBy(id = _email) private WebElement email;

    private final String _password = "Password";
    @FindBy(id = _password) private WebElement password;

    private final String _confirmPassword = "ConfirmPassword";
    @FindBy(id = _confirmPassword) private WebElement confirmPassword;

    private final String _registerButton = "register-button";
    @FindBy(id = _registerButton) private WebElement registerButton;


    /**User action methods**/
    public void selectGender(String gender) {
        for (int i = 0; i < genderRadioButton.size(); i++) {
            String value = genderRadioButton.get(i).getText();
            if (value.equals(gender))
            {
                page.getElementText(genderRadioButton.get(i));
                break;
            }
        }
    }
    public void enterFirstName(String fName){
        page.enterText(firstName,fName);
    }
    public void enterLastName(String lName){
        page.enterText(lastName,lName);
    }
    public void enterEmail(String eml){
        page.enterText(email,eml);
    }
    public void enterpassword(String pswd){
        page.enterText(password,pswd);
    }
    public void enterConfirmPassword(String cPswd){
        page.enterText(confirmPassword,cPswd);
    }
    public UserAccountPage clickOnRegisterButton() {
        page.clickOnElement(registerButton);
        return new UserAccountPage(driver);
    }
}
