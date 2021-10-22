package testes;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import java.util.Random;

import static org.junit.Assert.*;

@Feature("Testes site de ecommerce")
public class SetupTest extends BaseTests {

    @Test
    @Story("Abrir o site")
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a url");

    }
    @Test
    @Story("Realizar o login")
    public void testLogin(){
        // Iniciar as paginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();

        home.clickBtnLogin();
        System.out.println("Click em sig in e direcionou para pagina de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()
                .concat("index.php?controller=authentication&back=my-account")));

        login.fillEmail();
        System.out.println("Preencheu o email");
        login.fillPasswd();
        System.out.println("Preencheu a senha");
        login.clickBtnSubmitLogin();
        System.out.println("Clicou em sing in");
        assertTrue((Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account"))));
        System.out.println("Validou a url de minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou minha conta no site");

    }

    @Test
    @Story("Testar pesquisa")
    public void testSearch(){

        String quest = " DRESS ";
        String questResultQtde = "7";


        //iniciar páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        //Fazer pesquisa
        home.doSearch(quest);

        //Validar a pesquisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLigther().replace("\"", ""), quest);
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtde));
    }

    @Test
    @Story("Pesquisar e adicionar ao carrinho")
    //TESTE "MAOS A MASSA" AULA - UTILIZANDO ELEMENTOS
    public void pesquisaAdicionaCarrinho(){

        String quest = " T-SHIRTS ";

        //iniciar páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();
        System.out.println("acessou  a página");

        //Fazer pesquisa
        home.doSearch(quest);
        System.out.println("fez a pesquisa");

        //Clicar no produto
        home.clickProduto();
        System.out.println("clicou no produto");

        //Adicionar ao carrinho
        home.clickAdd();
        System.out.println("adicionou no carrinho ");
    }

    @Test
    @Story("Acessar categoria")
    public void testAcessCategoryTshirts(){
        //Inicar as páginas
        HomePage home = new HomePage();
        CategoryPage category = new CategoryPage();

        //Clicar categoria t-shirts
        home.clickCategoryTShirts();

        //Validar se esta na categoria
        assertTrue(category.isPageTshirts());
    }

    @Test
    @Story("Adicionar produto")
    public void testAddProductToProductPage(){
        //Acessar a categoria t-shirts
        testAcessCategoryTshirts();

        //Iniciar páginas
        CategoryPage category = new CategoryPage();
        ProductPage pdp = new ProductPage();

        //Salva nome do produto na página de categoria
        String nameProductCategory = category.getProductNameCategory();

        //Clicar em more e ir para página do produto
        category.clickProductAddToProductPage();

        //verificar se produto ta na página de detalhes do produto
        assertTrue(pdp.getProductNamePDP().equals(nameProductCategory));

    }

    @Test
    @Story("Adicionar produto ao carrinho")
    public void testAddProductToCartPage(){
        //Acessar a pagina de produto
        testAddProductToProductPage();

        //Iniciar as páginas
        ProductPage pdp = new ProductPage();
        CartPage cart = new CartPage();

        //salvar o nome do produto na pagina de PDP
        String nameProductPDP = pdp.getProductNamePDP();

        //Clicar no botao de add ao carrinho
        pdp.clickButtonAddToCart();

        //clicar no botão Proceed To Checkout da modal
        pdp.clickButtonmodalProceedToCheckout();

        //validaçao do nome do produto no carrinho
        assertTrue(cart.getNameProductCart().equals(nameProductPDP));

    }

    @Test //DESAFIO WEB - teste para o fluxo de criação de conta de um usuário do ecommerce
    @Story("Cadastrar cliente")
    public void CadastroCliente(){
        //Inicar as páginas
        CadastroClientePage cad = new CadastroClientePage();
        CategoryPage category = new CategoryPage();
        System.out.println("acessou  a página");

        //Clicar  em login
        cad.clickBtnLogin();
        System.out.println("Click em sig in e direcionou para pagina de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()
                .concat("index.php?controller=authentication&back=my-account")));

        //Preencher email
        cad.preencherEmail();


        //Clicar em create an account
        cad.clickBtnCreateAnAccount();
        System.out.println("Clicou em criar conta");

        //Prencher dados obrigatorios
        cad.clickTitle();
        cad.preencherFirstName();
        cad.preencherLastName();
        cad.preencherPassword();
        cad.preencherNameAdress();
        cad.preencherLastNameAdress();
        cad.preencherAdress();
        cad.preencherCity();
        cad.preencherState();
        cad.preencherPostalCode();
        cad.preencherCountry();
        cad.preencherMobilePhone();
        cad.preencherReference();

        //Clicar em registrar
        cad.clickBtnCreate();
    }

    @Test // DESAFIO WEB - fluxo automatizado de compra
    @Story("Testar todo fluxo de compra")
    public void fluxoCompra(){
        testLogin();
        testAddProductToCartPage();
        CheckoutPage check = new CheckoutPage();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=order")));
        check.clickProceedToCheckout();
        assertTrue(Browser.getCurrentDriver().findElement(By.id("address_invoice_form")).getAttribute("style").equals("display: none;"));
        check.clickProceedToCheckoutAddress();
        check.clickTermsOfService();
        check.clickProceedToCheckoutShipping();
        check.clickBankwire();
        check.clickConfirm();
        System.out.println("Finalizou");
    }
}
