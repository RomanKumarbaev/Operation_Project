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
// Roman's add
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        app.stop();

    }



}
