import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class qaclickacademy {
    public static void main (String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com");
        //Click on Interview Guide
        driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"tablist1-tab1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"tablist1-tab2\"]")).click();
        //driver.findElement(By.xpath("//*[@id='tablist1-tab2']/following-sibling::li[1]")).getTagName();
        driver.findElement(By.xpath("//*[text() = ' Soap UI ']")).click();

    }
}
//*[@id=\"homepage\"]/header/section/div/div/div/div/ul/li[1]
//*[@id="tablist1-tab1"]

//*[@id="tablist1-tab2"]