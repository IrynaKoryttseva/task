

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LaptopePage  {
    private WebDriver driver;
    public LaptopePage(WebDriver driver){
        this.driver=driver; 
    } 
    //виды laptops
    @FindBy(xpath = "//*[@id=\"head_banner_container\"]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/" +
            "div/div[1]/div[1]/div[2]/div[1]/div/h4/a")private WebElement netbook;
    @FindBy(xpath = "//*[@id=\"head_banner_container\"]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/" +
            "div/div[1]/div[1]/div[2]/div[2]/div/h4/a")private WebElement easyTasks;
    @FindBy(xpath = "//*[@id=\"head_banner_container\"]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/" +
            "div/div[1]/div[1]/div[2]/div[3]/div/h4/a")private WebElement forWorkAndStudy;
    @FindBy(xpath = "//*[@id='head_banner_container']/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/"+
            "div/div[1]/div[1]/div[2]/div[4]/div/h4/a")private WebElement forBisness;
    @FindBy(xpath = "//*[@id='head_banner_container']/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/"+
            "div/div[1]/div[1]/div[3]/div[1]/div/h4/a")private WebElement forGames;
    @FindBy(xpath = "//*[@id='head_banner_container']/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/"+
            "div/div[1]/div[1]/div[3]/div[2]/div/h4/a")private WebElement forMultyMedieCenter;
    @FindBy(xpath = "//*[@id='head_banner_container']/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/"+
            "div/div[1]/div[1]/div[3]/div[3]/div/h4")private WebElement lightAndSlim;
    @FindBy(xpath = "//*[@id='head_banner_container']/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/"+
            "div/div[1]/div[1]/div[3]/div[4]/div/h4/a")private WebElement transformer;
    //clicking
    public void Netbook(){
        netbook.click();
    }
    public void EasyTasks(){
        easyTasks.click();
    }
    public void ForWorkAndStudy(){
        forWorkAndStudy.click();
    }
    public void ForBisness(){
    	forBisness.click();
    }
    public void ForGames(){
    	forGames.click();
    }
    public void ForMultyMedieCenter(){
    	forMultyMedieCenter.click();
    }
    public void LightAndSlim(){
    	lightAndSlim.click();
    }
    public void Transformer(){
    	transformer.click();
    }
   // public WebDriver getDriver() { return driver;
   // }
}
