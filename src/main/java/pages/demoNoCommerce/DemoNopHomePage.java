package pages.demoNoCommerce;

import com.ej.drivers.CYCLONE;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class DemoNopHomePage {

   private CYCLONE.WebDriver driver;

   public DemoNopHomePage(CYCLONE.WebDriver driver){
       this.driver = driver;
   }

    private final By registerBtn = By.className("ico-register");
    private final By loginBtn = By.className("ico-login");
    private final By welcomeMsg = By.xpath("//div[@class=\"topic-block-title\"]//h2");
    private final By computerCatBtn = By.xpath("//a[@href='/computers']");
    private final By softwareCatBtn = By.xpath("//ul[@class='sublist first-level']//a[@href='/software']");


    public RegisterPage hoverAndClickRegBtn(){
        driver.elementAction().hoverTo(registerBtn).then().click(registerBtn);

        return new RegisterPage(driver);
    }
    @Step("clickRegisterBtn")
    public RegisterPage clickRegisterBtn(){
        driver.elementAction().click(registerBtn);
        return new RegisterPage(driver);
    }
    @Step("clickLoginBtn")
    public LoginPage clickLoginBtn(){
        driver.elementAction().click(loginBtn);
        return new LoginPage(driver);
    }

    public ComputerPage clickComputerBtn(){
        driver.elementAction().click(computerCatBtn);
        return new ComputerPage(driver);
    }


    @Step("hoverComputerCategory")
    public DemoNopHomePage hoverComputerCategory(){
        driver.elementAction().hoverTo(computerCatBtn);
        return this;
    }

    @Step("clickSoftwareBtn")
    public CategoriesPage clickSoftwareBtn(){
        driver.elementAction().click(softwareCatBtn);
        return new CategoriesPage(driver);
    }
    @Step("getWelcomeMsg")
    public String getWelcomeMsg(){
       return driver.elementAction().getText(welcomeMsg);
    }
}
