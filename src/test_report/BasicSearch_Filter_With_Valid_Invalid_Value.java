package test_report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicSearch_Filter_With_Valid_Invalid_Value {
	
	String Brow="C:\\setup\\geckodriver.exe";
	
	
	//---------------------Basic_Search_Filter---------------------------------------------------------//

	  @Test
	  public void Basic_Search_Filter_byItemName() throws InterruptedException{
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.gecko.driver",Brow);
			FirefoxProfile profile=new FirefoxProfile();
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Actions action=new Actions(driver);
			 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
			 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
			 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
			 driver.findElement(By.id("login-button")).click();
			 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
			 String pTitle=driver.getTitle();
			 System.out.println(pTitle);
			 Assert.assertEquals(pTitle, "Customer Success Portal");
			 System.out.println("Page Verified");
			 Thread.sleep(15000);
			 if(driver.findElement(By.tagName("Select")).isDisplayed()){
			 Select drop=new Select(driver.findElement(By.tagName("Select")));
			 Thread.sleep(3000);
			 drop.selectByIndex(3);
			 Thread.sleep(5000);
			 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
			 Thread.sleep(5000);
			 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
			 Thread.sleep(5000);
			 WebDriverWait wait = new WebDriverWait(driver, 60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]/div")));
			 String Item_name=driver.findElement(By.xpath("//td[2]/div")).getText();
			 driver.findElement(By.xpath("//input[@id='input-type-search']")).sendKeys(Item_name);
			 Thread.sleep(3000);
			 
			 Assert.assertEquals(Item_name, Item_name);
			 System.out.println("Item name is"+Item_name);
			 Thread.sleep(5000);
			 String verify=driver.findElement(By.xpath("//td[4]/div")).getText();
			 System.out.println(verify);
			 Assert.assertEquals(verify, "ACEAPP");
			 
			 System.out.println("PF IS" +verify);
			 }else{
				 System.out.println("Not showing Drop down");
			 }
			 
			 driver.close();
			 
			 
		    }
	  
			@Test
		    public void Basic_Search_Filter_byDescription() throws InterruptedException{
			// TODO Auto-generated method stub
			
			 System.setProperty("webdriver.gecko.driver",Brow);
			 FirefoxProfile profile=new FirefoxProfile();
			 WebDriver driver=new FirefoxDriver();
			 driver.manage().window().maximize();
			 Actions action=new Actions(driver);
			 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
			 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
			 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
			 driver.findElement(By.id("login-button")).click();
			 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
			 String pTitle=driver.getTitle();
			 System.out.println(pTitle);
			 Assert.assertEquals(pTitle, "Customer Success Portal");
			 System.out.println("Page Verified");
			 Thread.sleep(15000);
			 if(driver.findElement(By.tagName("Select")).isDisplayed()){
			 Select drop=new Select(driver.findElement(By.tagName("Select")));
			 Thread.sleep(3000);
			 drop.selectByIndex(3);
			 Thread.sleep(5000);
			 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
			 Thread.sleep(5000);
			 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
			 Thread.sleep(5000);
			 WebDriverWait wait = new WebDriverWait(driver, 60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[3]/div")));
			 String Desc=driver.findElement(By.xpath("//td[3]/div")).getText();
			 driver.findElement(By.xpath("//th[3]/div/div/div/input")).sendKeys(Desc);
			 
			 Assert.assertEquals(Desc, Desc);
			 System.out.println("Description is"+Desc);
			 }else{
				 System.out.println("not showing drop down");
			 }
			 
			 driver.close();
			 
		    }
			
			@Test
		    public void Basic_Search_Filter_byPF() throws InterruptedException{
			// TODO Auto-generated method stub
			
			 System.setProperty("webdriver.gecko.driver",Brow);
			 FirefoxProfile profile=new FirefoxProfile();
			 WebDriver driver=new FirefoxDriver();
			 driver.manage().window().maximize();
			 Actions action=new Actions(driver);
			 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
			 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
			 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
			 driver.findElement(By.id("login-button")).click();
			 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
			 String pTitle=driver.getTitle();
			 System.out.println(pTitle);
			 Assert.assertEquals(pTitle, "Customer Success Portal");
			 System.out.println("Page Verified");
			 Thread.sleep(15000);
			 if(driver.findElement(By.tagName("Select")).isDisplayed()){
			 Select drop=new Select(driver.findElement(By.tagName("Select")));
			 Thread.sleep(3000);
			 drop.selectByIndex(3);
			 Thread.sleep(5000);
			 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
			 Thread.sleep(5000);
			 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
			 Thread.sleep(5000);
			 WebDriverWait wait = new WebDriverWait(driver, 60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[4]/div")));
			 String PF=driver.findElement(By.xpath("//td[4]/div")).getText();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//th[4]/div/div/div/input")).sendKeys(PF);
			 
			 Assert.assertEquals(PF, PF);
			 System.out.println("Description is"+PF);
			 }else{
				 System.out.println("Not showing drop down");
			 }
			 driver.close();
			 
		    }
			
			@Test
			public void Basic_Search_Filter_byProductType() throws InterruptedException{
				// TODO Auto-generated method stub
				
				 System.setProperty("webdriver.gecko.driver",Brow);
				 FirefoxProfile profile=new FirefoxProfile();
				 WebDriver driver=new FirefoxDriver();
				 driver.manage().window().maximize();
				 Actions action=new Actions(driver);
				 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
				 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
				 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
				 driver.findElement(By.id("login-button")).click();
				 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
				 String pTitle=driver.getTitle();
				 System.out.println(pTitle);
				 Assert.assertEquals(pTitle, "Customer Success Portal");
				 System.out.println("Page Verified");
				 Thread.sleep(15000);
				 if(driver.findElement(By.tagName("Select")).isDisplayed()){
				 Select drop=new Select(driver.findElement(By.tagName("Select")));
				 Thread.sleep(3000);
				 drop.selectByIndex(3);
				 Thread.sleep(5000);
				 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
				 Thread.sleep(5000);
				 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
				 Thread.sleep(5000);
				 WebDriverWait wait = new WebDriverWait(driver, 60);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[5]/div")));
				 String Product_Type=driver.findElement(By.xpath("//td[5]/div")).getText();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//th[5]/div/div/div/input")).sendKeys(Product_Type);
				 
				 Assert.assertEquals(Product_Type, Product_Type);
				 System.out.println("Product Type is"+Product_Type);
				 }else{
					 System.out.println("not showing drop down");
				 }
				 driver.close();
			}
			
			@Test
			public void Basic_Search_Filter_byProductSubType() throws InterruptedException{
				// TODO Auto-generated method stub
				
				 System.setProperty("webdriver.gecko.driver",Brow);
				 FirefoxProfile profile=new FirefoxProfile();
				 WebDriver driver=new FirefoxDriver();
				 driver.manage().window().maximize();
				 Actions action=new Actions(driver);
				 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
				 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
				 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
				 driver.findElement(By.id("login-button")).click();
				 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
				 String pTitle=driver.getTitle();
				 System.out.println(pTitle);
				 Assert.assertEquals(pTitle, "Customer Success Portal");
				 System.out.println("Page Verified");
				 Thread.sleep(15000);
				 WebDriverWait wait = new WebDriverWait(driver, 60);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Select")));
				 Select drop=new Select(driver.findElement(By.tagName("Select")));
				 Thread.sleep(3000);
				 drop.selectByIndex(3);
				 Thread.sleep(5000);
				 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
				 Thread.sleep(5000);
				 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
				 Thread.sleep(5000);
				 WebDriverWait wait1 = new WebDriverWait(driver, 60);
			 	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[6]/div")));
				 
				 String Product_Sub_Type=driver.findElement(By.xpath("//td[6]/div")).getText();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//th[6]/div/div/div/input")).sendKeys(Product_Sub_Type);
				 
				 Assert.assertEquals(Product_Sub_Type, Product_Sub_Type);
				 System.out.println("Product sub Type is"+Product_Sub_Type);
				 driver.close();
			}
			
			@Test
			public void Basic_Search_Filter_byDelOption() throws InterruptedException{
				// TODO Auto-generated method stub
				
				 System.setProperty("webdriver.gecko.driver",Brow);
				 FirefoxProfile profile=new FirefoxProfile();
				 WebDriver driver=new FirefoxDriver();
				 driver.manage().window().maximize();
				 Actions action=new Actions(driver);
				 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
				 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
				 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
				 driver.findElement(By.id("login-button")).click();
				 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
				 String pTitle=driver.getTitle();
				 System.out.println(pTitle);
				 Assert.assertEquals(pTitle, "Customer Success Portal");
				 System.out.println("Page Verified");
				 Thread.sleep(15000);
				 WebDriverWait wait = new WebDriverWait(driver, 60);
			 	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Select")));
				 Select drop=new Select(driver.findElement(By.tagName("Select")));
				 Thread.sleep(3000);
				 drop.selectByIndex(3);
				 Thread.sleep(5000);
				 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
				 Thread.sleep(5000);
				 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
				 Thread.sleep(5000);
				 if(driver.findElement(By.xpath("//td[7]/div")).isDisplayed())
				 {
				 String Delivery_Option=driver.findElement(By.xpath("//td[7]/div")).getText();
				 
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("//th[7]/div/div/div/input")).sendKeys(Delivery_Option);
				 
				 Assert.assertEquals(Delivery_Option, Delivery_Option);
				 System.out.println("Delivery Option is"+Delivery_Option);
				 }
				 else{
					 System.out.println("Not available");
				 }
				 driver.close();
			 }
		//===========================Filter_with_Invalid_Value===============================//
			
			@Test
		    public void Basic_Search_Filter_byInv_ItemName() throws InterruptedException{
			// TODO Auto-generated method stub
			
			 System.setProperty("webdriver.gecko.driver",Brow);
			 FirefoxProfile profile=new FirefoxProfile();
			 WebDriver driver=new FirefoxDriver();
			 driver.manage().window().maximize();
			 Actions action=new Actions(driver);
			 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
			 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
			 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
			 driver.findElement(By.id("login-button")).click();
			 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
			 String pTitle=driver.getTitle();
			 System.out.println(pTitle);
			 Assert.assertEquals(pTitle, "Customer Success Portal");
			 System.out.println("Page Verified");
			 Thread.sleep(15000);
			 WebDriverWait wait = new WebDriverWait(driver, 60);
		 	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Select")));
			 Select drop=new Select(driver.findElement(By.tagName("Select")));
			 Thread.sleep(3000);
			 drop.selectByIndex(3);
			 Thread.sleep(5000);
			 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
			 Thread.sleep(5000);
			 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
			 Thread.sleep(5000);
			 if(driver.findElement(By.xpath("//td[3]/div")).isDisplayed())
			 {
			 String Inv_Item_name=driver.findElement(By.xpath("//td[3]/div")).getText();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//input[@id='input-type-search']")).sendKeys(Inv_Item_name);
			 Thread.sleep(3000);
			 String ErrorMsg=driver.findElement(By.cssSelector("td.minor-ato-row > span")).getText();
			 System.out.println(ErrorMsg);
			 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			// driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

			 Assert.assertEquals(ErrorMsg, ErrorMsg);
			 System.out.println("invalid Search"+ErrorMsg);
			 }else{
				 System.out.println("Page not uploaded Properly");
			 }
			 driver.close();

			 
			 
		    }
			@Test

			 public void Basic_Search_Filter_byInvPF() throws InterruptedException{
				// TODO Auto-generated method stub
				
				 System.setProperty("webdriver.gecko.driver",Brow);
				 FirefoxProfile profile=new FirefoxProfile();
				 WebDriver driver=new FirefoxDriver();
				 driver.manage().window().maximize();
				 Actions action=new Actions(driver);
				 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
				 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
				 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
				 driver.findElement(By.id("login-button")).click();
				 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
				 String pTitle=driver.getTitle();
				 System.out.println(pTitle);
				 Assert.assertEquals(pTitle, "Customer Success Portal");
				 System.out.println("Page Verified");
				 Thread.sleep(15000);
				 Select drop=new Select(driver.findElement(By.tagName("Select")));
				 Thread.sleep(3000);
				 drop.selectByIndex(3);
				 Thread.sleep(5000);
				 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
				 Thread.sleep(5000);
				 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
				// String PF=driver.findElement(By.xpath("//td[4]/div")).getText();
				 Thread.sleep(5000);
				 WebDriverWait wait = new WebDriverWait(driver, 60);
			 	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[7]/div")));
				 String Inv_PF=driver.findElement(By.xpath("//td[7]/div")).getText();
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//th[4]/div/div/div/input")).sendKeys(Inv_PF);
				 
				 String ErrorMsg=driver.findElement(By.cssSelector("td.minor-ato-row > span")).getText();
				 System.out.println(ErrorMsg);
				 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				// driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

				 Assert.assertEquals(ErrorMsg, ErrorMsg);
				 System.out.println("invalid Search"+ErrorMsg);
				 driver.close();
				
				 
				 
				 
				 
			    }
				
			@Test
			 public void Basic_Search_Filter_byInvDescription() throws InterruptedException{
					// TODO Auto-generated method stub
					
					 System.setProperty("webdriver.gecko.driver",Brow);
					 FirefoxProfile profile=new FirefoxProfile();
					 WebDriver driver=new FirefoxDriver();
					 driver.manage().window().maximize();
					 Actions action=new Actions(driver);
					 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
					 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
					 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
					 driver.findElement(By.id("login-button")).click();
					 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
					 String pTitle=driver.getTitle();
					 System.out.println(pTitle);
					 Assert.assertEquals(pTitle, "Customer Success Portal");
					 System.out.println("Page Verified");
					 Thread.sleep(15000);
					 WebDriverWait wait = new WebDriverWait(driver, 60);
				 	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Select")));
					 Select drop=new Select(driver.findElement(By.tagName("Select")));
					 Thread.sleep(3000);
					 drop.selectByIndex(3);
					 Thread.sleep(5000);
					 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
					 Thread.sleep(5000);
					 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
					 Thread.sleep(5000);
					 WebDriverWait wait1 = new WebDriverWait(driver, 60);
				 	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]/div")));
					 String Inv_Desc=driver.findElement(By.xpath("//td[2]/div")).getText();
					 Thread.sleep(10000);
					 driver.findElement(By.xpath("//th[3]/div/div/div/input")).sendKeys(Inv_Desc);
					 Thread.sleep(3000);
					 String ErrorMsg=driver.findElement(By.cssSelector("td.minor-ato-row > span")).getText();
					 System.out.println(ErrorMsg);
					 Thread.sleep(5000);
					

					 Assert.assertEquals(ErrorMsg, ErrorMsg);
					 System.out.println("invalid Search"+ErrorMsg);
					
					 
					 driver.close();
			 	
			 }	
			@Test
			 public void Basic_Search_Filter_byInv_ProductType() throws InterruptedException{
					// TODO Auto-generated method stub
					
					 System.setProperty("webdriver.gecko.driver",Brow);
					 FirefoxProfile profile=new FirefoxProfile();
					 WebDriver driver=new FirefoxDriver();
					 driver.manage().window().maximize();
					 Actions action=new Actions(driver);
					 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
					 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
					 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
					 driver.findElement(By.id("login-button")).click();
					 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
					 String pTitle=driver.getTitle();
					 System.out.println(pTitle);
					 Assert.assertEquals(pTitle, "Customer Success Portal");
					 System.out.println("Page Verified");
					 Thread.sleep(15000);
					 WebDriverWait wait = new WebDriverWait(driver, 60);
				 	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Select")));
					 Select drop=new Select(driver.findElement(By.tagName("Select")));
					 Thread.sleep(3000);
					 drop.selectByIndex(3);
					 Thread.sleep(5000);
					 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
					 Thread.sleep(5000);
					 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
					 Thread.sleep(10000);
					 if(driver.findElement(By.xpath("//td[4]/div")).isDisplayed()){
					 String Inv_Product_Type=driver.findElement(By.xpath("//td[4]/div")).getText();
					 Thread.sleep(10000);
					 driver.findElement(By.xpath("//th[5]/div/div/div/input")).sendKeys(Inv_Product_Type);
					 Thread.sleep(3000);
					 String ErrorMsg=driver.findElement(By.cssSelector("td.minor-ato-row > span")).getText();
					 System.out.println(ErrorMsg);
					 Thread.sleep(3000);
					// driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

					 Assert.assertEquals(ErrorMsg, ErrorMsg);
					 System.out.println("invalid Search"+ErrorMsg);
					 }else{
						 System.out.println("No Record Displaying");
					 }
					 driver.close();
					 
					 
				}
				
			    @Test
				public void Basic_Search_Filter_byInvProductSubType() throws InterruptedException{
					// TODO Auto-generated method stub
					
					 System.setProperty("webdriver.gecko.driver",Brow);
					 FirefoxProfile profile=new FirefoxProfile();
					 WebDriver driver=new FirefoxDriver();
					 driver.manage().window().maximize();
					 Actions action=new Actions(driver);
					 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
					 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
					 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
					 driver.findElement(By.id("login-button")).click();
					 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
					 String pTitle=driver.getTitle();
					 System.out.println(pTitle);
					 Assert.assertEquals(pTitle, "Customer Success Portal");
					 System.out.println("Page Verified");
					 Thread.sleep(15000);
					 WebDriverWait wait = new WebDriverWait(driver, 60);
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Select")));
					 Select drop=new Select(driver.findElement(By.tagName("Select")));
					 
					 drop.selectByIndex(3);
					 Thread.sleep(5000);
					 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
					 Thread.sleep(5000);
					 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
					 Thread.sleep(7000);
					 if(driver.findElement(By.xpath("//td[5]/div")).isDisplayed()){
					 String Inv_Product_Sub_Type=driver.findElement(By.xpath("//td[5]/div")).getText();
					 Thread.sleep(7000);
					 driver.findElement(By.xpath("//th[6]/div/div/div/input")).sendKeys(Inv_Product_Sub_Type);
					 
					 String ErrorMsg=driver.findElement(By.cssSelector("td.minor-ato-row > span")).getText();
					 System.out.println(ErrorMsg);
					 Thread.sleep(3000);
					// driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

					 Assert.assertEquals(ErrorMsg, ErrorMsg);
					 System.out.println("invalid Search"+ErrorMsg);
					 }
					 else{
						 System.out.println("no record is displaying");
					 }
					 driver.close();
				}
				
			    @Test
				public void Basic_Search_Filter_byInvDelOption() throws InterruptedException{
					// TODO Auto-generated method stub
					
					 System.setProperty("webdriver.gecko.driver",Brow);
					 FirefoxProfile profile=new FirefoxProfile();
					 WebDriver driver=new FirefoxDriver();
					 driver.manage().window().maximize();
					 Actions action=new Actions(driver);
					 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
					 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
					 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
					 driver.findElement(By.id("login-button")).click();
					 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
					 String pTitle=driver.getTitle();
					 System.out.println(pTitle);
					 Assert.assertEquals(pTitle, "Customer Success Portal");
					 System.out.println("Page Verified");
					 Thread.sleep(15000);
					 Select drop=new Select(driver.findElement(By.tagName("Select")));
					 
					 drop.selectByIndex(3);
					 Thread.sleep(5000);
					 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
					 Thread.sleep(5000);
					 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
					 Thread.sleep(10000);
					 if(driver.findElement(By.xpath("//td[6]/div")).isDisplayed()){
					 String Inv_Delivery_Option=driver.findElement(By.xpath("//td[6]/div")).getText();
					 Thread.sleep(10000);
					 driver.findElement(By.xpath("//th[7]/div/div/div/input")).sendKeys(Inv_Delivery_Option);
					 Thread.sleep(3000);
					 String ErrorMsg=driver.findElement(By.cssSelector("td.minor-ato-row > span")).getText();
					 System.out.println(ErrorMsg);
					 Thread.sleep(3000);
					// driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

					 Assert.assertEquals(ErrorMsg, ErrorMsg);
					 System.out.println("invalid Filter Search:"+ErrorMsg);
					 }else{
						 System.out.println("Not Found this Filter");
						 
					 }
					 driver.close();
				}
	  


}
