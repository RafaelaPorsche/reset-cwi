package pageObjects;

import elementMapper.CheckoutPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CheckoutPage extends CheckoutPageElementMapper {

    public CheckoutPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Confirmar")
    public void clickProceedToCheckout(){
        proceedToCheckout.click();
    }

    @Step("Aceitar os termos e condições")
    public void clickTermsOfService(){
        termsOfService.click();
    }

    @Step("Escolher meio de pagamento")
    public void clickBankwire(){
        bankwire.click();
    }

    @Step("Confirmar compra")
    public void clickConfirm(){
        confirm.click();
    }

    @Step("Confirmando endereço de entrega")
    public void clickProceedToCheckoutAddress(){
        proceedToCheckoutAddress.click();
    }

    @Step("Confirmando o frete")
    public void clickProceedToCheckoutShipping(){
        proceedToCheckoutShipping.click();
    }
}
