package pages;

import org.openqa.selenium.*;

public class TestTest {
    private WebDriver driver;
    public SearchContext expandRootElement (WebElement element) {
        SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) driver).executeScript (
                "return arguments[0].shadowRoot", element);
        return shadowRoot;
    }

    public String getNestedTextUsingJSExecutor () {
        WebElement shadowHost = driver.findElement (By.id ("shadow_host")); //Locator
        SearchContext shadowRootOne = expandRootElement (shadowHost);
        WebElement nestedShadowHost = shadowRootOne.findElement (By.cssSelector ("#nested_shadow_host")); //Locator
        SearchContext shadowRootTwo = expandRootElement (nestedShadowHost);
        return shadowRootTwo.findElement (By.cssSelector ("#nested_shadow_content > div"))
                .getText ();

    }
}
