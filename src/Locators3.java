import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;

public class Locators3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
System.setProperty("webdriver.edge.driver", "C:\\Users\\saira\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        
        // Initialize the EdgeDriver
        WebDriver driver = new EdgeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        
        // Locate the form element and input the value
        driver.findElement(By.id("inputUsername")).sendKeys("sairam");
        
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p[style*='color']")).getText());
        

	}

}
 