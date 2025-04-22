Feature: BestBuy Purchase

  @WEB @TEST1 @TC_ID_1001 @TC_ID_1002
  Scenario Template: Launch BestBuy Website, Select a Country and Validate URL is valid
    Given As a user i should launch BestBuy Website
    And I should "<Country Name>" select Country
    Then I should validate URL "<Current URL>" is valid

    Examples:
      | Country Name   | Current URL   |
      | &COUNTRY NAME& | &CURRENT URL& |

  @WEB @TEST1 @TC_ID_1003 @TC_ID_1004 @TC_ID_1005 @TC_ID_1006
  Scenario Template: Create Account with No Test Data and Invalid Data
    Given As a user i should navigate to Create Account page
    And I should not enter any data in input fields and Click on Create an Account button
    Then I should check the mandatory fields "<Validation Messages>" validation messages
    And I should enter invalid data "<Invalid Data>" in input fields and Click on Create an Account button
    Then I should check all invalid messages "<Invalid Validation Messages>" are displayed
    And I should enter valid data "<Valid Data>" in input fields and Click on Create an Account button
    Then I should check account is created successfully
    #Then I should signout from the BestBuy Website
    Examples:
      | Validation Messages   | Invalid Data   | Invalid Validation Messages   | Valid Data   |
      | &VALIDATION MESSAGES& | &INVALID DATA& | &INVALID VALIDATION MESSAGES& | &VALID DATA& |

  @WEB @TEST1 @TC_ID_1007
  Scenario Template: Login with Existing User
    Given As a user i should navigate to Sign In button
    When I enter UserName "<UserName>" and click Continue
    When I select Use Password "<Password>" ,enter Password and click Continue
    Then I should check account is logged in successfully
    Examples:
      | UserName   | Password   |
      | &USERNAME& | &PASSWORD& |

  @WEB @TEST1 @TC_ID_1008
  Scenario Outline: Navigate to Deals Menu , Deals and Deals by Category Sub-Menu and its Pages and Validate URL
    Given As a user i should click on Menu Button
    When I should click on Deals Sub-menu
    And I should get all the Deals Pages and Navigate to each page
    Then I should validate Sub-Menu URL "<DealsPageUrl>"

    Examples:
      | DealsPageUrl   |
      | &DEALSPAGEURL& |

  @WEB @TEST1 @TC_ID_1009
  Scenario Outline: Navigate to Deals Menu , Deals by Category Sub-Menu and its Pages and Validate URL
    Given As a user i should click on Menu Button
    When I should click on Support and Services Sub-menu
    And I should get all the Support and Services Pages and Navigate to each page
    Then I should validate Support and Services Sub-Menu URL "<SupportAndServicesPageUrl>"

    Examples:
      | SupportAndServicesPageUrl   |
      | &SUPPORTANDSERVICESPAGEURL& |

  @WEB @TEST1 @TC_ID_1010
  Scenario Outline: Navigate to Deals Menu , Brands Sub-Menu and its Pages and Validate URL
    Given As a user i should click on Menu Button
    When I should click on Brands Sub-menu
    And I should get all the Brands Pages and Navigate to each page
    Then I should validate Brands Sub-Menu URL "<BrandsPageUrl>"

    Examples:
      | BrandsPageUrl   |
      | &BRANDSPAGEURL& |

  @WEB @TEST1 @TC_ID_1011
  Scenario Outline: Navigate to Appliances Menu and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Appliances Sub-menu
    Then I should get all the Appliances Sub Menu Pages and Validate the Sub Menus "<AppliancesSubMenus>"
    Then I should get all the Appliances Menu Pages and Validate the Menus "<AppliancesMenus>"

    Examples:
      | AppliancesSubMenus   | AppliancesMenus   |
      | &APPLIANCESSUBMENUS& | &APPLIANCESMENUS& |

  @WEB @TEST1 @TC_ID_1012
  Scenario Outline: Navigate to TV & Home Theatre Menu and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on TV & Home Theatre Sub-menu
    Then I should get all the TV & Home Theatre  Sub Menu Pages and Validate the Sub Menus "<TVHTSubMenus>"
    Then I should get all the TV & Home Theatre  Menu Pages and Validate the Menus "<TVHTMenus>"

    Examples:
      | TVHTSubMenus   | TVHTMenus   |
      | &TVTHSUBMENUS& | &TVHTMENUS& |

  @WEB @TEST1 @TC_ID_1013
  Scenario Outline: Navigate to Computers & Tablets Menu and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Computers & Tablets Sub-menu
    Then I should get all the Computers & Tablets Sub Menu Pages and Validate the Sub Menus "<CTSubMenus>"
    Then I should get all the Computers & Tablets Menu Pages and Validate the Menus "<CTMenus>"

    Examples:
      | CTSubMenus   | CTMenus   |
      | &CTSUBMENUS& | &CTMENUS& |

  @WEB @TEST1 @TC_ID_1014
  Scenario Outline: Navigate to Cell Phones Menu and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Cell Phones Sub-menu
    Then I should get all the Cell Phones Sub Menu Pages and Validate the Sub Menus "<CPSubMenus>"
    Then I should get all the Cell Phones Menu Pages and Validate the Menus "<CPMenus>"

    Examples:
      | CPSubMenus   | CPMenus   |
      | &CPSUBMENUS& | &CPMENUS& |

  @WEB @TEST1 @TC_ID_1015
  Scenario Outline: Navigate to Audio and Head Phones Menu and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Audio and Head Phones Sub-menu
    Then I should get all the Audio and Head Phones Sub Menu Pages and Validate the Sub Menus "<AHPSubMenus>"
    Then I should get all the Audio and Head Phones Menu Pages and Validate the Menus "<AHPMenus>"

    Examples:
      | AHPSubMenus   | AHPMenus   |
      | &AHPSUBMENUS& | &AHPMENUS& |

  @WEB @TEST1 @TC_ID_1016
  Scenario Outline: Navigate to Video Games Menu and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Video Games Sub-menu
    Then I should get all the Video Games Sub Menu Pages and Validate the Sub Menus "<VGSubMenus>"
    Then I should get all the Video Games Menu Pages and Validate the Menus "<VGMenus>"

    Examples:
      | VGSubMenus   | VGMenus   |
      | &VGSUBMENUS& | &VGMENUS& |

  @WEB @TEST1 @TC_ID_1017
  Scenario Outline: Navigate to Cameras,Cam recorders and Drones and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Cameras,Cam recorders and Drones Sub-menu
    Then I should get all the Cameras,Cam recorders and Drones Sub Menu Pages and Validate the Sub Menus "<CCDSubMenus>"
    Then I should get all the Cameras,Cam recorders and Drones Menu Pages and Validate the Menus "<CCDMenus>"

    Examples:
      | CCDSubMenus   | CCDMenus   |
      | &CCDSUBMENUS& | &CCDMENUS& |

  @WEB @TEST1 @TC_ID_1018
  Scenario Outline: Navigate to Home,Furniture and Office and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Home,Furniture and Office Sub-menu
    Then I should get all the Home,Furniture and Office Sub Menu Pages and Validate the Sub Menus "<HFOSubMenus>"
    Then I should get all the Home,Furniture and Office Menu Pages and Validate the Menus "<HFOMenus>"

    Examples:
      | HFOSubMenus   | HFOMenus   |
      | &HFOSUBMENUS& | &HFOMENUS& |

  @WEB @TEST1 @TC_ID_1019
  Scenario Outline: Navigate to Smart Home, Security & Wi-Fi and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Smart Home, Security & Wi-Fi Sub-menu
    Then I should get all the Smart Home, Security & Wi-Fi Sub Menu Pages and Validate the Sub Menus "<SSWSubMenus>"
    Then I should get all the Smart Home, Security & Wi-Fi Menu Pages and Validate the Menus "<SSWMenus>"

    Examples:
      | SSWSubMenus   | SSWMenus   |
      | &SSWSUBMENUS& | &SSWMENUS& |

  @WEB @TEST1 @TC_ID_1020
  Scenario Outline: Navigate to Car Electronics & GPS and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Car Electronics & GPS Sub-menu
    Then I should get all the Car Electronics & GPS Sub Menu Pages and Validate the Sub Menus "<CEGSubMenus>"
    Then I should get all the Car Electronics & GPS Menu Pages and Validate the Menus "<CEGMenus>"

    Examples:
      | CEGSubMenus   | CEGMenus   |
      | &CEGSUBMENUS& | &CEGMENUS& |

  @WEB @TEST1 @TC_ID_1021
  Scenario Outline: Navigate to Wearable Technology and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Wearable Technology Sub-menu
    Then I should get all the Wearable Technology Sub Menu Pages and Validate the Sub Menus "<WTSubMenus>"
    Then I should get all the Wearable Technology Menu Pages and Validate the Menus "<WTMenus>"

    Examples:
      | WTSubMenus   | WTMenus   |
      | &WTSUBMENUS& | &WTMENUS& |

  @WEB @TEST1 @TC_ID_1022
  Scenario Outline: Navigate to Health, Wellness & Fitness and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Health, Wellness & Fitness Sub-menu
    Then I should get all the Health, Wellness & Fitness Sub Menu Pages and Validate the Sub Menus "<HWFSubMenus>"
    Then I should get all the Health, Wellness & Fitness Menu Pages and Validate the Menus "<HWFMenus>"

    Examples:
      | HWFSubMenus   | HWFMenus   |
      | &HWFSUBMENUS& | &HWFMENUS& |

  @WEB @TEST1 @TC_ID_1023
  Scenario Outline: Navigate to Outdoor Living and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Outdoor Living Sub-menu
    Then I should get all the Outdoor Living Sub Menu Pages and Validate the Sub Menus "<OLSubMenus>"
    Then I should get all the Outdoor Living Menu Pages and Validate the Menus "<OLMenus>"

    Examples:
      | OLSubMenus   | OLMenus   |
      | &OLSUBMENUS& | &OLMENUS& |

  @WEB @TEST1 @TC_ID_1024
  Scenario Outline: Navigate to Toys, Games & Collectibles and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Toys, Games & Collectibles Sub-menu
    Then I should get all the Toys, Games & Collectibles Sub Menu Pages and Validate the Sub Menus "<TGCSubMenus>"
    Then I should get all the Toys, Games & Collectibles Menu Pages and Validate the Menus "<TGCMenus>"

    Examples:
      | TGCSubMenus   | TGCMenus   |
      | &TGCSUBMENUS& | &TGCMENUS& |

  @WEB @TEST1 @TC_ID_1025
  Scenario Outline: Navigate to Electric Transportation and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on Electric Transportation Sub-menu
    Then I should get all the Electric Transportation Sub Menu Pages and Validate the Sub Menus "<ETSubMenus>"
    Then I should get all the Electric Transportation Menu Pages and Validate the Menus "<ETMenus>"

    Examples:
      | ETSubMenus   | ETMenus   |
      | &ETSUBMENUS& | &ETMENUS& |

  @WEB @TEST1 @TC_ID_1026
  Scenario Outline: Navigate to New & Featured and Validate Menu
    Given As a user i should click on Menu Button
    When I should click on New & Featured Sub-menu
    Then I should get all the New & Featured Sub Menu Pages and Validate the Sub Menus "<NFSubMenus>"
    Then I should get all the New & Featured Menu Pages and Validate the Menus "<NFMenus>"

    Examples:
      | NFSubMenus   | NFMenus   |
      | &NFSUBMENUS& | &NFMENUS& |

  @WEB @TEST1 @TC_ID_1027
  Scenario Outline: Navigate to Footer Support Links
    Given As a user i should click on BestBuy Button
    When I should get all the Footer Support Pages and Navigate to each page
    Then I should validate Footer Support URL "<FTSupportPageUrl>"

    Examples:
      | FTSupportPageUrl   |
      | &FTSUPPORTPAGEURL& |

  @WEB @TEST1 @TC_ID_1028
  Scenario Outline: Navigate to All Footer Links
    Given As a user i should click on BestBuy Button
    When I should get all the Footer Pages and Navigate to each page
    Then I should validate Footer Page URL "<FTAPPageUrl>"

    Examples:
      | FTAPPageUrl   |
      | &FTAPPAGEURL& |

  @WEB @TEST1 @TC_ID_1029
  Scenario Outline: Navigate to Footer T&C Links
    Given As a user i should click on BestBuy Button
    When I should get all the Footer T&C Pages and Navigate to each page
    Then I should validate Footer T&C Page URL "<FTTCPageUrl>"

    Examples:
      | FTTCPageUrl   |
      | &FTTCPAGEURL& |


  @WEB @TEST1 @TC_ID_1030
  Scenario Outline: Search a Product from search bar and add it to Cart
    Given As a user i should click on BestBuy Button
    When I should enter the disney toy "<DisneyToy>" in Search Box and Click Search
    And I should click and navigate to disney toy product page and view them "<PrNameModelSKU>"
    Then I should check the product  "<DisneyToy>" added to the cart
    And I should click on the Checkout button
    And I should click on the Continue as Guest button
    And I should enter email address "<GuestEmail>" and "<GuestPhoneNumber>" phonenumber
    And I should enter payment information "<CardNumber>" and delivery address "<DeliveryAddress>" details
    Then I should check order "<OrderSuccessMessage>" is placed successfully

    Examples:
      | DisneyToy   | PrNameModelSKU   | GuestEmail   | GuestPhoneNumber   | CardNumber   | DeliveryAddress   | OrderSuccessMessage   |
      | &DISNEYTOY& | &PRNAMEMODELSKU& | &GUESTEMAIL& | &GUESTPHONENUMBER& | &CARDNUMBER& | &DELIVERYADDRESS& | &ORDERSUCCESSMESSAGE& |

  @WEB @TEST1 @TC_ID_1031
  Scenario Outline: Navigate to Shop by Department and add a Product to Cart from Toys, Games & Collectibles and Brand Barbie
    Given As a user i should click on BestBuy Button
    When I click on Deals menu and click on Toys,Games and collectibles
    Then I click on Shop by Brand and Click on Barbie
    And I should click and navigate to barbie toy product page and view them "<BarbieNameModelSKU>"
    Then I should check the barbie product "<BarbieToy>" added to the cart
    And I should click on the Checkout button
    And I should click on the Continue as Guest button
    And I should enter email address "<GuestEmail>" and "<GuestPhoneNumber>" phonenumber
    And I should enter payment information "<CardNumber>" and delivery address "<DeliveryAddress>" details
    Then I should check order "<OrderSuccessMessage>" is placed successfully

    Examples:
      | BarbieNameModelSKU   | BarbieToy   | GuestEmail   | GuestPhoneNumber   | CardNumber   | DeliveryAddress   | OrderSuccessMessage   |
      | &BARBIENAMEMODELSKU& | &BARBIETOY& | &GUESTEMAIL& | &GUESTPHONENUMBER& | &CARDNUMBER& | &DELIVERYADDRESS& | &ORDERSUCCESSMESSAGE& |

  @WEB @TEST1 @TC_ID_1032
  Scenario Outline: Navigate to Select By Brand and add a Product to Cart from Toys, Games & Collectibles and Brand Barbie
    Given As a user i should click on BestBuy Button
    When I click on Deals menu and click on Brands
    Then I click on Lenovo and Click on Laptops
    And I should click and navigate to laptop product page and view them "<LaptopNameModelSKU>"
    Then I should check the laptop product "<LaptopDevice>" added to the cart
    And I should click on the Checkout button
    And I should click on the Continue as Guest button
    And I should enter email address "<GuestEmail>" and "<GuestPhoneNumber>" phonenumber
    And I should enter payment information "<CardNumber>" and delivery address "<DeliveryAddress>" details
    Then I should check order "<OrderSuccessMessage>" is placed successfully

    Examples:
      | LaptopNameModelSKU   | LaptopDevice   | GuestEmail   | GuestPhoneNumber   | CardNumber   | DeliveryAddress   | OrderSuccessMessage   |
      | &LAPTOPNAMEMODELSKU& | &LAPTOPDEVICE& | &GUESTEMAIL& | &GUESTPHONENUMBER& | &CARDNUMBER& | &DELIVERYADDRESS& | &ORDERSUCCESSMESSAGE& |


  @WEB @TEST1 @TC_ID_1033
  Scenario Outline: Search a Wrong Product from search bar and verify message
    Given As a user i should click on BestBuy Button
    When I should enter the product name "<WrongProductName>" in Search Box and Click Search
    Then I should check the product not available in store
    Examples:
      | WrongProductName   |
      | &WRONGPRODUCTNAME& |






