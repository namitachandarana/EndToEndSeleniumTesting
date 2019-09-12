import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Dynamic drop downs and stati dropdowns
public class spicejet {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L); // Important step test fails without this
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000); //2 secs or 2000milliseconds
        ///The below line finds the code 2 matches for the value MAA, so if [2] index is not specified
       // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        //Alternative to line 21 as some clients dont like using indexing in searching for elements
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
    }

    //a[@value='']
    //a[@
}
