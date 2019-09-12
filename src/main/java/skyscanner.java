import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class skyscanner {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.skyscanner.net/");
        //The below code gets the id of the button to click on
        driver.findElement(By.id("CabinClassTravellersSelector_fsc-class-travellers-trigger__18yAY")).click();
        Thread.sleep(2000L);
        //int i = 1;
        //WHile loop only stops when the condition becomes false
        /*
        while(i < 5)
        {
            driver.findElement(By.xpath("//*[@id=\"cabin-class-travellers-popover\"]/div/div/div[2]/div/button[2]")).click();
            i++; // This is an important step as this will increment i. if this is not present then loop will run infinitely as i will always be 1 as that is what we have initialised i as before starting the while loop
            //i is 1 because 1 adult is selected by default
        }
*/
        for(int i=1;i<5;i++)
        {
            driver.findElement(By.xpath("//*[@id=\"cabin-class-travellers-popover\"]/div/div/div[2]/div/button[2]")).click();
        }

        driver.findElement(By.xpath("//*[text() = 'Done']")).click();


    }
}
