package store;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data {
    private final WebDriver driver;
    public Data(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\simran.uppal\\Documents\\Projects\\selenium_aid\\src\\main\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }
    public WebDriver getData() {
        return driver;
    }
}
