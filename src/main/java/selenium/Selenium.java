package selenium;

import Roman.Roman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class Selenium extends AbstractPage {

    public Selenium(Roman roman){
        super(roman);
    }

    public void leftClick(By by){
        Actions actions = new Actions(_driver);
        actions.click(_driver.findElement(by));
    }

    public void clear(By by){
        Actions actions = new Actions(_driver);
        WebElement space = _driver.findElement(by);
        space.clear();
    }
}
