package test.java.businessModel;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;


public class PriceOption {
	
	private static PriceOption priceOptionInfo;

    public static PriceOption getInstance() {
        if (priceOptionInfo == null)
        	priceOptionInfo = new PriceOption();
            return priceOptionInfo;
    }
    
    private Random random;
    
    {
    	try {
    		random = SecureRandom.getInstanceStrong();
    	} catch (NoSuchAlgorithmException e) {
    		e.printStackTrace();
    	}
    }
    
    
    private String priceOption;
    
    public String getPriceOption() {
    	return priceOption;
    }
    
    public String getPriceOptionRandom() {
    	String priceOptionOptions[] = {"Silver", "Gold", "Platinum", "Ultimate"};
    	this.priceOption = priceOptionOptions[random.nextInt(priceOptionOptions.length)];
    	
    	return priceOption;
    }
    
    public void setPriceOption (String priceOption) {
    	this.priceOption = priceOption;
    }
    
}
