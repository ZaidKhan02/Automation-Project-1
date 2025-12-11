package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    By wantToReadLink = By.xpath("//a[contains(@href, 'want-to-read')]");

    public void clickWantToReadLink() {
        click(wantToReadLink);
    }

}
