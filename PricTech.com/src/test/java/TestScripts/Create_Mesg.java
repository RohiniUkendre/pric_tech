package TestScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.BaseClass.Random_Num;
import com.crm.Pom.pric;
@Listeners(com.crm.Listeners.Create_New_lock_Mesg.class)
public class Create_Mesg extends BaseClass {
	@Test
	public void create_mesg() throws IOException, InterruptedException
	{
		pric p=new pric(driver);
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		Thread.sleep(2000);
		String s=String.valueOf(-567);
		p.amount.sendKeys(s);
		Thread.sleep(2000);
		p.visible_Mesg.sendKeys("Manjiri");
		Thread.sleep(2000);
 	    p.preminumContent.sendKeys("1234");
 	   Thread.sleep(2000);
		p.submit.click();
		p.Home.click();
		
	}


}
