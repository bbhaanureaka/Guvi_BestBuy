package Happy_Path_Patient_Web_and_MR.cukes;

import cap.utilities.TestDataUtil;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

import static cap.utilities.SharedDriver.*;


@CucumberOptions(
        features = {"src/test/resources/features/BestBuyPurchase"},
        monochrome = true,
        tags = "@TEST1",
        glue = {"Happy_Path_Patient_Web_and_MR"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:reports/WEB/index.html",
                "json:reports/WEB/cucumber.json"

        })

public class DemoWebBestBuy extends AbstractTestNGCucumberTests {

    @AfterClass
    public void teardown() {
        ExtentService.getInstance().setSystemInfo("Application Name", "BestBuy E-Commerce Website");
        ExtentService.getInstance().setSystemInfo("Application URL", TestDataUtil.getValue("&URL&"));
        ExtentService.getInstance().setSystemInfo("Operating System", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Execution Browser", strBrowserNames);
        ExtentService.getInstance().setSystemInfo("Browser Version", strBrowserVersion);
        ExtentService.getInstance().setSystemInfo("Execution Machine", strSystemName);
        ExtentService.getInstance().setSystemInfo("Automation QA", System.getProperty("user.name"));


    }
}
