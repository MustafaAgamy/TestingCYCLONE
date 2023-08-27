package pages.demoNoCommerce;

import com.ej.drivers.CYCLONE;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CategoriesPage {

    private CYCLONE.WebDriver driver;

    public CategoriesPage(CYCLONE.WebDriver driver){
        this.driver = driver;
    }

    private final By windowsEightBtn = By.xpath("//div[@class='picture']//a[@href='/windows-8-pro']");
    private final By windowsEightBtn1 = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a");
    @Step("clickWindowsEightBtn")
    public ProductPage clickWindowsEightBtn(){
        driver.elementAction().click(windowsEightBtn1);
        return new ProductPage(driver);
    }
}
