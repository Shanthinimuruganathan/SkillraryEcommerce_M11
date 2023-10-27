package Scripts;

import org.testng.annotations.Test;

import Generic_Libraries.BaseClass;
import POM.DemoSkillraryPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;

public class TestCase2 extends BaseClass{
@Test
public void tc2()
{
	SkillraryHomePage s=new SkillraryHomePage(driver);
	s.GearsBtn(); // business library of gears from SkillraryHomePage
	s.skillraryDemoApp(); // business library of skillraryDemoApp from SkillraryHomePage
	utilities.childbrowser(driver);
	DemoSkillraryPage ds=new DemoSkillraryPage(driver);
	ds.feedBackBtn();// business library of feedBackBtn from DemoSkillraryPage
	DownloadInvoicePage dI=new DownloadInvoicePage(driver);
	dI.downloadInvoiceButton(); // business library of downloadInvoiceButton from DownloadInvoicePage
}

}
