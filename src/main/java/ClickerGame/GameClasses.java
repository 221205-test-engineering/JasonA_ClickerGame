package ClickerGame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GameClasses {

    public WebDriver driver;

    public GameClasses(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button")
    public WebElement clickButton;

    @FindBy(id = "0")
    public WebElement slowClick;

    @FindBy(id = "1")
    public WebElement OkayClick;
}