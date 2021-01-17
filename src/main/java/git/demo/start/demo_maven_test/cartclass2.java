package git.demo.start.demo_maven_test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cartclass2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("Webdriver.Chrome.Driver", "chromedriver.exe");
		WebDriver xd=new ChromeDriver();
		/*
		 * xd.get("https://www.flipkart.com/");
		 * 
		 * Robot x=new Robot(); x.keyPress(KeyEvent.VK_CONTROL);
		 * x.keyPress(KeyEvent.VK_T); x.keyRelease(KeyEvent.VK_CONTROL);
		 * x.keyRelease(KeyEvent.VK_T);
		 * 
		 * Set<String> set=xd.getWindowHandles(); Iterator<String> itr1=set.iterator();
		 * String parentwindow=itr1.next(); String childwindow=itr1.next();
		 * xd.switchTo().window(childwindow);
		 * xd.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
		 */
		
		xd.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(3000);
		xd.manage().window().maximize();
		xd.switchTo().frame("classFrame"); //frame id,name
		xd.findElement(By.linkText("org.openqa.selenium")).click();// clicks to iframe
		xd.switchTo().defaultContent(); 
		xd.switchTo().frame(1);
		Thread.sleep(3000);
		xd.findElement(By.linkText("Actions")).click();
		xd.switchTo().parentFrame();
		xd.switchTo().frame(xd.findElement(By.xpath("//iframe[@title='All Packages']")));
		Thread.sleep(3000);
		xd.findElement(By.linkText("org.openqa.selenium.devtools")).click();
		
		
		
		
		
	}

}
