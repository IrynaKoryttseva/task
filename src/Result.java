import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Result {
    private WebDriver driver;
    public Result(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(xpath="//*[@id='title_page']/div/div/div[2]/h1")
    private WebElement results1;
    @FindBy(className="filter-active-i")
    private WebElement results2;
    @FindBy(xpath="//*[@id='title_page']/div/div/div[3]/ul/li[4]/p")
    private WebElement results3;
    
    public void getPagesReturned(){
    System.out.println("Test done, result: поиск по фильтру "+results1.getText()+"-> "+results2.getText());
    System.out.println("По запросу:  "+results3.getText()); 
    //return results1.getText();
         }
    }