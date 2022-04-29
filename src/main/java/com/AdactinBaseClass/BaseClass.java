package com.AdactinBaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public  static WebDriver getBrowser( String browserName ) {
	
		if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 }
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}
	
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		 driver.get(url);
	 }
	 
	 public static void refresh() {
		 driver.navigate().refresh();
	 }
	 
	 public static void quit(){
		 driver.quit();
		 }
	 
	 public static void close() {
		 driver.close();
	 }
	 
	 public static void forward() {
		 driver.navigate().forward();
	 }
	 
	 public static void back() {
		 driver.navigate().back();
	 }
	 
	 public static void navigateTo(String url) {
		 driver.navigate().to(url);
	 }
	 
	 public static void getCurrentUrl() {
		  String currentUrl = driver.getCurrentUrl();
		 System.out.println("currentUrl "); 
	 }
	
	 public static void getTitle() {
			String title = driver.getTitle();
			System.out.println("title");
		}
		
		public static void sendkeys(WebElement element, String value) {
			element.sendKeys(value);
		}
		
		public static void click(WebElement element){
			element.click();
		}
		
		public static void getText(WebElement element) {
			String text = element.getText();
			System.out.println(text);
		}
		
		public static void isEnabled(WebElement element) {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
		}
		
		public static void isDisplayed(WebElement element) {
			boolean displayed = element.isDisplayed();
	        System.out.println(displayed);
		}

		
		public static void isSelected(WebElement element) {
		  boolean selected = element.isSelected();
		System.out.println(selected);
		}
		
		
		public static void alert(String value) {
			Alert alert = driver.switchTo().alert();
		if(value.equalsIgnoreCase("accept")) {
			alert.accept();
		}
		else if (value.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}
		else if(value.equalsIgnoreCase("getText")) {
			String text = alert.getText();
		System.out.println(text);
		}
		}
		
		
		public static void actions(WebElement element,String option){
		Actions a =new Actions(driver);
		if(option.equalsIgnoreCase("move")) {
			a.moveToElement(element).build().perform();
		}
		else if(option.equalsIgnoreCase("right click")) {
			a.contextClick(element).build().perform();
		}
		else if(option.equalsIgnoreCase("click")) {
			a.click().build().perform();
		}
		else if(option.equalsIgnoreCase("double click")) {
			
			a.doubleClick().build().perform();
		}
		}
		
		
		public static void Singledropdown(WebElement element, String option, String value) {
			Select s = new Select(element);
			if(option.equalsIgnoreCase("SelectByValue")) {
				s.selectByValue(value);
			}
				else if(option.equalsIgnoreCase("VisibleText")) {
					s.selectByVisibleText(value);
				}
				else if(option.equalsIgnoreCase("index")) {
				int parsInt = Integer.parseInt(value);
					s.selectByIndex(parsInt);
				}
			}
		
		public static void thread(int value) throws InterruptedException
		{
			Thread.sleep(value);
		}
		
		public static void implicitwait()
		{
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		public static void scroll(WebElement element){
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0]scrollIntoView()",element);
		}
		
		public static void screenshot(String location) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File scr = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(location);
			FileUtils.copyFile(scr,dest);
		}
			
			public static void singlefram(WebElement element ) {
				driver.switchTo().frame(element);
			
			}
			
					

	

}
