package TestScripts;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.BaseClass.Random_Num;
import com.crm.pom.pric;
@Listeners(com.crm.Listeners.Edit_Existing_locked_Mesg.class)
public class EditLocked_Mesg extends BaseClass {
	@Test
	public void edit_mesg() throws IOException, InterruptedException
	{
		preCondition();
		login();
     	pric p=new pric(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = Random_Num.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("rohini");
 	    p.preminumContent.sendKeys("124");
		p.submit.click();
       p.edit.click();
       p.visible_Mesg.clear();
       p.visible_Mesg.sendKeys("hioejns");
       p.submit.click();
       p.Home.click();
}
}