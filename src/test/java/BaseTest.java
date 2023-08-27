import com.ej.drivers.CYCLONE;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.demoNoCommerce.DemoNopHomePage;
import pages.internetHerokuapp.HerokuappHomePage;
import pages.vodafoneEShop.VodHomePage;



public class BaseTest {


    private CYCLONE.WebDriver driver;

    protected DemoNopHomePage demoNopHomePage;
    protected VodHomePage vodHomePage;
    protected HerokuappHomePage herokuappHomePage;

    @BeforeMethod
//    @Parameters({"browser"})
    protected void setUp() {
        driver = new CYCLONE.WebDriver();
        driver.browserAction().navigateToURL();
        returnVodHome();
    }

    public VodHomePage returnVodHome(){
        return new VodHomePage(driver);
    }

    public DemoNopHomePage returnDemoNopHome(){
        return new DemoNopHomePage(driver);
    }
    public HerokuappHomePage returnHerokuappHome(){
        return new HerokuappHomePage(driver);
    }

    @AfterMethod
    protected void tearDown(){ driver.quit();}
    
}
