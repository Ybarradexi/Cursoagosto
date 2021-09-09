package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjemploSelenium {
	
		public static void main(String[] args) throws InterruptedException {
			String exePath = "./driver/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/"); // Inicializar Chrome la URL especificada
			driver.manage().window().maximize(); //Maximizar Ventana
			
			// Obteniendo Objetos // WebElements de la pagina 
			WebElement userName = driver.findElement(By.id ("txtUsername"));
			WebElement password = driver.findElement(By.id ("txtPassword"));
			WebElement loginBtn = driver.findElement(By.id("btnLogin"));
			
			
			//Login
			
			userName.sendKeys("Admin");
			Thread.sleep(2000);
			password.sendKeys("admin123");
			Thread.sleep(2000);
			loginBtn.click();
			Thread.sleep(2000);
			
		}
		
}
