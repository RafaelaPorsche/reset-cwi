package pageObjects;

import elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.spi.LocaleNameProvider;

public class LoginPage extends LoginPageElementMapper {



    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Preencher dados do email")
    public void fillEmail(){
       email.sendKeys("rafaelapcramos@gmail.com");
    }

    @Step("Preencher dados da senha")
    public void fillPasswd(){
//        Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("rafaela852");
//        Random genSenha = new Random();

        passwd.sendKeys("rafaela852");
//        passwd.sendKeys(genSenha.nextInt(99999) + "");
    }

    @Step("Clicar no submit do login ")
    public void clickBtnSubmitLogin(){
       SubmitLogin.click();
    }

}
