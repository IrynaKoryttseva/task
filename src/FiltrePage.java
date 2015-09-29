

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FiltrePage {
    private WebDriver driver;
    public FiltrePage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(xpath = "//*[@id='filter_parameters_form']/div[2]/div[2]/span")private WebElement openMenuProducer;
    public void OpenMenuProducer(){
    openMenuProducer.click();
    }
    //filter producer
    @FindBy(xpath = "//*[@id='sort_producer']/li[3]/label/a/span/i[1]")private WebElement producerAsusFiltre;
    @FindBy(xpath = "//*[@id='sort_producer']/li[4]/span")private WebElement producerDellFiltre;
    public void ProducerAsusFiltre(){
    producerAsusFiltre.click();
    }
    public void ProducerDellFiltree(){
    producerDellFiltre.click();
    	
    }
    //
    @FindBy(xpath = "//*[@id=\"sort_36514\"]/li[1]/label/a/span/i[1]")private WebElement notebookHddFiltre;
    @FindBy(xpath = "//*[@id=\"sort_20882\"]/li[1]/label/a/span/i[1]")private WebElement notebookFilterValue;
    public void NBFiltreHDD(){
        notebookHddFiltre.click();
    }
    public void NBFiltreValue(){
        notebookFilterValue.click();
    }
}
