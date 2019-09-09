import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ObjectCreation {

    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        //System.setProperty("webdriver.ie.driver", "C:\\MicrosoftWebDriver.exe");
        // The above line gives details of the driver
        //WebDriver driver = new ChromeDriver(); //Give you IDE info of which browser you are using
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new InternetExplorerDriver();
        driver.get("http:\\google.com");
        System.out.println(driver.getTitle()); // Prints the page title
        System.out.println(driver.getCurrentUrl()); //Validates that the current url and the one i asked the program to browse to are the same
        //System.out.println(driver.getPageSource());
        driver.get("http://yahoo.com");
        driver.navigate().back();
        driver.close();
        //driver.quit();
    }
}


/*This class is about 3 drivers to use to test on 2 different browsers and close the browser once done
* Difference between close and quit is close: closes current browsers, quit: closes all the browsers opened by selenium browser
* */