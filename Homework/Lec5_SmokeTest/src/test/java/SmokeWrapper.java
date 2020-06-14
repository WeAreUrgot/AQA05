import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SmokeWrapper {
    private String driverPath = "\\GitRep\\AQA05\\TestSelenium\\src\\driver\\chromedriver.exe";
    public ChromeDriver driver;

    @BeforeTest
    public void opn() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    @AfterTest
    public void cls() {
        driver.quit();
    }
}
