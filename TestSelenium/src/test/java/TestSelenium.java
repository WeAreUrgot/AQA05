import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium {

    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "\\Users\\Tom\\IdeaProjects\\TestSelenium\\src\\driver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");

        //Ввод веса
        WebElement weight = driver.findElementByName("wg");
        weight.sendKeys("37.2");

        //Ввод роста
        WebElement height = driver.findElementByName("ht");
        height.sendKeys("140");

        //Нажать кнопку Рассчитать
        WebElement click = driver.findElementByName("cc");
        click.click();




    }
}
