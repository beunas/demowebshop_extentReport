package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends TestHelperUtility {
    WebDriver driver;

    /**page constructor**/
    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /**Page elements**/

    private final String _product="//td[@class='product']//a[@class='product-name']";
    @FindBy(xpath =_product ) private WebElement product;

    /**User action methods**/

    public String getProductName() {
        return  page.getElementText(product);

    }

}
