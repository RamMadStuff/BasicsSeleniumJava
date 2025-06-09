import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.edge.EdgeDriver;



public class autosuggestion2 {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub



//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

//WebDriver driver =new ChromeDriver();
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

driver.findElement(By.id("autosuggest")).sendKeys("ind");

Thread.sleep(3000);

List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

//The reason you're not able to print all options is likely because the condition inside your
//if statement checks for "India", and when it finds "India", it clicks the option and might trigger 
//a page reload or some other interaction, potentially halting further printing of options.

//If you want to print all options regardless of whether "India" is found and clicked,
//you need to separate the logic for printing from the logic for clicking. 
//You can print the options in one pass and click in a second pass (if needed). 
//Alternatively, if clicking an option like "India" reloads the page, 
//you may want to finish printing all options first, then click "India" at the end.

//Here’s how you can modify the code to ensure that all options are printed and "India" is clicked:

//Print all options first
for (int i = 0; i < options.size(); i++) {
 WebElement option = options.get(i);
 System.out.println(option.getText());
}

//Click "India" after printing all options
for (int i = 0; i < options.size(); i++) {
 WebElement option = options.get(i);

 if (option.getText().equalsIgnoreCase("India")) {
     option.click(); 
     System.out.println("Clicked successfully: " + option.getText());
     break; // Exit the loop after clicking "India"
 }
}

}



}