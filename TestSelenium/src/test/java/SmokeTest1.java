import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SmokeTest1 {

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "\\GitRep\\AQA05\\TestSelenium\\src\\driver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://3crkp.by/информация/полезно-знать/медицинские-калькуляторы/расчет-имт");

        WebElement height = driver.findElement(By.name("ht"));

        WebElement weight = driver.findElement(By.name("mass"));

        WebElement calculate = driver.findElement(By.cssSelector("input[type = 'button']"));

        WebElement button = driver.findElement(By.name("result"));

        WebElement imt = driver.findElement(By.id("resline"));



        driver.quit();
    }
}
