package pages.internetHerokuapp;

import com.ej.drivers.CYCLONE;
import org.openqa.selenium.By;

public class HerokuappHomePage {

    private CYCLONE.WebDriver driver;

    public HerokuappHomePage(CYCLONE.WebDriver driver){
        this.driver = driver;
    }

    private final By javaScriptAlertBtn = By.xpath("//ul//li//a[@href='/javascript_alerts']");


    public HerokuappJavaScriptPage clickJavaScriptAlertBtn(){
        driver.elementAction().click(javaScriptAlertBtn);
        return new HerokuappJavaScriptPage(driver);
    }
}
