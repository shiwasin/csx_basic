package test_report;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

import bsh.This;

public class BasicSearch_Veirfy_Search_Major_MinorRecords_WithDB {
	
	
	
	   
//=========Search_with_PF====================//
	String Brow="C:\\setup\\geckodriver.exe";
	   
	
public void Login_withAdmin() throws InterruptedException{
		
		String Brow="C:\\setup\\geckodriver.exe";
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 Actions action=new Actions(driver);
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
		 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 Thread.sleep(15000);
		 /*String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Title Verified:"+pTitle);*/
		// Thread.sleep(15000);
		
		
	}

	// @Test
	    public void Search_byPF() throws Throwable{
		// TODO Auto-generated method stub
		 String Brow="C:\\setup\\geckodriver.exe";
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 Actions action=new Actions(driver);
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
		 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
		 driver.findElement(By.id("login-button")).click();
		 
		 Thread.sleep(15000);
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 Thread.sleep(15000);
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Title Verified:"+pTitle);
		
		 
		Thread.sleep(15000);
		 
		 if(driver.findElement(By.tagName("Select")).isDisplayed()){
			 Select drop=new Select(driver.findElement(By.tagName("Select")));
			 Thread.sleep(3000);
			 drop.selectByIndex(3);
		 File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(shot, new File("C:/Users/shiwasin.PARTNERS/Desktop/gitWorkspace/CSX/Basic_Search/searc_pf_dropdown.png"));
		 Thread.sleep(3000);
		 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
		 Thread.sleep(3000);
		 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//th[4]/div/div/div/input")).sendKeys("ACEAPP");
		 driver.findElement(By.xpath("//th[4]/div/div/div/input")).sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 String verify=driver.findElement(By.xpath("//td[4]/div")).getText();
		 File shot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(shot1, new File("C:/Users/shiwasin.PARTNERS/Desktop/gitWorkspace/test_report/Basic_Search/search_pf_verify_pf.png"));
		 System.out.println(verify);
		 //input[@id='input-type-search'])[3]
		 System.out.println(verify);
		 Thread.sleep(3000);
		 //driver.findElement(By.xpath("//div/button")).click();
		 //Thread.sleep(3000);
		 Assert.assertEquals(verify, "ACEAPP");
		 
		 System.out.println("Both the Records are Matvh");
		 }
		 else{
			 System.out.println("Drop down not displaying");
		 }
		 driver.close();
		 }
	   
	 
	//==================Search_By_Offer_Type=========================//
	  @Test
		public void Search_byOfferType() throws InterruptedException, IOException{
			// TODO Auto-generated method stub
			
			 String Brow="C:\\setup\\geckodriver.exe";
			 System.setProperty("webdriver.gecko.driver",Brow);
			 FirefoxProfile profile=new FirefoxProfile();
			 WebDriver driver=new FirefoxDriver();
			 Actions action=new Actions(driver);
			 driver.manage().window().maximize();
			 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
			 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
			 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
			 driver.findElement(By.id("login-button")).click();
			 
			 Thread.sleep(15000);
			 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
			 Thread.sleep(15000);
			 String pTitle=driver.getTitle();
			 System.out.println(pTitle);
			 Assert.assertEquals(pTitle, "Customer Success Portal");
			 System.out.println("Page Title Verified:"+pTitle);
			 Thread.sleep(15000);
			 if(driver.findElement(By.tagName("Select")).isDisplayed()){
			 Select drop=new Select(driver.findElement(By.tagName("Select")));
			 
			 drop.selectByIndex(2);
			 File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(shot, new File("C:/Users/shiwasin.PARTNERS/Desktop/gitWorkspace/test_report/Basic_Search/search_offertype_dropdown.png"));
			 Thread.sleep(5000);
			 driver.findElement(By.tagName("input")).sendKeys("WEBEX");
			 	
			 Thread.sleep(3000);
			 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
			 Thread.sleep(3000);
			 Actions action1=new Actions(driver);
			 action1.moveToElement(driver.findElement(By.cssSelector(".select-dd-click"))).click().build().perform();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			 Thread.sleep(3000);
			
			 
			 action.moveToElement(driver.findElement(By.xpath("//span[2]/button"))).click().build().perform();
			 Thread.sleep(3000);
			 File shot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(shot1, new File("C:/Users/shiwasin.PARTNERS/Desktop/gitWorkspace/CSX/Basic_Search/searc_offertype_value.png"));


			 String offer_type_value=driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div[2]/div[2]/app-search-result/app-ato-list/div/div[2]/table/tbody/tr[1]/td[8]/div")).getText();
			
			Assert.assertEquals(offer_type_value, "WEBEX");
			System.out.println("Offer Type Match with Search Result");
			 }else{
				 System.out.println("Drop down not available");
			 }
			driver.close();
			

		}
	//==============search_by_commerce_offer================================//
		
	  // @Test
		public void Search_byCommerceOffer() throws InterruptedException{
					
			String Brow="C:\\setup\\geckodriver.exe";
			 System.setProperty("webdriver.gecko.driver",Brow);
			 FirefoxProfile profile=new FirefoxProfile();
			 WebDriver driver=new FirefoxDriver();
			 Actions action=new Actions(driver);
			 driver.manage().window().maximize();
			 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
			 driver.findElement(By.id("userInput")).sendKeys("shrutipa");
			 driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
			 driver.findElement(By.id("login-button")).click();
			 
			 Thread.sleep(15000);
			 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
			 Thread.sleep(15000);
			 String pTitle=driver.getTitle();
			 System.out.println(pTitle);
			 Assert.assertEquals(pTitle, "Customer Success Portal");
			 System.out.println("Page Title Verified:"+pTitle);
			 Thread.sleep(15000);
					if(driver.findElement(By.tagName("Select")).isDisplayed()){ 
					
					Select drop=new Select(driver.findElement(By.tagName("Select")));
					Thread.sleep(3000);
					drop.selectByIndex(1);
						
					driver.findElement(By.tagName("input")).sendKeys("C1-A");
					Thread.sleep(3000);
					driver.findElement(By.tagName("input")).sendKeys(Keys.DOWN);
					Thread.sleep(3000);
					driver.findElement(By.tagName("input")).sendKeys(Keys.DOWN);
					Thread.sleep(3000);
					 //String offer_name=driver.findElement(By.tagName("input")).getText();
					 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
					//Actions action=new Actions(driver);
					Thread.sleep(3000);
					
					 WebDriverWait wait = new WebDriverWait(driver, 60);
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]/div")));
					 String Verify_COffer=driver.findElement(By.xpath("//td[2]/div")).getText();
				     System.out.println(Verify_COffer);
				     String Description_Offer=driver.findElement(By.xpath("//td[3]/div")).getText();
				     System.out.println(Description_Offer);
				    
				     String Product_type=driver.findElement(By.xpath("//td[5]/div")).getText();
				     System.out.println("Product_Type:"+Product_type);
				     String Product_Sub_Grp=driver.findElement(By.xpath("//td[6]/div")).getText();
				     System.out.println("Product_SubType:"+Product_Sub_Grp);
				     String Delivery_grp=driver.findElement(By.xpath("//td[7]/div")).getText();
				     System.out.println("Delivery_Group"+Delivery_grp);
				     Assert.assertEquals(Verify_COffer, Verify_COffer);

				     System.out.println("Commerce Offer match with Search Result:"+Verify_COffer);
				     
				     try {
				  			Class.forName("oracle.jdbc.driver.OracleDriver");
				  			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ldap://ldap-ldstg3.cisco.com:5000/cn=OracleContext,dc=cisco,dc=com/ts3CG1_SRVC_OTH","XXWOC","Pr1R4M9M");
				  			//if(con!=null)System.out.println("found");
				  			 
				  			Statement stmt=con.createStatement(); 
				  			ResultSet rs=stmt.executeQuery("select ITEM_NAME from apps.xxitm_ege_item_request where ITEM_NAME='+Verify_COffer+' AND PRODUCT_FAMILY='AIRCTB' AND PRODUCT_TYPE='FUNCSYSTM' AND ITEM_TYPE='ATO MODEL'");  
				  			while(rs.next())
				  				
				  			Assert.assertEquals(rs.getString(1), Verify_COffer);
				  			System.out.println("Commerce Offer Name Match with DB :"+ " " +Verify_COffer );
				  			
				  			ResultSet rs1=stmt.executeQuery("select DESCRIPTION from apps.xxitm_ege_item_request where ITEM_NAME='+Verify_COffer+' AND PRODUCT_FAMILY='AIRCTB' AND PRODUCT_TYPE='FUNCSYSTM' AND ITEM_TYPE='ATO MODEL'");  
				  			while(rs.next())
				  			Assert.assertEquals(rs.getString(1), Description_Offer);
				  			System.out.println("description match with DB:"+Description_Offer);
				  			
				  			ResultSet rs3=stmt.executeQuery("Select PRODUCT_TYPE from apps.xxitm_ege_item_request where ITEM_NAME='+Verify_COffer+' AND PRODUCT_FAMILY='AIRCTB' AND  ITEM_TYPE='ATO MODEL'");  
				  			while(rs.next())
				  			Assert.assertEquals(rs.getString(1), Product_type);
				  			System.out.println("Product_TYPE match with DB:"+Product_type);
				  			
				  			ResultSet rs4=stmt.executeQuery("Select PRODUCT_SUB_GRP from apps.xxitm_ege_item_request where ITEM_NAME='+Verify_COffer+' AND PRODUCT_FAMILY='AIRCTB' AND  ITEM_TYPE='ATO MODEL'");  
				  			while(rs.next())
				  			Assert.assertEquals(rs.getString(1), Product_Sub_Grp);
				  			System.out.println("PRODUCT_SUB_GRP match with DB:"+Product_Sub_Grp);
				  			
				  			ResultSet rs5=stmt.executeQuery("Select DELIVERY_OPTION from apps.xxitm_ege_item_request where ITEM_NAME='+Verify_COffer+' AND PRODUCT_FAMILY='AIRCTB' AND  ITEM_TYPE='ATO MODEL'");  
				  			while(rs.next())
				  			Assert.assertEquals(rs.getString(1), Delivery_grp);
				  			System.out.println("PRODUCT_SUB_GRP match with DB:"+Delivery_grp);
				  			
				  		
				  			
				  		} catch (ClassNotFoundException | SQLException e) {
				  			// TODO Auto-generated catch block
				  			e.printStackTrace();
				  			 
				  		}
				    
					
					}else{
						System.out.println("Not displaying drop down");
					}
						driver.close();

					
					
				}
				
//========================VERIFY_PF_Count_with_UI=====================================//
			@Test
			    public void Search_byPF_Count() throws Throwable{
				// TODO Auto-generated method stub
				 String Brow="C:\\setup\\geckodriver.exe";
				 System.setProperty("webdriver.gecko.driver",Brow);
				 FirefoxProfile profile=new FirefoxProfile();
				 WebDriver driver=new FirefoxDriver();
				 driver.manage().window().maximize();
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
				 WebDriverWait wait1 = new WebDriverWait(driver, 60);
				 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Select")));
				 Select drop=new Select(driver.findElement(By.tagName("Select")));
				 
				 drop.selectByIndex(3);
				 Thread.sleep(7000);
				 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
				 Thread.sleep(7000);
				 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
				 Thread.sleep(7000);
				 driver.findElement(By.xpath("//div[3]/div/div/div/select")).click();
				 driver.findElement(By.xpath("//div[3]/div/div/div/select/option[3]")).click();
					
				 String Page_Value=driver.findElement(By.xpath("//div[3]/div/div/div/select/option[3]")).getText();
				 System.out.println(Page_Value);
				 Thread.sleep(1000);
				   

//				    System.out.println(rows.size());
	//			    System.out.println(column.size());
				    
				    String Cou=driver.findElement(By.xpath("//*/div/div[3]/div[2]/span[3]")).getText();
				    System.out.println(Cou);
				    int coun=Integer.parseInt(Cou);
				    System.out.println(coun);
				    
				    String num=driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show'])[1]/following::span[1]")).getText();
				   // System.out.println(num);
				    String Page_Count=num.split("of ")[1];
				    int PF_Total_Count=Integer.parseInt(Page_Count);
				    System.out.println("PF Total Count on UI:"+PF_Total_Count);
				    
				    driver.close();
				    
				   

			}
				
				
			 // @Test
				  public void OfferType_Count() throws InterruptedException
				  {
					   System.out.println(This.class.getSimpleName());
					   String Brow="C:\\setup\\geckodriver.exe";
						System.setProperty("webdriver.gecko.driver",Brow);
						FirefoxProfile profile=new FirefoxProfile();
						WebDriver driver=new FirefoxDriver();
						driver.manage().window().maximize();
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
						 
						 drop.selectByIndex(2);
						 Thread.sleep(7000);
						 
						 driver.findElement(By.tagName("input")).sendKeys("SXP");
						 Thread.sleep(1000);
						 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
						 Thread.sleep(7000);
						 driver.findElement(By.xpath("//div[3]/div/div/div/select")).click();
						 driver.findElement(By.xpath("//div[3]/div/div/div/select/option[3]")).click();
							
						 String Page_Value=driver.findElement(By.xpath("//div[3]/div/div/div/select/option[3]")).getText();
						 System.out.println(Page_Value);
						 Thread.sleep(5000);
	 						WebElement table = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/div[2]/app-search-result/app-ato-list/div/div[2]/table/tbody"));

						   // WebElement table = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div[2]/app-search-result/app-ato-list/div/div[2]/table/tbody"));
						   // WebElement table1=driver.findElement(By.cssSelector("html body.cui app-root app-main div.content.mainContainer main.row div.col-md-12 div.container app-search-result app-ato-list div div table.table.table--bordered.offers-table.ato-table"));
						    List<WebElement> rows = table.findElements(By.tagName("tr"));
						    List<WebElement> column = table.findElements(By.tagName("td"));
						    List<String> value = new ArrayList<String>();

						    System.out.println("Rows Count:"+rows.size());
						    System.out.println("Column Count:"+column.size());
						    
						    String Cou=driver.findElement(By.xpath("//*/div/div[3]/div[2]/span[3]")).getText();
						    System.out.println(Cou);
						    int coun=Integer.parseInt(Cou);
						    System.out.println(coun);
						    
						    String num=driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show'])[1]/following::span[1]")).getText();
						    System.out.println(num);
						    String Page_Count=num.split("of ")[1];
						    System.out.println("Total Count:"+Page_Count);
						    int Page_no=Integer.parseInt(Page_Count);
						    System.out.println(Page_Count);
						  
						  
						    
						    
						    try {
					  			Class.forName("oracle.jdbc.driver.OracleDriver");
					  			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ldap://ldap-ldstg3.cisco.com:5000/cn=OracleContext,dc=cisco,dc=com/ts3CG1_SRVC_OTH","XXWOC","Pr1R4M9M");
					  			//if(con!=null)System.out.println("found");
					  			 
					  			Statement stmt=con.createStatement(); 
					  			int count_db=0;
					  			
					  			ResultSet rs=stmt.executeQuery("select Count(*) from apps.ego_mtl_sy_items_ext_b where attr_group_id=216 and organization_id=1 and item_catalog_group_id=12004 and C_EXT_ATTR19='SXP'");
					  			
					  			 while(rs.next()){
					  		     count_db=rs.getInt(1);
					  			 }
					  			System.out.println("Count  is:"+count_db);
					  			
					  			Assert.assertEquals(Page_no, count_db, "Counts are not match");
					  			System.out.println("UI Count for Offer_Type:"+Page_no+"   "+"db count for Offer_type:"+count_db);
					  			 
					  			 
					  		
								
									
									
					  			
					  		} catch (ClassNotFoundException | SQLException e) {
					  			// TODO Auto-generated catch block
					  			e.printStackTrace();
					  			 
					  		}
						 }
						 System.out.println("Drop down enable");
						    driver.close();
				  }
						    
						    
						
											//==============Verify_Count_Commerce Offer_on_UI============================//
								    
							  			@Test
							  				public void Search_count_byCommerceoffer() throws Throwable{
											// TODO Auto-generated method stub
							  				String Brow="C:\\setup\\geckodriver.exe";
											System.setProperty("webdriver.gecko.driver",Brow);
											FirefoxProfile profile=new FirefoxProfile();
											WebDriver driver=new FirefoxDriver();
											driver.manage().window().maximize();
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
											
											 drop.selectByIndex(1);
											 Thread.sleep(5000);
											 String Commerce_Offer=driver.findElement(By.xpath("//div[3]/div[2]/table/tbody/tr/td")).getText();
											 Thread.sleep(5000);
											 driver.findElement(By.tagName("input")).sendKeys("C1-TAAS-SW-K9");
											 Thread.sleep(1000);
											 
											 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
											 Thread.sleep(3000);
											
											 driver.findElement(By.cssSelector("span.collapse-icon")).click();
											 
											 Thread.sleep(5000);
											 
											 
											
											    WebElement table = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div[2]/div[2]/app-search-result/app-ato-list/div/div[2]/table/tbody"));
											    List<WebElement> rows = table.findElements(By.tagName("tr"));
											    List<WebElement> column = table.findElements(By.tagName("td"));
											    List<String> value = new ArrayList<String>();

											    System.out.println("Total BOM Count:"+rows.size());
											    System.out.println(column.size());
											  
											 	}
											  else{
												 System.out.println("Dropdown enabled");
														
											 }

											    driver.close();

								  
								  
							  }
							  		//----------------------------------------subscription---------------------------------------------//
							  			
							  			 @Test
							  			 public void Validate_Subscription_BOM() throws InterruptedException, IOException{
							  				String Brow="C:\\setup\\geckodriver.exe";
							  						System.setProperty("webdriver.gecko.driver",Brow);
							  						FirefoxProfile profile=new FirefoxProfile();
							  						WebDriver driver=new FirefoxDriver();
							  						driver.manage().window().maximize();
							  						driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
							  						driver.findElement(By.id("userInput")).sendKeys("shrutipa");
							  						driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
							  						driver.findElement(By.id("login-button")).click();
							  						driver.get("https://csx-cdev.cisco.com/customersuccess/#/");
							  						String pTitle=driver.getTitle();
							  						System.out.println(pTitle);
							  						Assert.assertEquals(pTitle, "Customer Success Portal");
							  						System.out.println("Page Title Verified:"+pTitle);
							  						Thread.sleep(3000);
							  						 
							  						Select drop=new Select(driver.findElement(By.tagName("Select")));
							  						drop.selectByIndex(1);
							  							
							  						driver.findElement(By.tagName("input")).sendKeys("L-ISE-ADV-S-2500=");
							  						Thread.sleep(3000);
							  						driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
							  						Actions action=new Actions(driver);
							  						Thread.sleep(3000);
							  						driver.findElement(By.cssSelector("span.collapse-icon")).click();
							  						Thread.sleep(5000);
							  						
							  						//String Error_msg=driver.findElement(By.cssSelector("span.showErrorMsg")).getText();
							  							
							  							//if(Error_msg==null)
							  							//{
							  								
							  								System.out.println("Minor is present");
							  								File subs_shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
							  								FileUtils.copyFile(subs_shot, new File("C:/Users/shiwasin.PARTNERS/Desktop/gitWorkspace/CSX/Basic_Search/Subscription_UI.png"));
							  		 					    //WebElement table = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div[2]/app-search-result/app-ato-list/div/div[2]/table/tbody"));

							  		 						WebElement table = driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div/div[2]/app-search-result/app-ato-list/div/div[2]/table/tbody"));
							  		 					    List<WebElement> rows = table.findElements(By.tagName("tr"));
							  		 					    List<WebElement> column = table.findElements(By.tagName("td"));
							  		 					    List<String> value = new ArrayList<String>();

							  		 					   // System.out.println("rows:"+rows.size());
							  		 					    //System.out.println(column.size());
							  		 					    int sub_count=rows.size();
							  		 					  
							  		 					   
							  		 					    ArrayList<String> Subscription_value=new ArrayList<String>();
							  		 					    for(int i=2;i<=rows.size();i++){
							  		 					    	
							  		 					    	String Subs_minor_list=driver.findElement(By.xpath("//tr["+i+"]/td[2]/div")).getText();
							  		 					    	Subscription_value.add(Subs_minor_list);
							  		 					    	System.out.println("Minor ON UI:"+Subs_minor_list);
							  		 					    }

							  		 						    
							  		 						 
							  		 						 
							  		 								try {
							  		 					  			Class.forName("oracle.jdbc.driver.OracleDriver");
							  		 					  			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ldap://tns-prod:5000/cn=OracleContext,dc=cisco,dc=com/TS3DMP","XXCFG_Q2O_U","RRCH9F_6q");
							  		 					  			if(con!=null)System.out.println("found");
							  		 					  			
							  		 					  			 
							  		 					  			Statement stmt=con.createStatement(); 
							  		 					  			ArrayList<String> Subscription_List=new ArrayList<String>();
							  		 					  			ResultSet rs=stmt.executeQuery("select * from xxwoc_prod_sv_mapping where product_name in ('L-ISE-ADV-S-2500=') and service_type = 'SUBSCRIPTION'");  
							  		 					  			
							  		 					  			
							  		 					  			while(rs.next()){
							  		 					  				String Subscription_Minor=rs.getString(3);
							  		 					  				Subscription_List.add(Subscription_Minor);
							  		 					  				System.out.println("Minor on DB:"+Subscription_Minor);
							  		 					  			}
							  		 					  			    System.out.println("size:"+Subscription_List.size());
							  		 					                Collections.sort(Subscription_List);
							  		 					                Collections.sort(Subscription_value);
							  		 					                Assert.assertEquals(Subscription_List, Subscription_value);
							  		 					                System.out.println("Subscription Minor records are same on ui and db ");
							  		 					  				
							  		 					  						  					  		} catch (ClassNotFoundException | SQLException e) {
							  		 					  			// TODO Auto-generated catch block
							  		 					  			e.printStackTrace();
							  		 					  			 
							  		 					  		}
							  		 				driver.close();
							  			 }

							  					    
							  			
							  		//=================================Minor Available or Not=====================================
							  			@Test
							  			public void Validate_Minor_Available_Or_Not() throws InterruptedException{
							  							
							  							System.setProperty("webdriver.gecko.driver",Brow);
							  							FirefoxProfile profile=new FirefoxProfile();
							  							WebDriver driver=new FirefoxDriver();
							  							driver.manage().window().maximize();
							  							driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
							  							driver.findElement(By.id("userInput")).sendKeys("shrutipa");
							  							driver.findElement(By.id("passwordInput")).sendKeys("Vrushsen$55");
							  							driver.findElement(By.id("login-button")).click();
							  							driver.get("https://csx-stage.cisco.com/customersuccess/#/");
							  							String pTitle=driver.getTitle();
							  							System.out.println(pTitle);
							  							Assert.assertEquals(pTitle, "Customer Success Portal");
							  							System.out.println("Page Title Verified");
							  							Thread.sleep(15000);
							  							 
							  							if((driver.findElement(By.tagName("Select")).isDisplayed())){
							  							Select drop=new Select(driver.findElement(By.tagName("Select")));
							  							 Thread.sleep(3000);
							  							drop.selectByIndex(1);
							  								
							  							driver.findElement(By.tagName("input")).sendKeys("CISCO-SFP-T3-GE-C=");
							  							Thread.sleep(3000);
							  							driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
							  							Actions action=new Actions(driver);
							  							Thread.sleep(3000);
							  							driver.findElement(By.cssSelector("span.collapse-icon")).click();
							  							Thread.sleep(6000);
							  							String Error_msg=driver.findElement(By.cssSelector("span.showErrorMsg")).getText();
							  							
							  							if(Error_msg.isEmpty())
							  							{
							  								
							  								System.out.println("Minor is present");
							  							}
							  								System.out.println(Error_msg);
							  								Assert.assertEquals(Error_msg, "No minor lines are present");
							  								driver.close();
							  							}
							  							else{
							  								System.out.println("wewwq");
							  							}
							  				}


							  		//==========================Filter should be cleared when user click on x icon==================
							  			
							  	//	 @Test
							  			  public void Filter_Value_Should_be_Clear() throws InterruptedException{
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
							  					 if((driver.findElement(By.tagName("Select")).isDisplayed())){
							  					 Select drop=new Select(driver.findElement(By.tagName("Select")));
							  					 
							  					 drop.selectByIndex(3);
							  					 Thread.sleep(5000);
							  					 driver.findElement(By.tagName("input")).sendKeys("ACEAPP");
							  					 Thread.sleep(5000);
							  					 driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
							  					 Thread.sleep(7000);
							  					 //----ITEM_TYPE_FILTER----------//
							  					 if(driver.findElement(By.xpath("//td[2]/div")).isEnabled()){
							  					 String Item_name=driver.findElement(By.xpath("//td[2]/div")).getText();
							  					 
							  					 Thread.sleep(3000);
							  					 driver.findElement(By.xpath("//input[@id='input-type-search']")).sendKeys(Item_name);
							  					 Thread.sleep(3000);
							  					 driver.findElement(By.cssSelector("span.icon-exit.icon-smallar")).click();
							  					 Thread.sleep(3000);
							  					 String Item_name_Filter=driver.findElement(By.xpath("//input[@id='input-type-search']")).getText();
							  					 Thread.sleep(3000);
							  					 Assert.assertEquals(Item_name_Filter, "");
							  					 System.out.println("Item name is"+Item_name_Filter);
							  					 Thread.sleep(5000);
							  					 }
							  					 else{
							  						 System.out.println("Filter not availble");
							  					 }
							  					 //---Description Filter----//
							  					WebDriverWait wait1 = new WebDriverWait(driver, 60);
												 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[3]/div")));
							  					 if(driver.findElement(By.xpath("//td[3]/div")).isEnabled()){
							  					 String Description=driver.findElement(By.xpath("//td[3]/div")).getText();
							  					 Thread.sleep(3000);
							  					 driver.findElement(By.xpath("(//input[@id='input-type-search'])[2]")).sendKeys(Description);
							  					 Thread.sleep(3000);
							  					 driver.findElement(By.xpath("//th[3]/div/div/div/span")).click();
							  					 Thread.sleep(3000);
							  					 String Description_Filter=driver.findElement(By.xpath("(//input[@id='input-type-search'])[2]")).getText();
							  					 Assert.assertEquals(Description_Filter, "");
							  					 System.out.println("Description is:"+Description_Filter);
							  					 Thread.sleep(5000);
							  					 }
							  					 else{
							  						 System.out.println("Description Filter not available");
							  					 }
							  					 //----------------PF_Filter------------------//
							  					WebDriverWait wait = new WebDriverWait(driver, 60);
												 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[4]/div")));
							  					 if(driver.findElement(By.xpath("//td[4]/div")).isEnabled()){
							  					 
							  					 String PF=driver.findElement(By.xpath("//td[4]/div")).getText();
							  					 Thread.sleep(3000);
							  					 driver.findElement(By.xpath("(//input[@id='input-type-search'])[3]")).sendKeys(PF);
							  					 Thread.sleep(3000);
							  					 driver.findElement(By.xpath("//th[4]/div/div/div/span")).click();
							  					 Thread.sleep(3000);
							  					 String PF_Filter=driver.findElement(By.xpath("(//input[@id='input-type-search'])[3]")).getText();
							  					 Assert.assertEquals(PF_Filter, "");
							  					 System.out.println("Description is:"+PF_Filter);
							  					 Thread.sleep(5000);
							  					 }
							  					 else{
							  						 System.out.println("PF filter not available");
							  					 }
							  					 //-----------------Product_Type-------------//
							  					WebDriverWait wait2 = new WebDriverWait(driver, 60);
												 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[5]/div")));
							  					
							  					 
							  					 String Product_Type=driver.findElement(By.xpath("//td[5]/div")).getText();
							  					 Thread.sleep(3000);
							  					 driver.findElement(By.xpath("(//input[@id='input-type-search'])[4]")).sendKeys(Product_Type);
							  					 Thread.sleep(3000);
							  					 driver.findElement(By.xpath("//th[5]/div/div/div/span")).click();
							  					 Thread.sleep(3000);
							  					 String Product_Type_Filter=driver.findElement(By.xpath("(//input[@id='input-type-search'])[4]")).getText();
							  					 Assert.assertEquals(Product_Type_Filter, "");
							  					 System.out.println("Product Type is:"+Product_Type_Filter);
							  					 Thread.sleep(5000);
							  					 
							  					 
							  				    
							  			  
							  			  
							  			  		//----------------------Product_Sub_Type-----------------------//
							  					 if(driver.findElement(By.xpath("//td[6]/div")).isDisplayed()){
							  			  
							  					 String Product_Sub_Type=driver.findElement(By.xpath("//td[6]/div")).getText();
							  					 Thread.sleep(3000);
							  					 driver.findElement(By.xpath("(//input[@id='input-type-search'])[5]")).sendKeys(Product_Sub_Type);
							  					 Thread.sleep(3000);
							  					 driver.findElement(By.xpath("//th[6]/div/div/div/span")).click();
							  					 Thread.sleep(3000);
							  					 String Product_Sub_Type_Filter=driver.findElement(By.xpath("(//input[@id='input-type-search'])[5]")).getText();
							  					 Assert.assertEquals(Product_Sub_Type_Filter, "");
							  					 System.out.println("Product sub type is:"+Product_Sub_Type);
							  					 Thread.sleep(5000);
							  					 }
							  					 else{
							  						 System.out.println("Product Sub Type filter is not available");
							  					 }
							  					 
							  					 //----------------------Delivery Option--------------------------------//
							  					 if(driver.findElement(By.xpath("//td[7]/div")).isDisplayed()){
							  					 String Delivery_Option=driver.findElement(By.xpath("//td[7]/div")).getText();
							  					 Thread.sleep(3000);
							  					 driver.findElement(By.xpath("(//input[@id='input-type-search'])[6]")).sendKeys(Delivery_Option);
							  					 Thread.sleep(3000);
							  					 driver.findElement(By.xpath("//th[7]/div/div/div/span")).click();
							  					 Thread.sleep(3000);
							  					 String Delivery_Option_Filter=driver.findElement(By.xpath("(//input[@id='input-type-search'])[6]")).getText();
							  					 Assert.assertEquals(Delivery_Option_Filter, "");
							  					 System.out.println("Delivery Option is is:"+Delivery_Option_Filter);
							  					 Thread.sleep(5000);
							  					 }else{
							  						 System.out.println("Delivery Option Filter is not available");
							  					 }
							  					 
							  					 }else{
							  						
							  						 System.out.println("Drop down not displaying");
							  					 }
							  					 
							  					 driver.close();
							  					 
							  			  }



}
