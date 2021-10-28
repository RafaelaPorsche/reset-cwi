package elementMapper;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPageElementMapper {

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]")
    public WebElement nameCategoryTShirts;

    @FindBy(css = ".product-container")
    public WebElement product;

    @FindBy(css = ".button[title=View]")
    public WebElement buttonMoreAddToProductPage;

    @FindBy(css = ".product_list .product-name")
    public WebElement productNameCategory;

}
