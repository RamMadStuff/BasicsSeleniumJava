import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class CalenderAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		String month =	"11";
		String date = "2";
		String year = "2024";
		String[] expectedList= {month,date,year}; 
		driver.findElement(By.xpath("//input[@name='month']")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='2024']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__tile--now react-calendar__tile--hasActive react-calendar__year-view__months__month']")).click();
		driver.findElement(By.xpath("//button[6]")).click();
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));


		for(int i =0; i<actualList.size();i++)

		{

		System.out.println(actualList.get(i).getAttribute("value"));

		Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);

		}
		
		

}
} 


//another chat GPT 
/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CalendarAutomation {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        String targetDate = "02";
        String targetMonth = "November";
        String targetYear = "1998";

        // Open the calendar
        driver.findElement(By.xpath("//input[@placeholder='Choose Date']")).click();

        // Select year
        while (!driver.findElement(By.className("react-calendar__navigation__label")).getText().contains(targetYear)) {
            driver.findElement(By.className("react-calendar__navigation__prev-button")).click();
        }

        // Select month
        while (!driver.findElement(By.className("react-calendar__navigation__label")).getText().contains(targetMonth)) {
            driver.findElement(By.className("react-calendar__navigation__prev-button")).click();
        }

        // Select date
        driver.findElement(By.xpath("//button[normalize-space()='" + targetDate + "']")).click();

        // Verify the selected date
        String selectedDate = driver.findElement(By.xpath("//input[@placeholder='Choose Date']")).getAttribute("value");
        System.out.println("Selected Date: " + selectedDate);

        driver.quit();
    }
}*/

