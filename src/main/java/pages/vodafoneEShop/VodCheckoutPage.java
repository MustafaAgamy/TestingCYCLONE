package pages.vodafoneEShop;

import com.ej.drivers.CYCLONE;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class VodCheckoutPage {
    private CYCLONE.WebDriver driver;
    public VodCheckoutPage(CYCLONE.WebDriver driver){
        this.driver = driver;
    }

    private final By selectCity = By.xpath("//*[@id=\"headingOne\"]/div[1]/select");
    private final By selectArea = By.xpath("//*[@id=\"headingOne\"]/div[2]/select");
    private final By deliverToHomeBtn = By.xpath("//div[@class='checkout-DelivaryOptionsRes'][1]");
    private final By streetAddField = By.xpath("//input[@placeholder='Street Name']");
    private final By buildingNoField = By.xpath("//input[@formcontrolname='buildingNumber']");
    private final By floorNoField = By.xpath("//input[@formcontrolname='floorNumber']");
    private final By appartmentNoField = By.xpath("//input[@formcontrolname='appartmentNumber']");
    private final By deliveryAddressContBtn = By.xpath("//div[@class='checkout-addressBtn']//button");
    private final By personalInfoContBtn = By.xpath("//button[@id='shippingAddressContinue']");
    private final By alertMsg = By.xpath("//*[@id=\"collapseTwo\"]/form/div/div/div[1]/div[1]/app-alert/div/div/div/div[2]");

    @Step
    public VodCheckoutPage selectDeliveryOptions(String city, String area){
        driver.elementAction().selectByText(selectCity,city);
        driver.elementAction().selectByText(selectArea,area);
        return this;
    }

    @Step
    public VodCheckoutPage clickDeliverOption(){
        driver.elementAction().click(deliverToHomeBtn);
        return this;
    }

    @Step
    public VodCheckoutPage fillDeliveryInfo(String street, String building, String floor, String appartment){
        driver.elementAction().sendKeys(streetAddField,street);
        driver.elementAction().sendKeys(buildingNoField,building);
        driver.elementAction().sendKeys(floorNoField,floor);
        driver.elementAction().sendKeys(appartmentNoField,appartment);
        return this;
    }

    @Step
    public VodCheckoutPage clickDeliveryContBtn(){
        driver.elementAction().click(deliveryAddressContBtn);
        return this;
    }
    @Step
    public VodCheckoutPage clickPersonalContBtn(){
        driver.elementAction().click(personalInfoContBtn);
        return this;
    }

    @Step
    public String checkAlertMsg(){
        return driver.elementAction().getText(alertMsg);
    }
}
