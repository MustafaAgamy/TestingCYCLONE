import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class HeroKuAppTest extends BaseTest{

    @Test
    public void testJSAlert(){
        herokuappHomePage
                .clickJavaScriptAlertBtn()
                .clickJavaScriptAlertBtnAndDismissAlert();
    }

    @Test
    public void testJSAlertAndAccept(){
        herokuappHomePage
                .clickJavaScriptAlertBtn()
                .clickJavaScriptAlertBtnAndAcceptAlert();
    }

    @Test
    public void testJSAlertAndDismiss(){
        herokuappHomePage
                .clickJavaScriptAlertBtn()
                .clickJavaScriptAlertBtnAndCancelAlert();
    }

    @Test
    public void testJSPromptTypeAndAccept(){
        Assertions.assertThat(herokuappHomePage
                .clickJavaScriptAlertBtn()
                .clickJavaScriptPromptBtnAndTypeAndAccept()
                .getResultText())
                    .isNotNull()
                    .matches(".*Mostafa.*")
                    .hasSizeGreaterThan(0);
    }

    @Test
    public void testJSPromptTypeAndAcceptTest(){
        herokuappHomePage
                .clickJavaScriptAlertBtn()
                .clickJavaScriptPromptBtnAndTypeAndAcceptTest();
    }

    @Test
    public void testJSPromptTypeAndDismiss(){
        herokuappHomePage
                .clickJavaScriptAlertBtn()
                .clickJavaScriptPromptBtnAndTypeAndDismiss();
    }
}
