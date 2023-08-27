package pages.demoNoCommerce;

import com.ej.drivers.CYCLONE;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProductPage {

    private CYCLONE.WebDriver driver;
    public ProductPage(CYCLONE.WebDriver driver) {
        this.driver = driver;
    }

    private final By addToCartBtn = By.xpath("//button[@id='add-to-cart-button-11']");
    private final By closeAlertMsgBtn = By.xpath("//span[@title='Close']");
    private final By closeAlertMsgBtn1 = By.className("close");
    @Step("clickAddToCartBtn")
    public ProductPage clickAddToCartBtn(){
        driver.elementAction().click(addToCartBtn);

        return this;
    }
    @Step("closeAlertMsg")
    public ProductPage closeAlertMsg(){
        driver.elementAction().click(closeAlertMsgBtn);

        return this;
    }
}
