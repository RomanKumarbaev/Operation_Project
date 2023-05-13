package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUserByEvgeny extends HelperBase {
    public HelperUserByEvgeny(WebDriver wd) {
        super(wd);
    }

    public void clickOnElements()
    {
        click(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']"));
    }
    public void OpenTextBox()
    {
        click(By.xpath("//span[normalize-space()='Text Box']"));
    }
    public void clickName()
    {
        click(By.xpath("//input[@id='userName']"));
    }
    public void clickEmail()
    {
        click(By.xpath("//input[@id='userEmail']"));
    }
    public void clickCurAddress()
    {
        click(By.xpath("//textarea[@id='currentAddress']"));
    }
    public void 

















}
