import org.openqa.selenium.By;
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

        app.getHUBE().clickOnElements();

        app.getHUBE().OpenTextBox();
        app.getHUBE().fillForm("Evgeny Piyanzin","Pivivar555@yandex.ru",
                "Ashkelon, Ben-Gurion 5","Gaza , Hamas");
        app.getHUBE().clickSubmit();








    }




}
