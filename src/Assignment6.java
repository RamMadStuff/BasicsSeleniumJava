import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		
		String test = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		System.out.println(test);
		WebElement staicDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staicDropdown);
		dropdown.selectByVisibleText(test);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(test);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String test1 = driver.switchTo().alert().getText();
		System.out.println(test1);
		
		if(test1.contains("Option2"))
		{
			System.out.println("pass");
		}
		
			else
			{
				System.out.println("fail");
		}
		
		driver.switchTo().alert().accept();
		
	
		
		
		
		
		
		
		
	}

}
