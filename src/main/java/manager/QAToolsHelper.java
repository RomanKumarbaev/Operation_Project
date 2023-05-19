package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QAToolsHelper extends HelperBase{

    public QAToolsHelper(EventFiringWebDriver wd) {
        super(wd);
    }
public void clickSite(){
        click(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']"));
}

// Roman's add
    public void clickToElements() {
click(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']"));
    }
// Roman's add
    public void clickTextBox() {
click(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
    }
// Roman's add
    public void fillFullNameTextBox(String fullName) {
        type(By.xpath("//input[@id='userName']"),fullName);
    }
// Roman's add
    public void fillEmailTextBox(String email) {
        type(By.xpath("//input[@id='userName']"),email);
    }
// Roman's add
    public void fillCurrentAddressTextBox(String currentAddress) {
        type(By.xpath("//textarea[@id='currentAddress']"), currentAddress);
    }
// Roman's add
    public void fillPermanentAddressTextBox(String permanentAddress) {
        type(By.xpath("//textarea[@id='permanentAddress']"), permanentAddress);
    }
// Roman's add
    public void clickTotheSubmitButtonTextBox() {
        click(By.xpath("//button[@id='submit']"));
    }
// Roman's add
    public void resultsTestTextBox() {
        if(isElementPresent(By.xpath("//div[@class='border col-md-12 col-sm-12']"))){
            System.out.println("Test TEXT-BOX is DONE");
        }else {
            System.out.println("Test TEXT-BOX isn't Done!!!!!!!!!!");
        }
    }
// Roman's add
    public void clickToRadioButton() {
        click(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']"));
    }
// Roman's add
    public void clickToTheRadiobuttonYes() {
        click(By.xpath("//label[normalize-space()='Yes']"));
    }
// Roman's add
    public void clickToTheRadiobuttonImpressive() {
        click(By.xpath("//label[normalize-space()='Impressive']"));
    }
// Roman's add
    public void isClicable() {
       if(isElementPresent(By.xpath("//label[contains(@class,'custom-control-label disabled')]"))){
           WebElement element = wd.findElement(By.xpath("//label[contains(@class,'custom-control-label disabled')]"));
           String par = element.getText();
           System.out.println("Radio button "+par+" isn't clickable");
       }
    }
}
