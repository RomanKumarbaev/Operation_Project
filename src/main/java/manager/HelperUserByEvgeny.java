package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HelperUserByEvgeny extends HelperBase {
    WebDriver wd;
    public HelperUserByEvgeny(WebDriver wd) {
        super(wd);
    }

    public void clickOnElements()
    {
        click(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']"));
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void OpenTextBox()
    {
        click(By.xpath("//span[normalize-space()='Text Box']"));
        wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    ////////////////
   /* public void clickName()
    {
        click(By.xpath("//input[@id='userName']"));
    }
    public
    public void clickEmail()
    {
        click(By.xpath("//input[@id='userName']");
    }
    public void clickCurAddress()
    {
        click(By.xpath("//textarea[@id='currentAddress']"));
    }
    public void clickPerAddress()
    {
        click(By.xpath("//textarea[@id='permanentAddress']"));
    }*/


    public void fillForm(String FullName,String Email,String CurAddress,String PerAddress)
    {
        type(By.xpath("//input[@id='userName']"),FullName);
        type(By.xpath("//input[@id='userName']"),Email);
        type(By.xpath("//textarea[@id='currentAddress']"),CurAddress);
        type(By.xpath("//textarea[@id='permanentAddress']"),PerAddress);
    }

    public void clickSubmit()
    {
        click(By.xpath("//button[@id='submit']"));
    }


















}
