package Seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Yocket {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");//Chrome Driver Path
		WebDriver driver=new ChromeDriver();//launch chrome.
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://yocket.com/");//Navigate to yocket website.
		
		String title = driver.getTitle();
		System.out.println(title);
		//verify that navigation is correct or not.
		if(title.equals("Yocket: Overseas Education Consultants to Assist You in Your Higher Education Abroad | Yocket"))
		{ 
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		Thread.sleep(20000);
		driver.findElement(By.linkText("College Finder")).click();
		//Verify that the page navigate to College Finder or not.
		String title1 = driver.getTitle();
		System.out.println(title1);
		if(title1.equals("University Finder: Find the Best Suited Colleges & Universities to Study Abroad | Yocket"))
		{ 
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		Thread.sleep(20000);
		driver.findElement(By.linkText("Masters")).click();
		//Verify that the page navigate to Masters Section or not.
		String title2 = driver.getTitle();
		System.out.println(title2);
		if(title2.equals("Masters (MS) University Finder: Find the Best Suited Colleges & Universities to Study MS Abroad | Yocket"))
		{ 
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
	
		Thread.sleep(15000);
		driver.findElement(By.id("vs1__combobox")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='vs1__combobox']//div[1]//input")).sendKeys("Canada");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='vs1__combobox']//div[1]//input")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='vs2__combobox']//div[1]//input")).sendKeys("Computational Mathematics");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='vs2__combobox']//div[1]//input")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		driver.switchTo().activeElement();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).sendKeys(Keys.ENTER);;
		Thread.sleep(6000);
		
		driver.findElement(By.id("vs4__combobox")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='vs4__combobox']//div[1]//input")).sendKeys("Hansraj College");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='vs4__combobox']//div[1]//input")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		driver.findElement(By.id("vs6__combobox")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='vs6__combobox']//div[1]//input")).sendKeys("Computational Mathematics");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='vs6__combobox']//div[1]//input")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='marks']")).sendKeys("6");
		Thread.sleep(6000);
		driver.switchTo().activeElement();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).sendKeys(Keys.ENTER);;
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("(//div[@class='text-sm'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='toefl_overall_score']")).sendKeys("60");
		Thread.sleep(6000);
		//WebElement content1=driver.findElement(By.xpath("//*[@id='siqiframe']"));
		//driver.switchTo().frame(content1);
		//Thread.sleep(6000);
		WebElement test = driver.findElement(By.xpath("//div[text()='GMAT']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", test);
		//driver.findElement(By.xpath("//div[text()='GMAT']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='total_gmat_score']")).sendKeys("500");
		Thread.sleep(5000);
		driver.switchTo().activeElement();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).sendKeys(Keys.ENTER);;
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id='work_exp']")).sendKeys("6");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='text-sm'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='project']")).sendKeys("5");
		Thread.sleep(5000);
		driver.switchTo().activeElement();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).sendKeys(Keys.ENTER);;
		Thread.sleep(6000);
		
	    driver.quit();//Close the window

	}

}
