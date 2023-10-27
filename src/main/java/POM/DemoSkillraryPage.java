package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage {
	
	//Declaration
	//URL: https://demoapp.skillrary.com/category.php?category=testing
	//www.skillrary.com -> Gears->skillrarydemoapp-> inspect  Select Category
	//address of select category
	@FindBy(name="addresstype")
	private WebElement selectDd;
	
	//address of feedback
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbackBtn; 
	
	//Initialization
		public DemoSkillraryPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		//Utilization
		public WebElement getSelectDd() {
			return selectDd;
		}

		public WebElement getFeedbackBtn() {
			return feedbackBtn;
		}
		//BusinessLibrary (Created only for clickable element..as select is a drop down we dint create)
		public void feedBackBtn()
		{
			feedbackBtn.click();
		}

}

