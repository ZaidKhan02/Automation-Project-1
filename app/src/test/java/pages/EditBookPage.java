package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditBookPage extends BasePage {

    public EditBookPage(WebDriver driver) {
        super(driver);
    }

    By pageHeader = By.cssSelector("//div[@id='contentHead']//h1");

    public String getPageHeader() {
        return getText(pageHeader);
    }
}
