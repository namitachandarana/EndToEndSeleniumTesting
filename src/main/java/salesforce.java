import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.name("pw")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
        // This will throw an error as the class name has spaces
        // driver.findElement(By.className("button r4 wide primary")).click();
        driver.findElement(By.xpath("//*[@id='forgot_password_link']")).click();//*[@id="forgot_password_link"]
       driver.close();
    }
}


/*This class is about 3 drivers to use to test on 2 different browsers and close the browser once done
 * Difference between close and quit is close: closes current browsers, quit: closes all the browsers opened by selenium browser
 * */