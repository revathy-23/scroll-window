package com.javascript.executor;
welcome

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	//javascript is an interface,so we cannot create object for this,
	//so we type caset to driver object
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript(script,arguments)
	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\NewJavaProject\\src\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms11.htm");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//scroll up and down
		js.executeScript("window.scroll(0,800)", "");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,-800)", "");
		
		//go to the bottom of webpage
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,0)","");
		
		
		//go to the specific element
		WebElement link=driver.findElement(By.linkText("online tool"));
		js.executeScript("arguments[0].scrollIntoView(true);", link);
		
		
		



}
}
