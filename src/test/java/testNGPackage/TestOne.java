package testNGPackage;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestOne extends BaseClass 
{
	
	
	@Test(priority = 1)
	public void installation() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		WebDriverWait wait0 = new WebDriverWait(driver,Duration.ofSeconds(200));
	    wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc=\"Apps\"]")));
	    
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Apps\"]")).click();
		
		driver.findElement(By.id("com.android.launcher3:id/search_drop_target_bar")).click();
		WebElement active = driver.switchTo().activeElement();
		Actions action = new Actions(driver);
		action.moveToElement(active).sendKeys("play store").sendKeys(Keys.ENTER).perform();				
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Play Store\"]")).click();
		 wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View")));
		    
			
		    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.view.View")).click();
			
			
			WebElement textField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.EditText"));
			textField.sendKeys("unit converter");
			
			action.moveToElement(active).sendKeys(Keys.ENTER).perform();	

			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.Button")).click();
			Thread.sleep(10000);
			System.out.println("Application installed..");
	}
	
	@Test(priority = 2)
	public void  verification()
	{
		try
		{

				String expectedOutput = "2' 1\"";
				String expectedOutput2 = "0' 10\"";
				String expectedOutput3 = "1' 0\"";			
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			WebDriverWait wait0 = new WebDriverWait(driver,Duration.ofSeconds(200));
		    wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc=\"Apps\"]")));
		    
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Apps\"]")).click();
			
			driver.findElement(By.id("com.android.launcher3:id/search_drop_target_bar")).click();
			WebElement active = driver.switchTo().activeElement();
			Actions action = new Actions(driver);
			action.moveToElement(active).sendKeys("unit converter").sendKeys(Keys.ENTER).perform();				
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Unit Converter\"]")).click();

			
			driver.findElement(By.id("kr.sira.unit:id/tab0_input")).click();
			
			driver.findElement(By.id("kr.sira.unit:id/tab0_num2")).click();
			driver.findElement(By.id("kr.sira.unit:id/tab0_num5")).click();
			
			String actualOutput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView")).getText();
			if(actualOutput.equals(expectedOutput))
			{
				System.out.println("Test Case1 : PASS");
			}
			else
				System.out.println("Test Case1 : Fail");
			
			WebElement backSpace = driver.findElement(By.id("kr.sira.unit:id/tab0_numback"));
			backSpace.click();
			backSpace.click();
			
			driver.findElement(By.id("kr.sira.unit:id/tab0_num1")).click();
			driver.findElement(By.id("kr.sira.unit:id/tab0_num0")).click();
			
			String actualOutput2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView")).getText();
			if(actualOutput2.equals(expectedOutput2))
			{
				System.out.println("Test Case2 : PASS");
			}
			else
				System.out.println("Test Case2 : FAIL");
			
			backSpace.click();
			backSpace.click();
			
			driver.findElement(By.id("kr.sira.unit:id/tab0_num1")).click();
			driver.findElement(By.id("kr.sira.unit:id/tab0_num2")).click();
			
			String actualOutput3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView")).getText();
			if(actualOutput3.equals(expectedOutput3))
			{
				System.out.println("Test Case3 : PASS");
			}
			else
				System.out.println("Test Case3 : FAIL");
			
			System.out.println("Program Ends..");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	@Test(priority = 3)
	public void uninstallation()
	{		
		driver.removeApp("kr.sira.unit");
		System.out.println("Application is uninstalled..");
	}
	
	

}
