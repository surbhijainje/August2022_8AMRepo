package amazon;
import java.util.Iterator;
import java.util.Set;
//searching item on amazon
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class amazon1 {

	
	
		
		static WebDriver driver;
		Actions a;

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\surbh\\Desktop\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();

			// selecting Home & kitchen section
			driver.findElement(By.name("url")).sendKeys("Home & Kitchen");
			Thread.sleep(3000);

			// in above section select Home decor items
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Paradigm Pictures Home Decoration");
			Thread.sleep(3000);

			// click on it
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(3000);

			// clicking one item in Home decor items
			WebElement Element = driver.findElement(By.linkText(
					"Paradigm Pictures Home Decoration Items Wind Chimes for Home (Golden,Pipe & Hanging Bells)"));
			Element.click();
			
			String mainWindowHandle = driver.getWindowHandle();
			
			String childWindowName = switchToChildWindow();
			

			WebElement element = driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@id='add-to-cart-button']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500); 
			
			// clicking on cart option
			driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@id='add-to-cart-button']")).click();
			
			Thread.sleep(2000);
			
			String confirmationMsg = driver.findElement(By.xpath("//div[@id='sw-atc-confirmation']//child::div[contains(@class,'sw-atc-message')]")).getText();
			if(confirmationMsg.equals("Added to Cart")) {
				System.out.println("Product Added successfully");
			}
			
			//close second window
			driver.switchTo().window(childWindowName).close();
			
			//switch to parent window
			driver.switchTo().window(mainWindowHandle);
			
			WebElement Element1 = driver.findElement(By.linkText(
					"PARADIGM PICTURES Wood Metal Wind Chime (Multicolour, 30 Inch)"));
			Element1.click();
			
		}
		
		private  static String switchToChildWindow() {
			 String mainWindowHandle = driver.getWindowHandle();
		     Set<String> allWindowHandles = driver.getWindowHandles();
		     Iterator<String> iterator = allWindowHandles.iterator();
		     String ChildWindow = null;
	        // Here we will check if child window has other child windows and will fetch the heading of the child window
	        while (iterator.hasNext()) {
	             ChildWindow = iterator.next();
	                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	                driver.switchTo().window(ChildWindow);
	              
	            }
	        }
	        
	        return ChildWindow;
		}
	}
