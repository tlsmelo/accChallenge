package test.java.stepDefinitions;

import cucumber.api.java.Before;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import test.java.businessModel.InsurantData;
import test.java.businessModel.PriceOption;
import test.java.businessModel.ProductData;
import test.java.businessModel.VehicleData;
import test.java.dataProvider.ConfigFileReader;
import test.java.pageObjects.TricentsPage;
import test.java.utils.WebElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Assert;

public class testSteps extends WebElementUtils {
	
	private WebDriver driver;
	private TricentsPage tricentsPage;
	
	private VehicleData vehicleDataInfo;
	private InsurantData insurantDataInfo;
	private ProductData productDataInfo;
	private PriceOption priceOptionInfo;
	
	public testSteps() {
		this.vehicleDataInfo = VehicleData.getInstance();
		this.insurantDataInfo = InsurantData.getInstance();
		this.productDataInfo = ProductData.getInstance();
		this.priceOptionInfo = PriceOption.getInstance();
		
		tricentsPage = new TricentsPage(driver);
		
	}
	
	@Before
    public void beforeScenario(){
		System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
		
        driver = new ChromeDriver();
    }

    @After
    public void afterScenario(){
        driver.quit();
    }

    
    @Given("I navigate to the form url")
    public void iNavigateToTheFormUrl() {
    	this.navigateToTheUrl(ConfigFileReader.getInstance().getFormUrl());
    }
    
    private void navigateToTheUrl(String url){
        tricentsPage = new TricentsPage(driver);
        driver.get(url);
        driver.manage().window().maximize();
        WaitForElementToLoad(driver, tricentsPage.nextButtonToInsurantData);

        //verify if the page is correctly loaded
        //assume the page is totally loaded when the next button is displayed
        assertThat("Page was not load correctly", tricentsPage.nextButtonToInsurantData.isDisplayed(), is(equalTo(true)));
    }
    
    @When("I fill the vehicle data form")
    public void iFillTheVehicleDataForm() {
    	System.out.println("Vehicle Data: There are " + tricentsPage.vehicleDataFieldsCounter.getText() + " fields that must be filled");
    	//Fill with random values
    	tricentsPage.SetMakeDropdown(vehicleDataInfo.getMakeRandom());
    	tricentsPage.SetModelDropdown(vehicleDataInfo.getModelRandom());
    	tricentsPage.cylinderCapacityField.clear();
    	tricentsPage.cylinderCapacityField.sendKeys(vehicleDataInfo.getCylinderCapacityRandom());
    	tricentsPage.enginePerformanceField.clear();
    	tricentsPage.enginePerformanceField.sendKeys(vehicleDataInfo.getEnginePerformanceRandom());
    	tricentsPage.dateOfManufactureField.clear();
    	tricentsPage.dateOfManufactureField.sendKeys(vehicleDataInfo.getDateOfManufactureRandom());
    	tricentsPage.SetNumberOfSeats1Dropdown(vehicleDataInfo.getNumberOfSeats1Random());
    	tricentsPage.SetNumberOfSeats2Dropdown(vehicleDataInfo.getNumberOfSeats2Random());
    	tricentsPage.SetFuelTypeDropdown(vehicleDataInfo.getFuelTypeRandom());
    	tricentsPage.payloadField.clear();
    	tricentsPage.payloadField.sendKeys(vehicleDataInfo.getPayloadRandom());
    	tricentsPage.totalWeightField.clear();
    	tricentsPage.totalWeightField.sendKeys(vehicleDataInfo.getTotalWeightRandom());
    	tricentsPage.listPriceField.clear();
    	tricentsPage.listPriceField.sendKeys(vehicleDataInfo.getListPriceRandom());
    	tricentsPage.annualMileageField.clear();
    	tricentsPage.annualMileageField.sendKeys(vehicleDataInfo.getAnnualMileageRandom());
    	
    	System.out.println("Total fields " +tricentsPage.vehicleDataFieldsCounter.getText());
    	
    	assertThat("Vehicle Data: There are mandatory fields not filled, back and verify them.", tricentsPage.vehicleDataFieldsCounter.getText().equals("0"), is(equalTo(true)));
    	
    	System.out.println("Going to the next page!");

    }
    
    @Then("I fill the insurant data form")
    public void iFillTheInsurantDataForm() {
    	Actions action = new Actions(driver);
    	System.out.println("Insurant Data: There are " + tricentsPage.insurantDataFieldsCounter.getText() + " fields that must be filled");
    	//Fill with random values
    	tricentsPage.firstNameField.clear();
    	tricentsPage.firstNameField.sendKeys("Test");
    	tricentsPage.lastNameField.clear();
    	tricentsPage.lastNameField.sendKeys("Silva");
    	tricentsPage.dateOfBirthField.clear();
    	tricentsPage.dateOfBirthField.sendKeys(insurantDataInfo.getDateOfBirthRandom());
    	String genderChoosen = insurantDataInfo.getGenderRandom();
    	if (genderChoosen.equals("Male")) {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.genderMale);
    		action.moveToElement(tricentsPage.genderMale).click().perform();
    	} else if (genderChoosen.equals("Female")) {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.genderFemale);
    		action.moveToElement(tricentsPage.genderFemale).click().perform();
    	}
    	tricentsPage.SetCountryDropdown(insurantDataInfo.getCountryRandom());
    	tricentsPage.zipCodeField.clear();
    	tricentsPage.zipCodeField.sendKeys(insurantDataInfo.getZipCodeRandom());
    	tricentsPage.SetOccupationDropdown(insurantDataInfo.getOccupationRandom());
    	String hobbiesChoosen = insurantDataInfo.getHobbiesRandom();
    	if (hobbiesChoosen.equals("Speeding")) {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.speedingHobbie);
    		action.moveToElement(tricentsPage.speedingHobbie).click().perform();
    	} else if (hobbiesChoosen.equals("Bungee Jumping")) {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.bungeeJumpingHobbie);
    		action.moveToElement(tricentsPage.bungeeJumpingHobbie).click().perform();
    	} else if (hobbiesChoosen.equals("Cliff Diving")) {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.cliffDivingHobbie);
    		action.moveToElement(tricentsPage.cliffDivingHobbie).click().perform();
    	} else if (hobbiesChoosen.equals("Skydiving")) {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.skyDivingHobbie);
    		action.moveToElement(tricentsPage.skyDivingHobbie).click().perform();
    	} else {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.otherHobbie);
    		action.moveToElement(tricentsPage.otherHobbie).click().perform();
    	}
    	
    	System.out.println("Total fields " +tricentsPage.insurantDataFieldsCounter.getText());
    	
    	assertThat("Insurant Data: There are mandatory fields not filled, back and verify them.", tricentsPage.insurantDataFieldsCounter.getText().equals("0"), is(equalTo(true)));
    	
    	System.out.println("Going to the next page!");

    }
    
    @Then("I fill the product data form")
    public void iFillTheProductDataForm() {
    	Actions action = new Actions(driver);
    	System.out.println("Product Data: There are " + tricentsPage.productDataFieldsCounter.getText() + " fields that must be filled");
    	//Fill with random values
    	tricentsPage.startDateField.clear();
    	tricentsPage.startDateField.sendKeys(productDataInfo.getStartDateRandom());
    	tricentsPage.SetInsuranceSumDropdown(productDataInfo.getInsuranceSumRandom());
    	tricentsPage.SetMeritRatingDropdown(productDataInfo.getMeritRatingRandom());
    	tricentsPage.SetDamageInsuranceDropdown(productDataInfo.getDamageInsuranceRandom());
    	String optionalProductsChoosen = productDataInfo.getOptionalProductsRandom();
    	if (optionalProductsChoosen.equals("Euro Protection")) {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.optionalProductsEuroProtection);
    		action.moveToElement(tricentsPage.optionalProductsEuroProtection).click().perform();
    	} else if (optionalProductsChoosen.equals("Legal Defense Insurance")) {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.optionalProductsLegalDefenseInsurance);
    		action.moveToElement(tricentsPage.optionalProductsLegalDefenseInsurance).click().perform();
    	}
    	tricentsPage.SetCourtesyCarDropdown(productDataInfo.getCourtesyCarRandom());
    	
    	System.out.println("Total fields " +tricentsPage.productDataFieldsCounter.getText());
    	
    	assertThat("Product Data: There are mandatory fields not filled, back and verify them.", tricentsPage.productDataFieldsCounter.getText().equals("0"), is(equalTo(true)));
    	
    	System.out.println("Going to the next page!");

    }
    
    @Then("I choose the price option")
    public void iChooseThePriceOption() {
    	Actions action = new Actions(driver);
    	System.out.println("Price Option: There is " + tricentsPage.priceOptionFieldsCounter.getText() + " option to be selected");
    	//Select the price option randomly
    	String priceOptionChoosen = priceOptionInfo.getPriceOptionRandom();
    	if (priceOptionChoosen.equals("Silver")) {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.priceOptionSilver);
    		action.moveToElement(tricentsPage.priceOptionSilver).click().perform();
    	} else if (priceOptionChoosen.equals("Gold")) {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.priceOptionGold);
    		action.moveToElement(tricentsPage.priceOptionGold).click().perform();
    	} else if (priceOptionChoosen.equals("Platinum")) {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.priceOptionPlatinum);
    		action.moveToElement(tricentsPage.priceOptionPlatinum).click().perform();
    	} else if (priceOptionChoosen.equals("Ultimate")) {
    		WebElementUtils.WaitForElementToBeClickable(driver, tricentsPage.priceOptionUltimate);
    		action.moveToElement(tricentsPage.priceOptionUltimate).click().perform();
    	} 
    	
    	System.out.println("Total fields " +tricentsPage.priceOptionFieldsCounter.getText());
    	
    	assertThat("Price Option: The price option was not selected, back and verify it.", tricentsPage.priceOptionFieldsCounter.getText().equals("0"), is(equalTo(true)));
    	
    	WebElementUtils.WaitForElementToLoad(driver, tricentsPage.nextButtonToSendQuote);
    	System.out.println("Going to the next page!");

    }
    
    @When("I fill the quote data form")
    public void iFillTheQuoteDataForm() {
    	System.out.println("Send Quote: There are " + tricentsPage.sendQuoteFieldsCounter.getText() + " fields that must be filled");
    	//Fill with hard-coded values
    	tricentsPage.emailField.clear();
    	tricentsPage.emailField.sendKeys("test@test.com.br");
    	tricentsPage.usernameField.clear();
    	tricentsPage.usernameField.sendKeys("teste123");
    	tricentsPage.passwordField.clear();
    	tricentsPage.passwordField.sendKeys("Abcd123");
    	tricentsPage.confirmPasswordField.clear();
    	tricentsPage.confirmPasswordField.sendKeys("Abcd123");
    	
    	System.out.println("Total fields " +tricentsPage.sendQuoteFieldsCounter.getText());
    	
    	assertThat("Send Quote: There are mandatory fields not filled, back and verify them.", tricentsPage.sendQuoteFieldsCounter.getText().equals("0"), is(equalTo(true)));
    	
    	System.out.println("Sending the email!");

    }
    
    @And("I click in the Next button to Insurant Data")
    public void iClickInTheNextButtonToInsurantData() {
    	tricentsPage.nextButtonToInsurantData.click();
    	WaitForElementToLoad(driver, tricentsPage.nextButtonToProductData);
    }
    
    @And("I click in the Next button to Product Data")
    public void iClickInTheNextButtonToProductData() {
    	tricentsPage.nextButtonToProductData.click();
    	WaitForElementToLoad(driver, tricentsPage.nextButtonToSelectPriceOption);
    }
    
    @And("I click in the Next button to Select Price Option")
    public void iClickInTheNextButtonToSelectPriceOption() {
    	tricentsPage.nextButtonToSelectPriceOption.click();
    }
    
    @And("I click in the Next button to Send Quote")
    public void iClickInTheNextButtonToSendQuote() {
    	tricentsPage.nextButtonToSendQuote.click();
    }
    
    @And("I click in the Send button")
    public void iClickInTheSendButton() {
    	tricentsPage.sendEmail.click();
    	WebElementUtils.WaitForElementToLoad(driver, tricentsPage.loadingSpinnerSendingEmail);
    }
    
    @Then("I should see the message of success")
    public void iShouldSeeTheMessageOfSuccess() {
    	String successMessage = "Sending e-mail success!";
    	WebElementUtils.WaitForElementToLoad(driver, tricentsPage.alertBox);
    	Assert.assertTrue("I should see " + successMessage + " but I got " + tricentsPage.alertMessageSuccessfullyEmailSent.getText() + " instead.", tricentsPage.alertMessageSuccessfullyEmailSent.getText().equalsIgnoreCase(successMessage));
    
    	System.out.println ("Email was sent successfully. See the message: " + tricentsPage.alertMessageSuccessfullyEmailSent.getText());
    
    }
    
}
