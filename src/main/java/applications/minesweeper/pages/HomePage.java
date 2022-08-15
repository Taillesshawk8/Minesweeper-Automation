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
    private final WebElement width = _driver.findElement(By.xpath("//input[@id='custom_width']"));
    private final WebElement Height = _driver.findElement(By.xpath("//input[@id='custom_height']"));
    private final WebElement Mines = _driver.findElement(By.xpath("//input[@id='custom_mines']"));
    private final By updateBtn = By.xpath("//button[@id='level_update_btn']");

    public void difficultyBeginner(){
        navigateTo();
        click(standardMode);
    }
     public void setCustomGrid(){
        navigateTo();
        click(standardMode);
        click(customBtn);
        width.clear();
        width.sendKeys("3");
        Height.clear();
        Height.sendKeys("3");
        Mines.clear();
        Mines.sendKeys("1");
        click(updateBtn);
     }
}
