package pageObjects;

import elementMapper.SearchPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class SearchPage extends SearchPageElementMapper {

    public  SearchPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Pegar texto da navegação")
    public String getTextNavigation_page(){
        return navigation_page.getText();
    }

    @Step("Validar pesquisa")
    public String getTextLigther(){
        return  lighter.getText();
    }

    @Step("Validar pesquisa")
    public String getTextHeading_counter(){
        return heading_counter.getText();
    }

    @Step("Validar pesquisa")
    public boolean isSearchPage(){
        return getTextNavigation_page().equals("Search");
    }
}
