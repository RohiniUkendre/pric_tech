package TestScripts;

import java.io.IOException;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.BaseClass.Random_Num;
import com.crm.pom.pric;
@Listeners(com.crm.Listeners.Create_New_lock_Mesg.class)

public class Create_Locked_Mesg extends BaseClass{
	
	@Test
	public void create_mesg() throws IOException, InterruptedException
	{
//		preCondition();
//		login();
     	pric p=new pric(driver);
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = Random_Num.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("rohini");
 	    p.preminumContent.sendKeys("1234");
		p.submit.click();
		p.Home.click();
		
		

		
	}

}
