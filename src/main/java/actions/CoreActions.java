package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreActions {
    protected final WebDriver data;
    protected final WebDriverWait waiter;
    protected CoreActions(WebDriver data)
    {
        this.data=data;
        this.waiter=new WebDriverWait(data,10);
    }
    protected void Click(By element)
    {
    	data.findElement(element).click();
    }
    protected void ChooseSubject(By element)
    {
    	WebElement a1 = data.findElement(element);
    	Select DropDown = new Select(a1);
    	DropDown.selectByIndex(1);
    }
    protected void VerifyEmail(By element , String text)
    {
    	 data.findElement(element).sendKeys(text);
    }
    protected void WriteMessage(By element , String text)
    {
    	 data.findElement(element).sendKeys(text);
    }
    
   public void sleep(double sec)
{
    try {
        Thread.sleep((long)(sec * 1000));
    }catch (InterruptedException ex)
    {
        ex.printStackTrace();
    }
}
}