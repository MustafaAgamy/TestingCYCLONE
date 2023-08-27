import com.ej.drivers.CYCLONE;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class VodafoneE2ETest extends BaseTest{

    CYCLONE.DataDriven.JsonClass jsonData;
    private final String JSON_PATH = "vodafoneEshop.json";

    @Test()
    public void E2ETest(){
        jsonData = new CYCLONE.DataDriven.JsonClass(JSON_PATH);
        Assertions.assertThat(
                vodHomePage .clickEnglishBtn()
            .clickShopByBrand()
            .clickShowMore()
            .clickProduct()
            .clickAddToBasket()
            .clickProceed()
            .selectDeliveryOptions(jsonData.readJson("City"),
                    jsonData.readJson("Area"))
            .clickDeliverOption()
            .fillDeliveryInfo(jsonData.readJson("Street"),
                    jsonData.readJson("Building"), jsonData.readJson("Floor"),
                    jsonData.readJson("Appartment"))
            .clickDeliveryContBtn()
            .clickPersonalContBtn()
            .checkAlertMsg().contains("Please enter a valid name"));
    }
}
