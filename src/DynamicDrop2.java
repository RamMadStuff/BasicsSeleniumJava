import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDrop2 {

    public static void main(String[] args) {
        // Set up WebDriver and maximize the window
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Open the website
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");

        // Initialize WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the origin dropdown is clickable and click it
        WebElement originDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
        originDropdown.click();

        // Wait until the Hyderabad option is clickable and click it
        WebElement hyderabadOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@value='HYD']")));
        hyderabadOption.click();

        // Wait until the Chennai option is clickable and click it
        WebElement chennaiOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@value='MAA'])[1]")));
        chennaiOption.click();

        // Close the browser
        driver.quit(); 
    }
}
