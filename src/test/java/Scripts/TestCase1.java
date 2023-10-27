package Scripts;

import org.testng.annotations.Test;

import Generic_Libraries.BaseClass;
import POM.DemoSkillraryPage;
import POM.SkillraryHomePage;
import POM.TestingPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1() throws Throwable
	{
		SkillraryHomePage s=new SkillraryHomePage(driver);
		s.GearsBtn(); // business library of gears from SkillraryHomePage
		s.skillraryDemoApp(); // business library of skillraryDemoApp from SkillraryHomePage
		utilities.childbrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		utilities.dropdown(ds.getSelectDd(),pdata.getPropertydata("coursedd"));
		TestingPage t=new TestingPage(driver);
		utilities.Scrolling(driver,t.getFaceBook());
		Thread.sleep(3000);
		t.FaceBookWebElement(); // business library of FaceBookWebElement from TestingPage
		
	}
	

}
