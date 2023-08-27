package pages.vodafoneEShop;

import com.ej.drivers.CYCLONE;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class VodProductPage {
    private CYCLONE.WebDriver driver;
    public VodProductPage(CYCLONE.WebDriver driver){
        this.driver = driver;
    }

    private final By addToBasketBtn = By.xpath("//button[@class='btn btn-red btn-block fontLightEnAr']");

    @Step
    public VodShoppingCartPage clickAddToBasket(){
        driver.elementAction().click(addToBasketBtn);
        return new VodShoppingCartPage(driver);
    }
}
