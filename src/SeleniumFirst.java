import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirst {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.edgedriver.driver", "C:\\Users\\saira\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        // Initialize a new instance of ChromeDriver
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saira\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open a website
        driver.get("https://www.youtube.com");

        // Print the title of the page
        System.out.println("Title: " + driver.getTitle());
        System.out.println("page:"+ driver.getCurrentUrl());

        // Close the browser
       driver.quit();
    }
} 