package test.java.utils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.Random;

public class RandomGeneratorsUtils {
	private static Random random;
    
    	static {
    			try {
    				RandomGeneratorsUtils.random = SecureRandom.getInstanceStrong();
    			} catch (NoSuchAlgorithmException e) {
    				e.printStackTrace();
    			}
    		}
    	
    	//Random Integer between two values
    	public static Integer RandomIntegerBetween(Integer min, Integer max) {
    		return min + random.nextInt(max);
    	}
    	
    	public static int createRandomIntBetween(int start, int end) {
            return start + (int) Math.round(Math.random() * (end - start));
        }
    	
    	public static LocalDate createRandomDate(int startYear, int endYear) {
            int day = createRandomIntBetween(1, 28);
            int month = createRandomIntBetween(1, 12);
            int year = createRandomIntBetween(startYear, endYear);
            return LocalDate.of(year, month, day);
        }

}
