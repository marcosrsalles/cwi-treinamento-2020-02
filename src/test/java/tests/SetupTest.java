package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

public class SetupTest extends BaseTests {

        @Test
        public void testOpeningBrowserAndLoadingPage() {
                assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
                System.out.println("Abrimos o navegador e carregamos a URL");
        }

        @Test
        public void testeLogin() {
                // Browser.getCurrentDriver().findElement(By.className("login")).click();
                // Iniciar as paginas
                HomePage home = new HomePage();
                LoginPage login = new LoginPage();
                home.ClickBtnLogin();
                System.out.println("foi para pagina de login");
                assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                        .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

                login.fillEmail();
                System.out.println("preencheu email");
                login.fillpasswd();
                System.out.println("preencheu senha");
                login.clickBtnSubmitLogin();
                System.out.println("Clicou em Sign In");
                assertTrue((Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()
                        .concat("index.php?controller=my-account"))));
                System.out.println("Validou a url de minha conta");
                Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT");
                System.out.println("Validou minha conta no site");

        }

        @Test
        public void testSearch() {

                String quest = "DRESS";
                String questResultQtd = "7";

                //Inicia as paginas
                HomePage home = new HomePage();
                SearchPage search = new SearchPage();

                // Fazer a pesquisa
                home.doSearch(quest);

                //Validar a pesquisa
                Assert.assertTrue(search.isSearchPage());
                assertEquals(search.getTextLighter().replace("\"", ""), quest);
                assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));
        }

        @Test
        public void testAcessCategoryTShirts() {
                //Iniciar as paginas
                HomePage home = new HomePage();
                CategoryPage category = new CategoryPage();

                //Clicar na categoria T-Shirt
                home.clickCategoryTShirts();

                //Validar se esta na categoria T-Shirts
                assertTrue(category.isPageTShirts());

        }

        @Test
        public void testeAddProductToProductPage() {
                //Acessar a categoria T-Shirt
                testAcessCategoryTShirts();

                //Iniciar as paginas
                CategoryPage category = new CategoryPage();
                ProductPage pdp = new ProductPage();

                //Salva nome produto do produto na categoria
                String nameProdutctCategory = category.getProductNameCategory();

                //Clicar em more e redirecionar para a pagina de produto
                category.clickProductAddToProductPage();

                //Verificar se o produto esta na pagina de detalhes do produto corretamente
                assertTrue(pdp.getProductNamePDP().equals(nameProdutctCategory));
        }

        @Test
        public void testcreatAccount() {
                //iniciar paginas
                HomePage home = new HomePage();
                home.ClickBtnLogin();
                CreatAccount creat = new CreatAccount();
                creat.clickEmailCreat();
                creat.fillemailCreat();
                creat.clickSubmitCreate();
                System.out.println("Clicou em criar conta");
                System.out.println("Foi para pagina de criaçao de conta");
                creat.idGenderMrClick();
                System.out.println("Clicou no genero Mr");
                creat.fillcustomer_firstname();
                creat.fillpasswd();
                System.out.println("Preencheu a senha");
                creat.filldays();
                System.out.println("preencheu dia de nascimento");
                creat.fillmonths();
                System.out.println("preencheu mes de nascimento");
                creat.fillyears();
                System.out.println("preencheu o ano de nascimento");
                creat.fillfirstname();
                System.out.println("preencheu o primeiro nome");
                creat.filllastname();
                System.out.println("preencheu o segundo nome");
                creat.filladdress1();
                System.out.println("preencheu o endereço");
                creat.fillcity();
                System.out.println("Preencheu a cidade");
                creat.fillid_state();
                System.out.println("Preencheu o estado");
                creat.fillid_country();
                System.out.println("Preencheu o País");
                creat.fillpostcode();
                System.out.println("Preencheu o CEP");
                creat.fillphone_mobile();
                System.out.println("Preencheu o telefone");
                creat.fillalias();
                System.out.println("Preencheu a referencia de endereços");
                creat.clicksubmitAccount();
                System.out.println("clicou em register");
                Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT");
                System.out.println("Criou a conta");


        }


}


