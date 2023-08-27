package pages.airbnb;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

public class homepage {
    private WebDriver driver;

    public homepage(WebDriver driver){
        this.driver = driver;
    }

    private final By anyWhereBtn = By.xpath("//header/div//div[2]/div[1]/div/button[1]");
    private final By whereField = By.xpath("//label[@for='bigsearch-query-location-input']");
    private final By tenthSatCheckIn= By.xpath("//*[@id=\"panel--tabs--0\"]//div[@data-testid='calendar-day-06/10/2023']");
    private final By tenthStatCheckOut = By.xpath("//*[@id=\"panel--tabs--0\"]//div[@data-testid=\"calendar-day-06/10/2023\"]");
    private final By guestsField = By.xpath("//*[@id=\"search-tabpanel\"]//div[@data-testid=\"structured-search-input-field-guests-button\"]");
    private final By adultsBtnPlusOne = By.xpath("//*[@id=\"stepper-adults\"]/button[2]");
    private final By searchBtn = By.xpath("//*[@id=\"search-tabpanel\"]//button[@data-testid=\"structured-search-input-search-button\"]");


    @SneakyThrows
    public void checkTest(){
       findElement(driver, anyWhereBtn).click();
       Thread.sleep(2000);
       findElement(driver, whereField).sendKeys("Rome,italy" + Keys.ENTER);
       Thread.sleep(2000);findElement(driver, tenthSatCheckIn).click();
       findElement(driver, tenthStatCheckOut).click();
       Thread.sleep(2000);
       findElement(driver, guestsField).click();
        Thread.sleep(2000);
       findElement(driver, adultsBtnPlusOne).click();
        Thread.sleep(2000);
        findElement(driver, searchBtn).click();
        Thread.sleep(2000);
    }

    protected   WebElement findElement(WebDriver driver, By locator) {
        var wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(4))
                .ignoring(Exception.class);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected List<WebElement> findElements(WebDriver driver, By locator){
        var wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(4))
                .ignoring(Exception.class);
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
}
