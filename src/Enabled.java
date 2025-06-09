
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Enabled {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		System.out.println(driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_IndArm]")).isSelected());
		driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_IndArm]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_IndArm]")).isSelected());
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled();
		System.out.println(driver.findElement(By.cssSelector("#Div1")).getAttribute("style"));
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.cssSelector("#Div1")).getAttribute("style"));
		
		//driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled();
		
		if(driver.findElement(By.cssSelector("#Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("enabled");
			Assert.assertTrue(true);
			
		} 
		else
		{
			System.out.println("Disabled");
			Assert.assertTrue(false);
		}
		
		
		
		
		
		 driver.quit();
		
		
		
		

	}

}
