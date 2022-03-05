package demo_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_case_1 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Pradeep_Selenuim\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("9527108777");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("9527108777");
		driver.findElement(By.name("login")).click();
		
		String fb = driver.getTitle();
		System.out.println("The title is"+fb);
		driver.close();
		


	}

}
