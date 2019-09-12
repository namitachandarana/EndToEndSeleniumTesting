import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ticketstoindia {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ticketstoindia.co.uk");
        Select select = new Select(driver.findElement(By.id("FAdult")));
        select.selectByValue("2");
        select.selectByIndex(5);
        select.selectByVisibleText("9");

        driver.get("https://www.skyscanner.net/");
        //The below code gets the id of the button to click on
        driver.findElement(By.id("CabinClassTravellersSelector_fsc-class-travellers-trigger__18yAY")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"cabin-class-travellers-popover\"]/div/div/div[2]/div/button[2]")).click();
    }}
//Select tag in the code indicates static drop down
///select class has own set of methods
// there should be option tag under select class
