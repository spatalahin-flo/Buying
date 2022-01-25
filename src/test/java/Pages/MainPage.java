package Pages;

import org.openqa.selenium.By;
import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends Base {

    private static final By SearchBtn = By.className("input__field");
    private static final By FindBtn = By.className("search-icon-wrap");

    public void openSite(String url) {
        driver.get(url); //открыть сайт;
    }

    public void enterNameProduct(String keysToSend) {

        WebElement SearchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(SearchBtn));
        SearchButton.sendKeys(keysToSend); // ввести имя продукта в поле поиска;
    }

    public void clickSearch() {
        driver.findElement(FindBtn).click(); //нажать на кнопку найти;
    }

}
