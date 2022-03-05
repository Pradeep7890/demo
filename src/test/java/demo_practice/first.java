package demo_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {


    public static void main(String[] args) {
   	 System.setProperty("Webdriver.Chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Pradeep_Selenuim\\chromedriver.exe");
   		

       WebDriver driver = new ChromeDriver();       
       driver.manage().window().maximize();        
       driver.manage().deleteAllCookies(); 
       driver.get("https://www.Amazon.in");
       
       String amz = driver.getTitle();
       System.out.println("the title of amazon is "+amz);
    }
}
