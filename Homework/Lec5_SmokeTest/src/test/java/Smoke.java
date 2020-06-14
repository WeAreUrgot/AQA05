import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Smoke extends SmokeWrapper {

    @Test
    public void underSmoke() {
        String wgValue = "40";
        String htValue = "158";
        String siValue = "16.02";
        String usValue = "16.29";
        String ukValue = "101.73";
        String resValue = "Your category is Underweight";

        //  1.Открыть сайт https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");

        //  2.Ввести Weight 40 kg
        WebElement weight = driver.findElement(By.name("wg"));
        weight.sendKeys(wgValue);

        //  3.Ввести Height 158
        WebElement height = driver.findElement(By.name("ht"));
        height.sendKeys(htValue);

        //  4.Нажать на кнопку ‘Calculate’
        WebElement click = driver.findElement(By.name("cc"));
        click.click();

        //  5.Проверить значение в поле 'SI Units’ 16.02
        WebElement siUnits = driver.findElement(By.name("si"));
        Assert.assertEquals(siUnits.getAttribute("value"), siValue);

        //  6.Проверить значение в поле 'US Units’ 16.29
        WebElement usUnits = driver.findElement(By.name("us"));
        Assert.assertEquals(usUnits.getAttribute("value"), usValue);

        //  7.Проверить значение в поле ’UK Units’ 101.73
        WebElement ukUnits = driver.findElement(By.name("uk"));
        Assert.assertEquals(ukUnits.getAttribute("value"), ukValue);

        //  8.Проверить статус "Your category is Underweight"
        WebElement status = driver.findElement(By.name("desc"));
        Assert.assertEquals(status.getAttribute("value"), resValue);
    }

    @Test
    public void normalSmoke() {
        String wtValue = "70";
        String wtPound = "pounds";
        String htFrstValue = "5";
        String htScndValue = "6";
        String siValue = "11.27";
        String usValue = "11.46";
        String ukValue = "71.58";
        String resValue = "Your category is Normal";

        //  1.Открыть сайт https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");

        //  2.Ввести Weight 70 pounds
        WebElement pounds = driver.findElement(By.name("opt1"));

        Select poundsValue = new Select(pounds);
        poundsValue.selectByVisibleText(wtPound);

        WebElement weight = driver.findElement(By.name("wg"));
        weight.clear();
        weight.sendKeys(wtValue);

        //  3.Ввести Height 5’ 6’’
        WebElement dropHtFirst = driver.findElement(By.name("opt2"));
        Select heightFirst = new Select(dropHtFirst);
        heightFirst.selectByValue(htFrstValue);

        WebElement dropHtSecond = driver.findElement(By.name("opt3"));
        Select heightSecond = new Select(dropHtSecond);
        heightSecond.selectByValue(htScndValue);

        //  4.Нажать на кнопку ‘Calculate’
        WebElement click = driver.findElement(By.name("cc"));
        click.click();

        //  5.Проверить значение в поле 'SI Units’ 11.27
        WebElement siUnits = driver.findElement(By.name("si"));
        Assert.assertEquals(siUnits.getAttribute("value"), siValue);

        //  6.Проверить значение в поле 'US Units’  11.46
        WebElement usUnits = driver.findElement(By.name("us"));
        Assert.assertEquals(usUnits.getAttribute("value"), usValue);

        //  7.Проверить значение в поле ’UK Units’ 71.58
        WebElement ukUnits = driver.findElement(By.name("uk"));
        Assert.assertEquals(ukUnits.getAttribute("value"), ukValue);

        //  8.Проверить статус Your category is Normal
        WebElement status = driver.findElement(By.name("desc"));
        Assert.assertEquals(status.getAttribute("value"), resValue);
    }
}