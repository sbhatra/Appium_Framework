package Practice.Appium_Framework;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TC04 extends Capability {

	//public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	@Test
	public void openApp() throws IOException {
	
    AndroidDriver<AndroidElement> driver = DesiredCapability();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    /*driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Aditi");
    //driver.hideKeyboard();
    driver.findElement(By.xpath("//*[@text='Female']")).click();
    driver.findElement(By.id("android:id/text1")).click();
    
    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Albania\"))");
    driver.findElement(By.xpath("//*[@text='Albania']")).click();
    driver.findElement(By.className("android.widget.Button")).click();
    
    driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
    
   //first add to cart becomes added to cart so again the index becomes 0 for the select element as it is the first add to cart in the view
    driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
    
 	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
 	Thread.sleep(5000);
 	
 	
 	WebElement Checkbox = driver.findElement(By.className("android.widget.CheckBox"));
    TouchAction t = new TouchAction(driver);
    t.tap(tapOptions().withElement(element(Checkbox))).perform();
    
    Thread.sleep(3000);
	
    WebElement instructions = driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));

	//WebElement TandC = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
   // t.longPress(longPressOptions().withElement(element(TandC)).withDuration(ofSeconds(2))).release().perform();
     t.longPress(longPressOptions().withElement(element(instructions)).withDuration(ofSeconds(2))).release().perform();
  // t.longPress(longPressOptions().withElement(element(instructions)).withDuration(ofSeconds(2))).release().perform();
    
	driver.findElement(By.id("android:id/button1")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	
	Thread.sleep(8000);
	
	// my Native app is changed the context to webapp
		        Set<String> contextNames = driver.getContextHandles();
		        for (String contextName : contextNames) {
		            System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		        }
		        //driver.context(contextNames.toArray()[1]);
		        //I will be able to work with web app
		        Thread.sleep(5000);
		        driver.context("WEBVIEW_com.androidsample.generalstore");
		        
		        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		        driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.RETURN);
		       
		        driver.pressKey(new KeyEvent(AndroidKey.BACK));
		        driver.context("NATIVE_APP");
		        */

		
	}
	
	}

