package pages.vodafoneEShop;

import com.ej.drivers.CYCLONE;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class VodHomePage {

    private CYCLONE.WebDriver driver;


    public VodHomePage(CYCLONE.WebDriver driver){
        this.driver = driver;
    }
    private final By englishBtn = By.className("lang");
    private final By shopByBrandIOS = By.xpath("//li[7]//a[@id='shopByBrandCard']");

    @Step
    public VodHomePage clickEnglishBtn(){
        driver.elementAction().click(englishBtn);
        return this;
    }

    @Step
    public VodShopByBrandPage clickShopByBrand(){
        driver.elementAction().click(shopByBrandIOS);
        return new VodShopByBrandPage(driver);
    }
}
