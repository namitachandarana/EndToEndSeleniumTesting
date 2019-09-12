import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//This program is not working as expected as the website has changed considerably to what is shown in the lecture 52
public class makemytrip {

    //Auto suggestive drop downs
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        /*
        WebElement sourceLocation = driver.findElement(By.id("fromCity"));
        Thread.sleep(3000);
        //driver.findElement(By.id("fromCity")).clear();
        sourceLocation.sendKeys("DEL");
        Thread.sleep(5000);
        //driver.findElement(By.id("fromCity")).sendKeys(Keys.ARROW_DOWN);
        sourceLocation.sendKeys(Keys.TAB);

        WebElement destinationLocation = driver.findElement(By.id("toCity"));
        Thread.sleep(3000);
        destinationLocation.sendKeys("MUM");
        Thread.sleep(5000);
        destinationLocation.sendKeys(Keys.ARROW_DOWN);
        destinationLocation.sendKeys(Keys.TAB);
*/

        //Check boxes
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.linkText("SEARCH")).click();
        driver.findElement(By.xpath("//*[@id=\"stop_group\"]/span[1]/label/span[1]/span")).click();

    }
}