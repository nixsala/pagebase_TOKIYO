package ResultReport;

import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import utils.MethodBase;
/**
 *Author Daclas
 */
public class RawMaterialTestResult extends TestBase {
    @Test
    public void RawMaterialTestResult(){
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[3]/div/div");
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]");
    }

}
