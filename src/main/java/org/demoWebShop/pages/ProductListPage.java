package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductListPage extends TestHelperUtility {
    WebDriver driver;

    /**page constructor**/
    public ProductListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    /**Page elements**/

    private final String _sortByOption="products-orderby";
    @FindBy(id = _sortByOption) private List<WebElement> sortByOption;

    private final String _blackDaimond="//h2[@class='product-title']//a[@href='/black-white-diamond-heart']";
    @FindBy(xpath =_blackDaimond ) private List<WebElement> blackDaimond;

    /**User action methods**/
    public void clickOnSortBy(String text) {
        for (int i=0;i<sortByOption.size();i++) {
            String value = sortByOption.get(i).getText();
            if (value.equals(text)) {
                page.selectDropDownByVisibleText(sortByOption.get(i),text);
            }
        }
    }
    public ProductPage clickOnProduct(String prdt) {
        for (int i=0;i<blackDaimond.size();i++) {
            String value = blackDaimond.get(i).getText();
            if (value.equals(prdt)) {
                page.clickOnElement(blackDaimond.get(i));
            }
        }
        return new ProductPage(driver);
    }

}
