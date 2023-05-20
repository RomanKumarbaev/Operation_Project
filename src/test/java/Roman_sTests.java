
import org.testng.annotations.Test;

import java.io.IOException;

public class Roman_sTests extends TestBase {
    @Test
    public void testTextBoxTest() {
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
    public void testRadioButtonTest() {
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

    @Test
    public void buttonsTest(){
        app.getQA().clickToElements();
        app.getQA().clickToButtons();
        app.getQA().doubleClick();
        app.getQA().pause(1000);
        app.getQA().rightClick();
        app.getQA().pause(1000);
        app.getQA().clickMe();
    }
    @Test
    public void uploadDownloadTest() throws IOException {
        app.getQA().clickToElements();
        app.getQA().pause(2000);
        app.getQA().clickUploadAndDownload();
        app.getQA().uploadFile("C:\\Users\\User\\Desktop\\Charles1.png");
       // app.getQA().checkDownload();

    }


}
