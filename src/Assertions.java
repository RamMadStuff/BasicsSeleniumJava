import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "sairam";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saira\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String passoword = getPassword(driver);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        
        // Locate the form element and input the value 
        driver.findElement(By.id("inputUsername")).sendKeys("sairam");
        driver.findElement(By.name("inputPassword")).sendKeys(passoword);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p[style*='color']")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("p[style*='color']")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Hello " +name+",");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();
	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1500);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText=driver.findElement(By.cssSelector("form p")).getText();
      //Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray = passwordText.split("'");
        String password = passwordArray[1].split("'")[0];
        return password;
        
        
		
	}

}
