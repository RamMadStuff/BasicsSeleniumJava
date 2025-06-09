import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot2 {

    public static void main(String[] args) throws IOException {
        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        // Navigate to the website
        driver.get("http://google.com");

        // Take a screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        // Save the screenshot with a proper file name and extension
        FileUtils.copyFile(src, new File("C:\\Users\\saira\\OneDrive\\Desktop\\PYTHON\\screenshot.png"));
        
        System.out.println("Screenshot taken successfully!");
        
        // Close the browser
        driver.quit();
    }
}
