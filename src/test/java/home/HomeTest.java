package home;

import core.CoreTestIntegration;
import core.Listener;
import actions.PageImplementation;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
@Epic("Epic 1")
@Listeners(Listener.class)

public class HomeTest extends CoreTestIntegration {
    PageImplementation pl;
    @Test
    @Description("Creating objects before class")
    public void initimpl()
    {
        pl=new PageImplementation(data);
    }
    @Test(dependsOnMethods = "initimpl")
    @Description("testing the function")
    @Severity(SeverityLevel.NORMAL)
    @Story("STORY 1")
    @Feature("Feature 1")
    @Owner("SIMRAN UPPAL")
    
    public void ContactCase()
    {
    	logStep("contact verify");
    	pl.PressContact();
    	pl.sleep(3);
    }
    @Test(priority=2)
    public void SubjectCase() 
    {
    	logStep("subject");
    	pl.ChooseHeading();
    	pl.sleep(3);
    	}
    @Test(priority=3)
    public void EmailCase()
    {
    	logStep("validate email ");
    	pl.ValidEmail("uppal@gmail.com");
    	pl.sleep(3);
    }
    @Test(priority=4)
    public void MessageCase()
    {
    	logStep("entered message");
    	pl.EnterMessage("hello");
    	pl.sleep(3);
    }
    @Test(priority=5)
    public void SendCase()
    {
    	logStep("clicked send");
    	pl.PressClick();
    	pl.sleep(3);
    }
    //test case2
    @Test(priority=6)
    public void ContactCase2()
    {
    	logStep("contact verify");
    	pl.PressContact();;
    	pl.sleep(3);
    }
    @Test(priority=7)
    public void SubjectCase2() 
    {
    	logStep("subject");
    	pl.ChooseHeading();;
    	pl.sleep(3);
    	}
    @Test(priority=8)
    public void EmailCase2()
    {
    	logStep("validate email ");
    	pl.ValidEmail("uppalll.com");
    	pl.sleep(5);
    }
    public void SendCase2() {
    	logStep("clicked send button");
    	pl.PressClick();
    	pl.sleep(5);
    }
    
}

