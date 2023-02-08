package facebookDDT;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class intallation 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		 {
				DesiredCapabilities dc = new DesiredCapabilities();
			
				dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
				dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
				//dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Tiramisu");
				dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
				dc.setCapability(MobileCapabilityType.APP, "C:\\APKfiles\\facebook.apk");				
				
				URL url = new URL("http://0.0.0.0:4723/wd/hub");
				
				AndroidDriver driver = new AndroidDriver(url,dc);
				
				//driver.quit();
		}


	}

}
