package test_report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic_Search_Autosearch_And_Pagination {
	
	String Brow="C:\\setup\\geckodriver.exe";
	   
		//----------------AutoSearch------------------------------------//	   
			 @Test
			    public void AutoSearch_byPF() throws InterruptedException{
				// TODO Auto-generated method stub
				
				System.setProperty("webdriver.gecko.driver",Brow);
				FirefoxProfile profile=new FirefoxProfile();
				
				 WebDriver driver=new FirefoxDriver();
				 Actions action=new Actions(driver);
				 driver.manage().window().maximize();
				 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
				 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
				 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
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
				 Thread.sleep(3000);
				
				 action.moveToElement(driver.findElement(By.tagName("input"))).click().build().perform();
				 Thread.sleep(5000);
				 
				 boolean AutoSearch1=driver.findElement(By.id("ngb-typeahead-0-0")).isDisplayed();
				 Assert.assertEquals(AutoSearch1, true);
			
				 System.out.println("Autosearch Working"+AutoSearch1);
				 }else{
					 
					System.out.println("drop down not available");
				 }
				 driver.close();
				 		
				 
				 
			    }
			  
			  
			  @Test
			    public void AutoSearch_byOfferType() throws InterruptedException{
				// TODO Auto-generated method stub
				
				System.setProperty("webdriver.gecko.driver",Brow);
				FirefoxProfile profile=new FirefoxProfile();
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
				 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
				 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
				 driver.findElement(By.id("login-button")).click();
				 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
				 Actions action=new Actions(driver);
				 String pTitle=driver.getTitle();
				 System.out.println(pTitle);
				 Assert.assertEquals(pTitle, "Customer Success Portal");
				 System.out.println("Page Verified");
				 Thread.sleep(15000);
				 if(driver.findElement(By.tagName("Select")).isDisplayed()){
				 Select drop=new Select(driver.findElement(By.tagName("Select")));
				 Thread.sleep(3000);
				 drop.selectByIndex(2);
				 Thread.sleep(5000);
			
				 action.moveToElement(driver.findElement(By.tagName("input"))).click().build().perform();
				 Thread.sleep(5000);
				 
				 boolean AutoSearch1=driver.findElement(By.id("ngb-typeahead-0-0")).isDisplayed();
				 Assert.assertEquals(AutoSearch1, true);
			
				 System.out.println("Autosearch Working"+AutoSearch1);
				 }else{
					 System.out.println("not showing drop down");
				 }
				 driver.close();
				 		
				 
				 
			    }
			  
			  @Test
			    public void AutoSearch_byCommerceOffer() throws InterruptedException{
				// TODO Auto-generated method stub
				
				System.setProperty("webdriver.gecko.driver",Brow);
				FirefoxProfile profile=new FirefoxProfile();
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
				 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
				 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
				 driver.findElement(By.id("login-button")).click();
				 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
				 Actions action=new Actions(driver);
				 String pTitle=driver.getTitle();
				 System.out.println(pTitle);
				 Assert.assertEquals(pTitle, "Customer Success Portal");
				 System.out.println("Page Verified");
				 Thread.sleep(15000);
				 if(driver.findElement(By.tagName("Select")).isDisplayed()){
				 Select drop=new Select(driver.findElement(By.tagName("Select")));
				 Thread.sleep(3000);
				 drop.selectByIndex(1);
				 Thread.sleep(5000);
				 driver.findElement(By.tagName("input")).sendKeys("C1-");
				 Thread.sleep(5000);
		        // action.moveToElement(driver.findElement(By.tagName("input"))).sendKeys("C1-").build().perform();
		         boolean AutoSearchbyCO=(driver.findElement(By.tagName("input")).isDisplayed());
		         
		         Thread.sleep(5000);
				 
				 Assert.assertEquals(AutoSearchbyCO, true);
				
			
				 System.out.println("Autosearch is displaying"+AutoSearchbyCO);
				 }else{
					 System.out.println("Not showin drop down");
				 }
				 driver.close();
				 		
				 
				 
			    }
			  
	//---------------------------Basic_Search_Pagination---------------------------------------------------//				    
					    @Test
						public void Pagination_by_Admin_50() throws InterruptedException{
							
							
							 System.setProperty("webdriver.gecko.driver",Brow);
							 FirefoxProfile profile=new FirefoxProfile();
							 WebDriver driver=new FirefoxDriver();
							 driver.manage().window().maximize();
							 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
							 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
							 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
							 driver.findElement(By.id("login-button")).click();
							 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
							 String pTitle=driver.getTitle();
							 System.out.println(pTitle);
							 Assert.assertEquals(pTitle, "Customer Success Portal");
							 System.out.println("Page Verified");
							// driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
							 Thread.sleep(15000);
							 WebDriverWait wait = new WebDriverWait(driver, 60);
							 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Select")));
							 Select drop=new Select(driver.findElement(By.tagName("Select")));
							 Thread.sleep(3000);
							 drop.selectByIndex(3);
							// driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
							 Thread.sleep(3000);
							 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
							 Thread.sleep(3000);
							 driver.findElement(By.className("searchFlow-icon")).click();
							 Thread.sleep(3000); 
							 WebDriverWait wait1 = new WebDriverWait(driver, 60);
							 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[4]/div")));
							 String verify=driver.findElement(By.xpath("//td[4]/div")).getText();
							 System.out.println(verify);
							 Assert.assertEquals(verify, "ACEAPP");
							 
							System.out.println("PF IS" +verify);
							Thread.sleep(1000);
							driver.findElement(By.xpath("//div[3]/div/div/div/select")).click();
							Thread.sleep(1000);
							driver.findElement(By.xpath("//div[3]/div/div/div/select/option[3]")).click();
							Thread.sleep(3000);
							String Page_Value=driver.findElement(By.xpath("//div[3]/div/div/div/select/option[3]")).getText();
							System.out.println(Page_Value);
							int Pagination=Integer.parseInt(Page_Value);
							
							Assert.assertEquals(Pagination,50);
							System.out.println("Pass"+"Pagination value is:"+Pagination);
							driver.close();
							
							
						}
					@Test
					  public void Pagination_by_Admin_10() throws InterruptedException{
							
							
							 System.setProperty("webdriver.gecko.driver",Brow);
							 FirefoxProfile profile=new FirefoxProfile();
							 WebDriver driver=new FirefoxDriver();
							 driver.manage().window().maximize();
							 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
							 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
							 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
							 driver.findElement(By.id("login-button")).click();
							 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
							 String pTitle=driver.getTitle();
							 System.out.println(pTitle);
							 Assert.assertEquals(pTitle, "Customer Success Portal");
							 System.out.println("Page Verified");
							// driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
							 Thread.sleep(15000);
							 WebDriverWait wait1 = new WebDriverWait(driver, 60);
							 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Select")));
							 Select drop=new Select(driver.findElement(By.tagName("Select")));
							 Thread.sleep(3000);
							 drop.selectByIndex(3);
							// driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
							 Thread.sleep(3000);
							 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
							 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
							 driver.findElement(By.className("searchFlow-icon")).click();
							 Thread.sleep(5000); 
							 WebDriverWait wait2 = new WebDriverWait(driver, 60);
							 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[4]/div")));
							 String verify=driver.findElement(By.xpath("//td[4]/div")).getText();
							 System.out.println(verify);
							 Assert.assertEquals(verify, "ACEAPP");
							 
							 System.out.println("PF IS" +verify);
							driver.findElement(By.xpath("//div[3]/div/div/div/select")).click();
							driver.findElement(By.xpath("//div[3]/div/div/div/select/option[2]")).click();
							
							String Page_Value1=driver.findElement(By.xpath("//div[3]/div/div/div/select/option[2]")).getText();
							System.out.println(Page_Value1);
							int Pagination1=Integer.parseInt(Page_Value1);
							
							Assert.assertEquals(Pagination1,10);
							System.out.println("Pass"+"Pagination value is:"+Pagination1);
							driver.close();
							
						}



					public void Pagination_by_Admin_5() throws InterruptedException{
						
						
						 System.setProperty("webdriver.gecko.driver",Brow);
						 FirefoxProfile profile=new FirefoxProfile();
						 WebDriver driver=new FirefoxDriver();
						 driver.manage().window().maximize();
						 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
						 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
						 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
						 driver.findElement(By.id("login-button")).click();
						 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
						 String pTitle=driver.getTitle();
						 System.out.println(pTitle);
						 Assert.assertEquals(pTitle, "Customer Success Portal");
						 System.out.println("Page Verified");
						// driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
						 Thread.sleep(15000);
						 Select drop=new Select(driver.findElement(By.tagName("Select")));
						 Thread.sleep(3000);
						 drop.selectByIndex(3);
						// driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
						 Thread.sleep(1000);
						 WebDriverWait wait1 = new WebDriverWait(driver, 60);
						 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input")));
						 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
						 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
						 driver.findElement(By.className("searchFlow-icon")).click();
						 Thread.sleep(5000); 
						 String verify=driver.findElement(By.xpath("//td[4]/div")).getText();
						 System.out.println(verify);
						 Assert.assertEquals(verify, "ACEAPP");
						 
						 System.out.println("PF IS" +verify);
						//driver.findElement(By.xpath("//div[3]/div/div/div/select")).click();
						//driver.findElement(By.xpath("//div[3]/div/div/div/select/option[2]")).click();
						
						String Page_Value2=driver.findElement(By.xpath("//div[3]/div/div/div/select/option[1]")).getText();
						System.out.println(Page_Value2);
						int Pagination2=Integer.parseInt(Page_Value2);
						
						Assert.assertEquals(Pagination2,5);
						System.out.println("Pass"+"Pagination value is:"+Pagination2);
						 driver.close();
						
						
					}

	//----------------------Show/Hide Columns----------------------------------------------//

					@Test
					public void verify_show_hide_Parameters() throws InterruptedException{
					
					
						// TODO Auto-generated method stub
						 String Brow="C:\\setup\\geckodriver.exe";
						 System.setProperty("webdriver.gecko.driver",Brow);
						 FirefoxProfile profile=new FirefoxProfile();
						 WebDriver driver=new FirefoxDriver();
						 driver.manage().window().maximize();
						 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
						 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
						 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
						 driver.findElement(By.id("login-button")).click();
						 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
						 String pTitle=driver.getTitle();
						 System.out.println(pTitle);
						 Assert.assertEquals(pTitle, "Customer Success Portal");
						 System.out.println("Page Verified");
						 Thread.sleep(15000);
						 WebDriverWait wait1 = new WebDriverWait(driver, 60);
						 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Select")));
						 Select drop=new Select(driver.findElement(By.tagName("Select")));
						 
						 drop.selectByIndex(3);
						 
						 Thread.sleep(3000);
						 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
						 Thread.sleep(3000);
						 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
						 Thread.sleep(3000);
						 driver.findElement(By.xpath("//th[4]/div/div/div/input")).sendKeys("ACEAPP");
						 driver.findElement(By.xpath("//th[4]/div/div/div/input")).sendKeys(Keys.ENTER);
						 Thread.sleep(7000);
						 WebDriverWait wait2 = new WebDriverWait(driver, 60);
						 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[4]/div")));
						 String verify=driver.findElement(By.xpath("//td[4]/div")).getText();
						 //input[@id='input-type-search'])[3]
						 System.out.println(verify);
						 Thread.sleep(3000);
						 
						 driver.findElement(By.xpath("//span[2]/button")).click();
						 Thread.sleep(3000);
						 String Col_1=driver.findElement(By.xpath("//app-ato-list/div/div/div/div/div[2]")).getText();
						 String Col_2=driver.findElement(By.xpath("//div/div/div[3]")).getText();
						 String Col_3=driver.findElement(By.xpath("//div/div/div[4]")).getText();
						 String Col_4=driver.findElement(By.xpath("//div/div/div[5]")).getText();
						 String Col_5=driver.findElement(By.xpath("//div/div/div[6]")).getText();
						 String Col_6=driver.findElement(By.xpath("//div/div/div[7]")).getText();
						 String Col_7=driver.findElement(By.xpath("//div/div/div[8]")).getText();
						 String Col_8=driver.findElement(By.xpath("//div/div/div[9]")).getText();
						 String Col_9=driver.findElement(By.xpath("//div/div/div[10]")).getText();
						 String Col_10=driver.findElement(By.xpath("//div/div/div[11]")).getText();
						 String Col_11=driver.findElement(By.xpath("//div/div/div[12]")).getText();
						 String Col_12=driver.findElement(By.xpath("//div/div/div[13]")).getText();
						 String Col_13=driver.findElement(By.xpath("//div/div/div[14]")).getText();
						 String Col_14=driver.findElement(By.xpath("//div/div/div[15]")).getText();
						 String Col_15=driver.findElement(By.xpath("//div/div/div[16]")).getText();
						 String Col_16=driver.findElement(By.xpath("//div/div/div[17]")).getText();
						 String Col_17=driver.findElement(By.xpath("//div/div/div[18]")).getText();
						 String Col_18=driver.findElement(By.xpath("//div/div/div[19]")).getText();
						 String Col_19=driver.findElement(By.xpath("//div/div/div[20]")).getText();
						 String Col_20=driver.findElement(By.xpath("//div/div/div[21]")).getText();
						 String Col_21=driver.findElement(By.xpath("//div/div/div[22]")).getText();
						 //String Col_22=driver.findElement(By.xpath("//div/div/div[23]")).getText();
						 
						 System.out.println(Col_1+"  "+Col_2+"  "+Col_3+"  "+Col_4+"  "+Col_5+"  "+Col_6+"  "+"  "+Col_7+"  "+Col_8+"  "+Col_9+"  "+Col_10+"  "+Col_11+"  "+Col_12+"  "+Col_13
								 +"   "+Col_14+"  "+Col_15+"  "+Col_16+"  "+Col_17+"  "+Col_18+"  "+Col_19+"  "+Col_20+"  "+Col_21);
						 

						 
						 Thread.sleep(3000);
						 		 
						 driver.close();
						 
					    }
					
				    
							@Test
							public void verify_By_default_selected_Items() throws InterruptedException{
							
							
								// TODO Auto-generated method stub
								String Brow="C:\\setup\\geckodriver.exe";
								System.setProperty("webdriver.gecko.driver",Brow);
								FirefoxProfile profile=new FirefoxProfile();
								WebDriver driver=new FirefoxDriver();
								driver.manage().window().maximize();
								 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
								 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
								 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$11");
								 driver.findElement(By.id("login-button")).click();
								 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
								 String pTitle=driver.getTitle();
								 System.out.println(pTitle);
								 Assert.assertEquals(pTitle, "Customer Success Portal");
								 System.out.println("Page Verified");
								 Thread.sleep(15000);
								 WebDriverWait wait1 = new WebDriverWait(driver, 60);
								 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Select")));
								 Select drop=new Select(driver.findElement(By.tagName("Select")));
								
								 drop.selectByIndex(3);
								 Thread.sleep(3000);
								 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
								 Thread.sleep(3000);
								 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
								 Thread.sleep(7000);
								 driver.findElement(By.xpath("//th[4]/div/div/div/input")).sendKeys("ACEAPP");
								 driver.findElement(By.xpath("//th[4]/div/div/div/input")).sendKeys(Keys.ENTER);
								 Thread.sleep(10000);
								 if(driver.findElement(By.xpath("//td[4]/div")).isDisplayed()){
								 String verify=driver.findElement(By.xpath("//td[4]/div")).getText();
								 //input[@id='input-type-search'])[3]
								 System.out.println(verify);
								 Thread.sleep(10000);
								 
								 WebElement Show_Hide_Button=driver.findElement(By.xpath("//span[2]/button"));
								 
								 System.out.println(driver.findElement(By.xpath("//span[2]/button")).isEnabled());
								 
								 if(Show_Hide_Button.isEnabled())
								 {
									 Show_Hide_Button.click();
									 
									 Thread.sleep(3000);
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected(), true,"found 2");
									// Assert.assertEquals(driver.findElement(By.xpath("((//input[@type='checkbox'])[2]")).isSelected(),true,"Found 1");
									 //Boolean Col_2=driver.findElement(By.xpath("//div/div/div[3]")).isSelected();
									Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected(), true,"found 2");
									
									Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).isSelected(),false,"found 3");
									// System.out.println(driver.findElement(By.xpath("//div/div/div[4]")).getText());
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).isSelected(),true,"found 4");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected(),true,"found 5");
									Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).isSelected(),true,"found 6");
									// System.out.println(driver.findElement(By.xpath("//app-ato-list/div/div/div/div/div[2]")).getText()+"  "+driver.findElement(By.xpath("//div/div/div[3]")).getText()+"  "
											 //+driver.findElement(By.xpath("//div/div/div[5]")).getText()+"  "+driver.findElement(By.xpath("//div/div/div[6]")).getText());
									Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isSelected(),false,"not found 4");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).isSelected(),false,"not found 5");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).isSelected(),false,"6");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).isSelected(),true);
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).isSelected(),false,"7");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).isSelected(),false,"8");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).isSelected(),false,"9");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[15]")).isSelected(),false,"10");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[16]")).isSelected(),false,"11");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[17]")).isSelected(),false,"12");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[18]")).isSelected(),false,"13");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[19]")).isSelected(),false,"14");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[20]")).isSelected(),false,"15");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[21]")).isSelected(),false,"16");
									 Assert.assertEquals(driver.findElement(By.xpath("(//input[@type='checkbox'])[22]")).isSelected(),false,"17");
									 //String Col_22=driver.findElement(By.xpath("//div/div/div[23]")).getText();
									 
									 System.out.println("Only 6 column should be displayed by default"+"  "+driver.findElement(By.xpath("//app-ato-list/div/div/div/div/div[2]")).getText()+" "
											 +driver.findElement(By.xpath("//div/div/div[3]")).getText()+"  "+driver.findElement(By.xpath("//div/div/div[5]")).getText()+
											 "  "+driver.findElement(By.xpath("//div/div/div[6]")).getText()+" "+driver.findElement(By.xpath("//div/div/div[7]")).getText());
									
								 }
								 else{
									 System.out.println("Not clickable");
								 }
								 
								 
								 Thread.sleep(3000);
								 }else{
									 System.out.println("enable");
								 }
								 		 
								driver.close();
								 
							    }


}
