package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Base {
    protected static WebDriver driver;
    public long waiting_time = 30;
    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waiting_time));
}
