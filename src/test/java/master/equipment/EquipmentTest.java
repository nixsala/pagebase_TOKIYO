package master.equipment;


import com.test.qa.tokyo.DisplayDashboard.master.equipmentNV.Equipment;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;

/**
 * Author Daclas
 */
public class EquipmentTest extends TestBase {
    @Test(groups = {"Smoke" },priority = 1)
    public void equipment() throws Exception {
        softAssert = new SoftAssert();
        Equipment.clickMasterPanel();
        Equipment.clickequipmenttab();
        Equipment.clickequipment();
        softAssert.assertTrue(Equipment.isDisplayed(),"Sorry we could not find" );
        Equipment.clickaddequipment();
        Equipment.clicksavebtn();
        //here check validation Message
        softAssert.assertEquals(MethodBase.get_Text("/html/body/div[6]/div/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div[1]"),"Name can't be empty","there are not equal");
        Equipment.setEquipment("Ovendrier");
        Equipment.setDescription("add data");
        Equipment.selecttype();
        Equipment.clicksavebtn();
        // next line for Editing purpose
        Equipment.clickEditButton();
        Equipment.setDescription("Equipment");
        Equipment.clicksavebtn();
        // this is for check the delete button
        Equipment.ClickDeletebtn();
        Equipment.dlt();

        softAssert.assertAll();
    }

}




