package Framework.Practice;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Utilities {
	
	AndroidDriver driver;
	
	
	public Utilities(AndroidDriver<AndroidElement> driver)
	{
		 this.driver=driver;
	}
	
	public void scrollToText (String Text)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+Text+"\"));");
	}

}
