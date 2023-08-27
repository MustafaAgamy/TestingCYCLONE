import com.ej.drivers.CYCLONE;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class DemoNopLoginTest extends BaseTest{

    CYCLONE.DataDriven.JsonClass jsonData;
    String JSON_FILE = "registerData.json";

    @Test
    public void loginTest(){
        jsonData = new CYCLONE.DataDriven.JsonClass(JSON_FILE);

        Assertions.assertThat(
                demoNopHomePage
                        .clickLoginBtn()
                        .fillLoginInfo(
                                jsonData.readJson("Email"),
                                jsonData.readJson("Password"))
                        .clickConfLoginBtn()
                        .getWelcomeMsg())
                            .matches(".*our store.*")
                            .isNotNull()
                            .hasSizeGreaterThan(10);

    }
}
