package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import base.Base;

public class ProductsPage extends Base {

    private static final By NeededProduct = By.xpath("//*[contains(text(),'Смартфон POCO X3 Pro 256GB Phantom Black')]");

    public void navigateToTheProduct() {
        WebElement element = driver.findElement(NeededProduct); // навестись на нужный товар
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    public void clickOnItem() {
        driver.findElement(NeededProduct).click(); //нажать на товар;
    }

}
