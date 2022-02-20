package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestHelperUtility {
    WebDriver driver;

    /**page constructor**/
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /**Page elements**/

    private final String _addToCartButton="add-to-cart-button-14";
    @FindBy(id =_addToCartButton ) private WebElement addToCartButton;

    private final String _shoppingCartCartMenu="ico-cart";
    @FindBy(className =_shoppingCartCartMenu ) private WebElement shoppingCartCartMenu;


    /**User action methods**/

    public void clickOnShoppingCart(){
        page.clickOnElement(addToCartButton);
    }
    public ShoppingCartPage clickOnShoppingCartMenu() {
        page.clickOnElement(shoppingCartCartMenu);
        return new ShoppingCartPage(driver);
    }
}
