package pageObjects;

import elementMapper.CategoryPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryPageElementMapper {


    public CategoryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }


    @Step("Autenticar pagina de categoria T-SHIRTS")
    public boolean isPageTshirts(){
        return getAuthenticationPageTShirts().contains("T-SHIRTS");
    }

    @Step("Autenticar a pagina de categoria T-SHIRTS")
    public String getAuthenticationPageTShirts(){
        return nameCategoryTShirts.getText();
    }


    @Step("Adicionar produto")
    public void clickProductAddToProductPage(){
        BasePage.mouseOver(productNameCategory);
        buttonMoreAddToProductPage.click();
    }

    @Step("Pegar o nome da categoria")
    public String getProductNameCategory(){
        return productNameCategory.getText();
    }


}
