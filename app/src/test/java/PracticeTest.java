import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTest {

    @Test
    public void loginTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = "https://automationexercise.com/login";
        driver.get(url);
        WebElement emailField = driver.findElement(By.cssSelector("input[name='email']"));
        emailField.clear();
        emailField.sendKeys("zaidlovesmath@gmail.com");
        WebElement passwordField = driver.findElement(By.cssSelector("input[name='password']"));
        passwordField.clear();
        passwordField.sendKeys("zaidkhanpassword");
        WebElement loginBtn = driver.findElement(By.cssSelector("button[data-qa='login-button']"));
        loginBtn.click();
        Thread.sleep(2000);
        WebElement logout = driver.findElement(By.cssSelector("[href='/logout']"));
        Assert.assertTrue(logout.isDisplayed());
        driver.quit();
    }
}
