package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.Base;
import java.time.Duration;

public class NeededProductPage extends Base{

    private static final By AddCartBtn = By.xpath("//div[@class='mv-main-button--content']");
    private static final By PopUpBtn = By.xpath("//a[@data-fl-close='1800']");

    public void scrollToAddCartBtn() {
        WebElement AddCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(AddCartBtn));
        Actions actions = new Actions(driver);
        actions.moveToElement(AddCartButton);
        actions.perform();
    }

    public void exitPopUp(long time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PopUpBtn)); // выключить поп-ап
    }

    public void addToCart() {
        WebElement AddCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(AddCartBtn));
        AddCartButton.click(); //нажать на кнопку покупки;
    }

}
