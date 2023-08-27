package pages.vodafoneEShop;

import com.ej.drivers.CYCLONE;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class VodShopByBrandPage {

    private CYCLONE.WebDriver driver;
    public VodShopByBrandPage(CYCLONE.WebDriver driver){
        this.driver = driver;
    }

    private final By showMoreBtn = By.xpath("//button[@class='btn btn-grey productList-button']");
    private final By iphoneProduct = By.xpath("//*[@id=\"home-0\"]/div/ul/li[22]");

    @Step
    public VodShopByBrandPage clickShowMore(){
        driver.elementAction().click(showMoreBtn);
        driver.elementAction().click(showMoreBtn);
        return this;
    }

    @Step
    public VodProductPage clickProduct(){
        driver.elementAction().click(iphoneProduct);
        return new VodProductPage(driver);
    }
}
