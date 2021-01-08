package test.java.businessModel;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;


public class ProductData {
	
	private static ProductData productDataInfo;

    public static ProductData getInstance() {
        if (productDataInfo == null)
        	productDataInfo = new ProductData();
            return productDataInfo;
    }
    
    private Random random;
    
    {
    	try {
    		random = SecureRandom.getInstanceStrong();
    	} catch (NoSuchAlgorithmException e) {
    		e.printStackTrace();
    	}
    }
    
    private String startDate;

    public String getStartDate() {   	
    	return startDate;
    }
    
    public String getStartDateRandom() {
    	//the start date must be at least 1 month ahead now day
    	LocalDate randomDate = LocalDate.now();
    	
    	randomDate = randomDate.plusDays(32);
    	
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    	
    	String dateFormatted = randomDate.format(formatter);
    	
    	this.startDate = dateFormatted;
    	
    	return startDate;
    }
    
    public void setStartDate (String startDate) {
    	this.startDate = startDate;
    }
    
    private String insuranceSum;
    
    public String getInsuranceSum() {
    	return insuranceSum;
    }
    
    public String getInsuranceSumRandom() {
    	String insuranceSumOptions[] = {" 3.000.000,00", " 5.000.000,00", " 7.000.000,00", " 10.000.000,00", " 15.000.000,00", " 20.000.000,00", " 25.000.000,00", " 30.000.000,00", " 35.000.000,00"};
    	this.insuranceSum = insuranceSumOptions[random.nextInt(insuranceSumOptions.length)];
    	
    	return insuranceSum;
    }
    
    public void setInsuranceSum (String insuranceSum) {
    	this.insuranceSum = insuranceSum;
    }
    
    private String meritRating;
    
    public String getMeritRating() {
    	return meritRating;
    }
    
    public String getMeritRatingRandom() {
    	//input some merit ratings from the list
    	String meritRatingOptions[] = {"Super Bonus", "Bonus 1", "Bonus 2", "Bonus 3", "Bonus 4", "Bonus 5", "Malus 15", "Malus 16", "Malus 17"};
    	this.meritRating = meritRatingOptions[random.nextInt(meritRatingOptions.length)];
    	
    	return meritRating;
    }
    
    public void setMeritRating (String meritRating) {
    	this.meritRating = meritRating;
    }
    
   private String damageInsurance;
    
    public String getDamageInsurance() {
    	return damageInsurance;
    }
    
    public String getDamageInsuranceRandom() {
    	String damageInsuranceOptions[] = {"No Coverage", "Partial Coverage", "Full Coverage"};
    	this.damageInsurance = damageInsuranceOptions[random.nextInt(damageInsuranceOptions.length)];
    	
    	return damageInsurance;
    }
    
    public void setDamageInsurance (String damageInsurance) {
    	this.damageInsurance = damageInsurance;
    }
    
    private String optionalProducts;
    
    public String getOptionalProducts() {
    	return optionalProducts;
    }
    
    public String getOptionalProductsRandom() {
    	String optionalProductsOptions[] = {"Euro Protection", "Legal Defense Insurance"};
    	this.optionalProducts = optionalProductsOptions[random.nextInt(optionalProductsOptions.length)];
    	
    	return optionalProducts;
    }
    
    public void setOptionalProducts (String optionalProducts) {
    	this.optionalProducts = optionalProducts;
    }
    
    private String courtesyCar;
    
    public String getCourtesyCar() {
    	return courtesyCar;
    }
    
    public String getCourtesyCarRandom() {
    	String courtesyCarOptions[] = {"No", "Yes"};
    	this.courtesyCar = courtesyCarOptions[random.nextInt(courtesyCarOptions.length)];
    	
    	return courtesyCar;
    }
    
    public void setCourtesyCar (String courtesyCar) {
    	this.courtesyCar = courtesyCar;
    }
}
