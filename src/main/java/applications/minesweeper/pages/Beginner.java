package applications.minesweeper.pages;

import Roman.Roman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.Selenium;

import java.util.Random;

public class Beginner extends Selenium {

    private final Roman roman;

    public Beginner(Roman roman){
        super(roman);
        this.roman = roman;
    }

    @Override
    protected String get_uri() {
        return null;
    }

    @Override
    public boolean waitForDisplayed() {
        return false;
    }

    private By cell = null;

    public void randomSelect(){
        Random random = new Random();
        int x = random.nextInt(4);
        int y = random.nextInt(4);
        WebElement cellSpace = _driver.findElement(By.xpath("//div[@id='cell_"+x+"_"+y+"'][@class='cell size24 hd_closed']"));
        Actions cell = new Actions(_driver);
        cell.click(cellSpace).perform();
    }
}