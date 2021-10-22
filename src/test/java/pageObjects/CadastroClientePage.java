package pageObjects;

import elementMapper.CadastroClienteElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

import java.util.Random;


public class CadastroClientePage extends CadastroClienteElementMapper {

    public CadastroClientePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Clicando em login")
    public void clickBtnLogin(){
        login.click();
    }

    @Step("Clicando em botão de criar conta")
    public void clickBtnCreateAnAccount(){
        create.click();

    }

    public void clickTitle(){
        title.click();
    }


    @Step("Preencher email")
    public void preencherEmail(){
        Random gen = new Random();
        emailAddress.sendKeys( gen.nextInt(99999) + "@cwi.com");
    }

    @Step("Preencher primeiro nome")
    public void preencherFirstName(){
        firstName.sendKeys("Rafaela");
    }

    @Step("Preencher restante do nome")
    public void preencherLastName(){
        lastName.sendKeys("Porsche Coelho Ramos");
    }

    @Step("Preencher senha")
    public void preencherPassword(){
        password.sendKeys("rafaela852");
    }

    @Step("Preencher nome de destinatario")
    public void preencherNameAdress(){
        nameAdress.sendKeys("Rafaela");
    }

    @Step("Preencher endereço")
    public void preencherAdress(){
        adress.sendKeys("Rua Gramado 55");
    }

    @Step("Preencher restante do nome do destinatario")
    public void preencherLastNameAdress(){
        lastNameAdress.sendKeys("Porsche");
    }

    @Step("Preencher cidade")
    public void preencherCity(){
        city.sendKeys("New York");
    }

    @Step("Preencher estado")
    public void preencherState(){
        BasePage.mouseOver(state);
        state.sendKeys("New York");
    }

    @Step("Preencher CEP")
    public void preencherPostalCode(){
        postalCode.sendKeys("07305");
    }

    @Step("Preencher telefone de contato")
    public void preencherMobilePhone(){
        mobilePhone.sendKeys("5551958784536");
    }

    @Step("Preencher uma referencia")
    public void preencherReference(){
        reference.sendKeys("Rua Engenheiro 74");
    }

    @Step("Preencher país")
    public void preencherCountry(){
        BasePage.mouseOver(country);
        country.sendKeys("United States");
    }

    @Step("Clicar em registrar cadastro")
    public void clickBtnCreate(){
        registrer.click();
    }
}





