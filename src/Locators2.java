import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\Users\\saira\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        
        // Initialize the EdgeDriver
        WebDriver driver = new EdgeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//   // Create a WebDriverWait instance

        // Open the website
        
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        
        // Locate the form element and input the value
        driver.findElement(By.id("inputUsername")).sendKeys("sairam");
        
        driver.findElement(By.name("inputPassword")).sendKeys("rahul"); 
        

        // Locate the button element and click it
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//p.error syntax for css selector and getText to get error text
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ram");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ram@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("sai@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("8978249949");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//*[text()='Go to Login']")).click();////button[text()='Go to Login']
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("ram");
        driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
        driver.findElement(By.className("signInBtn")).click();
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        
        
        //driver.quit();
	 } 

}
