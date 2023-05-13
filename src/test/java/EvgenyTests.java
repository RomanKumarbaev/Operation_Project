import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EvgenyTests extends TestBase {

    @Test

    public void FillForm()
    {
        String FullName = "Evgeny Piyanzin";
        String Email = "Pivivar555@yandex.ru";
        String CurAddress = "Ashkelon, Ben-Gurion 5";
        String PerAddress = "Gaza , Hamas";


        app.openTestBoxTab();
        app.fillFullName(FullName);
        app.fillEmail(Email);
        app.fillCurrentAddress(CurAddress);
        app.fillPermanentAddress(PerAddress);
        app.clickOntheSubmitButton();


    }




}
