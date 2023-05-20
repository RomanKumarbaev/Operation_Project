import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EvgenyTests extends TestBase {

WebDriver wd;

    @Test

    public void FillForm()
    {
        String FullName = "Evgeny Piyanzin";
        String Email = "Pivivar555@yandex.ru";
        String CurAddress = "Ashkelon, Ben-Gurion 5";
        String PerAddress = "Gaza , Hamas";

        app.getUser().clickOnElements();

        app.getUser().OpenTextBox();
        app.getUser().pause(15);
        app.getUser().fillForm(" Evgeny Piyanzin", " Pivivar555@yandex.ru",
                " Ashkelon, Ben-Gurion 5", " Gaza , Hamas");
        app.getUser().pause(10000);
        app.getUser().clickSubmit();
        app.getUser().pause(10000);

        Assert.assertEquals(app.getUser().textElement(By.cssSelector("p#name.mb-1")),"Name: Evgeny Piyanzin");
        Assert.assertEquals(app.getUser().textElement(By.cssSelector("p#email.mb-1")),"Email:Pivivar555@yandex.ru");
        Assert.assertEquals(app.getUser().textElement(By.cssSelector("p#currentAddress.mb-1")),"Current Address : Ashkelon, Ben-Gurion 5");
        Assert.assertEquals(app.getUser().textElement(By.cssSelector("p#permanentAddress.mb-1")),"Permananet Address : Gaza , Hamas");

    }
    @Test
    public void CheckBox()

    {////open all check boxes:

        app.getUser().clickOnElements();
        app.getUser().pause(5000);
        app.getUser().clickOnCheckBox();
    wd.findElement(By.xpath("(//*[name()='path'])[54]")).click();
        wd.findElement(By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-expand-close'])[1]")).click();
        wd.findElement(By.xpath("(//*[name()='path'])[60]")).click();
        wd.findElement(By.xpath("((//*[name()='svg'][@class='rct-icon rct-icon-expand-close'])[3]")).click();
        wd.findElement(By.xpath("//body//div[@id='app']//li[@class='rct-node rct-node-parent rct-node-expanded']//li[@class='rct-node rct-node-parent rct-node-expanded']//li[1]//span[1]//button[1]//*[name()='svg']")).click();
        wd.findElement(By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-expand-close'])[2]")).click();

        //// click all opened check boxes:

        wd.findElement(By.xpath("(//*[name()='path'])[60]")).click();
        wd.findElement(By.xpath("(//*[name()='path'])[62]")).click();
        wd.findElement(By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-check'])[7]")).click();
        wd.findElement(By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-check'])[8]")).click();
        wd.findElement(By.xpath("(//*[name()='path'])[74]")).click();
        wd.findElement(By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-check'])[11]")).click();
        wd.findElement(By.xpath("(//*[name()='path'])[81]")).click();
        wd.findElement(By.xpath("(//*[name()='path'])[83]")).click();
        wd.findElement(By.xpath("(//*[name()='path'])[85]")).click();
        wd.findElement(By.xpath("(//*[name()='path'])[90]")).click();
        wd.findElement(By.xpath("(//*[name()='path'])[92]")).click();


        WebElement sub = wd.findElement(By.xpath("(//div[@id='result'])[1]"));
        String SubText = sub.getText();
        Assert.assertNotNull(SubText);






    }




}
