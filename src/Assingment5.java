import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assingment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		
		 // Switch to the parent frame
        driver.switchTo().frame("frame-top");

        // Switch to the middle frame
        driver.switchTo().frame("frame-middle");
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());

	}

}
