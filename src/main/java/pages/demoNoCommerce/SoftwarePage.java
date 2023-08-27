package pages.demoNoCommerce;

import com.ej.drivers.CYCLONE;
import org.openqa.selenium.By;

public class SoftwarePage {

    private CYCLONE.WebDriver driver;
    public SoftwarePage(CYCLONE.WebDriver driver) {
        this.driver = driver;
    }

    private final By windowsEightBtn = By.xpath("//div[@class='picture']//a[@href='/windows-8-pro']");


    public ProductPage clickWindowsEightBtn(){
        driver.elementAction().click(windowsEightBtn);

        return new ProductPage(driver);
    }
}
