package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {

    @FindBy(className = "login")
    public WebElement login;

    //@FindBy(id = "search_query_top") se for buscar por o msm nome ou id no site , n precisa de @FindBy
    public WebElement search_query_top;

    //@FindBy(id = "submit_search") se for buscar por o msm nome ou id no site , n precisa de @FindBy
    public WebElement submit_search;

    //TESTE "MAOS A MASSA" AULA - UTILIZANDO ELEMENTOS
    @FindBy(linkText = "Faded Short Sleeve T-shirts")
    public WebElement clickProduto;

    //TESTE "MAOS A MASSA" AULA - UTILIZANDO ELEMENTOS
    @FindBy(xpath = "//*[@id=\"center_column\"]")
    public WebElement clickAdd;

    @FindBy(css = "#block_top_menu .sf-menu li:nth-child(3) a[title=T-shirts]")
    public  WebElement menuTShirts;

}
