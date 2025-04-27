package Happy_Path_Patient_Web_and_MR.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BestBuyPage extends BasePage {

    private List<String> strDealsPageURL;

    public BestBuyPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Choose a country.')]")
    protected WebElement elmntCountrySelectionPage;

    @FindBy(how = How.XPATH, using = "//div[@class='content']/div[not(contains(@class, 'hidden'))]/div[@class='country-selection']/a[@class='us-link']")
    protected WebElement elmntUSAChooseCountry;

    @FindBy(how = How.XPATH, using = "//div[@class='content']/div[not(contains(@class, 'hidden'))]/div[@class='country-selection']/a[@class='canada-link']")
    protected WebElement elmntCANChooseCountry;

    @FindBy(how = How.XPATH, using = "//div[@id='onetrust-close-btn-container']/button")
    protected WebElement elmntCANCountryPrivacy;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign in or Create Account')]")
    protected WebElement elmntSignInAccount;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Français')]")
    protected WebElement elmntFranceTxt;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Account')]")
    protected WebElement elmntAccount;

    @FindBy(how = How.XPATH, using = "//div[@class='shop-account-signin-create']//a[contains(text(),'Create Account')]")
    protected WebElement elmntCreateAccount;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Create an Account')]")
    protected WebElement btnCreateAccount;
    protected String elmntCrAccNoDataValidationMsgs = new StringBuilder().append("//p[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//input[@id='firstName']")
    protected WebElement elmntCrAcFirstName;

    @FindBy(how = How.XPATH, using = "//input[@id='lastName']")
    protected WebElement elmntCrAcLastName;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    protected WebElement elmntCrAcEmailId;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-p1']")
    protected WebElement elmntCrAcPassword;

    @FindBy(how = How.XPATH, using = "//input[@id='reenterPassword']")
    protected WebElement elmntCrAcConfirmPassword;

    @FindBy(how = How.XPATH, using = "//input[@id='phone']")
    protected WebElement elmntCrAcPhoneNumber;
    protected String elmntCrAccInvalidDataValidationMsgs = new StringBuilder().append("//div[@class='tb-validation']//p[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Skip for now')]")
    protected WebElement elmntSkipforNow;

    @FindBy(how = How.XPATH, using = "//div[@class='header__container']/h2[contains(text(),'Products')]")
    protected WebElement elmntcheckCrAccProducts;

    @FindBy(how = How.XPATH, using = "//div[@class='flyout-button-wrapper']/button")
    protected WebElement elmntAccbutton;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign out')]")
    protected WebElement elmntSignOutbutton;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Return to previous page')]")
    protected WebElement elmntReturnPreviousPage;

    @FindBy(how = How.XPATH, using = "//span[@class='pt-100 pb-100 pl-none pr-none flex']/a[contains(text(),'Sign In')]")
    protected WebElement btnSignIn;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-e']")
    protected WebElement elmntUserName;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
    protected WebElement btnUserNameContinue;

    //@FindBy(how = How.XPATH, using ="//label/span[contains(text(),'Use password')]")
    @FindBy(how = How.XPATH, using = "//div[@class='cia-signin-options__username']/following::fieldset[1]//input[@id='password-radio']")
    protected WebElement chkboxUsePassword;

    @FindBy(how = How.XPATH, using = "//input[@id='fld-p1']")
    protected WebElement elmntPassword;

    @FindBy(how = How.XPATH, using = "//button[@class='c-button-unstyled hamburger-menu-button']")
    protected WebElement elmntMenu;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Deals')]")
    protected WebElement elmntDealsMenu;

    //@FindBy(how = How.XPATH, using ="//ul[@class='hamburger-menu-flyout-list hamburger-menu-flyout-sidecar-list']/li[@class='liDropdownList']/a")
    //protected List<WebElement> elmntDealsSubMenuList;

    @FindBy(how = How.XPATH, using = "//ul[@class='hamburger-menu-flyout-list hamburger-menu-flyout-sidecar-list']/li[@class='liDropdownList' and not(contains(@class,'separateThis'))]/a")
    protected List<WebElement> elmntDealsSubMenuList;

    protected String elmntDealsSubMenuURL = new StringBuilder().append("//ul[@class='hamburger-menu-flyout-list hamburger-menu-flyout-sidecar-list']//li/a[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Support & Services')]")
    protected WebElement elmntSupportServicesMenu;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Brands')]")
    protected WebElement elmntBrandsMenu;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Appliances')]")
    protected WebElement elmntAppliancesMenu;

    @FindBy(how = How.XPATH, using = "//ul[@class='hamburger-menu-flyout-list']/li[@class='liDropdownList ' and not(contains(@class,'separateThis'))]/button")
    protected List<WebElement> elmntAppliancesMenuWithBtnList;

    @FindBy(how = How.XPATH, using = "//ul[@class='hamburger-menu-flyout-list']/li[@class='liDropdownList' and not(contains(@class,'separateThis'))]/a")
    protected List<WebElement> elmntAppliancesMenuWithoutBtnList;

    /*@FindBy(how = How.XPATH, using = "//ul[@class='hamburger-menu-flyout-list']/li[@class='liDropdownList']/a")
    protected List<WebElement> elmntAppliancesMenuWithoutBtnList;*/

    /*@FindBy(how = How.XPATH, using ="//ul[@class='hamburger-menu-flyout-list']//following::li[@class='liDropdownList']/a")
    protected List<WebElement> elmntAppliancesMenuWithoutBtnList;
    */

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'TV & Home Theater')]")
    protected WebElement elmntTVHTMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Computers & Tablets')]")
    protected WebElement elmntCTMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Cell Phones')]")
    protected WebElement elmntCPMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Audio & Headphones')]")
    protected WebElement elmntAHPMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Video Games')]")
    protected WebElement elmntVGMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Cameras, Camcorders & Drones')]")
    protected WebElement elmntCCDMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Home, Furniture & Office')]")
    protected WebElement elmntHFOMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Smart Home, Security & Wi-Fi')]")
    protected WebElement elmntSHSMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Car Electronics & GPS')]")
    protected WebElement elmntCEGMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Wearable Technology')]")
    protected WebElement elmntWTMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Health, Wellness & Fitness')]")
    protected WebElement elmntHWFMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Outdoor Living')]")
    protected WebElement elmntOLMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Toys, Games & Collectibles')]")
    protected WebElement elmntTGCMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'Electric Transportation')]")
    protected WebElement elmntETMenu;

    @FindBy(how = How.XPATH, using = "//li[@class='liDropdownList ']//button[contains(text(),'New & Featured')]")
    protected WebElement elmntNFMenu;
    @FindBy(how = How.XPATH, using = "//div[@id='survey_window']//button[@id='survey_invite_no']")
    protected WebElement elmntSurveyPopupNo;

    @FindBy(how = How.XPATH, using = "//a[@href='https://www.bestbuy.com']")
    protected WebElement elmntBestBuyLogo;

    @FindBy(how = How.XPATH, using = "//footer[@id='footer']/ul/li/div/a/strong")
    protected List<WebElement> elmntFTSupportList;

    protected String elmntFTSupportPageURL = new StringBuilder().append("//footer[@id='footer']/ul/li/div/a/strong[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[@class='main-navigation grid grid-cols-3 auto-flow-col']//following::ul/li[@class='body-copy']/a")
    protected List<WebElement> elmntFTOTList;

    protected String elmntFTOTPageURL = new StringBuilder().append("//div[@class='main-navigation grid grid-cols-3 auto-flow-col']//following::ul/li[@class='body-copy']/a[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[@class='flex justify-content-start']/a")
    protected List<WebElement> elmntFTTCList;

    protected String elmntFTTCPageURL = new StringBuilder().append("//div[@class='flex justify-content-start']/a[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//li/a[contains(text(),'Sales & Promotions')]/following::li/button[contains(text(),'Close')]")
    protected WebElement elmntDealsMenuClose;

    @FindBy(how = How.XPATH, using = "//form[@name='frmSearch']/input[@id='gh-search-input']")
    protected WebElement elmntSearchField;
    @FindBy(how = How.XPATH, using = "//button[@class='header-search-button ']/span")
    protected WebElement elmntSearchIcon;

    @FindBy(how = How.XPATH, using = "//div[@class='no-results-found-block']/h3[contains(text(),'Hmmm, we didn’t find anything')]")
    protected WebElement elmntNoSearchResultsText;

    /*@FindBy(how = How.XPATH, using = "//div[@class='title-wrapper title']/span")
    protected WebElement elmntSearchResultsText;*/

    @FindBy(how = How.XPATH, using = "//div[@class='results-title']/div/span[2]")
    protected WebElement elmntSearchResultsText;

    @FindBy(how = How.XPATH, using = "//div[@class='title-wrapper title']/span//h1[@class='search-title']")
    protected WebElement elmntSearchResultsInputText;

    @FindBy(how = How.XPATH, using = "//span[@class='item-count']")
    protected WebElement elmntItemsCount;

    @FindBy(how = How.XPATH, using = "//div[@class='pagination-num-found']")
    protected WebElement elmntFooterItemsCount;

    protected String elmntListSize = "//ol[@class='sku-item-list']/li[@class='sku-item' and not(contains(@class,'embedded-leaderboard'))]";

    protected String elmntListSizeCategory = "//ul[@class='plp-product-list']//li[@class='product-list-item' and not(contains(@class,'display-ad-wrapper'))]";

    protected String elmntProductName = ".//h4/a";

    protected String elmntProductNameCategory = ".//a[@class='product-list-item-link']/h2";

    protected String elmntModelNumber = ".//div[@class='sku-model']//span[contains(text(),'Model:')]/following-sibling::span[@class='sku-value']";

    protected String elmntModelNumberCategory = ".//div[@class='product-attributes']//div[contains(text(),'Model:')]/span";


    protected String elmntSKUNumber = ".//div[@class='sku-model']//span[contains(text(),'SKU:')]/following-sibling::span[@class='sku-value']";

    protected String elmntSKUNumberCategory = ".//div[@class='product-attributes']//div[contains(text(),'SKU:')]/span";

    protected String elmntSeaProductClick = new StringBuilder().append("//ol[@class='sku-item-list']/li[@class='sku-item']//div[@class='column-middle']/h4/a[contains(@href, '")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSeaProductAddClick = new StringBuilder().append("//ol[@class='sku-item-list']/li[@class='sku-item']//div[@class='column-right']//button[contains(@data-sku-id, '")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSeaProductAddClickBrands = new StringBuilder().append("//div[@class='column-right']//button[contains(@data-sku-id, '")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntSeaProductClickCategory = "//ul[@class='plp-product-list']//button[contains(@data-test-id, 'add-to-cart')]";

    //@FindBy(how = How.XPATH, using = "//div[@class='footer-pagination']//span[contains(text(),'Next')]")
    //protected WebElement elmntLastPageArrowClick;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
    protected WebElement elmntLastPageArrowClick;

    //@FindBy(how = How.XPATH, using = "//div[@class='footer-pagination']//span[contains(text(),'Previous')]")
    //protected WebElement elmntFirstPageArrowClick;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Previous')]")
    protected WebElement elmntFirstPageArrowClick;

    /*@FindBy(how = How.XPATH, using ="//div[12]/div[1]/div/div[@class='_none']/div[@class='fulfillment-add-to-cart-button']//button[contains(text(),'Add to Cart')]")
    protected WebElement elmntAddToCartClick;*/

    //@FindBy(how = How.XPATH, using  ="//*[@id='fulfillment-add-to-cart-button-7051188']/div/div/div/button[contains(text(),'Add to Cart')]")
    //protected WebElement elmntAddToCartClick;

    protected String elmntProductInCartList = "//ul[@class='item-list']/li";

    protected String elmtProductInCart = new StringBuilder().append("//ul[@class='item-list']/li[")
            .append("<<REPLACEMENT>>").append("]//h2/a").toString();

    protected String elmntLastPageValue = "//div[@class='footer-pagination']//ol[@class='paging-list']/li";

    protected String elmntLastPageValueCategory = "//div[@class='pagination-container']/a";

    protected String elmntTotalNoOfpages = new StringBuilder().append("//div[@class='footer-pagination']//ol[@class='paging-list']/li[")
            .append("<<REPLACEMENT>>").append("]/span").toString();

    protected String elmntTotalNoOfpagesBrands = new StringBuilder().append("//div[@class='footer-pagination']//ol[@class='paging-list']/li[")
            .append("<<REPLACEMENT>>").append("]/a").toString();


    @FindBy(how = How.XPATH, using = "//ul[@class='hamburger-menu-flyout-list']/li[@class='liDropdownList ' and not(contains(@class,'separateThis'))]//button[contains(text(),'Shop by Brand')]")
    protected WebElement elmntShopByBrandMenu;

    @FindBy(how = How.XPATH, using = "//ul[@class='hamburger-menu-flyout-list hamburger-menu-flyout-sidecar-list']/li/a[contains(text(),'Barbie')]")
    protected WebElement elmntBarbieBrandMenu;

    @FindBy(how = How.XPATH, using = "//ul[@class='hamburger-menu-flyout-list hamburger-menu-flyout-sidecar-list']/li/a[contains(text(),'Lenovo')]")
    protected WebElement elmntLenovoBrandMenu;

    @FindBy(how = How.XPATH, using = "//div[@class='tile-image-wrapper']//following-sibling::p[contains(text(),'Laptops')]")
    protected WebElement elmntLaptopsCard;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-lg btn-block btn-primary']")
    protected WebElement elmntCheckoutBtn;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue as Guest')]")
    protected WebElement elmntContinueAsGuestBtn;

    @FindBy(how = How.XPATH, using = "//input[@id='user.emailAddress']")
    protected WebElement elmntGuestEmailAddress;

    @FindBy(how = How.XPATH, using = "//input[@id='user.phone']")
    protected WebElement elmntGuestPhoneNumber;
    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-lg btn-block btn-secondary']/span[contains(text(),'Continue to Payment Information')]")
    protected WebElement elmntContinuePaymentBtn;

    @FindBy(how = How.XPATH, using = "//input[@id='cc-number']")
    protected WebElement elmntCardNumber;

    @FindBy(how = How.XPATH, using = "//input[@id='expirationDate']")
    protected WebElement elmntCardExpiry;

    @FindBy(how = How.XPATH, using = "//input[@id='cvv']")
    protected WebElement elmntCardCVV;

    @FindBy(how = How.XPATH, using = "//input[@id='first-name']")
    protected WebElement elmntDeliveryFirstName;

    @FindBy(how = How.XPATH, using = "//input[@id='last-name']")
    protected WebElement elmntDeliveryLastName;

    @FindBy(how = How.XPATH, using = "//input[@id='address-input']")
    protected WebElement elmntDeliveryAddress;

    @FindBy(how = How.XPATH, using = "//input[@id='city']")
    protected WebElement elmntDeliveryCity;

    @FindBy(how = How.ID, using = "state")
    protected WebElement elmntDeliveryState;

    @FindBy(how = How.XPATH, using ="//select[@id='state']/option[contains(text(),'AK')]")
    protected WebElement elmntDeliveryStates;

    @FindBy(how = How.XPATH, using = "//input[@id='postalCode']")
    protected WebElement elmntDeliveryZipCode;

    @FindBy(how = How.XPATH, using = "//input[@id='create-account-password-form-show-password']'")
    protected WebElement elmntBestBuyPassword;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-lg btn-block btn-primary']/span[contains(text(),'Place Your Order')]")
    protected WebElement elmntPlaceYourOrder;

    @FindBy(how = How.XPATH, using = "//div[@id='error-box']//div[@class='error-spacing']/div/span")
    protected WebElement elmntOrderSuccessMessage;


    @FindBy(how = How.XPATH, using = "//input[@id='soldout_facet-Exclude-Out-of-Stock-Items-0']")
    protected WebElement elmntExcludeOutofStockClick;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Go to Cart')]")
    protected WebElement elmntGoToCartButton;

    public String strDealsCurrentURL = "";
    public List<String> dealsSubMenuURL = new ArrayList<String>();

    public List<String> shopByDeptSubMenuURL = new ArrayList<String>();

    public boolean visitWebsite() {

        boolean blResult = false;
        System.out.println("Inside Visit");
        int WindowsCount = driver.getWindowHandles().size();
        System.out.println("===============>WindowsCount::" + WindowsCount);
        if (WindowsCount == 2) {
            focusWindow(1);
            if (verifyElement(elmntCountrySelectionPage)) {
                driver.manage().deleteAllCookies();
                System.out.println("User here in Provider home page");
            } else {

//                System.out.println("Else Part ::::::Window Count 2");
                driver.manage().deleteAllCookies();
                visit(TestDataUtil.getValue("&URL&"));

            }
        }
        if (WindowsCount == 1) {
            if (verifyElement(elmntCountrySelectionPage)) {
                driver.manage().deleteAllCookies();
                System.out.println("Inside WindowsCount 1 - IF Block");
                System.out.println("User is in Country Selection Landing Page");
                takeScreenshot(driver);
            } else {
                System.out.println("Inside WindowsCount 1 - ELSE Block");
                visit(TestDataUtil.getValue("&URL&"));
                driver.manage().deleteAllCookies();
            }

        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean selectCountry(String strCountryName) {

        boolean blResult = false;
        try {

            if (strCountryName.equals("United States")) {
                waitForElement(elmntUSAChooseCountry);
                click(elmntUSAChooseCountry);
                waitForElement(elmntSignInAccount);
                blResult = verifyElement(elmntSignInAccount);
            } else if (strCountryName.equals("Canada")) {
                waitForElement(elmntCANChooseCountry);
                click(elmntCANChooseCountry);
                click(elmntCANCountryPrivacy);
                waitForElement(elmntFranceTxt);
                blResult = verifyElement(elmntFranceTxt);
            }
            takeScreenshot(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean
    checkValidURL(String strcurrrentCountryURL) {

        boolean blResult = false;
        try {
            String strActualCurrentURL = driver.getCurrentUrl();

            if (strActualCurrentURL.equals(strcurrrentCountryURL)) {

                System.out.println("Current URL is: " + strcurrrentCountryURL);

                URL urllink = new URL(strActualCurrentURL);

                HttpURLConnection connection = (HttpURLConnection) urllink.openConnection();
                connection.setRequestMethod("HEAD");
                connection.setConnectTimeout(3000);
                connection.connect();

                int httpResponseCode = connection.getResponseCode();
                if (httpResponseCode >= 400) {
                    System.out.println("URL is Broken/Invalid " + httpResponseCode);
                } else {
                    System.out.println("URL is Not Broken/Valid " + httpResponseCode);
                    blResult = true;

                }
                System.out.println("checkValidURL boolean value is: " + blResult);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean goToCreateAccountPage() {

        boolean blResult = false;
        try {

            waitForElement(elmntAccount);
            click(elmntAccount);
            waitForElement(elmntCreateAccount);
            click(elmntCreateAccount);
            blResult = verifyElement(btnCreateAccount);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean clickCreateAnAccountButton() {

        boolean blResult = false;
        try {
            waitForElement(btnCreateAccount);
            click(btnCreateAccount);
            blResult = verifyElement(btnCreateAccount);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean checkNoDataValidationMessages(List<String> strNoDataValidationMessages) {
        boolean blResult = false;
        try {
            for (String strExpectedValidationMsg : strNoDataValidationMessages) {
                WebElement elmntValidationmessages = waitForElement(By.xpath(elmntCrAccNoDataValidationMsgs.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strExpectedValidationMsg))));
                blResult = verifyElement(elmntValidationmessages);
                String strActualValidationMsg = elmntValidationmessages.getText();
                if (strExpectedValidationMsg.equals(strActualValidationMsg)) {
                    System.out.println("Expected Msg " + strExpectedValidationMsg);
                    System.out.println("Actual Msg " + strActualValidationMsg);
                    blResult = true;
                }
            }
            System.out.println("checkNoDataValidationMessages return boolean value is " + blResult);
            takeScreenshot(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean EnterInvalidDataCreateAccountPage(List<String> strInvalidTestData) {
        boolean blResult = false;
        try {
            blResult = verifyElement(elmntCrAcFirstName);
            enterValue(elmntCrAcFirstName, strInvalidTestData.get(0));
            blResult = verifyElement(elmntCrAcLastName);
            enterValue(elmntCrAcLastName, strInvalidTestData.get(1));
            blResult = verifyElement(elmntCrAcEmailId);
            enterValue(elmntCrAcEmailId, strInvalidTestData.get(2));
            blResult = verifyElement(elmntCrAcPassword);
            enterValue(elmntCrAcPassword, strInvalidTestData.get(3));
            blResult = verifyElement(elmntCrAcConfirmPassword);
            enterValue(elmntCrAcConfirmPassword, strInvalidTestData.get(4));
            blResult = verifyElement(elmntCrAcPhoneNumber);
            enterValue(elmntCrAcPhoneNumber, strInvalidTestData.get(5));
            waitForElement(btnCreateAccount);
            click(btnCreateAccount);
            blResult = verifyElement(btnCreateAccount);
            System.out.println("EnterInvalidDataCreateAccountPage return boolean value is " + blResult);

            takeScreenshot(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean checkInvalidDataValidationMessages(List<String> strInvalidDataValidationMessages) {
        boolean blResult = false;
        try {
            for (String strExpectedValidationMsg : strInvalidDataValidationMessages) {
                WebElement elmntValidationmessages = waitForElement(By.xpath(elmntCrAccInvalidDataValidationMsgs.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strExpectedValidationMsg))));
                blResult = verifyElement(elmntValidationmessages);
                String strActualValidationMsg = elmntValidationmessages.getText();
                if (strExpectedValidationMsg.equals(strActualValidationMsg)) {
                    System.out.println("Expected Msg " + strExpectedValidationMsg);
                    System.out.println("Actual Msg " + strActualValidationMsg);
                    blResult = true;
                }
            }
            System.out.println("checkInvalidDataValidationMessages return boolean value is " + blResult);
            takeScreenshot(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean EnterValidDataCreateAccountPage(List<String> strInvalidTestData) {
        boolean blResult = false;
        try {
            refreshBrowser();
            blResult = verifyElement(elmntCrAcFirstName);
            enterValue(elmntCrAcFirstName, strInvalidTestData.get(0));
            blResult = verifyElement(elmntCrAcLastName);
            enterValue(elmntCrAcLastName, strInvalidTestData.get(1));
            blResult = verifyElement(elmntCrAcEmailId);
            enterValue(elmntCrAcEmailId, strInvalidTestData.get(2));
            blResult = verifyElement(elmntCrAcPassword);
            enterValue(elmntCrAcPassword, strInvalidTestData.get(3));
            blResult = verifyElement(elmntCrAcConfirmPassword);
            enterValue(elmntCrAcConfirmPassword, strInvalidTestData.get(4));
            blResult = verifyElement(elmntCrAcPhoneNumber);
            enterValue(elmntCrAcPhoneNumber, strInvalidTestData.get(5));
            waitForElement(btnCreateAccount);
            click(btnCreateAccount);
            blResult = verifyElement(btnCreateAccount);
            System.out.println("EnterInvalidDataCreateAccountPage return boolean value is " + blResult);
            takeScreenshot(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean checkAccountIsCreatedSuccessfully() {
        boolean blResult = false;
        try {
            blResult = verifyElement(elmntSkipforNow);
            click(elmntSkipforNow);
            blResult = verifyElement(elmntcheckCrAccProducts);
            System.out.println("Inside checkAccountIsCreatedSuccessfully try " + blResult);
            if (blResult == false) {
                System.out.println("Inside checkAccountIsCreatedSuccessfully try False");
                blResult = verifyElement(elmntReturnPreviousPage);
                click(elmntReturnPreviousPage);
            }

        } catch (Exception e) {
            System.out.println("Inside checkAccountIsCreatedSuccessfully catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean signoutFromTheBestBuyWebsite() {
        boolean blResult = false;
        try {
            blResult = verifyElement(elmntAccbutton);
            click(elmntAccbutton);
            blResult = verifyElement(elmntSignOutbutton);
            click(elmntSignOutbutton);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean navigateToSignInButton() {
        boolean blResult = false;
        try {
            blResult = verifyElement(elmntAccbutton);
            click(elmntAccbutton);
            blResult = verifyElement(btnSignIn);
            click(btnSignIn);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public boolean EnterUserNameAndClickContinue(String strUserName) {
        boolean blResult = false;
        try {
            blResult = verifyElement(elmntUserName);
            enterValue(elmntUserName, strUserName);
            blResult = verifyElement(btnUserNameContinue);
            click(btnUserNameContinue);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean SelectUsePasswordEnterPasswordAndClickContinue(String strPassword) {
        boolean blResult = false;
        try {
            //blResult = verifyElement(chkboxUsePassword);
            blResult = selectRadiobutton(chkboxUsePassword);
            //blResult = verifyElement(elmntPassword);
            blResult = enterValue(elmntPassword, strPassword);
            //blResult = verifyElement(btnUserNameContinue);
            //jsClickScroll(btnUserNameContinue);
            blResult = click(btnUserNameContinue);
            //actionsClick(btnUserNameContinue);
            System.out.println("SelectUsePasswordEnterPasswordAndClickContinue try");

        } catch (Exception e) {
            System.out.println("SelectUsePasswordEnterPasswordAndClickContinue catch");

            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean checkAccountIsLoggedInSuccessfully() {

        boolean blResult = false;
        try {
            System.out.println("Inside checkAccountIsLoggedInSuccessfully try");
            blResult = verifyElement(elmntReturnPreviousPage);
            click(elmntReturnPreviousPage);

        } catch (Exception e) {
            System.out.println("Inside checkAccountIsCreatedSuccessfully catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean clickOnMenuButton() {

        boolean blResult = false;
        try {
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);


        } catch (Exception e) {
            System.out.println("ClickOnMenuButton catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean clickOnDealsSubMenu() {

        boolean blResult = false;
        try {
            blResult = verifyElement(elmntDealsMenu);
            click(elmntDealsMenu);

        } catch (Exception e) {
            System.out.println("clickOnDealsSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean getAllTheDealsPagesAndNavigateToEachPage() {
        boolean blResult = false;
        int i = 1;
        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntDealsSubMenuList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            for (String text : texts) {
                System.out.println("Print Deals Sub-menu Text " + text);
                if (i > 1) {
                    //Click Menu Hamburger Icon
                    blResult = verifyElement(elmntMenu);
                    System.out.println("Click WebElemnt Sub-Menu URL " + elmntMenu);
                    click(elmntMenu);

                    //Click Deals Menu
                    blResult = verifyElement(elmntDealsMenu);
                    //click(elmntDealsMenu);
                    jsClickScroll(elmntDealsMenu);

                    if (i == 7) {
                        System.out.println("Inside loop 7");
                        text = "TV & Home Theater";
                        System.out.println("Inside loop 7 Print Deals Sub-menu Text " + text);
                    }
                    if (i == 8) {
                        System.out.println("Inside loop 8");
                        text = "Computers & Tablets";
                        System.out.println("Inside loop 8 Print Deals Sub-menu Text " + text);
                    }


                }
                //waitForSeconds(5);
                //Click Deals Sub-Menu
                WebElement elmntSubMenuURL = waitForElement(By.xpath(elmntDealsSubMenuURL.replace("<<REPLACEMENT>>", text)));
                blResult = verifyElement(elmntSubMenuURL);
                click(elmntSubMenuURL);

                try {
                    //If Survey Popup occurs,then click "No,Thanks" button and proceed
                    verifyElement(elmntSurveyPopupNo);
                    click(elmntSurveyPopupNo);
                    waitForSeconds(2);
                    System.out.println("Survey Popup inside try " + blResult);
                } catch (Exception ex) {
                    System.out.println("Survey Popup exception catch " + ex.getMessage());
                }

                strDealsCurrentURL = getCurrentUrl();
                //Add the current page URL in an Array List
                dealsSubMenuURL.add(strDealsCurrentURL);

                System.out.println("elmntSubMenuURL value is " + elmntSubMenuURL);
                System.out.println("strcurrentUrl value is " + strDealsCurrentURL);
                System.out.println("for loop int i value is " + i);


                i++;
            }
            System.out.println("getAllTheDealsPagesAndNavigateToEachPage try ");

            //Print all the Deals Current URLS in the list
            dealsSubMenuURL.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("getAllTheDealsPagesAndNavigateToEachPage catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean validateSubMenuURL(List<String> strDealsPageURL) {

        boolean blResult = false;

        try {
            blResult = compareListContains(dealsSubMenuURL, strDealsPageURL);

        } catch (Exception e) {
            System.out.println("validateSubMenuURL catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean clickOnSupportAndServicesSubMenu() {
        boolean blResult = false;
        try {
            blResult = verifyElement(elmntSupportServicesMenu);
            click(elmntSupportServicesMenu);

        } catch (Exception e) {
            System.out.println("clickOnSupportAndServicesSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean getAllTheSupportAndServicesPagesAndNavigateToEachPage() {
        boolean blResult = false;
        int i = 1;
        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntDealsSubMenuList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            for (String text : texts) {
                System.out.println("Print Deals Sub-menu Text " + text);
                if (i > 1) {
                    //Click Menu Hamburger Icon
                    blResult = verifyElement(elmntMenu);
                    System.out.println("Click WebElemnt Sub-Menu URL " + elmntMenu);
                    click(elmntMenu);

                    //Click Support and Services Menu
                    blResult = verifyElement(elmntSupportServicesMenu);
                    //click(elmntDealsMenu);
                    jsClickScroll(elmntSupportServicesMenu);

                    if(i==8) {
                        System.out.println("Inside loop 8");
                        text = "Computer & Tablet Services";
                        System.out.println("Inside loop 8 Print Deals Sub-menu Text " + text);
                    }
                    /*else if(i==18){
                        System.out.println("Inside loop 18");
                        text = "My Best Buy Total Membership";
                        System.out.println("Inside loop 18 Print Deals Sub-menu Text " + text);
                    }else if(i==22){
                        System.out.println("Inside loop 22");
                        text = "Haul Away & Recycling";
                        System.out.println("Inside loop 22 Print Deals Sub-menu Text " + text);

                    }*/

                }

                waitForSeconds(5);
                //Click Deals Sub-Menu
                WebElement elmntSubMenuURL = waitForElement(By.xpath(elmntDealsSubMenuURL.replace("<<REPLACEMENT>>", text)));
                blResult = verifyElement(elmntSubMenuURL);
                click(elmntSubMenuURL);

                try {
                    //If Survey Popup occurs,then click "No,Thanks" button and proceed
                    verifyElement(elmntSurveyPopupNo);
                    click(elmntSurveyPopupNo);
                    waitForSeconds(2);
                    System.out.println("Survey Popup inside try " + blResult);
                } catch (Exception ex) {
                    System.out.println("Survey Popup exception catch " + ex.getMessage());
                }


                strDealsCurrentURL = getCurrentUrl();
                //Add the current page URL in an Array List
                dealsSubMenuURL.add(strDealsCurrentURL);

                System.out.println("elmntSubMenuURL value is " + elmntSubMenuURL);
                System.out.println("strcurrentUrl value is " + strDealsCurrentURL);
                System.out.println("for loop int i value is " + i);

                if (i == 23) {
                    navigateBackPage();
                    waitForSeconds(1);
                    System.out.println("Navigated Back to BestBuy page");
                }


                i++;
            }
            System.out.println("getAllTheSupportAndServicesPagesAndNavigateToEachPage try ");

            //Print all the Deals Current URLS in the list
            dealsSubMenuURL.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("getAllTheSupportAndServicesPagesAndNavigateToEachPage catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean validateSupportAndServicesSubMenuUR(List<String> strDealsByCategoryPageURL) {

        boolean blResult = false;

        try {
            blResult = compareListContains(dealsSubMenuURL, strDealsByCategoryPageURL);

        } catch (Exception e) {
            System.out.println("validateSupportAndServicesSubMenuUR catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean clickOnBrandsSubMenu() {
        boolean blResult = false;
        try {
            blResult = verifyElement(elmntBrandsMenu);
            click(elmntBrandsMenu);

        } catch (Exception e) {
            System.out.println("clickOnBrandsSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllTheBrandsPagesAndNavigateToEachPage() {
        boolean blResult = false;
        int i = 1;
        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntDealsSubMenuList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            for (String text : texts) {
                System.out.println("Print Deals Sub-menu Text " + text);
                if (i > 1) {
                    //Click Menu Hamburger Icon
                    blResult = verifyElement(elmntMenu);
                    System.out.println("Click WebElemnt Sub-Menu URL " + elmntMenu);
                    click(elmntMenu);

                    //Click Deals Menu
                    blResult = verifyElement(elmntBrandsMenu);
                    //click(elmntDealsMenu);
                    jsClickScroll(elmntBrandsMenu);

                    if (i == 9) {
                        System.out.println("Inside loop 9");
                        text = "Lenovo";
                        System.out.println("Inside loop 9 Print Deals Sub-menu Text " + text);

                    }
                    if (i == 10) {
                        System.out.println("Inside loop 10");
                        text = "Whirlpool";
                        System.out.println("Inside loop 10 Print Deals Sub-menu Text " + text);

                    }else if (i == 14) {
                        /*System.out.println("Inside loop 14");
                        text = "Best Buy essentials";
                        System.out.println("Inside loop 14 Print Deals Sub-menu Text " + text);*/
                    }

                }

                waitForSeconds(5);
                //Click Deals Sub-Menu
                WebElement elmntSubMenuURL = waitForElement(By.xpath(elmntDealsSubMenuURL.replace("<<REPLACEMENT>>", text)));
                blResult = verifyElement(elmntSubMenuURL);
                click(elmntSubMenuURL);

                try {
                    //If Survey Popup occurs,then click "No,Thanks" button and proceed
                    verifyElement(elmntSurveyPopupNo);
                    click(elmntSurveyPopupNo);
                    waitForSeconds(2);
                    System.out.println("Survey Popup inside try " + blResult);
                } catch (Exception ex) {
                    System.out.println("Survey Popup exception catch " + ex.getMessage());
                }

                strDealsCurrentURL = getCurrentUrl();
                //Add the current page URL in an Array List
                dealsSubMenuURL.add(strDealsCurrentURL);

                System.out.println("elmntSubMenuURL value is " + elmntSubMenuURL);
                System.out.println("strcurrentUrl value is " + strDealsCurrentURL);
                System.out.println("for loop int i value is " + i);


                i++;
            }
            System.out.println("getAllTheBrandsPagesAndNavigateToEachPage try ");

            //Print all the Deals Current URLS in the list
            dealsSubMenuURL.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("getAllTheBrandsPagesAndNavigateToEachPage catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean validateBrandsSubMenuURL(List<String> strDealsByCategoryPageURL) {

        boolean blResult = false;

        try {
            blResult = compareListContains(dealsSubMenuURL, strDealsByCategoryPageURL);

        } catch (Exception e) {
            System.out.println("validateBrandsSubMenuURL catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllTheBestBuyBrandsPagesAndNavigateToEachPage() {
        boolean blResult = false;
        int i = 14;

        // Extract text using Java 8 Streams
        List<String> texts = elmntDealsSubMenuList.stream()
                .map(WebElement::getText) // Extract text from each element
                .collect(Collectors.toList());

        try {
            if (i >= 14) {

                for (String text : texts) {
                    System.out.println("Print Deals Sub-menu Text " + text);
                    if (i > 14) {
                        //Click Menu Hamburger Icon
                        blResult = verifyElement(elmntMenu);
                        System.out.println("Click WebElemnt Sub-Menu URL " + elmntMenu);
                        click(elmntMenu);

                        //Click Deals Menu
                        blResult = verifyElement(elmntBrandsMenu);
                        //click(elmntDealsMenu);
                        jsClickScroll(elmntBrandsMenu);

                    }
                    //Click Deals Sub-Menu
                    WebElement elmntSubMenuURL = waitForElement(By.xpath(elmntDealsSubMenuURL.replace("<<REPLACEMENT>>", text)));
                    blResult = verifyElement(elmntSubMenuURL);
                    click(elmntSubMenuURL);

                    try {
                        //If Survey Popup occurs,then click "No,Thanks" button and proceed
                        verifyElement(elmntSurveyPopupNo);
                        click(elmntSurveyPopupNo);
                        waitForSeconds(2);
                        System.out.println("Survey Popup inside try " + blResult);
                    } catch (Exception ex) {
                        System.out.println("Survey Popup exception catch " + ex.getMessage());
                    }

                    strDealsCurrentURL = getCurrentUrl();
                    //Add the current page URL in an Array List
                    dealsSubMenuURL.add(strDealsCurrentURL);

                    System.out.println("elmntSubMenuURL value is " + elmntSubMenuURL);
                    System.out.println("strcurrentUrl value is " + strDealsCurrentURL);
                    System.out.println("for loop int i value is " + i);

                    i++;
                }
            }
            System.out.println("getAllTheBrandsPagesAndNavigateToEachPage try ");

            //Print all the Deals Current URLS in the list
            dealsSubMenuURL.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("getAllTheBrandsPagesAndNavigateToEachPage catch " + blResult);
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean validateBestBuyBrandsSubMenuURL(List<String> strDealsByCategoryPageURL) {

        boolean blResult = false;
        try {
            blResult = compareListContains(dealsSubMenuURL, strDealsByCategoryPageURL);

        } catch (Exception e) {
            System.out.println("validateBestBuyBrandsSubMenuURL catch " + blResult);
            e.printStackTrace();
        }
        return blResult;


    }

    public boolean clickOnAppliancesSubMenu() {

        boolean blResult = false;
        try {
            /*blResult = verifyElement(elmntAppliancesMenu);
            click(elmntAppliancesMenu);*/

            jsClickScroll(elmntAppliancesMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnAppliancesSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllTheAppliancesSubMenuPages(List<String> strAppliancesSubmenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strAppliancesSubmenuPages, texts);
            System.out.println("getAllTheAppliancesSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllTheAppliancesSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public boolean getAllTheAppliancesMenuPages(List<String> strAppliancesMenuPages) {
        boolean blResult = false;

        try {

            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntAppliancesMenu);
            //click(elmntAppliancesMenu);
            jsClickScroll(elmntAppliancesMenu);
            waitForSeconds(5);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strAppliancesMenuPages, texts);
            System.out.println("getAllTheAppliancesMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllTheAppliancesMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public boolean clickOnTVHomeTheatreSubMenu() {

        boolean blResult = false;
        try {
            blResult = verifyElement(elmntTVHTMenu);
            click(elmntTVHTMenu);

        } catch (Exception e) {
            System.out.println("clickOnTVHomeTheatreSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllTVHomeTheatreSubMenuPages(List<String> strTVHTSubmenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strTVHTSubmenuPages, texts);
            System.out.println("getAllTVHomeTheatreSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllTVHomeTheatreSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean getAllTheTVHTMenuPages(List<String> strTVHTMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntTVHTMenu);
            //click(elmntTVHTMenu);
            jsClickScroll(elmntTVHTMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strTVHTMenuPages, texts);
            System.out.println("getAllTheTVHTMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllTheTVHTMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public boolean clickOnComputersTabletsSubMenu() {
        boolean blResult = false;
        try {
            blResult = verifyElement(elmntCTMenu);
            click(elmntCTMenu);

        } catch (Exception e) {
            System.out.println("clickOnComputersTabletsSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllComputersTabletsSubMenuPages(List<String> strCTSubmenuPages) {
        boolean blResult = false;

        try {
            waitForSeconds(5);
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);
            System.out.println(strCTSubmenuPages);

            blResult = compareListStrings(strCTSubmenuPages, texts);
            System.out.println("getAllComputersTabletsSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllComputersTabletsSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean getAllComputersTabletsMenuPages(List<String> strCTMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntCTMenu);
            //click(elmntCTMenu);
            jsClickScroll(elmntCTMenu);
            waitForSeconds(5);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strCTMenuPages, texts);
            System.out.println("getAllComputersTabletsMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllComputersTabletsMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean clickOnCellPhonesSubMenu() {
        boolean blResult = false;
        try {
            /*blResult = verifyElement(elmntCPMenu);
            click(elmntCPMenu);*/

            jsClickScroll(elmntCPMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnCellPhonesSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllCellPhonesSubMenuPages(List<String> strCTSubmenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strCTSubmenuPages, texts);
            System.out.println("getAllCellPhonesSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllCellPhonesSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean getAllCellPhonesMenuPages(List<String> strCPMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntCPMenu);
            //click(elmntCPMenu);
            jsClickScroll(elmntCPMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strCPMenuPages, texts);
            System.out.println("getAllCellPhonesMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllCellPhonesMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean clickOnAudioAndHeadPhonesSubMenu() {
        boolean blResult = false;
        try {
            //blResult = verifyElement(elmntAHPMenu);
            //click(elmntAHPMenu);
            jsClickScroll(elmntAHPMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnAudioAndHeadPhonesSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllAudioAndHeadPhonesSubMenuPages(List<String> strAHPSubMenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strAHPSubMenuPages, texts);
            System.out.println("getAllAudioAndHeadPhonesSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllAudioAndHeadPhonesSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public boolean getAllAudioAndHeadPhonesMenuPages(List<String> strAHPMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntAHPMenu);
            //click(elmntAHPMenu);
            jsClickScroll(elmntAHPMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strAHPMenuPages, texts);
            System.out.println("getAllAudioAndHeadPhonesMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllAudioAndHeadPhonesMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean clickOnVideoGamesMenuSubMenu() {
        boolean blResult = false;
        try {
            /*blResult = verifyElement(elmntVGMenu);
            click(elmntVGMenu);*/

            /*waitForSeconds(2);
            jsClickScroll(elmntVGMenu);
            blResult = true;*/

            waitForSeconds(5);
            blResult = verifyElement(elmntVGMenu);
            click(elmntVGMenu);
            //jsClickScroll(elmntVGMenu);
            waitForSeconds(5);

        } catch (Exception e) {
            System.out.println("clickOnVideoGamesMenuSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean getAllVideoGamesSubMenuPages(List<String> strVGSubMenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strVGSubMenuPages, texts);
            System.out.println("getAllVideoGamesSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllVideoGamesSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public boolean getAllVideoGamesMenuMenuPages(List<String> strAHPMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntVGMenu);
            //click(elmntVGMenu);
            jsClickScroll(elmntVGMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strAHPMenuPages, texts);
            System.out.println("getAllVideoGamesMenuMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllVideoGamesMenuMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public boolean clickOnCamerasCamRecordersSubMenu() {
        boolean blResult = false;
        try {
            //blResult = verifyElement(elmntCCDMenu);
            //click(elmntCCDMenu);

            jsClickScroll(elmntCCDMenu);
            blResult = true;
        } catch (Exception e) {
            System.out.println("clickOnCamerasCamRecordersSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllCCDSubMenuPages(List<String> strCCDSubMenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strCCDSubMenuPages, texts);
            System.out.println("getAllCCDSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllCCDSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean getAllCCDMenuPages(List<String> strCCDMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntCCDMenu);
            //click(elmntCCDMenu);
            jsClickScroll(elmntCCDMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strCCDMenuPages, texts);
            System.out.println("getAllCCDMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllCCDMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean clickOnHomeFurnitureAndOfficeSubMenu() {
        boolean blResult = false;
        try {

            jsClickScroll(elmntHFOMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnHomeFurnitureAndOfficeSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllHFOSubMenuPages(List<String> strHFOSubMenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strHFOSubMenuPages, texts);
            System.out.println("getAllHFOSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllHFOSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean getAllHFOMenuPages(List<String> strHFOMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntHFOMenu);
            //click(elmntHFOMenu);
            jsClickScroll(elmntHFOMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strHFOMenuPages, texts);
            System.out.println("getAllHFOMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllHFOMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean clickOnSmartHomeSecurityWiFiSubMenu() {
        boolean blResult = false;
        try {
            /*blResult = verifyElement(elmntSHSMenu);
            click(elmntSHSMenu);*/

            jsClickScroll(elmntSHSMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnSmartHomeSecurityWiFiSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllSSWSubMenuPages(List<String> strSSWSubMenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strSSWSubMenuPages, texts);
            System.out.println("getAllSSWSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllSSWSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean getAllSSWMenuPages(List<String> strSSWMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntSHSMenu);
            //click(elmntSHSMenu);
            jsClickScroll(elmntSHSMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strSSWMenuPages, texts);
            System.out.println("getAllSSWMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllSSWMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean clickOnCarElectronicsGPSSubMenu() {
        boolean blResult = false;
        try {
           /* blResult = verifyElement(elmntCEGMenu);
            click(elmntCEGMenu);*/

            jsClickScroll(elmntCEGMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnCarElectronicsGPSSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean getAllCEGSubMenuPages(List<String> strCEGSubMenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strCEGSubMenuPages, texts);
            System.out.println("getAllCEGSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllCEGSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean getAllCEGMenuPages(List<String> strCEGMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntCEGMenu);
            //click(elmntCEGMenu);
            jsClickScroll(elmntCEGMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strCEGMenuPages, texts);
            System.out.println("getAllCEGMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllCEGMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean clickOnWearableTechnologySubMenu() {
        boolean blResult = false;
        try {
            /*blResult = verifyElement(elmntWTMenu);
            click(elmntWTMenu);*/

            jsClickScroll(elmntWTMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnWearableTechnologySubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllWTSubMenuPages(List<String> strWTSubMenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strWTSubMenuPages, texts);
            System.out.println("getAllWTSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllWTSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public boolean getAllWTMenuPages(List<String> strWTMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntWTMenu);
            click(elmntWTMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strWTMenuPages, texts);
            System.out.println("getAllWTMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllWTMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean clickOnHealthWellnessFitnessSubMenu() {
        boolean blResult = false;
        try {
            /*blResult = verifyElement(elmntHWFMenu);
            click(elmntHWFMenu);*/

            //jsClickScroll(elmntHWFMenu);
            //blResult = true;

            waitForSeconds(2);
            blResult = verifyElement(elmntHWFMenu);
            click(elmntHWFMenu);
            waitForSeconds(2);

        } catch (Exception e) {
            System.out.println("clickOnHealthWellnessFitnessSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllHWFSubMenuPages(List<String> strHWFSubMenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strHWFSubMenuPages, texts);
            System.out.println("getAllHWFSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllHWFSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean getAllHWFMenuPages(List<String> strHWFMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntHWFMenu);
            //click(elmntHWFMenu);
            jsClickScroll(elmntHWFMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strHWFMenuPages, texts);
            System.out.println("getAllHWFMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllHWFMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean clickOnOutdoorLivingSubMenu() {
        boolean blResult = false;
        try {
            /*blResult = verifyElement(elmntOLMenu);
            click(elmntOLMenu);*/

            jsClickScroll(elmntOLMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnOutdoorLivingSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllOLSubMenuPages(List<String> strOLSubMenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strOLSubMenuPages, texts);
            System.out.println("getAllOLSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllOLSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public boolean getAllOTMenuPages(List<String> strOLMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntOLMenu);
            //click(elmntOLMenu);
            jsClickScroll(elmntOLMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strOLMenuPages, texts);
            System.out.println("getAllOTMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllOTMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public boolean clickOnToysGamesCollectiblesSubMenu() {
        boolean blResult = false;
        try {
            /*blResult = verifyElement(elmntTGCMenu);
            click(elmntTGCMenu);*/

            jsClickScroll(elmntTGCMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnToysGamesCollectiblesSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllTGCSubMenuPages(List<String> strTGCSubMenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strTGCSubMenuPages, texts);
            System.out.println("getAllTGCSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllTGCSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public boolean getAllTGCMenuPages(List<String> strTGCMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntTGCMenu);
            //click(elmntTGCMenu);
            jsClickScroll(elmntTGCMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strTGCMenuPages, texts);
            System.out.println("getAllTGCMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllTGCMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean clickOnElectricTransportationSubMenu() {
        boolean blResult = false;
        try {
            /*blResult = verifyElement(elmntETMenu);
            click(elmntETMenu);*/

            waitForSeconds(2);
            blResult = verifyElement(elmntETMenu);
            click(elmntETMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnElectricTransportationSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean getAllETSubMenuPages(List<String> strETSubMenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strETSubMenuPages, texts);
            System.out.println("getAllETSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllETSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public boolean getAllETMenuPages(List<String> strETMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntETMenu);
            //click(elmntETMenu);
            jsClickScroll(elmntETMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strETMenuPages, texts);
            System.out.println("getAllETMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllETMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean clickOnNewFeaturedSubMenu() {
        boolean blResult = false;
        try {
            /*blResult = verifyElement(elmntNFMenu);
            click(elmntNFMenu);*/

            waitForSeconds(5);
            blResult = verifyElement(elmntNFMenu);
            jsClickScroll(elmntNFMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnNewFeaturedSubMenu catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean getAllNFSubMenuPages(List<String> strNFSubMenuPages) {
        boolean blResult = false;

        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strNFSubMenuPages, texts);
            System.out.println("getAllNFSubMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllNFSubMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }


    public boolean getAllNFMenuPages(List<String> strNFMenuPages) {
        boolean blResult = false;

        try {
            refreshPage();
            waitForSeconds(2);
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);
            blResult = verifyElement(elmntNFMenu);
            //click(elmntNFMenu);
            jsClickScroll(elmntNFMenu);
            waitForSeconds(2);


            // Extract text using Java 8 Streams
            List<String> texts = elmntAppliancesMenuWithoutBtnList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            //Print all the Deals Current URLS in the list
            texts.forEach(System.out::println);

            blResult = compareListStrings(strNFMenuPages, texts);
            System.out.println("getAllNFMenuPages bool value is " + blResult);

        } catch (Exception e) {
            System.out.println("getAllNFMenuPages catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;

    }

    public void checkSurveyPopup() {
        try {

            //If Survey Popup occurs,then click "No,Thanks" button and proceed
            verifyElement(elmntSurveyPopupNo);
            click(elmntSurveyPopupNo);
            waitForSeconds(2);
            System.out.println("Survey Popup exception try ");

        } catch (Exception ex) {
            System.out.println("Survey Popup exception catch " + ex.getMessage());
        }
    }


    public boolean clickOnBestBuyButton() {
        boolean blResult = false;
        try {
            try {
                //If Survey Popup occurs,then click "No,Thanks" button and proceed
                verifyElement(elmntSurveyPopupNo);
                click(elmntSurveyPopupNo);
                waitForSeconds(2);
                System.out.println("Survey Popup inside try " + blResult);
            } catch (Exception ex) {
                System.out.println("Survey Popup exception catch " + ex.getMessage());
            }

            jsClickScroll(elmntBestBuyLogo);
            blResult = true;

            try {
                //If Survey Popup occurs,then click "No,Thanks" button and proceed
                verifyElement(elmntSurveyPopupNo);
                click(elmntSurveyPopupNo);
                waitForSeconds(2);
                System.out.println("Survey Popup inside try " + blResult);
            } catch (Exception ex) {
                System.out.println("Survey Popup exception catch " + ex.getMessage());
            }

        } catch (Exception e) {
            System.out.println("clickOnBestBuyButton catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean GetAllFooterSupportPagesAndNavigateToEachPage() {
        boolean blResult = false;
        int i = 1;
        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntFTSupportList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            for (String text : texts) {
                System.out.println("Print Footer Support Links Text " + text);

                //Click Footer Support Links URL
                WebElement elmntSubMenuURL = waitForElement(By.xpath(elmntFTSupportPageURL.replace("<<REPLACEMENT>>", text)));
                blResult = verifyElement(elmntSubMenuURL);
                jsClickScroll(elmntSubMenuURL);
                waitForSeconds(2);

                strDealsCurrentURL = getCurrentUrl();
                //Add the current page URL in an Array List
                dealsSubMenuURL.add(strDealsCurrentURL);
                //Click on the BestBuy Logo
                jsClickScroll(elmntBestBuyLogo);
                waitForSeconds(2);

                System.out.println("elmntSubMenuURL value is " + elmntSubMenuURL);
                System.out.println("strcurrentUrl value is " + strDealsCurrentURL);
                System.out.println("for loop int i value is " + i);

                i++;
                if (i >= 5) {
                    break;
                }
            }
            System.out.println("GetAllFooterSupportPagesAndNavigateToEachPage try ");

            //Print all the Deals Current URLS in the list
            dealsSubMenuURL.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("GetAllFooterSupportPagesAndNavigateToEachPage catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean validateFTSupportURL(List<String> strFTSupportURL) {

        boolean blResult = false;

        try {
            blResult = compareListContains(dealsSubMenuURL, strFTSupportURL);

        } catch (Exception e) {
            System.out.println("validateSubMenuURL catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean GetAllFooterPagesAndNavigateToEachPage() {
        boolean blResult = false;
        int i = 1;
        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntFTOTList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            for (String text : texts) {
                System.out.println("Print Footer All Links Text " + text);

                //Click Footer Support Links URL
                WebElement elmntSubMenuURL = waitForElement(By.xpath(elmntFTOTPageURL.replace("<<REPLACEMENT>>", text)));
                blResult = verifyElement(elmntSubMenuURL);
                jsClickScroll(elmntSubMenuURL);
                waitForSeconds(5);

                strDealsCurrentURL = getCurrentUrl();
                //Add the current page URL in an Array List
                dealsSubMenuURL.add(strDealsCurrentURL);
                //Click on the BestBuy Logo
                navigateBackPage();
                waitForSeconds(5);
                jsClickScroll(elmntBestBuyLogo);
                waitForSeconds(5);

                System.out.println("elmntSubMenuURL value is " + elmntSubMenuURL);
                System.out.println("strcurrentUrl value is " + strDealsCurrentURL);
                System.out.println("for loop int i value is " + i);

                i++;
                /*if(i==4){
                    break;
                }*/
            }
            System.out.println("GetAllFooterPagesAndNavigateToEachPage try ");

            //Print all the Deals Current URLS in the list
            dealsSubMenuURL.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("GetAllFooterPagesAndNavigateToEachPage catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean validateFooterPageURL(List<String> strFooterPageURL) {

        boolean blResult = false;

        try {
            blResult = compareListContains(dealsSubMenuURL, strFooterPageURL);

        } catch (Exception e) {
            System.out.println("validateFooterPageURL catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean GetAllFooterTCPagesAndNavigateToEachPage() {
        boolean blResult = false;
        int i = 1;
        try {
            // Extract text using Java 8 Streams
            List<String> texts = elmntFTTCList.stream()
                    .map(WebElement::getText) // Extract text from each element
                    .collect(Collectors.toList());

            for (String text : texts) {
                System.out.println("Print Footer All T&C Links Text " + text);

                //Click Footer Support Links URL
                WebElement elmntSubMenuURL = waitForElement(By.xpath(elmntFTTCPageURL.replace("<<REPLACEMENT>>", text)));
                blResult = verifyElement(elmntSubMenuURL);
                jsClickScroll(elmntSubMenuURL);
                waitForSeconds(5);

                strDealsCurrentURL = getCurrentUrl();
                //Add the current page URL in an Array List
                dealsSubMenuURL.add(strDealsCurrentURL);
                //Click on the BestBuy Logo
                navigateBackPage();
                waitForSeconds(5);
                jsClickScroll(elmntBestBuyLogo);
                waitForSeconds(5);

                System.out.println("elmntSubMenuURL value is " + elmntSubMenuURL);
                System.out.println("strcurrentUrl value is " + strDealsCurrentURL);
                System.out.println("for loop int i value is " + i);

                i++;
                /*if(i==4){
                    break;
                }*/
            }
            System.out.println("GetAllFooterTCPagesAndNavigateToEachPage try ");

            //Print all the Deals Current URLS in the list
            dealsSubMenuURL.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("GetAllFooterTCPagesAndNavigateToEachPage catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean validateFooterTCPageURL(List<String> strFooterTCPageURL) {

        boolean blResult = false;

        try {
            blResult = compareListContains(dealsSubMenuURL, strFooterTCPageURL);

        } catch (Exception e) {
            System.out.println("validateFooterTCPageURL catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean enterTheDisneyToyInSearchBoxAndClickSearch(String strDisneyToyValue) {
        boolean blResult = false;
        try {
            //Enter data in Search Field
            blResult = verifyElement(elmntSearchField);
            jsEnterValue(elmntSearchField, strDisneyToyValue);

            //jsEnterValue(elmntSearchField,"lenovo laptop");

            //Click Search Icon
            blResult = click(elmntSearchIcon);
            waitForSeconds(2);

        } catch (Exception e) {
            System.out.println("enterTheDisneyToyInSearchBoxAndClickSearch catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean clickAndNavigateToDisneyToyProductPageAndViewThem(List<String> strPrNameModelSKU) {
        boolean blResult = false;
        boolean blItemNotFound = false;
        StringBuilder strSearchtxtSB;

        int productListSize;
        int lastPageNumber;
        String strTotalPageNumbers;


        try {

            //Verify Search Results Text
            /*blResult = verifyElement(elmntSearchResultsText);
            strSearchtxtSB = new StringBuilder(getTextValue(elmntSearchResultsText));
            System.out.println("Print Search Results Text: "+strSearchtxtSB.toString());*/

            //Verify Search Results Input Text
            /*blResult = verifyElement(elmntSearchResultsInputText);
            strSearchtxtSB = new StringBuilder(strSearchtxtSB.append(getTextValue(elmntSearchResultsInputText)).toString());
            System.out.println("Print Search Results Input Text After Append: "+strSearchtxtSB.toString());*/


            //Get Items Count
            blResult = verifyElement(elmntItemsCount);
            String strItemsCountTxt = getTextValue(elmntItemsCount);
            String strItemsCountValue = removeAfterSpace(strItemsCountTxt);

            //Convert String to Integer
            int totalProductsCount = Integer.parseInt(strItemsCountValue);
            System.out.println("TotalProductsCount Value is: " + totalProductsCount);


            //Get Total Items Count
            /*blResult = verifyElement(elmntFooterItemsCount);
            String strItemsCountTxt = getTextValue(elmntFooterItemsCount);

            Pattern pattern = Pattern.compile("of (\\d+)");
            Matcher matcher = pattern.matcher(strItemsCountTxt);
            String result = "";

            if (matcher.find()) {  // Check if pattern exists
                 result = matcher.group(1);  // Extract matched number
                System.out.println(result); // Output: 27
            }
            //Convert String to Integer
            int totalProductsCount = Integer.parseInt(result);
            System.out.println("TotalProductsCount Value is: "+totalProductsCount);
            */


            //Verify Search Results Product Not Found
            /*blItemNotFound = verifyElement(elmntNoSearchResultsText);
            System.out.println("Item Not Found Bool Value is "+blItemNotFound);
            if(blItemNotFound == false) {
                System.out.println(" Inside If blItemNotFound - Item is found");
                blResult = true;
            }*/

            productListSize = listWebelemSize(elmntListSize);

            // Print the List size
            System.out.println("Products List Size: " + productListSize);


            System.out.println(strPrNameModelSKU.get(0));
            System.out.println(strPrNameModelSKU.get(1));
            System.out.println(strPrNameModelSKU.get(2));

            String targetProductName = strPrNameModelSKU.get(0);
            String targetModelNumber = strPrNameModelSKU.get(1);
            String targetSkuNumber = strPrNameModelSKU.get(2);

            System.out.println("targetProductName: " + targetProductName);
            System.out.println("targetModelNumber: " + targetModelNumber);
            System.out.println("targetSkuNumber: " + targetSkuNumber);

             /*String elmntSeaProductClick1 = elmntSeaProductClick.replace("<<REPLACEMENT>>", targetSkuNumber);
             System.out.println("Product to be Clicked: "+elmntSeaProductClick1);*/

            String elmntSeaProductClick1 = elmntSeaProductAddClick.replace("<<REPLACEMENT>>", targetSkuNumber);
            System.out.println("Product Add To Cart Button click: " + elmntSeaProductClick1);


            if (totalProductsCount <= 18) {
                //Only products are found in one page
                System.out.println("Inside Only One page");

                checkSurveyPopup();

                List<WebElement> products = driver.findElements(By.xpath("//ol[@class='sku-item-list']/li[@class='sku-item']//div[@class='column-middle']"));

                //List<WebElement> products = driver.findElements(By.xpath("//ul[@class='plp-product-list']//div[@class='lv-center']/div[@class='product-list-item-title']"));
                // Click the matching product using Java 8 Streams - If and Else
                Optional<WebElement> matchedProduct = products.stream()
                        .filter(product -> {
                            try {
                                // Extract product details
                                String productName = product.findElement(By.xpath(elmntProductName)).getText();
                                String modelNumber = product.findElement(By.xpath(elmntModelNumber)).getText();
                                String skuNumber = product.findElement(By.xpath(elmntSKUNumber)).getText();

                                System.out.println("Checking product:");
                                System.out.println("Product Name: " + productName);
                                System.out.println("Model Number: " + modelNumber);
                                System.out.println("SKU Number: " + skuNumber);

                                // If all details match, return true (so this product gets selected)
                                return (productName.equalsIgnoreCase(targetProductName) &&
                                        modelNumber.equalsIgnoreCase(targetModelNumber) &&
                                        skuNumber.equalsIgnoreCase(targetSkuNumber));

                            } catch (Exception e) {
                                System.out.println("Error extracting product details: " + e.getMessage());
                                return false;
                            }
                        })
                        .findFirst();

                // Java 8 Fix: Use ifPresent() and handle else case separately
                if (matchedProduct.isPresent()) {
                    try {
                        matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1)).click();
                        System.out.println("Clicked on the product successfully!");
                        blResult = true;
                    } catch (Exception e) {
                        System.out.println("Error clicking product: " + e.getMessage());
                    }
                } else {
                    System.out.println("No matching product found!");
                }
                System.out.println("After Product Clicked Successfully - Inside Only One page");

            } else {
                //Only products are found more than one page
                System.out.println("Inside More than One page");

                //Find Last Page Arrow is enabled and click it
                blResult = verifyElementEnabled(elmntLastPageArrowClick);
                jsClickScroll(elmntLastPageArrowClick);

                lastPageNumber = listWebelemSize(elmntLastPageValue);
                System.out.println("lastPageNumber is: " + lastPageNumber);

                strTotalPageNumbers = elmntTotalNoOfpages.replace("<<REPLACEMENT>>", Integer.toString(lastPageNumber));
                System.out.println("strTotalPageNumbers: " + strTotalPageNumbers);
                String lastPageNumbers = getTextValueByXPathString(strTotalPageNumbers);
                System.out.println("lastPageNumbers: " + lastPageNumbers);

                //System.out.println("strTotalPageNumbers: "+strTotalPageNumbers);
                //System.out.println("Integer.parseInt(strTotalPageNumbers) is: "+Integer.parseInt(strTotalPageNumbers));

                /*String strLastPageCount = getTextValue(elmntLastPageCount);
                System.out.println("Last Page Count Value is: "+strLastPageCount);*/

                //Find First Page Arrow is enabled and click it
                blResult = verifyElementEnabled(elmntFirstPageArrowClick);
                jsClickScroll(elmntFirstPageArrowClick);

                checkSurveyPopup();

                for (int pgno = 1; pgno <= Integer.parseInt(lastPageNumbers); pgno++) {

                    System.out.println("For Loop Page Number Count is: " + pgno);

                    waitForSeconds(5);

                    if (pgno == 1) {

                        System.out.println("Inside More than One page - PAGE 1");

                        try {
                            //If Survey Popup occurs,then click "No,Thanks" button and proceed
                            verifyElement(elmntSurveyPopupNo);
                            click(elmntSurveyPopupNo);
                            waitForSeconds(2);
                            System.out.println("Survey Popup inside try " + blResult);
                        } catch (Exception ex) {
                            System.out.println("Survey Popup exception catch " + ex.getMessage());
                        }


                        List<WebElement> products = driver.findElements(By.xpath("//ol[@class='sku-item-list']/li[@class='sku-item']//div[@class='column-middle']"));

                        //List<WebElement> products = driver.findElements(By.xpath("//ul[@class='plp-product-list']//div[@class='lv-center']/div[@class='product-list-item-title']"));
                        // Click the matching product using Java 8 Streams - If and Else
                        Optional<WebElement> matchedProduct = products.stream()
                                .filter(product -> {
                                    try {
                                        // Extract product details
                                        String productName = product.findElement(By.xpath(elmntProductName)).getText();
                                        String modelNumber = product.findElement(By.xpath(elmntModelNumber)).getText();
                                        String skuNumber = product.findElement(By.xpath(elmntSKUNumber)).getText();

                                        System.out.println("Checking product:");
                                        System.out.println("Product Name: " + productName);
                                        System.out.println("Model Number: " + modelNumber);
                                        System.out.println("SKU Number: " + skuNumber);

                                        // If all details match, return true (so this product gets selected)
                                        return (productName.equalsIgnoreCase(targetProductName) &&
                                                modelNumber.equalsIgnoreCase(targetModelNumber) &&
                                                skuNumber.equalsIgnoreCase(targetSkuNumber));

                                    } catch (Exception e) {
                                        System.out.println("Error extracting product details: " + e.getMessage());
                                        return false;
                                    }
                                })
                                .findFirst();

                        // Java 8 Fix: Use ifPresent() and handle else case separately
                        if (matchedProduct.isPresent()) {
                            try {
                                matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1)).click();
                                System.out.println("Clicked on the product successfully!");
                                System.out.println("Loop Breaked");
                                blResult = true;
                                break;

                            } catch (Exception e) {
                                System.out.println("Error clicking product: " + e.getMessage());
                            }
                        } else {
                            System.out.println("No matching product found!");

                        }
                        System.out.println("After Product Clicked Successfully - Inside More than One page - PAGE 1");


                    } else if (pgno > 1) {

                        System.out.println("Inside More than One page - FROM PAGE 2");

                        System.out.println("page number value is: " + pgno);


                        //Find Last Page Arrow is enabled and click it
                        blResult = verifyElementEnabled(elmntLastPageArrowClick);
                        jsClickScroll(elmntLastPageArrowClick);

                        waitForSeconds(5);

                        checkSurveyPopup();

                       /* //Exclude Out of Stock Checkbox
                        verifyElement(elmntExcludeOutofStockClick);
                        click(elmntExcludeOutofStockClick);
                        waitForSeconds(5);*/

                        List<WebElement> products = driver.findElements(By.xpath("//ol[@class='sku-item-list']/li[@class='sku-item']//div[@class='column-middle']"));

                        //List<WebElement> products = driver.findElements(By.xpath("//ul[@class='plp-product-list']//div[@class='lv-center']/div[@class='product-list-item-title']"));
                        // Click the matching product using Java 8 Streams - If and Else
                        Optional<WebElement> matchedProduct = products.stream()
                                .filter(product -> {
                                    try {
                                        // Extract product details
                                        String productName = product.findElement(By.xpath(elmntProductName)).getText();
                                        String modelNumber = product.findElement(By.xpath(elmntModelNumber)).getText();
                                        String skuNumber = product.findElement(By.xpath(elmntSKUNumber)).getText();

                                        System.out.println("Checking product:");
                                        System.out.println("Product Name: " + productName);
                                        System.out.println("Model Number: " + modelNumber);
                                        System.out.println("SKU Number: " + skuNumber);

                                        // If all details match, return true (so this product gets selected)
                                        return (productName.equalsIgnoreCase(targetProductName) &&
                                                modelNumber.equalsIgnoreCase(targetModelNumber) &&
                                                skuNumber.equalsIgnoreCase(targetSkuNumber));

                                    } catch (Exception e) {
                                        System.out.println("Error extracting product details: " + e.getMessage());
                                        return false;
                                    }
                                })
                                .findFirst();

                        // Java 8 Fix: Use ifPresent() and handle else case separately
                        if (matchedProduct.isPresent()) {
                            try {
                                matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1)).click();
                                System.out.println("Clicked on the product successfully!");
                                System.out.println("Loop Breaked");
                                blResult = true;
                                break;
                            } catch (Exception e) {
                                System.out.println("Error clicking product: " + e.getMessage());
                            }
                        } else {
                            System.out.println("No matching product found!");

                        }
                        System.out.println("After Product Clicked Successfully - Inside More than One page: " + pgno);
                    }

                }

            }


        } catch (Exception e) {
            System.out.println("clickAndNavigateToDisneyToyProductPageAndViewThem catch " + blResult);
            e.printStackTrace();
        }
        System.out.println("clickAndNavigateToDisneyToyProductPageAndViewThem bool value is:  " + blResult);
        takeScreenshot(driver);
        return blResult;
    }


    public boolean checkTheProductAddedToTheCart(String strDisneyToyValue) {
        boolean blResult = false;
        int productsInCartCount;
        String strProductLink = "";
        String strActualProductName = "";

        try {

            waitForSeconds(5);
            productsInCartCount = listWebelemSize(elmntProductInCartList);
            for (int cartitems = 1; cartitems <= productsInCartCount; cartitems++) {
                System.out.println("Loop Count is: " + cartitems);

                strProductLink = elmtProductInCart.replace("<<REPLACEMENT>>", Integer.toString(cartitems));
                System.out.println("strProductLink: " + strProductLink);

                waitForSeconds(2);
                strActualProductName = getTextValueByXPathString(strProductLink);
                System.out.println("strActualProductName in cart is: " + strActualProductName);
                System.out.println("strDisneyToyValue value is: " + strDisneyToyValue);
                if (strActualProductName.equalsIgnoreCase(strDisneyToyValue)) {
                    blResult = true;
                    System.out.println("Product is Found in the Cart Page");
                }
            }


        } catch (Exception e) {
            System.out.println("checkTheProductAddedToTheCart catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean clickOnDealsMenuAndClickOnToysGamesAndCollectibles() {
        boolean blResult = false;
        try {
            //Click on Menu icon
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);

            //Click on Toys, Games & Collectibles Sub-Menu
            jsClickScroll(elmntTGCMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("ClickOnMenuButton catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean clickOnShopByBrandAndClickOnBarbie() {
        boolean blResult = false;
        try {
            //Click on Menu icon
            blResult = verifyElement(elmntShopByBrandMenu);
            jsClickScroll(elmntShopByBrandMenu);

            //Click on Toys, Games & Collectibles Sub-Menu
            jsClickScroll(elmntBarbieBrandMenu);
            waitForSeconds(5);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnShopByBrandAndClickOnBarbie catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean clickAndNavigateToBarbieToyProductPageAndViewThem(List<String> strPrNameModelSKU) {
        boolean blResult = false;
        boolean blItemNotFound = false;
        StringBuilder strSearchtxtSB;

        int productListSize;
        int lastPageNumber;
        String strTotalPageNumbers;
        int totalProductsCount;


        try {

            //Verify Search Results Text
            /*blResult = verifyElement(elmntSearchResultsText);
            strSearchtxtSB = new StringBuilder(getTextValue(elmntSearchResultsText));
            System.out.println("Print Search Results Text: "+strSearchtxtSB.toString());*/

            //Verify Search Results Input Text
            /*blResult = verifyElement(elmntSearchResultsInputText);
            strSearchtxtSB = new StringBuilder(strSearchtxtSB.append(getTextValue(elmntSearchResultsInputText)).toString());
            System.out.println("Print Search Results Input Text After Append: "+strSearchtxtSB.toString());*/


            //Get Items Count
            //blResult = verifyElement(elmntItemsCount);
            //if(blResult == true) {

            blResult = verifyElement(elmntItemsCount);
            System.out.println("Inside IF items Count");
            String strItemsCountTxt = getTextValue(elmntItemsCount);
            String strItemsCountValue = removeAfterSpace(strItemsCountTxt);

            //Convert String to Integer
            totalProductsCount = Integer.parseInt(strItemsCountValue);
            System.out.println("TotalProductsCount Value is: " + totalProductsCount);

            productListSize = listWebelemSize(elmntListSize);

            // Print the List size
            System.out.println("Products List Size: " + productListSize);

            /*System.out.println("Inside ELSE items Count");

                //Get Total Items Count
            blResult = verifyElement(elmntFooterItemsCount);
            String strItemsCountTxt = getTextValue(elmntFooterItemsCount);
            System.out.println("strItemsCountTxt value is:" +strItemsCountTxt);

            Pattern pattern = Pattern.compile("of (\\d+)");
            Matcher matcher = pattern.matcher(strItemsCountTxt);
            String result = "";

            if (matcher.find()) {  // Check if pattern exists
                 result = matcher.group(1);  // Extract matched number
                System.out.println(result); // Output: 27
            }
            //Convert String to Integer
            totalProductsCount = Integer.parseInt(result);
            System.out.println("TotalProductsCount Value is: "+totalProductsCount);*/



            System.out.println(strPrNameModelSKU.get(0));
            System.out.println(strPrNameModelSKU.get(1));
            System.out.println(strPrNameModelSKU.get(2));

            String targetProductName = strPrNameModelSKU.get(0);
            String targetModelNumber = strPrNameModelSKU.get(1);
            String targetSkuNumber = strPrNameModelSKU.get(2);

            System.out.println("targetProductName: " + targetProductName);
            System.out.println("targetModelNumber: " + targetModelNumber);
            System.out.println("targetSkuNumber: " + targetSkuNumber);

             /*String elmntSeaProductClick1 = elmntSeaProductClick.replace("<<REPLACEMENT>>", targetSkuNumber);
             System.out.println("Product to be Clicked: "+elmntSeaProductClick1);*/

            String elmntSeaProductClick1 = elmntSeaProductAddClick.replace("<<REPLACEMENT>>", targetSkuNumber);
            System.out.println("Product Add To Cart Button click: " + elmntSeaProductClick1);


            if (totalProductsCount <= 18) {
                //Only products are found in one page
                System.out.println("Inside Only One page");

                checkSurveyPopup();

                List<WebElement> products = driver.findElements(By.xpath("//ol[@class='sku-item-list']/li[@class='sku-item']//div[@class='column-middle']"));

                //List<WebElement> products = driver.findElements(By.xpath("//ul[@class='plp-product-list']//div[@class='lv-center']/div[@class='product-list-item-title']"));
                // Click the matching product using Java 8 Streams - If and Else
                Optional<WebElement> matchedProduct = products.stream()
                        .filter(product -> {
                            try {
                                // Extract product details
                                String productName = product.findElement(By.xpath(elmntProductName)).getText();
                                String modelNumber = product.findElement(By.xpath(elmntModelNumber)).getText();
                                String skuNumber = product.findElement(By.xpath(elmntSKUNumber)).getText();

                                System.out.println("Checking product:");
                                System.out.println("Product Name: " + productName);
                                System.out.println("Model Number: " + modelNumber);
                                System.out.println("SKU Number: " + skuNumber);

                                // If all details match, return true (so this product gets selected)
                                return (productName.equalsIgnoreCase(targetProductName) &&
                                        modelNumber.equalsIgnoreCase(targetModelNumber) &&
                                        skuNumber.equalsIgnoreCase(targetSkuNumber));

                            } catch (Exception e) {
                                System.out.println("Error extracting product details: " + e.getMessage());
                                return false;
                            }
                        })
                        .findFirst();

                // Java 8 Fix: Use ifPresent() and handle else case separately
                if (matchedProduct.isPresent()) {
                    try {
                        waitForSeconds(2);
                        //matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1)).click();
                        //System.out.println("Clicked on the product successfully!");
                        WebElement element = matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1));
                        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                        System.out.println("Clicked on the product successfully!");
                        blResult = true;
                    } catch (Exception e) {
                        System.out.println("Error clicking product: " + e.getMessage());
                    }
                } else {
                    System.out.println("No matching product found!");
                }
                System.out.println("After Product Clicked Successfully - Inside Only One page");

            } else {
                //Only products are found more than one page
                System.out.println("Inside More than One page");

                //Find Last Page Arrow is enabled and click it
                blResult = verifyElementEnabled(elmntLastPageArrowClick);
                jsClickScroll(elmntLastPageArrowClick);

                lastPageNumber = listWebelemSize(elmntLastPageValue);
                System.out.println("lastPageNumber is: " + lastPageNumber);

                strTotalPageNumbers = elmntTotalNoOfpages.replace("<<REPLACEMENT>>", Integer.toString(lastPageNumber));
                System.out.println("strTotalPageNumbers: " + strTotalPageNumbers);
                String lastPageNumbers = getTextValueByXPathString(strTotalPageNumbers);
                System.out.println("lastPageNumbers: " + lastPageNumbers);

                //System.out.println("strTotalPageNumbers: "+strTotalPageNumbers);
                //System.out.println("Integer.parseInt(strTotalPageNumbers) is: "+Integer.parseInt(strTotalPageNumbers));

                /*String strLastPageCount = getTextValue(elmntLastPageCount);
                System.out.println("Last Page Count Value is: "+strLastPageCount);*/

                //Find First Page Arrow is enabled and click it
                blResult = verifyElementEnabled(elmntFirstPageArrowClick);
                jsClickScroll(elmntFirstPageArrowClick);

                checkSurveyPopup();

                for (int pgno = 1; pgno <= Integer.parseInt(lastPageNumbers); pgno++) {

                    System.out.println("For Loop Page Number Count is: " + pgno);

                    waitForSeconds(5);

                    if (pgno == 1) {

                        System.out.println("Inside More than One page - PAGE 1");

                        try {
                            //If Survey Popup occurs,then click "No,Thanks" button and proceed
                            verifyElement(elmntSurveyPopupNo);
                            click(elmntSurveyPopupNo);
                            waitForSeconds(2);
                            System.out.println("Survey Popup inside try " + blResult);
                        } catch (Exception ex) {
                            System.out.println("Survey Popup exception catch " + ex.getMessage());
                        }
                        List<WebElement> products = driver.findElements(By.xpath("//ol[@class='sku-item-list']/li[@class='sku-item']//div[@class='column-middle']"));

                        //List<WebElement> products = driver.findElements(By.xpath("//ul[@class='plp-product-list']//div[@class='lv-center']/div[@class='product-list-item-title']"));
                        // Click the matching product using Java 8 Streams - If and Else
                        Optional<WebElement> matchedProduct = products.stream()
                                .filter(product -> {
                                    try {
                                        // Extract product details
                                        String productName = product.findElement(By.xpath(elmntProductName)).getText();
                                        String modelNumber = product.findElement(By.xpath(elmntModelNumber)).getText();
                                        String skuNumber = product.findElement(By.xpath(elmntSKUNumber)).getText();

                                        System.out.println("Checking product:");
                                        System.out.println("Product Name: " + productName);
                                        System.out.println("Model Number: " + modelNumber);
                                        System.out.println("SKU Number: " + skuNumber);

                                        // If all details match, return true (so this product gets selected)
                                        return (productName.equalsIgnoreCase(targetProductName) &&
                                                modelNumber.equalsIgnoreCase(targetModelNumber) &&
                                                skuNumber.equalsIgnoreCase(targetSkuNumber));

                                    } catch (Exception e) {
                                        System.out.println("Error extracting product details: " + e.getMessage());
                                        return false;
                                    }
                                })
                                .findFirst();

                        // Java 8 Fix: Use ifPresent() and handle else case separately
                        if (matchedProduct.isPresent()) {
                            try {
                                waitForSeconds(2);
                                //matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1)).click();
                                WebElement element = matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1));
                                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                                System.out.println("Clicked on the product successfully!");
                                System.out.println("Loop Breaked");
                                blResult = true;
                                break;

                            } catch (Exception e) {
                                System.out.println("Error clicking product: " + e.getMessage());
                            }
                        } else {
                            System.out.println("No matching product found!");

                        }
                        System.out.println("After Product Clicked Successfully - Inside More than One page - PAGE 1");


                    } else if (pgno > 1) {

                        System.out.println("Inside More than One page - FROM PAGE 2");

                        System.out.println("page number value is: " + pgno);


                        //Find Last Page Arrow is enabled and click it
                        blResult = verifyElementEnabled(elmntLastPageArrowClick);
                        jsClickScroll(elmntLastPageArrowClick);

                        waitForSeconds(5);

                        checkSurveyPopup();


                        List<WebElement> products = driver.findElements(By.xpath("//ol[@class='sku-item-list']/li[@class='sku-item']//div[@class='column-middle']"));

                        //List<WebElement> products = driver.findElements(By.xpath("//ul[@class='plp-product-list']//div[@class='lv-center']/div[@class='product-list-item-title']"));
                        // Click the matching product using Java 8 Streams - If and Else
                        Optional<WebElement> matchedProduct = products.stream()
                                .filter(product -> {
                                    try {
                                        // Extract product details
                                        String productName = product.findElement(By.xpath(elmntProductName)).getText();
                                        String modelNumber = product.findElement(By.xpath(elmntModelNumber)).getText();
                                        String skuNumber = product.findElement(By.xpath(elmntSKUNumber)).getText();

                                        System.out.println("Checking product:");
                                        System.out.println("Product Name: " + productName);
                                        System.out.println("Model Number: " + modelNumber);
                                        System.out.println("SKU Number: " + skuNumber);

                                        // If all details match, return true (so this product gets selected)
                                        return (productName.equalsIgnoreCase(targetProductName) &&
                                                modelNumber.equalsIgnoreCase(targetModelNumber) &&
                                                skuNumber.equalsIgnoreCase(targetSkuNumber));

                                    } catch (Exception e) {
                                        System.out.println("Error extracting product details: " + e.getMessage());
                                        return false;
                                    }
                                })
                                .findFirst();

                        // Java 8 Fix: Use ifPresent() and handle else case separately
                        if (matchedProduct.isPresent()) {
                            try {
                                waitForSeconds(2);
                                //matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1)).click();
                                //System.out.println("Clicked on the product successfully!");
                                WebElement element = matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1));
                                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                                System.out.println("Clicked on the product successfully!");
                                System.out.println("Loop Breaked");
                                blResult = true;
                                break;
                            } catch (Exception e) {
                                System.out.println("Error clicking product: " + e.getMessage());
                            }
                        } else {
                            System.out.println("No matching product found!");

                        }
                        System.out.println("After Product Clicked Successfully - Inside More than One page: " + pgno);
                    }

                }

            }
            //}
            //else{
                /*System.out.println("Inside ELSE items Count");

                //Get Total Items Count
            blResult = verifyElement(elmntFooterItemsCount);
            String strItemsCountTxt = getTextValue(elmntFooterItemsCount);
            System.out.println("strItemsCountTxt value is:" +strItemsCountTxt);

            Pattern pattern = Pattern.compile("of (\\d+)");
            Matcher matcher = pattern.matcher(strItemsCountTxt);
            String result = "";

            if (matcher.find()) {  // Check if pattern exists
                 result = matcher.group(1);  // Extract matched number
                System.out.println(result); // Output: 27
            }
            //Convert String to Integer
            totalProductsCount = Integer.parseInt(result);
            System.out.println("TotalProductsCount Value is: "+totalProductsCount);*/
            //}


        } catch (Exception e) {
            System.out.println("clickAndNavigateToBarbieToyProductPageAndViewThem catch " + blResult);
            e.printStackTrace();
        }
        System.out.println("clickAndNavigateToBarbieToyProductPageAndViewThem bool value is:  " + blResult);
        takeScreenshot(driver);
        return blResult;
    }


    public boolean checkTheBarbieProductAddedToTheCart(String strDisneyToyValue) {
        boolean blResult = false;
        int productsInCartCount;
        String strProductLink = "";
        String strActualProductName = "";

        try {

            //Click on Go To Cart button
            try {
                waitForSeconds(2);
                blResult = verifyElement(elmntGoToCartButton);
                jsClickScroll(elmntGoToCartButton);
            } catch (Exception ex) {
                System.out.println("checkTheBarbieProductAddedToTheCart Go To cart Button Catch" + ex.getMessage());
            }


            waitForSeconds(5);
            productsInCartCount = listWebelemSize(elmntProductInCartList);
            for (int cartitems = 1; cartitems <= productsInCartCount; cartitems++) {
                System.out.println("Loop Count is: " + cartitems);

                strProductLink = elmtProductInCart.replace("<<REPLACEMENT>>", Integer.toString(cartitems));
                System.out.println("strProductLink: " + strProductLink);

                strActualProductName = getTextValueByXPathString(strProductLink);
                if (strActualProductName.equalsIgnoreCase(strDisneyToyValue)) {
                    blResult = true;
                    System.out.println("Product is Found in the Cart Page");
                }
            }


        } catch (Exception e) {
            System.out.println("checkTheBarbieProductAddedToTheCart catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean clickOnDealsMenuAndClickOnBrands() {
        boolean blResult = false;
        try {

            //Click on Menu icon
            blResult = verifyElement(elmntMenu);
            click(elmntMenu);

            //Click on Brands Sub-Menu
            jsClickScroll(elmntBrandsMenu);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnDealsMenuAndClickOnBrands catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean clickOnLenovoAndClickOnLaptops() {
        boolean blResult = false;
        try {

            //Click on Menu icon
            blResult = verifyElement(elmntLenovoBrandMenu);
            jsClickScroll(elmntLenovoBrandMenu);
            waitForSeconds(5);

            //Click on Brands Sub-Menu
            jsClickScroll(elmntLaptopsCard);
            waitForSeconds(5);
            blResult = true;

        } catch (Exception e) {
            System.out.println("clickOnLenovoAndClickOnLaptops catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean checkTheLaptopProductAddedToTheCart(List<String> strPrNameModelSKU) {
        boolean blResult = false;
        boolean blItemNotFound = false;
        StringBuilder strSearchtxtSB;

        int productListSize;
        int lastPageNumber;
        String strTotalPageNumbers;


        try {

            //Verify Search Results Text
            /*blResult = verifyElement(elmntSearchResultsText);
            strSearchtxtSB = new StringBuilder(getTextValue(elmntSearchResultsText));
            System.out.println("Print Search Results Text: "+strSearchtxtSB.toString());*/

            //Verify Search Results Input Text
            /*blResult = verifyElement(elmntSearchResultsInputText);
            strSearchtxtSB = new StringBuilder(strSearchtxtSB.append(getTextValue(elmntSearchResultsInputText)).toString());
            System.out.println("Print Search Results Input Text After Append: "+strSearchtxtSB.toString());*/


            //Get Items Count
            blResult = verifyElement(elmntItemsCount);
            String strItemsCountTxt = getTextValue(elmntItemsCount);
            String strItemsCountValue = removeAfterSpace(strItemsCountTxt);

            //Convert String to Integer
            int totalProductsCount = Integer.parseInt(strItemsCountValue);
            System.out.println("TotalProductsCount Value is: " + totalProductsCount);


            //Get Total Items Count
            /*blResult = verifyElement(elmntFooterItemsCount);
            String strItemsCountTxt = getTextValue(elmntFooterItemsCount);

            Pattern pattern = Pattern.compile("of (\\d+)");
            Matcher matcher = pattern.matcher(strItemsCountTxt);
            String result = "";

            if (matcher.find()) {  // Check if pattern exists
                 result = matcher.group(1);  // Extract matched number
                System.out.println(result); // Output: 27
            }
            //Convert String to Integer
            int totalProductsCount = Integer.parseInt(result);
            System.out.println("TotalProductsCount Value is: "+totalProductsCount);
            */

            //Verify Search Results Product Not Found
            /*blItemNotFound = verifyElement(elmntNoSearchResultsText);
            System.out.println("Item Not Found Bool Value is "+blItemNotFound);
            if(blItemNotFound == false) {
                System.out.println(" Inside If blItemNotFound - Item is found");
                blResult = true;
            }*/

            productListSize = listWebelemSize(elmntListSize);

            // Print the List size
            System.out.println("Products List Size: " + productListSize);


            System.out.println(strPrNameModelSKU.get(0));
            System.out.println(strPrNameModelSKU.get(1));
            System.out.println(strPrNameModelSKU.get(2));

            String targetProductName = strPrNameModelSKU.get(0);
            String targetModelNumber = strPrNameModelSKU.get(1);
            String targetSkuNumber = strPrNameModelSKU.get(2);

            System.out.println("targetProductName: " + targetProductName);
            System.out.println("targetModelNumber: " + targetModelNumber);
            System.out.println("targetSkuNumber: " + targetSkuNumber);

             /*String elmntSeaProductClick1 = elmntSeaProductClick.replace("<<REPLACEMENT>>", targetSkuNumber);
             System.out.println("Product to be Clicked: "+elmntSeaProductClick1);*/

            String elmntSeaProductClick1 = elmntSeaProductAddClickBrands.replace("<<REPLACEMENT>>", targetSkuNumber);
            System.out.println("Product Add To Cart Button click: " + elmntSeaProductClick1);


            if (totalProductsCount <= 18) {
                //Only products are found in one page
                System.out.println("Inside Only One page");

                checkSurveyPopup();

                List<WebElement> products = driver.findElements(By.xpath("//ol[@class='sku-item-list']/li[@class='sku-item']//div[@class='column-middle']"));

                //List<WebElement> products = driver.findElements(By.xpath("//ul[@class='plp-product-list']//div[@class='lv-center']/div[@class='product-list-item-title']"));
                // Click the matching product using Java 8 Streams - If and Else
                Optional<WebElement> matchedProduct = products.stream()
                        .filter(product -> {
                            try {
                                // Extract product details
                                String productName = product.findElement(By.xpath(elmntProductName)).getText();
                                String modelNumber = product.findElement(By.xpath(elmntModelNumber)).getText();
                                String skuNumber = product.findElement(By.xpath(elmntSKUNumber)).getText();

                                System.out.println("Checking product:");
                                System.out.println("Product Name: " + productName);
                                System.out.println("Model Number: " + modelNumber);
                                System.out.println("SKU Number: " + skuNumber);

                                // If all details match, return true (so this product gets selected)
                                return (productName.equalsIgnoreCase(targetProductName) &&
                                        modelNumber.equalsIgnoreCase(targetModelNumber) &&
                                        skuNumber.equalsIgnoreCase(targetSkuNumber));

                            } catch (Exception e) {
                                System.out.println("Error extracting product details: " + e.getMessage());
                                return false;
                            }
                        })
                        .findFirst();

                // Java 8 Fix: Use ifPresent() and handle else case separately
                if (matchedProduct.isPresent()) {
                    try {
                        /*waitForSeconds(5);
                        matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1)).click();*/

                        waitForSeconds(30);
                        WebElement element = matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1));
                        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                        waitForSeconds(10);

                        /*WebDriverWait wait = new WebDriverWait(driver, 30);
                        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elmntSeaProductClick1)));

                        // Wait until visible
                        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elmntSeaProductClick1)));

                         // Now wait until clickable
                        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elmntSeaProductClick1)));
                        Actions actions = new Actions(driver);
                        actions.moveToElement(element).click().perform();*/



                        System.out.println("Clicked on the product successfully!");
                        blResult = true;
                    } catch (Exception e) {
                        System.out.println("Error clicking product: " + e.getMessage());
                    }
                } else {
                    System.out.println("No matching product found!");
                }
                System.out.println("After Product Clicked Successfully - Inside Only One page");

            } else {
                //Only products are found more than one page
                System.out.println("Inside More than One page");

                //Find Last Page Arrow is enabled and click it
                blResult = verifyElementEnabled(elmntLastPageArrowClick);
                jsClickScroll(elmntLastPageArrowClick);

                lastPageNumber = listWebelemSize(elmntLastPageValue);
                System.out.println("lastPageNumber is: " + lastPageNumber);

                strTotalPageNumbers = elmntTotalNoOfpagesBrands.replace("<<REPLACEMENT>>", Integer.toString(lastPageNumber));
                System.out.println("strTotalPageNumbers: " + strTotalPageNumbers);
                String lastPageNumbers = getTextValueByXPathString(strTotalPageNumbers);
                System.out.println("lastPageNumbers: " + lastPageNumbers);

                //System.out.println("strTotalPageNumbers: "+strTotalPageNumbers);
                //System.out.println("Integer.parseInt(strTotalPageNumbers) is: "+Integer.parseInt(strTotalPageNumbers));

                /*String strLastPageCount = getTextValue(elmntLastPageCount);
                System.out.println("Last Page Count Value is: "+strLastPageCount);*/

                //Find First Page Arrow is enabled and click it
                blResult = verifyElementEnabled(elmntFirstPageArrowClick);
                jsClickScroll(elmntFirstPageArrowClick);

                checkSurveyPopup();

                for (int pgno = 1; pgno <= Integer.parseInt(lastPageNumbers); pgno++) {

                    System.out.println("For Loop Page Number Count is: " + pgno);

                    waitForSeconds(5);

                    if (pgno == 1) {

                        System.out.println("Inside More than One page - PAGE 1");

                        checkSurveyPopup();


                        List<WebElement> products = driver.findElements(By.xpath("//ol[@class='sku-item-list']/li[@class='sku-item']//div[@class='column-middle']"));

                        //List<WebElement> products = driver.findElements(By.xpath("//ul[@class='plp-product-list']//div[@class='lv-center']/div[@class='product-list-item-title']"));
                        // Click the matching product using Java 8 Streams - If and Else
                        Optional<WebElement> matchedProduct = products.stream()
                                .filter(product -> {
                                    try {
                                        // Extract product details
                                        String productName = product.findElement(By.xpath(elmntProductName)).getText();
                                        String modelNumber = product.findElement(By.xpath(elmntModelNumber)).getText();
                                        String skuNumber = product.findElement(By.xpath(elmntSKUNumber)).getText();

                                        System.out.println("Checking product:");
                                        System.out.println("Product Name: " + productName);
                                        System.out.println("Model Number: " + modelNumber);
                                        System.out.println("SKU Number: " + skuNumber);

                                        // If all details match, return true (so this product gets selected)
                                        return (productName.equalsIgnoreCase(targetProductName) &&
                                                modelNumber.equalsIgnoreCase(targetModelNumber) &&
                                                skuNumber.equalsIgnoreCase(targetSkuNumber));

                                    } catch (Exception e) {
                                        System.out.println("Error extracting product details: " + e.getMessage());
                                        return false;
                                    }
                                })
                                .findFirst();

                        // Java 8 Fix: Use ifPresent() and handle else case separately
                        if (matchedProduct.isPresent()) {
                            try {
                                /*waitForSeconds(5);
                                matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1)).click();*/

                                waitForSeconds(30);
                                WebElement element = matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1));
                                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                                waitForSeconds(10);

                                /*WebDriverWait wait = new WebDriverWait(driver, 30);
                                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elmntSeaProductClick1)));

                                // Wait until visible
                                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elmntSeaProductClick1)));

                                // Now wait until clickable
                                //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elmntSeaProductClick1)));
                                Actions actions = new Actions(driver);
                                actions.moveToElement(element).click().perform();*/

                                System.out.println("Clicked on the product successfully!");
                                System.out.println("Loop Breaked");
                                blResult = true;
                                break;

                            } catch (Exception e) {
                                System.out.println("Error clicking product: " + e.getMessage());
                            }
                        } else {
                            System.out.println("No matching product found!");

                        }
                        System.out.println("After Product Clicked Successfully - Inside More than One page - PAGE 1");


                    } else if (pgno > 1) {

                        System.out.println("Inside More than One page - FROM PAGE 2");

                        System.out.println("page number value is: " + pgno);


                        //Find Last Page Arrow is enabled and click it
                        blResult = verifyElementEnabled(elmntLastPageArrowClick);
                        jsClickScroll(elmntLastPageArrowClick);

                        waitForSeconds(5);

                        checkSurveyPopup();

                       /* //Exclude Out of Stock Checkbox
                        verifyElement(elmntExcludeOutofStockClick);
                        click(elmntExcludeOutofStockClick);
                        waitForSeconds(5);*/

                        List<WebElement> products = driver.findElements(By.xpath("//ol[@class='sku-item-list']/li[@class='sku-item']//div[@class='column-middle']"));

                        //List<WebElement> products = driver.findElements(By.xpath("//ul[@class='plp-product-list']//div[@class='lv-center']/div[@class='product-list-item-title']"));
                        // Click the matching product using Java 8 Streams - If and Else
                        Optional<WebElement> matchedProduct = products.stream()
                                .filter(product -> {
                                    try {
                                        // Extract product details
                                        String productName = product.findElement(By.xpath(elmntProductName)).getText();
                                        String modelNumber = product.findElement(By.xpath(elmntModelNumber)).getText();
                                        String skuNumber = product.findElement(By.xpath(elmntSKUNumber)).getText();

                                        System.out.println("Checking product:");
                                        System.out.println("Product Name: " + productName);
                                        System.out.println("Model Number: " + modelNumber);
                                        System.out.println("SKU Number: " + skuNumber);

                                        // If all details match, return true (so this product gets selected)
                                        return (productName.equalsIgnoreCase(targetProductName) &&
                                                modelNumber.equalsIgnoreCase(targetModelNumber) &&
                                                skuNumber.equalsIgnoreCase(targetSkuNumber));

                                    } catch (Exception e) {
                                        System.out.println("Error extracting product details: " + e.getMessage());
                                        return false;
                                    }
                                })
                                .findFirst();

                        // Java 8 Fix: Use ifPresent() and handle else case separately
                        if (matchedProduct.isPresent()) {
                            try {
                                /*waitForSeconds(5);
                                matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1)).click();*/

                                waitForSeconds(30);
                                WebElement element = matchedProduct.get().findElement(By.xpath(elmntSeaProductClick1));
                                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                                waitForSeconds(10);

                                /*WebDriverWait wait = new WebDriverWait(driver, 30);
                                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elmntSeaProductClick1)));

                                // Wait until visible
                                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elmntSeaProductClick1)));

                                // Now wait until clickable
                                //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elmntSeaProductClick1)));
                                Actions actions = new Actions(driver);
                                actions.moveToElement(element).click().perform();*/

                                System.out.println("Clicked on the product successfully!");
                                System.out.println("Loop Breaked");
                                blResult = true;
                                break;
                            } catch (Exception e) {
                                System.out.println("Error clicking product: " + e.getMessage());
                            }
                        } else {
                            System.out.println("No matching product found!");

                        }
                        System.out.println("After Product Clicked Successfully - Inside More than One page: " + pgno);
                    }

                }

            }

        } catch (Exception e) {
            System.out.println("checkTheLaptopProductAddedToTheCart catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        System.out.println("checkTheLaptopProductAddedToTheCart bool value is:  " + blResult);
        return blResult;
    }


    public boolean checkTheLaptopProductInTheCart(String strLaptopProductValue) {
        boolean blResult = false;
        int productsInCartCount;
        String strProductLink = "";
        String strActualProductName = "";

        try {

            //Click on Go To Cart button
            try {
                waitForSeconds(2);
                blResult = verifyElement(elmntGoToCartButton);
                jsClickScroll(elmntGoToCartButton);
            } catch (Exception ex) {
                System.out.println("checkTheLaptopProductInTheCart Go To cart Button Catch" + ex.getMessage());
            }


            waitForSeconds(5);
            productsInCartCount = listWebelemSize(elmntProductInCartList);
            for (int cartitems = 1; cartitems <= productsInCartCount; cartitems++) {
                System.out.println("Loop Count is: " + cartitems);

                strProductLink = elmtProductInCart.replace("<<REPLACEMENT>>", Integer.toString(cartitems));
                System.out.println("strProductLink: " + strProductLink);

                strActualProductName = getTextValueByXPathString(strProductLink);
                if (strActualProductName.equalsIgnoreCase(strLaptopProductValue)) {
                    blResult = true;
                    System.out.println("Product is Found in the Cart Page");
                }
            }


        } catch (Exception e) {
            System.out.println("checkTheLaptopProductInTheCart catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean clickOnTheCheckoutButton() {
        boolean blResult = false;
        try {

            //Click on Checkout icon
            blResult = verifyElement(elmntCheckoutBtn);
            jsClickScroll(elmntCheckoutBtn);
            waitForSeconds(2);

        } catch (Exception e) {
            System.out.println("clickOnTheCheckoutButton catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean clickOnTheContinueAsGuestButton() {
        boolean blResult = false;
        try {

            waitForSeconds(2);

            //Click on Continue as Guest icon
            blResult = verifyElement(elmntContinueAsGuestBtn);
            jsClickScroll(elmntContinueAsGuestBtn);
            waitForSeconds(2);

        } catch (Exception e) {
            System.out.println("clickOnTheContinueAsGuestButton catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean emailAddressAndPhonenumber(String strEmail, String strPhonenumber) {
        boolean blResult = false;
        try {

            waitForSeconds(2);

            //Enter Guest Email and Phone Number
            blResult = verifyElement(elmntGuestEmailAddress);
            blResult = enterValue(elmntGuestEmailAddress, strEmail);
            blResult = verifyElement(elmntGuestPhoneNumber);
            blResult = enterValue(elmntGuestPhoneNumber, strPhonenumber);

            //Click Continue to Payment button
            jsClickScroll(elmntContinuePaymentBtn);

            waitForSeconds(2);

        } catch (Exception e) {
            System.out.println("clickOnTheContinueAsGuestButton catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean enterPaymentInformationAndDeliveryAddressDetails(List<String> strCardNumber, List<String> strDeliveryAddress) {
        boolean blResult = false;
        try {

            waitForSeconds(2);

            //Enter Card Number
            blResult = verifyElement(elmntCardNumber);
            blResult = enterValue(elmntCardNumber, strCardNumber.get(0));

            //Enter Card Number
            blResult = verifyElement(elmntCardExpiry);
            blResult = enterValue(elmntCardExpiry, strCardNumber.get(1));

            //Enter Card Number
            blResult = verifyElement(elmntCardCVV);
            blResult = enterValue(elmntCardCVV, strCardNumber.get(2));


            //Enter DeliveryAddress - First Name
            blResult = verifyElement(elmntDeliveryFirstName);
            blResult = enterValue(elmntDeliveryFirstName, strDeliveryAddress.get(0));

            //Enter DeliveryAddress - Last Name
            blResult = verifyElement(elmntDeliveryLastName);
            blResult = enterValue(elmntDeliveryLastName, strDeliveryAddress.get(1));

            //Enter DeliveryAddress - Address
            blResult = verifyElement(elmntDeliveryAddress);
            blResult = enterValue(elmntDeliveryAddress, strDeliveryAddress.get(2));

            //Enter DeliveryAddress - City
            blResult = verifyElement(elmntDeliveryCity);
            blResult = enterValue(elmntDeliveryCity, strDeliveryAddress.get(3));

            //Enter DeliveryAddress - State
            blResult = verifyElement(elmntDeliveryState);
            System.out.println("State value is: "+strDeliveryAddress.get(4));
            //ElementselectByVisibleString(elmntDeliveryState, strDeliveryAddress.get(4));
            //ElementselectByIndex(elmntDeliveryState, 3);

            WebElement element = driver.findElement(By.id("state"));

            if (element.getTagName().equalsIgnoreCase("select")) {
                Select dropdown = new Select(element);
                dropdown.selectByVisibleText("AK");
            } else {
                System.out.println("Element is not a <select> tag.");
                // Use JavaScript or click logic for custom dropdowns
            }

            //Enter DeliveryAddress - State
            blResult = verifyElement(elmntDeliveryZipCode);
            blResult = enterValue(elmntDeliveryZipCode, strDeliveryAddress.get(5));

            //Enter DeliveryAddress - Password
            //verifyElement(elmntBestBuyPassword);
            //enterValue(elmntBestBuyPassword, strDeliveryAddress.get(6));

            waitForSeconds(2);

            //Click Place Order button
            jsClickScroll(elmntPlaceYourOrder);

            waitForSeconds(8);

        } catch (Exception e) {
            System.out.println("enterPaymentInformationAndDeliveryAddressDetails catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean checkOrderIsPlacedSuccessfully(String strOrderSuccessMessage) {
        boolean blResult = false;
        try {
            //Check Order Success Message is displayed
            blResult = verifyElement(elmntOrderSuccessMessage);
            String strActualSuccessMsg = getTextValue(elmntOrderSuccessMessage);
            if (strActualSuccessMsg.equalsIgnoreCase(strOrderSuccessMessage)) {
                System.out.println("Inside checkOrderIsPlacedSuccessfully try IF Block");
                blResult = true;
            }
            waitForSeconds(2);

        } catch (Exception e) {
            System.out.println("checkOrderIsPlacedSuccessfully catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }



    public boolean enterTheProductNameInSearchBoxAndClickSearch(String strWrongProductName) {
        boolean blResult = false;
        try {
            //Enter data in Search Field
            blResult = verifyElement(elmntSearchField);
            jsEnterValue(elmntSearchField, strWrongProductName);

            //jsEnterValue(elmntSearchField,"lenovo laptop");

            //Click Search Icon
            blResult = click(elmntSearchIcon);
            waitForSeconds(5);

        } catch (Exception e) {
            System.out.println("enterTheProductNameInSearchBoxAndClickSearch catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }



    public boolean checkTheProductNotAvailableInStore() {
        boolean blResult = false;
        try {

            blResult = verifyElement(elmntNoSearchResultsText);
            System.out.println("Item Not Found Bool Value is "+blResult);
            /*if(blResult == false) {
                System.out.println(" Inside If blItemNotFound - Item is found");
                blResult = true;
            }*/

        } catch (Exception e) {
            System.out.println("checkTheProductNotAvailableInStore catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


}












