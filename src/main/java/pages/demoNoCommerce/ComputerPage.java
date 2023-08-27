package pages.demoNoCommerce;

import com.ej.drivers.CYCLONE;
import org.openqa.selenium.By;

public class ComputerPage {

    private CYCLONE.WebDriver driver;
    public ComputerPage(CYCLONE.WebDriver driver) {
        this.driver = driver;
    }

    private final By softwareBtn = By.xpath("//div[@class='picture']//a[@href='/software']");

    public SoftwarePage clickSoftwareBtn(){
        driver.elementAction().click(softwareBtn);

        return new SoftwarePage(driver);
    }


}
