package pages.vodafoneEShop;

import com.ej.drivers.CYCLONE;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class VodShoppingCartPage {
    private CYCLONE.WebDriver driver;
    public VodShoppingCartPage(CYCLONE.WebDriver driver){
        this.driver = driver;
    }

    private final By proceedBtn = By.xpath("//div[@class='cart_checkout fontLightEnAr']//button[@class='btn btn-red']");

    @Step
    public VodCheckoutPage clickProceed(){
        driver.elementAction().click(proceedBtn);
        return new VodCheckoutPage(driver);
    }
}
