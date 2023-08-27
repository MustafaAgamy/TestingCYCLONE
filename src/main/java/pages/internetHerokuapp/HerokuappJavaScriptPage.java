package pages.internetHerokuapp;

import com.ej.drivers.CYCLONE;
import org.openqa.selenium.By;

public class HerokuappJavaScriptPage {

    private CYCLONE.WebDriver driver;

    public HerokuappJavaScriptPage(CYCLONE.WebDriver driver){
        this.driver = driver;
    }

    private final By javaScriptAlertBtn = By.xpath("//button[@onclick='jsAlert()']");
    private final By javaScriptAlertOptionsBtn = By.xpath("//button[@onclick='jsConfirm()']");
    private final By javaScriptPromptBtn = By.xpath("//button[@onclick='jsPrompt()']");
    private final By resultMsg = By.xpath("//p[@id='result']");


    public HerokuappJavaScriptPage clickJavaScriptAlertBtnAndDismissAlert(){
        driver.elementAction().click(javaScriptAlertBtn);
        driver.alertAction().dismissAlert();
        return this;
    }

    public HerokuappJavaScriptPage clickJavaScriptAlertBtnAndAcceptAlert(){
        driver.elementAction().click(javaScriptAlertOptionsBtn);
        driver.alertAction().acceptAlert();
        return this;
    }

    public HerokuappJavaScriptPage clickJavaScriptAlertBtnAndCancelAlert(){
        driver.elementAction().click(javaScriptAlertOptionsBtn);
        driver.alertAction().dismissAlert();
        return this;
    }

    public HerokuappJavaScriptPage clickJavaScriptPromptBtnAndTypeAndAccept(){
        driver.elementAction().click(javaScriptPromptBtn);
        driver.alertAction().typeIntoAlert("MostafaAgamy").acceptAlert();
        return this;
    }

    public HerokuappJavaScriptPage clickJavaScriptPromptBtnAndTypeAndAcceptTest(){
        driver.elementAction().click(javaScriptPromptBtn);
        driver.seleniumDriver().switchTo().alert().sendKeys("123245");

        driver.alertAction().acceptAlert();
        return this;
    }
    public HerokuappJavaScriptPage clickJavaScriptPromptBtnAndTypeAndDismiss(){
        driver.elementAction().click(javaScriptPromptBtn);
        driver.alertAction().typeIntoAlert("MostafaAgamy").dismissAlert();
        return this;
    }

    public String getResultText(){
       return driver.elementAction().getText(resultMsg);
    }
}
