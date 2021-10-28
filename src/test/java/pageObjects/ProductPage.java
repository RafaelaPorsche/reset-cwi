package pageObjects;

import elementMapper.ProductPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ProductPageElementMapper {

    public ProductPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Verificar se produto ta na página de detalhes do produto")
    public String getProductNamePDP(){
        return productNamePDP.getText();
    }

    @Step("Clicar em adicionar ao carrinho ")
    public void clickButtonAddToCart(){
        buttonAddToCart.click();
    }

    @Step("Clicar para fazer cheeckout")
    public void clickButtonmodalProceedToCheckout(){
        buttonModalProceedToCheckout.click();
    }

    @Step("Clicar para fazer cheeckout")
    public void clickProceedToCheckout(){
        proceedToCheckout.click();
    }

}
