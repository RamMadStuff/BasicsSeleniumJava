import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

    public static void main(String[] args) {
        // Set the system property for EdgeDriver
        System.setProperty("webdriver.edge.driver", "C:\\Users\\saira\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        
        // Initialize the EdgeDriver
        WebDriver driver = new EdgeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Open the website
        driver.get("https://auth.ultimatix.net/utxLogin/login?TYPE=33554432&REALMOID=06-000e128c-664b-1c1a-9ba7-abcac0a8f081&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-EdbHMX6T%2bWb8DN7DVmL5sbY%2bn%2b30S7n%2fgIBptYa9dLbudResX4AYm9ObPeNozoDH&TARGET=-SM-https%3a%2f%2fwww%2eultimatix%2enet%2futxHomeApp%2fredirectToHome");

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        
        // Locate the form element and input the value
        driver.findElement(By.id("form1")).sendKeys("1995367");

        // Locate the button element and click it
        driver.findElement(By.id("proceed-button")).click();
        
        driver.findElement(By.id("auth-code-btn")).click();
        
    }
}
