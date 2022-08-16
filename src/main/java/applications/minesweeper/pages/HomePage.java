package applications.minesweeper.pages;

import Roman.Roman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.Selenium;

public class HomePage extends Selenium {

    public HomePage(Roman roman){
        super(roman);
    }

    @Override
    protected String get_uri() {
        return "https://minesweeper.online/";
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }

    private final By standardMode = By.xpath("//span[text()='Standard mode']");
    private final By customBtn = By.xpath("//div[@id='levels_full']//span[text()='Custom']");
    private final By width = By.xpath("//input[@id='custom_width']");
    private final By Height = By.xpath("//input[@id='custom_height']");
    private final By Mines = By.xpath("//input[@id='custom_mines']");
    private final By updateBtn = By.xpath("//button[@id='level_update_btn']");

    public void difficultyBeginner(){
        navigateTo();
        click(standardMode);
    }
     public void setCustomGrid(){
        navigateTo();
        click(standardMode);
        click(customBtn);
        clear(width);
        sendKeys(width,"3");
        clear(Height);
        sendKeys(Height,"3");
        clear(Mines);
        sendKeys(Mines,"1");
        click(updateBtn);
     }
}
