package cap.utilities;

import cap.helpers.Constants;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by codoid-pc on 6/5/2018.
 */

/**
 * The share driver util is used to determine which Execution Type run in your program receives a run time.Like BROWSER,MOBILEVIEW,MOBILE
 */
public class SharedDriver {

    protected static WebDriver driver;

    protected static WebDriver mobileDriver;
    protected static WebDriver windowsDriver;
    public static long randomID;
    public static String strExecutionID;

    public static String strBrowserNames;

    public static String strBrowserVersion;

    public static String strSystemName;

    /**
     * Using this method, get a Windows driver. A run time is assigned to each execution type that runs in your program. Like BROWSER,MOBILEVIEW,MOBILE
     */
    public static WebDriver getDriver() {
        return driver;
    }


    public static WebDriver getWindowDriver() {
        return windowsDriver;
    }

    /**
     * Using this method, get a Mobile driver.A run time is assigned to each execution type that runs in your program
     */
    public static WebDriver getMobileDriver() {
        return mobileDriver;
    }


    static {
        strExecutionID = cap.utilities.RandomGeneratorUtil.getRandomString();

        System.out.println("Inside SharedDriver static Block");

        TestDataUtil.loadData(Constants.TESTDATA_PATH, System.getProperty(Constants.ENV_VARIABLE_APPLICATION));

        System.out.println("Inside SharedDriver static Block - After Load data");

        String strExecutionType = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");

        System.out.println("Inside SharedDriver static Block - strExecutionType" + strExecutionType);

        String strBrowserName = System.getProperty(Constants.ENV_VARIABLE_BROWSER_NAME, "");

        System.out.println("Inside SharedDriver static Block - strBrowserName" + strBrowserName);


        System.out.println("\n >> Execution String: " + strExecutionID);

        if (strExecutionType.equalsIgnoreCase("BROWSER")
                || strExecutionType.equalsIgnoreCase("MOBILEVIEW")
                || strExecutionType.equalsIgnoreCase("TABLETVIEW")) {

            //Launch WebDriver
            driver = cap.utilities.DriverUtil.getDriver();
            System.out.println("<----------------------WeDriver is launched---------------------->");

            Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
            strBrowserNames = cap.getBrowserName();
            strBrowserVersion = cap.getVersion();
            try {
                strSystemName = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }

    }

    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            String strExecutionType = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");
            if (strExecutionType.equalsIgnoreCase("BROWSER")) {

                //Commented by Bhaanu on 03 March 2025
                //driver.quit();

            }


        }
    };

    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }


}
