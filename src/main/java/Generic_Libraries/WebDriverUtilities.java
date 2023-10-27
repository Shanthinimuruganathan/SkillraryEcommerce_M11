package Generic_Libraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	//1.Handling dropdown
	public void dropdown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	//2.Handling mouseOvering
		public void mouseOvering(WebDriver driver,WebElement ele)
		{
			Actions a=new Actions(driver);
			a.moveToElement(ele).perform();
		}
		//3.Handling rightClick
		public void rightClick(WebDriver driver,WebElement ele)
		{
			Actions a=new Actions(driver);
			a.contextClick(ele).perform();
		}
		//4.Handling doubleClick
		public void doubleclick(WebDriver driver,WebElement ele)
		{
			Actions a=new Actions(driver);
			a.doubleClick(ele).perform();
		}
		//5.Handling drag&drop
		public void draganddrop(WebDriver driver,WebElement Ele1,WebElement Ele2)
		{
			Actions a=new Actions(driver);
			a.dragAndDrop(Ele1,Ele2).perform();
		}
		//6.Handling frame
		public void frames(WebDriver driver,String value)
		{
			driver.switchTo().frame(value);
		}
		//7.Handling default content
		public void frames(WebDriver driver)
		{
			driver.switchTo().defaultContent();
		}
		//8.Handling child browser
		public void childbrowser(WebDriver driver)
		{
			Set<String> child=driver.getWindowHandles();
			for(String b:child)
				{
				driver.switchTo().window(b);
				}
		}
		//9.Handling Scrolling
		public void Scrolling(WebDriver driver,WebElement ele)
		{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();",ele); 
        }
		//10.Handling popup
        public void popup(WebDriver driver)
        {
        	driver.switchTo().alert().accept();
        }
}