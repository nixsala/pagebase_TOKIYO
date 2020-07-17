package master.equipment;

import com.test.qa.testdata.masterdata.EquipmentData;
import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import com.test.qa.tokyo.DisplayDashboard.master.equipmentNV.AddPlantEquipment;
import com.test.qa.tokyo.LoginPage;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

/**
 * Author Daclas
 */
public class AddPlantEquipmentTest extends TestBase {
    @Test(groups = {"Smoke"}, priority = 1)
    public void plantequipmentSmokeTest() throws Exception {
        softAssert = new SoftAssert();
        AddPlantEquipment.clickMasterPanel();
        AddPlantEquipment.clickEquipmentPanel();
        AddPlantEquipment.clickplantequipmentField();
        softAssert.assertTrue(AddPlantEquipment.isDisplayed(), "Page is not visible");
        AddPlantEquipment.clickAddPlantEquipment();
        AddPlantEquipment.clickbut();
        softAssert.assertEquals(MethodBase.get_Text("/html/body/div[8]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[1]"),"Serial No can't be empty","there are not equal");
        AddPlantEquipment.setSerialno("S002");
        AddPlantEquipment.selectPlanteuip();
        AddPlantEquipment.selectPlantplant();
        AddPlantEquipment.setbrandname("bans");
        AddPlantEquipment.setmodelnmae("S0015");
        AddPlantEquipment.setdescription("data");
        AddPlantEquipment.clickbut();
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[7]/span/a[2]/a/i");
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[11]/div/div/div/div[2]/div/div/div[2]/button[2]");
        softAssert.assertAll();
    }
}




   /* @Test(groups = {"test", "regression"}, priority = 2, dataProviderClass = EquipmentData.class, dataProvider = "equipmentdataprovider")
    public void TokiyoequipmentTest(String serialno, String equipment, String plant, String brandname, String modelname, String descripion) throws Exception {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "LoginPage Displayed");
        PlantPanel.clickMasterPanel();
        AddPlantEquipment.clickEquipmentPanel();
        AddPlantEquipment.clickAddPlantEquipment();
        AddPlantEquipment.setSerialno(serialno);

        AddPlantEquipment.setbrandname(brandname);
        AddPlantEquipment.setmodelnmae(modelname);
        AddPlantEquipment.setdescription(descripion);
        AddPlantEquipment.clickbut();
        softAssert.assertAll();

    }*/







