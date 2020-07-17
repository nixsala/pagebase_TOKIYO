package samples;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

public class FinishProductSampleIssue extends TestBase {
    public SoftAssert softAssert;

    @Test
    public void SampleIssue()throws Exception{
        softAssert = new SoftAssert();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[2]/div/div");// click Sample
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[4]");// click Finish product sample issue
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div[1]/div/div/div/div[1]/div/div/button");// click Finish product sample issue
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"supplierName\"]/div");// select Project
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"rawMaterialName\"]/div/div");// select pour code
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div");// select finish product
        MethodBase.hitEnter();
        PageBase.staticWait(02);
        MethodBase.setText_ByXpath("//*[@id=\"vehicleNo\"]","Number");// set vechile number
        PageBase.staticWait(02);
        MethodBase.clickButton_ByXpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]");
        softAssert.assertAll();

    }

}
