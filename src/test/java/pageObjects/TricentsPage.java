package test.java.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TricentsPage {

	public WebDriver driver;

    public TricentsPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    
    //VEHICLE DATA OBJECTS
    //Next Button to Insurant Data
    @FindBy(how = How.XPATH, using = "//button[@id='nextenterinsurantdata']")
    public WebElement nextButtonToInsurantData;
    
    //Vehicle Data mandatory fields counter
    @FindBy(how = How.XPATH, using = "//nav[@id='idealsteps-nav']/ul/li[1]/a/span")
    public WebElement vehicleDataFieldsCounter;
    
    
    //Make Dropdown
    @FindBy(how = How.XPATH, using = "//select[@name='Make']")
    public WebElement makeDropdown;
    
    public void SetMakeDropdown (String value) {
    	Select select = new Select(makeDropdown);
    	select.selectByVisibleText(value);
    }
    
    //Model Dropdown
    @FindBy(how = How.XPATH, using = "//select[@name='Model']")
    public WebElement modelDropdown;
    
    public void SetModelDropdown (String value) {
    	Select select = new Select(modelDropdown);
    	select.selectByVisibleText(value);
    }
    
    //Cylinder Capacity field
    @FindBy(how = How.XPATH, using = "//input[@id='cylindercapacity']")
    public WebElement cylinderCapacityField;
    
    //Engine Performance field
    @FindBy(how = How.XPATH, using = "//input[@id='engineperformance']")
    public WebElement enginePerformanceField;
    
    //Date of Manufacture field
    @FindBy(how = How.XPATH, using = "//input[@id='dateofmanufacture']")
    public WebElement dateOfManufactureField;
    
    //Number of Seats 1 Dropdown
    @FindBy(how = How.XPATH, using = "//select[@name='Number of Seats']")
    public WebElement numberOfSeats1Dropdown;
    
    public void SetNumberOfSeats1Dropdown (String value) {
    	Select select = new Select(numberOfSeats1Dropdown);
    	select.selectByVisibleText(value);
    }
    
    //Number of Seats 2 Dropdown
    @FindBy(how = How.XPATH, using = "//select[@name='Number of Seats Motorcycle']")
    public WebElement numberOfSeats2Dropdown;
    
    public void SetNumberOfSeats2Dropdown (String value) {
    	Select select = new Select(numberOfSeats2Dropdown);
    	select.selectByVisibleText(value);
    }
    
    //Fuel Type Dropdown
    @FindBy(how = How.XPATH, using = "//select[@name='Fuel Type']")
    public WebElement fuelTypeDropdown;
    
    public void SetFuelTypeDropdown (String value) {
    	Select select = new Select(fuelTypeDropdown);
    	select.selectByVisibleText(value);
    }
    
    //Payload field
    @FindBy(how = How.XPATH, using = "//input[@id='payload']")
    public WebElement payloadField;
    
    //Total Weight field
    @FindBy(how = How.XPATH, using = "//input[@id='totalweight']")
    public WebElement totalWeightField;
    
    //List Price field
    @FindBy(how = How.XPATH, using = "//input[@id='listprice']")
    public WebElement listPriceField;
    
    //Annual Mileage field
    @FindBy(how = How.XPATH, using = "//input[@id='annualmileage']")
    public WebElement annualMileageField;
    
    //INSURANT DATA OBJECTS
    //Next Button to Product Data
    @FindBy(how = How.XPATH, using = "//button[@id='nextenterproductdata']")
    public WebElement nextButtonToProductData;
    
    //Insurant Data mandatory fields counter
    @FindBy(how = How.XPATH, using = "//nav[@id='idealsteps-nav']/ul/li[2]/a/span")
    public WebElement insurantDataFieldsCounter;
    
    //First Name field
    @FindBy(how = How.XPATH, using = "//input[@id='firstname']")
    public WebElement firstNameField;
    
    //Last Name field
    @FindBy(how = How.XPATH, using = "//input[@id='lastname']")
    public WebElement lastNameField;
    
    //Date of Birth field
    @FindBy(how = How.XPATH, using = "//input[@id='birthdate']")
    public WebElement dateOfBirthField;
    
    //Gender - Male
    @FindBy(how = How.XPATH, using = "//div/label[text()='Gender']/../p/label/input[@value='Male']/../span")
    public WebElement genderMale;
    
    //Gender - Female
    @FindBy(how = How.XPATH, using = "//div/label[text()='Gender']/../p/label/input[@value='Female']/../span")
    public WebElement genderFemale;
    
    //Country Dropdown
    @FindBy(how = How.XPATH, using = "//select[@name='Country']")
    public WebElement countryDropdown;
    
    public void SetCountryDropdown (String value) {
    	Select select = new Select(countryDropdown);
    	select.selectByVisibleText(value);
    }
    
    //Zip Code field
    @FindBy(how = How.XPATH, using = "//input[@id='zipcode']")
    public WebElement zipCodeField;
    
    //Occupation Dropdown
    @FindBy(how = How.XPATH, using = "//select[@name='Occupation']")
    public WebElement occupationDropdown;
    
    public void SetOccupationDropdown (String value) {
    	Select select = new Select(occupationDropdown);
    	select.selectByVisibleText(value);
    }
    
    //Hobbies - Speeding
    @FindBy(how = How.XPATH, using = "//div/label[text()='Hobbies']/../p/label/input[@value='Speeding']/../span")
    public WebElement speedingHobbie;
    
    //Hobbies - Bungee Jumping
    @FindBy(how = How.XPATH, using = "//div/label[text()='Hobbies']/../p/label/input[@value='BungeeJumping']/../span")
    public WebElement bungeeJumpingHobbie;
    
    //Hobbies - Cliff Diving
    @FindBy(how = How.XPATH, using = "//div/label[text()='Hobbies']/../p/label/input[@value='CliffDiving']/../span")
    public WebElement cliffDivingHobbie;
    
    //Hobbies - Skydiving
    @FindBy(how = How.XPATH, using = "//div/label[text()='Hobbies']/../p/label/input[@value='Skydiving']/../span")
    public WebElement skyDivingHobbie;
    
    //Hobbies - Other
    @FindBy(how = How.XPATH, using = "//div/label[text()='Hobbies']/../p/label/input[@value='Other']/../span")
    public WebElement otherHobbie;
    
    //PRODUCT DATA OBJECTS
    //Next Button to Select Price Option
    @FindBy(how = How.XPATH, using = "//button[@id='nextselectpriceoption']")
    public WebElement nextButtonToSelectPriceOption;
    
    //Product Data mandatory fields counter
    @FindBy(how = How.XPATH, using = "//nav[@id='idealsteps-nav']/ul/li[3]/a/span")
    public WebElement productDataFieldsCounter;
    
    //Start Date field
    @FindBy(how = How.XPATH, using = "//input[@id='startdate']")
    public WebElement startDateField;
    
    //Insurance Sum Dropdown
    @FindBy(how = How.XPATH, using = "//select[@name='Insurance Sum']")
    public WebElement insuranceSumDropdown;
    
    public void SetInsuranceSumDropdown (String value) {
    	Select select = new Select(insuranceSumDropdown);
    	select.selectByVisibleText(value);
    }
    
    //Merit Rating Dropdown
    @FindBy(how = How.XPATH, using = "//select[@name='Merit Rating']")
    public WebElement meritRatingDropdown;
    
    public void SetMeritRatingDropdown (String value) {
    	Select select = new Select(meritRatingDropdown);
    	select.selectByVisibleText(value);
    }
    
    //Damage Insurance Dropdown
    @FindBy(how = How.XPATH, using = "//select[@name='Damage Insurance']")
    public WebElement damageInsuranceDropdown;
    
    public void SetDamageInsuranceDropdown (String value) {
    	Select select = new Select(damageInsuranceDropdown);
    	select.selectByVisibleText(value);
    }
    
    //Optional Products - Euro Protection
    @FindBy(how = How.XPATH, using = "//div/label[text()='Optional Products']/../p/label/input[@id='EuroProtection']/../span")
    public WebElement optionalProductsEuroProtection;
    
    //Optional Products - Legal Defense Insurance
    @FindBy(how = How.XPATH, using = "//div/label[text()='Optional Products']/../p/label/input[@id='LegalDefenseInsurance']/../span")
    public WebElement optionalProductsLegalDefenseInsurance;
    
    //Courtesy Car Dropdown
    @FindBy(how = How.XPATH, using = "//select[@name='Courtesy Car']")
    public WebElement courtesyCarDropdown;
    
    public void SetCourtesyCarDropdown (String value) {
    	Select select = new Select(courtesyCarDropdown);
    	select.selectByVisibleText(value);
    }
    
    //PRICE OPTION OBJECTS
    //Next Button to Send Quote
    @FindBy(how = How.XPATH, using = "//button[@id='nextsendquote']")
    public WebElement nextButtonToSendQuote;
    
    //Price Option mandatory fields counter
    @FindBy(how = How.XPATH, using = "//nav[@id='idealsteps-nav']/ul/li[4]/a/span")
    public WebElement priceOptionFieldsCounter;
    
    //Price Option - Silver
    @FindBy(how = How.XPATH, using = "//th/label[@class='choosePrice ideal-radiocheck-label']/input[@value='Silver']")
    public WebElement priceOptionSilver;
    
    //Price Option - Gold
    @FindBy(how = How.XPATH, using = "//th/label[@class='choosePrice ideal-radiocheck-label']/input[@value='Gold']")
    public WebElement priceOptionGold;
    
    //Price Option - Platinum
    @FindBy(how = How.XPATH, using = "//th/label[@class='choosePrice ideal-radiocheck-label']/input[@value='Platinum']")
    public WebElement priceOptionPlatinum;
    
    //Price Option - Ultimate
    @FindBy(how = How.XPATH, using = "//th/label[@class='choosePrice ideal-radiocheck-label']/input[@value='Platinum']")
    public WebElement priceOptionUltimate;
    
    //SEND QUOTE OBJECTS
    //Send Email Button
    @FindBy(how = How.XPATH, using = "//button[@id='sendemail']")
    public WebElement sendEmail;
    
    //Product Data mandatory fields counter
    @FindBy(how = How.XPATH, using = "//nav[@id='idealsteps-nav']/ul/li[5]/a/span")
    public WebElement sendQuoteFieldsCounter;
    
    //E-mail field
    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public WebElement emailField;
    
    //Username field
    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    public WebElement usernameField;
    
    //Password field
    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    public WebElement passwordField;
    
    //Confirm Password field
    @FindBy(how = How.XPATH, using = "//input[@id='confirmpassword']")
    public WebElement confirmPasswordField;
    
    //Alert box
    @FindBy(how = How.XPATH, using = "//div[@class='sweet-alert showSweetAlert visible']")
    public WebElement alertBox;
    
    //Email Successfully sent message
    @FindBy(how = How.XPATH, using = "//div[@class='sweet-alert showSweetAlert visible']/h2")
    public WebElement alertMessageSuccessfullyEmailSent;
    
    //Loading spinner sending email
    @FindBy(how = How.XPATH, using = "//*[@id='LoadingPDF']")
    public WebElement loadingSpinnerSendingEmail;
    
}
