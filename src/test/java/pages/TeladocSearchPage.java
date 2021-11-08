package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TeladocSearchPage {
    public TeladocSearchPage(){
        WebDriver driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@current-page='currentPage']")
    public WebElement currentPage;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> userData;

}
