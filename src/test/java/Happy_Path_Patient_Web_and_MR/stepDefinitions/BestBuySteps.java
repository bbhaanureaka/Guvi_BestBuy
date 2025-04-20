package Happy_Path_Patient_Web_and_MR.stepDefinitions;

import Happy_Path_Patient_Web_and_MR.DemoPageContainer;
import cap.utilities.TestDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/*
 * Created by Codoidian-pc on 05/03/2022.
 */
public class BestBuySteps {

    private DemoPageContainer demoPageContainer;

    public BestBuySteps(DemoPageContainer demoPageContainer) {

        this.demoPageContainer = demoPageContainer;
    }

    @Given("As a user i should launch BestBuy Website")
    public void as_a_user_i_should_launch_best_buy_website() {

        demoPageContainer.bestBuyPage.visitWebsite();
    }

    @Given("I should {string} select Country")
    public void i_should_select_country(String strCountryName) {

        Assert.assertTrue(demoPageContainer.bestBuyPage.selectCountry(TestDataUtil.getValue(strCountryName)));
    }

    @Then("I should validate URL {string} is valid")
    public void iShouldValidateURLIsValid(String strcurrrentCountryURL) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.checkValidURL(TestDataUtil.getValue(strcurrrentCountryURL)));
    }

    @Given("As a user i should navigate to Create Account page")
    public void asAUserIShouldNavigateToCreateAccountPage() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.goToCreateAccountPage());
    }

    @And("I should not enter any data in input fields and Click on Create an Account button")
    public void iShouldNotEnterAnyDataInInputFieldsAndClickOnCreateAnAccountButton() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickCreateAnAccountButton());
    }

    @Then("I should check the mandatory fields {string} validation messages")
    public void iShouldCheckTheMandatoryFieldsValidationMessages(String strNoDataValidationMessages) {

        Assert.assertTrue(demoPageContainer.bestBuyPage.checkNoDataValidationMessages(TestDataUtil.getListOfValue(strNoDataValidationMessages)));

    }

    @And("I should enter invalid data {string} in input fields and Click on Create an Account button")
    public void iShouldEnterInvalidDataInInputFieldsAndClickOnCreateAnAccountButton(String strInvalidTestData) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.EnterInvalidDataCreateAccountPage(TestDataUtil.getListOfValue(strInvalidTestData)));
    }

    @Then("I should check all invalid messages {string} are displayed")
    public void iShouldCheckAllInvalidMessagesAreDisplayed(String strInvalidDataValidationMessages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.checkInvalidDataValidationMessages(TestDataUtil.getListOfValue(strInvalidDataValidationMessages)));
    }

    @And("I should enter valid data {string} in input fields and Click on Create an Account button")
    public void iShouldEnterValidDataInInputFieldsAndClickOnCreateAnAccountButton(String strValidDataValidationMessages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.EnterValidDataCreateAccountPage(TestDataUtil.getListOfValue(strValidDataValidationMessages)));
    }

    @Then("I should check account is created successfully")
    public void iShouldCheckAccountIsCreatedSuccessfully() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.checkAccountIsCreatedSuccessfully());
    }

    @Then("I should signout from the BestBuy Website")
    public void iShouldSignoutFromTheBestBuyWebsite() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.signoutFromTheBestBuyWebsite());
    }

    @Given("As a user i should navigate to Sign In button")
    public void asAUserIShouldNavigateToSignInButton() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.navigateToSignInButton());
    }

    @When("I enter UserName {string} and click Continue")
    public void iEnterUserNameAndClickContinue(String strUserName) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.EnterUserNameAndClickContinue(TestDataUtil.getValue(strUserName)));
    }

    @When("I select Use Password {string} ,enter Password and click Continue")
    public void iSelectUsePasswordEnterPasswordAndClickContinue(String strPassword) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.SelectUsePasswordEnterPasswordAndClickContinue(TestDataUtil.getValue(strPassword)));
    }

    @Then("I should check account is logged in successfully")
    public void iShouldCheckAccountIsLoggedInSuccessfully() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.checkAccountIsLoggedInSuccessfully());
    }

    @Given("As a user i should click on Menu Button")
    public void asAUserIShouldClickOnMenuButton() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnMenuButton());
    }

    @When("I should click on Deals Sub-menu")
    public void iShouldClickOnDealsSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnDealsSubMenu());
    }

    @And("I should get all the Deals Pages and Navigate to each page")
    public void iShouldGetAllTheDealsPagesAndNavigateToEachPage() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllTheDealsPagesAndNavigateToEachPage());
    }

    @Then("I should validate Sub-Menu URL {string}")
    public void iShouldValidateSubMenuURL(String strDealsPageURL) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.validateSubMenuURL(TestDataUtil.getListOfValue(strDealsPageURL)));
    }

    @When("I should click on Support and Services Sub-menu")
    public void iShouldClickOnSupportAndServicesSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnSupportAndServicesSubMenu());
    }

    @And("I should get all the Support and Services Pages and Navigate to each page")
    public void iShouldGetAllTheSupportAndServicesPagesAndNavigateToEachPage() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllTheSupportAndServicesPagesAndNavigateToEachPage());
    }

    @Then("I should validate Support and Services Sub-Menu URL {string}")
    public void iShouldValidateSupportAndServicesSubMenuURL(String strDealsByCategoryPageURL) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.validateSupportAndServicesSubMenuUR(TestDataUtil.getListOfValue(strDealsByCategoryPageURL)));
    }

    @When("I should click on Brands Sub-menu")
    public void iShouldClickOnBrandsSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnBrandsSubMenu());
    }

    @And("I should get all the Brands Pages and Navigate to each page")
    public void iShouldGetAllTheBrandsPagesAndNavigateToEachPage() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllTheBrandsPagesAndNavigateToEachPage());
    }

    @Then("I should validate Brands Sub-Menu URL {string}")
    public void iShouldValidateBrandsSubMenuURL(String strDealsByCategoryPageURL) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.validateBrandsSubMenuURL(TestDataUtil.getListOfValue(strDealsByCategoryPageURL)));
    }

    @And("I should get all the Best Buy Brands Pages and Navigate to each page")
    public void iShouldGetAllTheBestBuyBrandsPagesAndNavigateToEachPage() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllTheBestBuyBrandsPagesAndNavigateToEachPage());
    }

    @Then("I should validate Best Buy Brands Sub-Menu URL {string}")
    public void iShouldValidateBestBuyBrandsSubMenuURL(String strDealsByCategoryPageURL) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.validateBestBuyBrandsSubMenuURL(TestDataUtil.getListOfValue(strDealsByCategoryPageURL)));
    }

    @When("I should click on Appliances Sub-menu")
    public void iShouldClickOnAppliancesSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnAppliancesSubMenu());
    }

    @Then("I should get all the Appliances Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheAppliancesSubMenuPagesAndValidateTheSubMenus(String strAppliancesSubmenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllTheAppliancesSubMenuPages(TestDataUtil.getListOfValue(strAppliancesSubmenuPages)));
    }

    @Then("I should get all the Appliances Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheAppliancesMenuPagesAndValidateTheMenus(String strAppliancesMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllTheAppliancesMenuPages(TestDataUtil.getListOfValue(strAppliancesMenuPages)));
    }

    @When("I should click on TV & Home Theatre Sub-menu")
    public void iShouldClickOnTVHomeTheatreSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnTVHomeTheatreSubMenu());
    }

    @Then("I should get all the TV & Home Theatre  Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheTVHomeTheatreSubMenuPagesAndValidateTheSubMenus(String strTVHTSubmenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllTVHomeTheatreSubMenuPages(TestDataUtil.getListOfValue(strTVHTSubmenuPages)));
    }

    @Then("I should get all the TV & Home Theatre  Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheTVHomeTheatreMenuPagesAndValidateTheMenus(String strTVHTMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllTheTVHTMenuPages(TestDataUtil.getListOfValue(strTVHTMenuPages)));
    }

    @When("I should click on Computers & Tablets Sub-menu")
    public void iShouldClickOnComputersTabletsSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnComputersTabletsSubMenu());
    }

    @Then("I should get all the Computers & Tablets Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheComputersTabletsSubMenuPagesAndValidateTheSubMenus(String strCTSubmenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllComputersTabletsSubMenuPages(TestDataUtil.getListOfValue(strCTSubmenuPages)));
    }

    @Then("I should get all the Computers & Tablets Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheComputersTabletsMenuPagesAndValidateTheMenus(String strCTMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllComputersTabletsMenuPages(TestDataUtil.getListOfValue(strCTMenuPages)));
    }

    @When("I should click on Cell Phones Sub-menu")
    public void iShouldClickOnCellPhonesSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnCellPhonesSubMenu());
    }

    @Then("I should get all the Cell Phones Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheCellPhonesSubMenuPagesAndValidateTheSubMenus(String strCPSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllCellPhonesSubMenuPages(TestDataUtil.getListOfValue(strCPSubMenuPages)));
    }

    @Then("I should get all the Cell Phones Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheCellPhonesMenuPagesAndValidateTheMenus(String strCPMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllCellPhonesMenuPages(TestDataUtil.getListOfValue(strCPMenuPages)));
    }

    @When("I should click on Audio and Head Phones Sub-menu")
    public void iShouldClickOnAudioAndHeadPhonesSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnAudioAndHeadPhonesSubMenu());
    }

    @Then("I should get all the Audio and Head Phones Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheAudioAndHeadPhonesSubMenuPagesAndValidateTheSubMenus(String strAHPSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllAudioAndHeadPhonesSubMenuPages(TestDataUtil.getListOfValue(strAHPSubMenuPages)));
    }

    @Then("I should get all the Audio and Head Phones Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheAudioAndHeadPhonesMenuPagesAndValidateTheMenus(String strCPMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllAudioAndHeadPhonesMenuPages(TestDataUtil.getListOfValue(strCPMenuPages)));
    }

    @When("I should click on Video Games Sub-menu")
    public void iShouldClickOnVideoGamesSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnVideoGamesMenuSubMenu());
    }

    @Then("I should get all the Video Games Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheVideoGamesSubMenuPagesAndValidateTheSubMenus(String strVGSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllVideoGamesSubMenuPages(TestDataUtil.getListOfValue(strVGSubMenuPages)));
    }

    @Then("I should get all the Video Games Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheVideoGamesMenuPagesAndValidateTheMenus(String strVideoGameMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllVideoGamesMenuMenuPages(TestDataUtil.getListOfValue(strVideoGameMenuPages)));
    }

    @When("I should click on Cameras,Cam recorders and Drones Sub-menu")
    public void iShouldClickOnCamerasCamRecordersAndDronesSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnCamerasCamRecordersSubMenu());
    }

    @Then("I should get all the Cameras,Cam recorders and Drones Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheCamerasCamRecordersAndDronesSubMenuPagesAndValidateTheSubMenus(String strCCDSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllCCDSubMenuPages(TestDataUtil.getListOfValue(strCCDSubMenuPages)));
    }

    @Then("I should get all the Cameras,Cam recorders and Drones Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheCamerasCamRecordersAndDronesMenuPagesAndValidateTheMenus(String strCCDMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllCCDMenuPages(TestDataUtil.getListOfValue(strCCDMenuPages)));
    }

    @When("I should click on Home,Furniture and Office Sub-menu")
    public void iShouldClickOnHomeFurnitureAndOfficeSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnHomeFurnitureAndOfficeSubMenu());
    }

    @Then("I should get all the Home,Furniture and Office Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheHomeFurnitureAndOfficeSubMenuPagesAndValidateTheSubMenus(String strHFOSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllHFOSubMenuPages(TestDataUtil.getListOfValue(strHFOSubMenuPages)));
    }

    @Then("I should get all the Home,Furniture and Office Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheHomeFurnitureAndOfficeMenuPagesAndValidateTheMenus(String strHFOMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllHFOMenuPages(TestDataUtil.getListOfValue(strHFOMenuPages)));
    }

    @When("I should click on Smart Home, Security & Wi-Fi Sub-menu")
    public void iShouldClickOnSmartHomeSecurityWiFiSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnSmartHomeSecurityWiFiSubMenu());
    }

    @Then("I should get all the Smart Home, Security & Wi-Fi Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheSmartHomeSecurityWiFiSubMenuPagesAndValidateTheSubMenus(String strSSWSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllSSWSubMenuPages(TestDataUtil.getListOfValue(strSSWSubMenuPages)));
    }

    @Then("I should get all the Smart Home, Security & Wi-Fi Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheSmartHomeSecurityWiFiMenuPagesAndValidateTheMenus(String strSSWMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllSSWMenuPages(TestDataUtil.getListOfValue(strSSWMenuPages)));
    }

    @When("I should click on Car Electronics & GPS Sub-menu")
    public void iShouldClickOnCarElectronicsGPSSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnCarElectronicsGPSSubMenu());
    }

    @Then("I should get all the Car Electronics & GPS Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheCarElectronicsGPSSubMenuPagesAndValidateTheSubMenus(String strCEGSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllCEGSubMenuPages(TestDataUtil.getListOfValue(strCEGSubMenuPages)));
    }

    @Then("I should get all the Car Electronics & GPS Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheCarElectronicsGPSMenuPagesAndValidateTheMenus(String strCEGMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllCEGMenuPages(TestDataUtil.getListOfValue(strCEGMenuPages)));
    }

    @When("I should click on Wearable Technology Sub-menu")
    public void iShouldClickOnWearableTechnologySubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnWearableTechnologySubMenu());
    }

    @Then("I should get all the Wearable Technology Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheWearableTechnologySubMenuPagesAndValidateTheSubMenus(String strWTSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllWTSubMenuPages(TestDataUtil.getListOfValue(strWTSubMenuPages)));
    }

    @Then("I should get all the Wearable Technology Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheWearableTechnologyMenuPagesAndValidateTheMenus(String strWTMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllWTMenuPages(TestDataUtil.getListOfValue(strWTMenuPages)));
    }

    @When("I should click on Health, Wellness & Fitness Sub-menu")
    public void iShouldClickOnHealthWellnessFitnessSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnHealthWellnessFitnessSubMenu());
    }

    @Then("I should get all the Health, Wellness & Fitness Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheHealthWellnessFitnessSubMenuPagesAndValidateTheSubMenus(String strHWTSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllHWFSubMenuPages(TestDataUtil.getListOfValue(strHWTSubMenuPages)));
    }

    @Then("I should get all the Health, Wellness & Fitness Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheHealthWellnessFitnessMenuPagesAndValidateTheMenus(String strHWFMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllHWFMenuPages(TestDataUtil.getListOfValue(strHWFMenuPages)));
    }

    @When("I should click on Outdoor Living Sub-menu")
    public void iShouldClickOnOutdoorLivingSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnOutdoorLivingSubMenu());
    }

    @Then("I should get all the Outdoor Living Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheOutdoorLivingSubMenuPagesAndValidateTheSubMenus(String strOLSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllOLSubMenuPages(TestDataUtil.getListOfValue(strOLSubMenuPages)));
    }

    @Then("I should get all the Outdoor Living Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheOutdoorLivingMenuPagesAndValidateTheMenus(String strOTMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllOTMenuPages(TestDataUtil.getListOfValue(strOTMenuPages)));
    }

    @When("I should click on Toys, Games & Collectibles Sub-menu")
    public void iShouldClickOnToysGamesCollectiblesSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnToysGamesCollectiblesSubMenu());
    }

    @Then("I should get all the Toys, Games & Collectibles Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheToysGamesCollectiblesSubMenuPagesAndValidateTheSubMenus(String strTGCSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllTGCSubMenuPages(TestDataUtil.getListOfValue(strTGCSubMenuPages)));
    }

    @Then("I should get all the Toys, Games & Collectibles Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheToysGamesCollectiblesMenuPagesAndValidateTheMenus(String strTGCMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllTGCMenuPages(TestDataUtil.getListOfValue(strTGCMenuPages)));
    }

    @When("I should click on Electric Transportation Sub-menu")
    public void iShouldClickOnElectricTransportationSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnElectricTransportationSubMenu());
    }

    @Then("I should get all the Electric Transportation Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheElectricTransportationSubMenuPagesAndValidateTheSubMenus(String strETSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllETSubMenuPages(TestDataUtil.getListOfValue(strETSubMenuPages)));
    }

    @Then("I should get all the Electric Transportation Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheElectricTransportationMenuPagesAndValidateTheMenus(String strETMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllETMenuPages(TestDataUtil.getListOfValue(strETMenuPages)));
    }

    @When("I should click on New & Featured Sub-menu")
    public void iShouldClickOnNewFeaturedSubMenu() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnNewFeaturedSubMenu());
    }

    @Then("I should get all the New & Featured Sub Menu Pages and Validate the Sub Menus {string}")
    public void iShouldGetAllTheNewFeaturedSubMenuPagesAndValidateTheSubMenus(String strNFSubMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllNFSubMenuPages(TestDataUtil.getListOfValue(strNFSubMenuPages)));
    }

    @Then("I should get all the New & Featured Menu Pages and Validate the Menus {string}")
    public void iShouldGetAllTheNewFeaturedMenuPagesAndValidateTheMenus(String strNFMenuPages) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.getAllNFMenuPages(TestDataUtil.getListOfValue(strNFMenuPages)));
    }

    @Given("As a user i should click on BestBuy Button")
    public void asAUserIShouldClickOnBestBuyButton() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnBestBuyButton());
    }

    @When("I should get all the Footer Support Pages and Navigate to each page")
    public void iShouldGetAllTheFooterSupportPagesAndNavigateToEachPage() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.GetAllFooterSupportPagesAndNavigateToEachPage());
    }

    @Then("I should validate Footer Support URL {string}")
    public void iShouldValidateFooterSupportURL(String strFTSupportURL) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.validateFTSupportURL(TestDataUtil.getListOfValue(strFTSupportURL)));
    }

    @When("I should get all the Footer Pages and Navigate to each page")
    public void iShouldGetAllTheFooterPagesAndNavigateToEachPage() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.GetAllFooterPagesAndNavigateToEachPage());
    }

    @Then("I should validate Footer Page URL {string}")
    public void iShouldValidateFooterPageURL(String strFooterPageURL) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.validateFooterPageURL(TestDataUtil.getListOfValue(strFooterPageURL)));
    }

    @When("I should get all the Footer T&C Pages and Navigate to each page")
    public void iShouldGetAllTheFooterTCPagesAndNavigateToEachPage() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.GetAllFooterTCPagesAndNavigateToEachPage());
    }

    @Then("I should validate Footer T&C Page URL {string}")
    public void iShouldValidateFooterTCPageURL(String strFooterTCPageURL) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.validateFooterTCPageURL(TestDataUtil.getListOfValue(strFooterTCPageURL)));
    }

    @When("I should enter the disney toy {string} in Search Box and Click Search")
    public void iShouldEnterTheDisneyToyInSearchBoxAndClickSearch(String strDisneyToyValue) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.enterTheDisneyToyInSearchBoxAndClickSearch(TestDataUtil.getValue(strDisneyToyValue)));
    }


    @And("I should click and navigate to disney toy product page and view them {string}")
    public void iShouldClickAndNavigateToDisneyToyProductPageAndViewThem(String strPrNameModelSKU) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickAndNavigateToDisneyToyProductPageAndViewThem(TestDataUtil.getListOfValue(strPrNameModelSKU)));
    }

    /*@And("I should add the product to the cart")
    public void iShouldAddTheProductToTheCart() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.addTheProductToTheCart());
    }*/

    @Then("I should check the product  {string} added to the cart")
    public void iShouldCheckTheProductAddedToTheCart(String strDisneyToyValue) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.checkTheProductAddedToTheCart(TestDataUtil.getValue(strDisneyToyValue)));
    }

    @When("I click on Deals menu and click on Toys,Games and collectibles")
    public void iClickOnDealsMenuAndClickOnToysGamesAndCollectibles() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnDealsMenuAndClickOnToysGamesAndCollectibles());
    }

    @Then("I click on Shop by Brand and Click on Barbie")
    public void iClickOnShopByBrandAndClickOnBarbie() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnShopByBrandAndClickOnBarbie());
    }

    @And("I should click and navigate to barbie toy product page and view them {string}")
    public void iShouldClickAndNavigateToBarbieToyProductPageAndViewThem(String strBarbieNameModelSKU) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickAndNavigateToBarbieToyProductPageAndViewThem(TestDataUtil.getListOfValue(strBarbieNameModelSKU)));
    }

    @Then("I should check the barbie product {string} added to the cart")
    public void iShouldCheckTheBarbieProductAddedToTheCart(String strBarbieToyValue) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.checkTheBarbieProductAddedToTheCart(TestDataUtil.getValue(strBarbieToyValue)));
    }

    @When("I click on Deals menu and click on Brands")
    public void iClickOnDealsMenuAndClickOnBrands() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnDealsMenuAndClickOnBrands());
    }

    @Then("I click on Lenovo and Click on Laptops")
    public void iClickOnLenovoAndClickOnLaptops() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnLenovoAndClickOnLaptops());
    }

    @And("I should click and navigate to laptop product page and view them {string}")
    public void iShouldClickAndNavigateToLaptopProductPageAndViewThem(String strLaptopDeviceValue) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.checkTheLaptopProductAddedToTheCart(TestDataUtil.getListOfValue(strLaptopDeviceValue)));
    }

    @Then("I should check the laptop product {string} added to the cart")
    public void iShouldCheckTheLaptopProductAddedToTheCart(String strLaptopDeviceValue) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.checkTheLaptopProductInTheCart(TestDataUtil.getValue(strLaptopDeviceValue)));
    }

    @And("I should click on the Checkout button")
    public void iShouldClickOnTheCheckoutButton() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnTheCheckoutButton());
    }

    @And("I should click on the Continue as Guest button")
    public void iShouldClickOnTheContinueAsGuestButton() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.clickOnTheContinueAsGuestButton());
    }

    @And("I should enter email address {string} and {string} phonenumber")
    public void iShouldEnterEmailAddressAndPhonenumber(String strGuestEmail, String strGuestPhone) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.emailAddressAndPhonenumber(TestDataUtil.getValue(strGuestEmail), TestDataUtil.getValue(strGuestPhone)));
    }

    @And("I should enter payment information {string} and delivery address {string} details")
    public void iShouldEnterPaymentInformationAndDeliveryAddressDetails(String strCardNumber, String strDeliveryAddress) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.enterPaymentInformationAndDeliveryAddressDetails(TestDataUtil.getListOfValue(strCardNumber), TestDataUtil.getListOfValue(strDeliveryAddress)));
    }

    @Then("I should check order {string} is placed successfully")
    public void iShouldCheckOrderIsPlacedSuccessfully(String strOrderSuccessMessage) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.checkOrderIsPlacedSuccessfully(TestDataUtil.getValue(strOrderSuccessMessage)));
    }

    @When("I should enter the product name {string} in Search Box and Click Search")
    public void iShouldEnterTheProductNameInSearchBoxAndClickSearch(String strWrongProductName) {
        Assert.assertTrue(demoPageContainer.bestBuyPage.enterTheProductNameInSearchBoxAndClickSearch(TestDataUtil.getValue(strWrongProductName)));
    }

    @Then("I should check the product not available in store")
    public void iShouldCheckTheProductNotAvailableInStore() {
        Assert.assertTrue(demoPageContainer.bestBuyPage.checkTheProductNotAvailableInStore());
    }
}
