package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WantToReadPage extends BasePage {

    public WantToReadPage(WebDriver driver) {
        super(driver);
    }

    By bookName = By.xpath("//li[contains(@class, 'searchResultItem')][1]//h3//a");

    public String getBookName() {
        return getText(bookName);
    }
}
