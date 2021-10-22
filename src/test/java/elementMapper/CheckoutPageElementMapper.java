package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageElementMapper {

    @FindBy(css = ".cart_navigation a[title='Proceed to checkout']")
    public WebElement proceedToCheckout;

    @FindBy(id = "cgv")
    public WebElement termsOfService;

    @FindBy(className = "bankwire")
    public WebElement bankwire;

    @FindBy(xpath = "//*[@class='button btn btn-default button-medium']")
    public WebElement confirm;

    @FindBy(name = "processAddress")
    public WebElement proceedToCheckoutAddress;

    @FindBy(name = "processCarrier")
    public WebElement proceedToCheckoutShipping;
}
