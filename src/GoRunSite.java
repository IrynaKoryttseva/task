
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GoRunSite {
    private WebDriver driver;
    public GoRunSite (WebDriver driver){
        this.driver=driver;
    }
    @FindBy(name="m-main-i")private WebElement  laptopList;

    public void GoRunSite (){
        driver.get("http://rozetka.com.ua/");
        System.out.println("Part 1. verify site ROZETKA: "+ driver.getTitle()); 

    }
    public void LaptopePage(){
        laptopList.click();
        System.out.println("step1");
        WebElement step2=driver.findElement(By.xpath("//a[contains(text(),'Ноутбуки')])[3]"));
        step2.isDisplayed();
        step2.click();
        System.out.println("step2");
        System.out.println("Part 2. verify page laptop: "+ driver.getTitle()); 
    }
}
