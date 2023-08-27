import org.testng.annotations.Test;

public class DemoNopAddToCartTest extends BaseTest{


    @Test
    public void addWindowsEightToCartTest(){
        demoNopHomePage
                .hoverComputerCategory()
                .clickSoftwareBtn()
                .clickWindowsEightBtn()
                .clickAddToCartBtn()
                .closeAlertMsg();
    }
}
