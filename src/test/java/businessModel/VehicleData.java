package test.java.businessModel;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import test.java.utils.RandomGeneratorsUtils;


public class VehicleData {
	
	private static VehicleData vehicleDataInfo;

    public static VehicleData getInstance() {
        if (vehicleDataInfo == null)
        	vehicleDataInfo = new VehicleData();
            return vehicleDataInfo;
    }
    
    private Random random;
    
    {
    	try {
    		random = SecureRandom.getInstanceStrong();
    	} catch (NoSuchAlgorithmException e) {
    		e.printStackTrace();
    	}
    }
    
    private String make;
    
    public String getMake() {
    	return make;
    }
    
    public String getMakeRandom() {
    	String makeOptions[] = {"Audi", "BMW", "Ford", "Honda", "Mazda", "Mercedes Benz", "Nissan", "Opel", "Porsche", "Renault", "Skoda", "Suzuki", "Toyota", "Volkswagen", "Volvo"};
    	this.make = makeOptions[random.nextInt(makeOptions.length)];
    	
    	return make;
    }
    
    public void setMake (String make) {
    	this.make = make;
    }
    
    private String model;
    
    public String getModel() {
    	return model;
    }
    
    public String getModelRandom() {
    	String modelOptions[] = {"Scooter", "Three-Wheeler", "Moped", "Motorcycle"};
    	this.model = modelOptions[random.nextInt(modelOptions.length)];
    	
    	return model;
    }
    
    public void setModel (String model) {
    	this.model = model;
    }
    
    private String cylinderCapacity;
    
    public String getCylinderCapacity() {
    	return cylinderCapacity;
    }
    
    public String getCylinderCapacityRandom() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(1, 2000);
    	
    	this.cylinderCapacity = value.toString();
    	
    	return cylinderCapacity;
    }
    
    public void setCylinderCapacity (String cylinderCapacity) {
    	this.cylinderCapacity = cylinderCapacity;
    }
    
    private String enginePerformance;
    
    public String getEnginePerformance() {
    	return enginePerformance;
    }
    
    public String getEnginePerformanceRandom() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(1, 2000);
    	
    	this.enginePerformance = value.toString();
    	
    	return enginePerformance;
    }
    
    public void setEnginePerformance (String enginePerformance) {
    	this.enginePerformance = enginePerformance;
    }
    
    private String dateOfManufacture;
    
    public String getDateOfManufacture() {
    	return dateOfManufacture;
    }
    
    public String getDateOfManufactureRandom() {
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
    	return numberOfSeats1;
    }
    
    public String getNumberOfSeats1Random() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(1, 9);
    	
    	this.numberOfSeats1 = value.toString();
    	
    	return numberOfSeats1;
    }
    
    public void setNumberOfSeats1 (String numberOfSeats1) {
    	this.numberOfSeats1 = numberOfSeats1;
    }
    
    private String numberOfSeats2;
    
    public String getNumberOfSeats2() {
    	return numberOfSeats2;
    }
    
    public String getNumberOfSeats2Random() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(1, 3);
    	
    	this.numberOfSeats2 = value.toString();
    	
    	return numberOfSeats2;
    }
    
    public void setNumberOfSeats2 (String numberOfSeats2) {
    	this.numberOfSeats2 = numberOfSeats2;
    }
    
    private String fuelType;
    
    public String getFuelType() {
    	return fuelType;
    }
    
    public String getFuelTypeRandom() {
    	String fuelTypeOptions[] = {"Petrol", "Diesel", "Electric Power", "Gas", "Other"};
    	this.fuelType = fuelTypeOptions[random.nextInt(fuelTypeOptions.length)];
    	
    	return fuelType;
    }
    
    public void setFuelType (String fuelType) {
    	this.fuelType = fuelType;
    }
    
    private String payload;
    
    public String getPayload() {   	
    	return payload;
    }
    
    public String getPayloadRandom() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(1, 1000);
    	
    	this.payload = value.toString();
    	
    	return payload;
    }
    
    public void setPayload (String payload) {
    	this.payload = payload;
    }
    
    private String totalWeight;
    
    public String getTotalWeight() {   	
    	return totalWeight;
    }
    
    public String getTotalWeightRandom() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(1, 50000);
    	
    	this.totalWeight = value.toString();
    	
    	return totalWeight;
    }
    
    public void setTotalWeight (String totalWeight) {
    	this.totalWeight = totalWeight;
    }
    
    private String listPrice;
    
    public String getListPrice() {  	
    	return listPrice;
    }
    
    public String getListPriceRandom() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(500, 100000);
    	
    	this.listPrice = value.toString();
    	
    	return listPrice;
    }
    
    public void setListPrice (String listPrice) {
    	this.listPrice = listPrice;
    }
    
    private String annualMileage;
    
    public String getAnnualMileage() {
    	return annualMileage;
    }
    
    public String getAnnualMileageRandom() {
    	Integer value = RandomGeneratorsUtils.RandomIntegerBetween(100, 100000);
    	
    	this.annualMileage = value.toString();
    	
    	return annualMileage;
    }
    
    public void setAnnualMileage (String annualMileage) {
    	this.annualMileage = annualMileage;
    }
}
