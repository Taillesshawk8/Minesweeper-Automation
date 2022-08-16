package apptests;

import Roman.RomanBase;
import applications.minesweeper.MinesweeperApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class MinesweeperTests extends RomanBase {

    @BeforeEach
    public void setup(){
        roman()._driver = roman().selenium.getChromeDriver();
        roman()._driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void demo(){
        MinesweeperApplication app = new MinesweeperApplication(roman());
        app.homePage.setCustomGrid();
        app.beginner.randomSelect();
        app.beginner.randomSelect();
    }
}