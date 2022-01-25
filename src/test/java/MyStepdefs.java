import Pages.MainPage;
import Pages.NeededProductPage;
import Pages.ProductsPage;
import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs extends Base {
    MainPage main = new MainPage();
    ProductsPage pages = new ProductsPage();
    NeededProductPage productPage = new NeededProductPage();


    @When("I open the {string} site page")
    public void iOpenTheSitePage(String url) {
        main.openSite(url);
    }

    @Then("Page opened")
    public void pageOpened() {
    }

    @And("Enter {string} in search field")
    public void enterProductNameInSearchField(String keysToSend) {
        main.enterNameProduct(keysToSend);
    }

    @And("Click on Найти")
    public void clickOnНайти() throws Throwable {
        main.clickSearch();
    }

    @Then("Navigate to the neededProduct")
    public void navigateToTheNeededProduct() {
        pages.navigateToTheProduct();
    }

    @And("Select neededProduct on item page")
    public void selectNeededProductOnItemPage() {
        pages.clickOnItem();
    }

    @Then("Scroll to Добавить в корзину button")
    public void scrollToДобавитьВКорзинуButton() {
        productPage.scrollToAddCartBtn();
    }

    @And("Exit pop-up")
    public void exitPopUp() {
        productPage.exitPopUp(10);
    }

    @And("Click on Добавить в корзину button")
    public void clickOnДобавитьВКорзинуButton() {
        productPage.addToCart();
    }

}
