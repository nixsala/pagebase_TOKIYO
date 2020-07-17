package samples;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

public class FinishProductSample extends TestBase {
    public SoftAssert softAssert;

    @Test(priority = 1)
    public void FinishProductSample()throws Exception{
        softAssert = new SoftAssert();

        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div"); // Click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[3]"); // Click Finish Product Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");// Click Add Finish Product Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"plantName\"]/div/div");// get Plant name
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"finsih_product_mixdesign_code\"]/div/div");// get mix design
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"equipmentId\"]/div/div");// get equipment
        PageBase.staticWait(02);
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"workOrderNo\"]","work order");// set work order
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"finishProductCode\"]","code");//
        PageBase.staticWait(03);
        MethodBase.click_ByXpath("/html/body/div[8]/div/div[2]/div/div[2]/div[3]/button[2]");
        softAssert.assertAll();
    }


}
