package hooks;

import base.Base;
import io.cucumber.java.Before;
import util.Browsers;
import util.WebDriverFactory;

public class Hooks extends Base {
    @Before(order = 1)
    public void setup(){
        driver = WebDriverFactory.getDriver(Browsers.CHROME);
        driver.manage().window().maximize();
    }

}


