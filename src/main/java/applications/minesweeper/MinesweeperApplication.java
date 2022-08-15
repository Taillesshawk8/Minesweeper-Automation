package applications.minesweeper;

import Roman.Roman;
import applications.minesweeper.pages.Beginner;
import applications.minesweeper.pages.HomePage;

public class MinesweeperApplication {
    public HomePage homePage;
    public Beginner beginner;

    public MinesweeperApplication(Roman roman){
        homePage = new HomePage(roman);
        beginner = new Beginner(roman);
    }
}
