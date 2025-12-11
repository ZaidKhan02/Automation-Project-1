package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookPage extends BasePage {

    public BookPage(WebDriver driver) {
        super(driver);
    }

    By editBtn = By.xpath("//div[@class='editButton']//a[@title='Edit this page']");

    public void clickEditBtn() {
        click(editBtn);
    }

}
