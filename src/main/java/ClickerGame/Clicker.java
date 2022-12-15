package ClickerGame;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicker {

    static WebDriver driver;

    public static void main(String[] args) {

        //Setup WebDriver and system properties
        WebDriverManager.chromedriver().setup();

        //Instantiate the WebDriver
        driver = new ChromeDriver();

        //Create instance of class
        GameClasses gameClicker = new GameClasses(driver);

        //Open up the clicker game
        driver.get("https://www.tetralark.com/ClickerJs/");

        //Test if the page open by getting the title
        //System.out.println(driver.getTitle());

        int total = 0;

        //While loop to continue the program until the score has been reached.
        while (total <= 1000) {

            gameClicker.clickButton.click();

            if (total > 10) {
                gameClicker.slowClick.click();
            }
            //Test to see if the button is being clicked by showing on output
            //System.out.println("Clicked");
            total++;
        }

        //Close the Webpage once loop has finish
        driver.quit();

        System.out.println("Total clicked: " + total);
    }

}
