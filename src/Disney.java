import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disney {

    public static void main(String[] args) throws InterruptedException {
        // Set system property for ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the Hotstar website
        driver.get("https://www.hotstar.com/in/onboarding/profile?ref=%2Fin");

        // Wait for the element to be clickable
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@decoding='async'])[3]")));
        Thread.sleep(2000L);

        // Click on the specified image
        driver.findElement(By.xpath("(//img[@decoding='async'])[3]")).click();

        // Perform other actions if needed
        // ...

        // Quit the driver
        driver.quit();
    }
}

