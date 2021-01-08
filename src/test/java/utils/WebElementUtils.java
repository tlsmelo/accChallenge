package test.java.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils {
	
	public static void WaitForElementToLoad(WebDriver activeDriver, WebElement webElement){
        WebDriverWait wait = new WebDriverWait(activeDriver, 30);
        wait.until((ExpectedConditions.visibilityOf(webElement)));
    }

    public static void WaitForElementToDisappear(WebDriver activeDriver, WebElement webElement){
    	WaitForElementToDisappear(activeDriver, webElement, 30);
    }

    public static void WaitForElementToDisappear(WebDriver activeDriver, WebElement webElement, Integer timeoutSeconds){
        explicitWaitMs(500);

        WebDriverWait wait = new WebDriverWait(activeDriver, timeoutSeconds);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static void WaitForElementToBeClickable(WebDriver activeDriver, WebElement webElement){
        WebDriverWait wait = new WebDriverWait(activeDriver, 30);
        wait.until((ExpectedConditions.elementToBeClickable(webElement)));
    }

    public static void WaitForElementWithText (WebDriver activeDriver, String text, WebElement webElement){
        WebDriverWait wait = new WebDriverWait(activeDriver, 30);
        wait.until((ExpectedConditions.textToBePresentInElement(webElement, text)));
    }


    public static void explicitWaitMs (Integer waitMs){
        try{
            Thread.sleep(waitMs);
        } catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

}
