import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
        //driver.findElement(By.cssSelector("input#password")).sendKeys("Goodbye");
        driver.findElement(By.xpath("//input[contains(@id, 'pass')]")).sendKeys("Goodbye");
        driver.findElement(By.xpath("//input[contains(@name, 'proc')]")).click();

    }
}


/*This class is about 3 drivers to use to test on 2 different browsers and close the browser once done
 * Difference between close and quit is close: closes current browsers, quit: closes all the browsers opened by selenium browser
 * */