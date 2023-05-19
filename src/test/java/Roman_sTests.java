import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Roman_sTests extends TestBase{
    @Test
    public void testTextBox(){
        app.getQA().clickToElements();
        app.getQA().clickTextBox();
        app.getQA().fillFullNameTextBox("Roman Kumarbaev");
        app.getQA().fillEmailTextBox("test@test.com");
        app.getQA().fillCurrentAddressTextBox("777555, Congo, Ulan-Bator, Pushkina-Dom Kolotushkina");
        app.getQA().fillPermanentAddressTextBox("111222, USA, Petah-tiqva, Tumba-umba 6-98");
        app.getQA().clickTotheSubmitButtonTextBox();
        app.getQA().resultsTestTextBox();
        app.getQA().pause(1500);
    }
    @Test
    public void testRadioButton(){
        app.getQA().clickToElements();
        app.getQA().clickToRadioButton();
        app.getQA().clickToTheRadiobuttonYes();
        app.getQA().pause(1000);
        app.getQA().clickToTheRadiobuttonImpressive();
        app.getQA().pause(1000);
        app.getQA().isClicable();
        app.getQA().pause(1000);
       // app.getQA().resultsTestRadioButton();

    }
    /*
    @Test
    public void buttons(){
        app.getQA().clickToButtons();
        app.getQA().doubleClick();
        app.getQA().rightClick();
        app.getQA().clickMe();
    }*/


}
