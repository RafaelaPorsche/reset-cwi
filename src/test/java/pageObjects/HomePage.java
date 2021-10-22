package pageObjects;

import elementMapper.HomePageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
//import org.w3c.dom.html.HTMLInputElement;
//import org.w3c.dom.html.HTMLInputElement;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Clicar em btn de login")
    public void clickBtnLogin(){
        login.click();
    }

    @Step("Clicar para pesquisar")
    public void clickSearch_query_top(){
        search_query_top.click();
    }

    @Step("Pesquisando")
    public void sendKeysSearch_query_top(String keys){
        search_query_top.sendKeys(keys);
    }

    @Step("Fazer pesquisa")
    public void clickSubmit_search(){
        submit_search.click();
    }

    @Step("Fazer pesquisa")
    public void doSearch(String quest){
        clickSearch_query_top();
        sendKeysSearch_query_top(quest);
        clickSubmit_search();
    }

    @Step("Clicar no produto")
    //TESTE "MAOS A MASSA" AULA - UTILIZANDO ELEMENTOS
    public void clickProduto(){
        clickProduto.click();
    }

    @Step("Clicar para adicionar produto")
    //TESTE "MAOS A MASSA" AULA - UTILIZANDO ELEMENTOS
    public void clickAdd(){
        clickAdd.click();
    }
    @Step("Clicar em categoria T-SHIRTS")
    public void clickCategoryTShirts(){
        menuTShirts.click();
    }
}
