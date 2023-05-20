import manager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;

public class TestBase {
    protected static ApplicationManager app =
            new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

// Roman's add
    @BeforeMethod(alwaysRun = true)
    public void setUp() {

        app.init();


    }
<<<<<<< HEAD

  @AfterSuite(alwaysRun = true)
   public void tearDown() {
       app.stop();
=======
// Roman's add
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        app.stop();
>>>>>>> 71fcf585bd6c0a4b80f2dd3df1a51c426573b8a0

    }



}
