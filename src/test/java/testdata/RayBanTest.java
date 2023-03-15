package testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RayBanTest {
    @Test
    public void TestGetUrl() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ray-ban.com/canada/en");

        driver.manage().window().maximize();

        WebElement closePopUp = driver.findElement(By.xpath("//div[@class='close-icon']"));
        closePopUp.click();

        WebElement buttonSearch = driver.findElement(By.xpath("//span[@class='common__icon common__icon--search']"));
        buttonSearch.click();

        WebElement buttonCloseSearch = driver.findElement(By.xpath("//div[@class='rb-btn__toggle']//span[@class='common__icon common__icon--delete']"));
        buttonCloseSearch.click();

        WebElement buttonAccount = driver.findElement(By.xpath("//button[@data-element-id='X_X_MainNav_Account']"));
        buttonAccount.click();

        driver.quit();
    }
}
