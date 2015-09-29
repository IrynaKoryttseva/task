import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class TestMetricks {
	private ChromeDriver driver;
	
	@Test
    public void Test1(){
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\workspace\\ROZETKA\\src\\Resurse\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        GoRunSite  clickAndGo =new PageFactory().initElements(driver,GoRunSite .class);
        clickAndGo.GoRunSite ();
        clickAndGo.LaptopePage();
        LaptopePage laptopfilter1=new PageFactory().initElements(driver,LaptopePage.class);
        FiltrePage laptopfilter2=new PageFactory().initElements(driver,FiltrePage.class);
        laptopfilter1.LightAndSlim();//choose filter -1 
        laptopfilter2.ProducerAsusFiltre();//choose filter -2
        Result loockresult=new PageFactory().initElements(driver, Result.class);
        loockresult.getPagesReturned();
        driver.close();
    }
}

