import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignament3 {

    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver and maximize the window
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Open the website
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Locate the input fields and send data
        driver.findElement(By.name("name")).sendKeys("sairam");
        driver.findElement(By.name("email")).sendKeys("sairam@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("sairam123");

        // Select checkbox
        driver.findElement(By.id("exampleCheck1")).click();

        // Select from dropdown
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        dropdown.click();
        driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']/option[text()='Male']")).click();// Xpath
        driver.findElement(By.cssSelector("select option:nth-child(1)")).click();//css path
        
        driver.findElement(By.name("bday")).sendKeys("2222222");
        // Submit the form
        driver.findElement(By.cssSelector("input[value='Submit']")).click();
        
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
        
        

        // Closing the driver
        Thread.sleep(3000);  // Adding some delay to view the result
        driver.quit();
    }
}
