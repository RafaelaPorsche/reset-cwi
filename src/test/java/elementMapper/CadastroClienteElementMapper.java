package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroClienteElementMapper {

    @FindBy(className = "login")
    public WebElement login;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
    public WebElement create;

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    public WebElement emailAddress;

    @FindBy(id = "uniform-id_gender2")
    public WebElement title;

    @FindBy (id = "customer_firstname")
    public WebElement firstName;

    @FindBy(id = "customer_lastname")
    public WebElement lastName;

    @FindBy (name = "passwd")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"firstname\"]")
    public WebElement nameAdress;

    @FindBy(xpath = "//*[@id=\"lastname\"]")
    public WebElement lastNameAdress;

    @FindBy(id = "address1")
    public WebElement adress;

    @FindBy(xpath = "//*[@id=\"city\"]")
    public WebElement city;

    @FindBy(xpath = "//*[@id=\"id_state\"]")
    public WebElement state;

    @FindBy(xpath = "//*[@id=\"postcode\"]")
    public WebElement postalCode;

    @FindBy(xpath = "//*[@id=\"phone_mobile\"]")
    public WebElement mobilePhone;

    @FindBy(xpath = "//*[@id=\"alias\"]")
    public WebElement reference;

    @FindBy(xpath = "//*[@id=\"id_country\"]")
    public WebElement country;

    @FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
    public WebElement registrer;






}


