package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage {
	//Declaration
	//address of download invoice
	//skillrary.com->skillrarydemo app-> feedback-> download invoice
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement downloadInvoiceBtn;
	
	//Initialization
	public DownloadInvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Utilization
	public WebElement getDownloadInvoiceBtn() {
		return downloadInvoiceBtn;
	}

	//BusinessLibrary
	public void downloadInvoiceButton()
	{
		downloadInvoiceBtn.click();
	}
	
	

}
