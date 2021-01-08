package test.java.businessModel;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

import test.java.utils.RandomGeneratorsUtils;


public class InsurantData {
	
	private static InsurantData insurantDataInfo;

    public static InsurantData getInstance() {
        if (insurantDataInfo == null)
        	insurantDataInfo = new InsurantData();
            return insurantDataInfo;
    }
    
    private Random random;
    
    {
    	try {
    		random = SecureRandom.getInstanceStrong();
    	} catch (NoSuchAlgorithmException e) {
    		e.printStackTrace();
    	}
    }
    
    private String dateOfBirth;

    public String getDateOfBirth() {   	
    	return dateOfBirth;
    }
    
    public String getDateOfBirthRandom() {
    	LocalDate randomDate = RandomGeneratorsUtils.createRandomDate(1965, 2002);
    	
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    	
    	String dateFormatted = randomDate.format(formatter);
    	
    	this.dateOfBirth = dateFormatted;
    	
    	return dateOfBirth;
    }
    
    public void setDateOfBirth (String dateOfBirth) {
    	this.dateOfBirth = dateOfBirth;
    }
    
    private String gender;
    
    public String getGender() {
    	return gender;
    }
    
    public String getGenderRandom() {
    	String genderOptions[] = {"Male", "Female"};
    	this.gender = genderOptions[random.nextInt(genderOptions.length)];
    	
    	return gender;
    }
    
    public void setGender (String gender) {
    	this.gender = gender;
    }
    
    private String country;
    
    public String getCountry() {
    	return country;
    }
    
    public String getCountryRandom() {
    	//input some countries from the list
    	String countryOptions[] = {"Argentina", "Brazil", "Canada", "Spain", "United Kingdom", "Ireland", "India", "Japan", "Mongolia", "Russian Federation", "South Africa", "United States", "Uruguay"};
    	this.country = countryOptions[random.nextInt(countryOptions.length)];
    	
    	return country;
    }
    
    public void setCountry (String country) {
    	this.country = country;
    }
    
    private String zipCode;

    public String getZipCode() {
    	
    	return zipCode;
    }
    
    public String getZipCodeRandom() {
    	
    	this.zipCode = RandomStringUtils.randomNumeric(8);
    	
    	return zipCode;
    }
    
    public void setZipCode (String zipCode) {
    	this.zipCode = zipCode;
    }
    
    private String occupation;
    
    public String getOccupation() {
    	return occupation;
    }
    
    public String getOccupationRandom() {
    	String occupationOptions[] = {"Employee", "Public Official", "Farmer", "Unemployed", "Selfemployed"};
    	this.occupation = occupationOptions[random.nextInt(occupationOptions.length)];
    	
    	return occupation;
    }
    
    public void setOccupation (String occupation) {
    	this.occupation = occupation;
    }
    
    private String hobbies;
    
    public String getHobbies() {
    	return hobbies;
    }
    
    public String getHobbiesRandom() {
    	String hobbiesOptions[] = {"Speeding", "Bungee Jumping", "Cliff Diving", "Skydiving", "Other"};
    	this.hobbies = hobbiesOptions[random.nextInt(hobbiesOptions.length)];
    	
    	return hobbies;
    }
    
    public void setHobbies (String hobbies) {
    	this.hobbies = hobbies;
    }
    
    private String cylinderCapacity;
    
    public String getCylinderCapacity() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(1, 2000);
    	
    	this.cylinderCapacity = value.toString();
    	
    	return cylinderCapacity;
    }
    
    public void setCylinderCapacity (String cylinderCapacity) {
    	this.cylinderCapacity = cylinderCapacity;
    }
    
    private String enginePerformance;
    
    public String getEnginePerformance() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(1, 2000);
    	
    	this.enginePerformance = value.toString();
    	
    	return enginePerformance;
    }
    
    public void setEnginePerformance (String enginePerformance) {
    	this.enginePerformance = enginePerformance;
    }
    
    private String dateOfManufacture;
    
    public String getDateOfManufacture() {
    	LocalDate randomDate = RandomGeneratorsUtils.createRandomDate(1991, 2015);
    	
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    	
    	String dateFormatted = randomDate.format(formatter);
    	
    	this.dateOfManufacture = dateFormatted;
    	
    	return dateOfManufacture;
    }
    
    public void setDateOfManufacture (String dateOfManufacture) {
    	this.dateOfManufacture = dateOfManufacture;
    }
    
    private String numberOfSeats1;
    
    public String getNumberOfSeats1() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(1, 9);
    	
    	this.numberOfSeats1 = value.toString();
    	
    	return numberOfSeats1;
    }
    
    public void setNumberOfSeats1 (String numberOfSeats1) {
    	this.numberOfSeats1 = numberOfSeats1;
    }
    
    private String rightHandDriver;
    
    public String getRightHandDriver() {
    	String righHandDriverOptions[] = {"Yes", "No"};
    	this.rightHandDriver = righHandDriverOptions[random.nextInt(righHandDriverOptions.length)];
    	
    	return rightHandDriver;
    }
    
    public void setRightHandDriver (String rightHandDriver) {
    	this.rightHandDriver = rightHandDriver;
    }
    
    private String numberOfSeats2;
    
    public String getNumberOfSeats2() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(1, 3);
    	
    	this.numberOfSeats2 = value.toString();
    	
    	return numberOfSeats2;
    }
    
    public void setNumberOfSeats2 (String numberOfSeats2) {
    	this.numberOfSeats2 = numberOfSeats2;
    }
    
    private String fuelType;
    
    public String getFuelType() {
    	String fuelTypeOptions[] = {"Petrol", "Diesel", "Electric Power", "Gas", "Other"};
    	this.fuelType = fuelTypeOptions[random.nextInt(fuelTypeOptions.length)];
    	
    	return fuelType;
    }
    
    public void setFuelType (String fuelType) {
    	this.fuelType = fuelType;
    }
    
    private String payload;
    
    public String getPayload() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(1, 1000);
    	
    	this.payload = value.toString();
    	
    	return payload;
    }
    
    public void setPayload (String payload) {
    	this.payload = payload;
    }
    
    private String totalWeight;
    
    public String getTotalWeight() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(1, 50000);
    	
    	this.totalWeight = value.toString();
    	
    	return totalWeight;
    }
    
    public void setTotalWeight (String totalWeight) {
    	this.totalWeight = totalWeight;
    }
    
    private String listPrice;
    
    public String getListPrice() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(500, 100000);
    	
    	this.listPrice = value.toString();
    	
    	return listPrice;
    }
    
    public void setListPrice (String listPrice) {
    	this.listPrice = listPrice;
    }
    
    private String annualMileage;
    
    public String getAnnualMileage() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(100, 100000);
    	
    	this.annualMileage = value.toString();
    	
    	return annualMileage;
    }
    
    public void setAnnualMileage (String annualMileage) {
    	this.annualMileage = annualMileage;
    }
}
