package pageObjects;

import elementMapper.CartPageElementMapper;
import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

import java.util.concurrent.TimeUnit;

public class CartPage extends CartPageElementMapper {

    public CartPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Pegar nome do produto")
    public String getNameProductCart(){
        return productNameCart.getText();
    }

    @Step("Adicionar quantidade")
    public void clickAdicionarQtde(){
        adicionarQtde.click();
    }

    @Step("Adicionar ao carrinho")
    public void clickCart(){
        adicionarAoCarrinho.click();
    }

    @Step("Fazer o cheeckout")
    public void clickProceedToCheckout(){
//        Browser.getCurrentDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        proceedToCheckout.click();
    }

}
