package pages.demoNoCommerce;

import com.ej.drivers.CYCLONE;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage {

    private CYCLONE.WebDriver driver;

    public LoginPage(CYCLONE.WebDriver driver){
        this.driver = driver;
    }

    private final By emailField = By.id("Email");
    private final By passwordField =By.id("Password");
    private final By confLoginBtn = By.xpath("//button[@class=\"button-1 login-button\"]");

    @Step("fillLoginInfo")
    public LoginPage fillLoginInfo(String email, String password){
        driver.elementAction().sendKeys(emailField, email);
        driver.elementAction().sendKeys(passwordField, password);

        return this;
    }
    @Step("clickConfLoginBtn")
    public DemoNopHomePage clickConfLoginBtn(){
        driver.elementAction().click(confLoginBtn);

        return new DemoNopHomePage(driver);
    }

}
