import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com");
        driver.findElement(By.id("email")).sendKeys("testmail@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("test");
        driver.findElement(By.linkText("Forgotten account?")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pass");
        driver.findElement(By.cssSelector("input[value='Search']")).click();
    }
}
