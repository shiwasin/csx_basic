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
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
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

public class Advance_Search {
	
	//String Brow="C:\\setup\\geckodriver.exe";
	
	
	@Test
	public void Advancesearch_byAllMandatory_Value() throws InterruptedException, IOException{
		
		System.setProperty("webdriver.gecko.driver",Brow);
		FirefoxProfile profile=new FirefoxProfile();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 
		 File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(shot, new File("C:/Users/shiwasin.PARTNERS/Desktop/gitWorkspace/CSX/error.png"));
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.name("Technology Group")).sendKeys("ATTG");
		 Thread.sleep(5000);
		 driver.findElement(By.name("Business Unit")).sendKeys("OTBU");
		 Thread.sleep(5000);
		 driver.findElement(By.name("Product Family")).sendKeys("15216");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[2]")).click();
		 Thread.sleep(10000);
		 String Total_Count=driver.findElement(By.xpath("//li/div/span")).getText();
		 File Total_Count_ui=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(Total_Count_ui, new File("C:/Users/shiwasin.PARTNERS/Desktop/gitWorkspace/test_report/Advancesearch/Total_Count_ui.png"));
		 int Total_Records=Integer.parseInt(Total_Count);
		 System.out.println(Total_Records);
		 Thread.sleep(2000);
		 String Item_Type_Count=driver.findElement(By.xpath("//li[2]/div[2]/ul/li/div/span")).getText();
		 int Item_type_Records=Integer.parseInt(Item_Type_Count);
		 System.out.println(Item_type_Records);
		 Thread.sleep(2000);
		 String ITEM_TYPE_2=driver.findElement(By.xpath("//li[2]/div/span")).getText();
		 int ITEM_TYPE_RECORD_2=Integer.parseInt(ITEM_TYPE_2);
		
		System.out.println(ITEM_TYPE_RECORD_2);
		driver.close();
	}
	
	
	@Test
	public void Advancesearch_verify_the_Pictorial_View() throws InterruptedException, IOException{
		
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.name("Technology Group")).sendKeys("ATTG");
		 Thread.sleep(2000);
		 driver.findElement(By.name("Business Unit")).sendKeys("OTBU");
		 Thread.sleep(2000);
		 driver.findElement(By.name("Product Family")).sendKeys("15216");
		 Thread.sleep(10000);
		 Actions action=new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//button[2]"))).click().build().perform();
		Thread.sleep(2000);
		File Pictorial_Count_ui=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(Pictorial_Count_ui, new File("C:/Users/shiwasin.PARTNERS/Desktop/gitWorkspace/test_report/Advancesearch/Total_Count_ui.png"));
		String Total_Count=driver.findElement(By.xpath("//li/div/span")).getText();
		int Total_Records=Integer.parseInt(Total_Count);
		System.out.println(Total_Records);
		Thread.sleep(2000);
		String Item_Type_Count=driver.findElement(By.xpath("//li[2]/div[2]/ul/li/div/span")).getText();
		int Item_type_Records=Integer.parseInt(Item_Type_Count);
		System.out.println(Item_type_Records);
		Thread.sleep(5000);
		String name=driver.findElement(By.xpath("//li/div/span")).getText();
		int Total_Records_AS_PER_COMBINATION=Integer.parseInt(name);
		
		//driver.findElements(By.className("tube-btn tube-btn-navyblue"))
		 
		 System.out.println("total Item_type:"+name);
		 
		
		
		
			//String ITEM_TYPE_2= driver.findElement(By.tagName("li")).getText();
			String ITEM_NAME_1=driver.findElement(By.xpath("//li[2]/div/span")).getText();
			int ITEM_TYPE_RECORD_2=Integer.parseInt(ITEM_NAME_1);
			String ITEM_NAME_2=driver.findElement(By.xpath("//li[2]/div[2]/ul/li/div/span")).getText();
			
			 System.out.println(ITEM_NAME_2+""+ITEM_TYPE_RECORD_2);
			 driver.close();
		 }
	 
		

		
		
	//}
	
	@Test
	public void BU_is_disabled_with_invalid_TG() throws Throwable{
		
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.name("Technology Group")).sendKeys("&^*");
		 Thread.sleep(10000);
		 File BU_List_disaled=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(BU_List_disaled, new File("C:/Users/shiwasin.PARTNERS/Desktop/gitWorkspace/CSX/BU_LIST_DISABLED.png"));

		 Boolean status_BU=driver.findElement(By.name("Business Unit")).isEnabled();
		 //Assert.assertEquals(driver.findElement(By.name("Business Unit")).isEnabled(),false);
		 Assert.assertEquals(driver.findElement(By.name("Business Unit")).isEnabled(),false, "it's not working as expected");
		 //Assert.assertEquals(status_BU, false);
		 System.out.println(status_BU);
		 driver.close();
		 
		 
		
		
	}
	@Test
	public void PF_is_disabled_with_invalid_TG() throws Throwable{
		
		System.setProperty("webdriver.gecko.driver",Brow);
		FirefoxProfile profile=new FirefoxProfile();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.name("Technology Group")).sendKeys("&^*");
		 Thread.sleep(10000);
		 Boolean status_PF=driver.findElement(By.name("Product Family")).isEnabled();
		 //Assert.assertEquals(driver.findElement(By.name("Product Family")).isEnabled(),false);
		 Assert.assertEquals(driver.findElement(By.name("Product Family")).isEnabled(),false, "it's not working as expected");
		 //Assert.assertEquals(status_BU, false);
		 System.out.println(status_PF);
		 
		 
		
		
	}
	
	@Test
	public void PF_is_disabled_with_invalid_BU() throws Throwable{
		
		System.setProperty("webdriver.gecko.driver",Brow);
		FirefoxProfile profile=new FirefoxProfile();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.name("Technology Group")).sendKeys("CAPRODTG");
		 Thread.sleep(10000);
		 driver.findElement(By.name("Business Unit")).sendKeys("!@@!");
		 Thread.sleep(10000);
		 Boolean status_PF=driver.findElement(By.name("Product Family")).isEnabled();
		 //Assert.assertEquals(driver.findElement(By.name("Product Family")).isEnabled(),false);
		 Assert.assertEquals(driver.findElement(By.name("Product Family")).isEnabled(),false, "it's not working as expected");
		 //Assert.assertEquals(status_BU, false);
		 System.out.println(status_PF);
		// driver.close();
		 
		 
		
		
	}
	
	@Test
	public void Autosearch_with_TG() throws Throwable{
		
		System.setProperty("webdriver.gecko.driver",Brow);
		FirefoxProfile profile=new FirefoxProfile();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.name("Technology Group")).sendKeys("CAP");
		 Thread.sleep(10000);
		 driver.findElement(By.id("ngb-typeahead-1-0")).isDisplayed();
		 Assert.assertEquals(driver.findElement(By.id("ngb-typeahead-1-0")).isDisplayed(), true);
		 System.out.println(driver.findElement(By.id("ngb-typeahead-1-0")).isDisplayed());
	}
	
	@Test
	public void Autosearch_with_BU() throws Throwable{
		
		System.setProperty("webdriver.gecko.driver",Brow);
		FirefoxProfile profile=new FirefoxProfile();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.name("Technology Group")).sendKeys("CAPRODTG");
		 
		 Thread.sleep(10000);
		 driver.findElement(By.name("Business Unit")).sendKeys("C");
		 Thread.sleep(10000);
		 driver.findElement(By.id("ngb-typeahead-2-0")).isDisplayed();
		 Assert.assertEquals(driver.findElement(By.id("ngb-typeahead-2-0")).isDisplayed(), true);
		 System.out.println(driver.findElement(By.id("ngb-typeahead-2-0")).isDisplayed());
		 driver.close();
	}
	
	@Test
	public void Autosearch_with_PF() throws Throwable{
		
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.name("Technology Group")).sendKeys("CAPRODTG");
		 Thread.sleep(10000);
		 driver.findElement(By.name("Business Unit")).sendKeys("CMSMSBU");
		 Thread.sleep(10000);
		 driver.findElement(By.name("Product Family")).sendKeys("C");
		 Thread.sleep(10000);
		 driver.findElement(By.id("ngb-typeahead-3-0")).isDisplayed();
		 Assert.assertEquals(driver.findElement(By.id("ngb-typeahead-3-0")).isDisplayed(), true);
		 System.out.println(driver.findElement(By.id("ngb-typeahead-3-0")).isDisplayed());
		 driver.close();
	}
	
	@Test
	public void Advance_search_Parameters() throws InterruptedException{
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 
		 String parameter_1=driver.findElement(By.xpath("//input[@placeholder='Technology Group']")).getAttribute("placeholder");
				 
		 System.out.println("First Parameter"+parameter_1);
		 Thread.sleep(2000);
		 String parameter_2=driver.findElement(By.xpath("//input[@placeholder='Business Unit']")).getAttribute("placeholder");
		 
		 System.out.println("Second Parameter"+parameter_2);
		 Thread.sleep(2000);
		 String parameter_3=driver.findElement(By.xpath("//input[@placeholder='Product Family']")).getAttribute("placeholder");
		 
		 System.out.println("First Parameter"+parameter_3);
		 Thread.sleep(2000);
		 String parameter_4=driver.findElement(By.xpath("//input[@placeholder='Item Type']")).getAttribute("placeholder");
		 
		 System.out.println("Second Parameter"+parameter_4);
		 Thread.sleep(2000);
		 
         String parameter_5=driver.findElement(By.xpath("//input[@placeholder='Product Type']")).getAttribute("placeholder");
		 
		 System.out.println("First Parameter"+parameter_5);
		 Thread.sleep(2000);
		 String parameter_6=driver.findElement(By.xpath("//input[@placeholder='Product Subtype']")).getAttribute("placeholder");
		 
		 System.out.println("Second Parameter"+parameter_6);
		 Thread.sleep(2000);

		// String f=driver.findElement(By.name("Technology Group")).getTagName();
		 //System.out.println(f);
		 
		
	}
	@Test
	public void Clear_All_Field_withReset() throws InterruptedException{
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 
		 String TG_Blank=driver.findElement(By.name("Technology Group")).getText();
		 System.out.println(TG_Blank);
		 Thread.sleep(1000);
		 driver.findElement(By.name("Technology Group")).sendKeys("CAPRODTG");
		 Thread.sleep(1000);
		 String BU_Blank=driver.findElement(By.name("Business Unit")).getText();
		 System.out.println(BU_Blank);
		 Thread.sleep(1000);
		 driver.findElement(By.name("Business Unit")).sendKeys("CMSMSBU");
		 Thread.sleep(1000);
		 String PF_Blank=driver.findElement(By.name("Product Family")).getText();
		 System.out.println(PF_Blank);
		 Thread.sleep(1000);
		 driver.findElement(By.name("Product Family")).sendKeys("CMSNXP");
		 Thread.sleep(1000);
		 String IT_Blank=driver.findElement(By.name("Item Type")).getText();
		 System.out.println(IT_Blank);
		 Thread.sleep(1000);
		 driver.findElement(By.name("Item Type")).sendKeys("ATO MODEL");
		 Thread.sleep(1000);
		// String Pro_type_Blank=driver.findElement(By.name("Product Type")).getText();
		 //System.out.println(Pro_type_Blank);
		 
		 //driver.findElement(By.name("Product Type")).sendKeys("BOARD");
		 //Thread.sleep(1000);
		 //String Pro_sub_type_Blank=driver.findElement(By.name("Product Subtype")).getText();
		 //System.out.println(IT_Blank);
		 //driver.findElement(By.name("Product Subtype")).sendKeys("SSERCISEBAS");
		 //Thread.sleep(3000);
		 //driver.findElement(By.name("Product Type")).click();
		 //Thread.sleep(5000);
		 Boolean Button_verify=driver.findElement(By.xpath("//button")).isEnabled();
		 System.out.println(Button_verify);
		 
		 Assert.assertEquals(driver.findElement(By.xpath("//button")).isEnabled(), true);
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button")).click();
		 Assert.assertEquals(TG_Blank, "");
		 Assert.assertEquals(BU_Blank, "");
		 Assert.assertEquals(PF_Blank, "");
		 Assert.assertEquals(IT_Blank, "");
		// Assert.assertEquals(Pro_type_Blank, "");
		// Assert.assertEquals(Pro_sub_type_Blank, "");
		 
		// String f=driver.findElement(By.name("Technology Group")).getTagName();
		 //System.out.println(f);
		 
		
	}
	@Test
	public void BU_List_As_per_the_selected_TG() throws InterruptedException, IOException{
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 //driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(1000);
		 
		 String TG_Blank=driver.findElement(By.name("Technology Group")).getText();
		 System.out.println(TG_Blank);
		 
		 Thread.sleep(3000);
		 driver.findElement(By.name("Technology Group")).sendKeys("CAPRODTG");
		 Thread.sleep(3000);
		 driver.findElement(By.name("Business Unit")).click();
		 Thread.sleep(3000);
		 System.out.println("done");
		 //Dimension size1=driver.findElement(By.id("ngb-typeahead-8")).getSize();
		 
		
		  String Auto_suggest_BU=driver.findElement(By.id("ngb-typeahead-2")).getText();
		  File BU_Auto_suggest=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(BU_Auto_suggest, new File("C:/Users/shiwasin.PARTNERS/Desktop/gitWorkspace/CSX/BU_Auto_suggest.png"));

		  
		  System.out.println("STring : "+Auto_suggest_BU);
		   String newString[] = null ;
		   for(int i=1;i<=Auto_suggest_BU.length();i++){
			   newString =  Auto_suggest_BU.split("\n");
			   
		   }

		   ArrayList<String> BUArrayList= new ArrayList<String>();
		   for (int i=0;i<newString.length;i++){
			   BUArrayList.add(newString[i]);
			   //System.out.println("**Array f string" + newString[i]);
		   }
		   Collections.sort(BUArrayList);
		   System.out.println("Array  string" + BUArrayList);
		  
		  
		//  Assert.assertEquals(driver.findElement(By.id("ngb-typeahead-2", );
		    
	
		 try {
	  			Class.forName("oracle.jdbc.driver.OracleDriver");
	  			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ldap://ldap-ldstg3.cisco.com:5000/cn=OracleContext,dc=cisco,dc=com/TS3CG1_SRVC_OTH","XXWOC","Pr1R4M9M");
	  			//if(con!=null)System.out.println("found");
	  			 
	  			Statement stmt=con.createStatement(); 
	  			ArrayList<String>BUList=new ArrayList<String>();
	  			ResultSet rs=stmt.executeQuery("SELECT distinct( business_unit)FROM apps.xxitm_item_prod_hierarchy Where TECHNOLOGY_GROUP='CAPRODTG' Order by business_unit");
	  			File BU_DB_LIST=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  		  FileUtils.copyFile(BU_DB_LIST, new File("C:/Users/shiwasin.PARTNERS/Desktop/gitWorkspace/CSX/BU_Auto_suggest_db.png"));

	  			while(rs.next()){
                	
                	String BU_Columns=rs.getString(1);
                   	BUList.add(BU_Columns);
                   	System.out.println(BU_Columns);
                }
                    System.out.println("size:"+BUList.size());
                    Collections.sort(BUList);
                    Assert.assertEquals(BUArrayList, BUList);
                    System.out.println("BU Matches with DB");
                    
	//}
               // System.out.println(rs.getString(1));
		 } catch (ClassNotFoundException | SQLException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  			
	  			
	  			 
	  		}
		 
	}
	
	@Test
	public void PF_List_As_per_the_selected_BU() throws InterruptedException{
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		// Thread.sleep(3000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(1000);
		 
		 String TG_Blank=driver.findElement(By.name("Technology Group")).getText();
		 System.out.println(TG_Blank);
		 
		 Thread.sleep(1000);
		 driver.findElement(By.name("Technology Group")).sendKeys("CAPRODTG");
		 Thread.sleep(3000);
		 driver.findElement(By.name("Business Unit")).sendKeys("CMSMSBU");
		 Thread.sleep(3000);
		 driver.findElement(By.name("Product Family")).click();
		 Thread.sleep(3000);
		 System.out.println("done");
		 //Dimension size1=driver.findElement(By.id("ngb-typeahead-8")).getSize();
		 
		
		  System.out.println("Auto suggest Data"+driver.findElement(By.id("ngb-typeahead-3")).getText());
		
		    
	
		 try {
	  			Class.forName("oracle.jdbc.driver.OracleDriver");
	  			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ldap://ldap-ldstg3.cisco.com:5000/cn=OracleContext,dc=cisco,dc=com/TS3CG1_SRVC_OTH","XXWOC","Pr1R4M9M");
	  			//if(con!=null)System.out.println("found");
	  			 
	  			Statement stmt=con.createStatement(); 
	  			ResultSet rs=stmt.executeQuery("SELECT distinct( product_family)FROM apps.xxitm_item_prod_hierarchy Where TECHNOLOGY_GROUP='CAPRODTG' AND BUSINESS_UNIT='CMSMSBU' Order by product_family");
                while(rs.next()){
                	String PF_Columns=rs.getString(1).toString();
            
                	System.out.println("Data Base value for selected TG and BU"+" "+PF_Columns);
                	Assert.assertEquals(driver.findElement(By.id("ngb-typeahead-3")).getText(),PF_Columns);
                	System.out.println("Records are matched on DB and Ui as per selected TG AND BU");
                }   
               
		 } catch (ClassNotFoundException | SQLException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  			
	  			
	  			 
	  		}
		 
	}
	
	@Test
	public void TG_List() throws InterruptedException{
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(1000);
		 
		 String TG_Blank=driver.findElement(By.name("Technology Group")).getText();
		 System.out.println(TG_Blank);
		 
	     Thread.sleep(1000);
		 driver.findElement(By.name("Technology Group")).click();
		 Thread.sleep(3000);
		
		 System.out.println("done");
		
		 
		   String Tech_List=driver.findElement(By.id("ngb-typeahead-1")).getText();
		   System.out.println("STring : "+Tech_List);
		   String newString[] = null ;
		   for(int i=1;i<=Tech_List.length();i++){
			   newString =  Tech_List.split("\n");
			   
		   }

		   ArrayList<String> technologyGrpArrayList= new ArrayList<String>();
		   for (int i=0;i<newString.length;i++){
			   technologyGrpArrayList.add(newString[i]);
			   //System.out.println("**Array f string" + newString[i]);
		   }
		   Collections.sort(technologyGrpArrayList);
		   System.out.println("Array f string" + technologyGrpArrayList);
		   
	
		
		    
	
		 try {
	  			Class.forName("oracle.jdbc.driver.OracleDriver");
	  			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ldap://tns-prod:5000/TS3CG1,cn=OracleContext,dc=cisco,dc=com","XXWOC","Pr1R4M9M");
	  			//if(con!=null)System.out.println("found");
	  			 ArrayList<String> technologyGroupArrayList = new ArrayList<String>();
	  			Statement stmt=con.createStatement(); 
	  			ResultSet rs=stmt.executeQuery("SELECT distinct(TECHNOLOGY_GROUP) FROM apps.xxitm_item_prod_hierarchy Order by TECHNOLOGY_GROUP");
                while(rs.next()){
               	String TG_Columns=rs.getString(1);
               	technologyGroupArrayList.add(TG_Columns);
               	System.out.println(TG_Columns);
                }
                System.out.println("size:"+technologyGroupArrayList.size());
                Collections.sort(technologyGroupArrayList);
                Assert.assertEquals(technologyGroupArrayList, technologyGrpArrayList);
                System.out.println("Technology Group Matches with DB");
              // System.out.println(rs.getString(1));
		 } catch (ClassNotFoundException | SQLException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  			
	  			
	  			 
	  		}
		 
	}
	@Test
	public void Default_Parameters_after_Search() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver",Brow);
		FirefoxProfile profile=new FirefoxProfile();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("Technology Group")).sendKeys("ATTG");
		 Thread.sleep(2000);
		 driver.findElement(By.name("Business Unit")).sendKeys("OTBU");
		 Thread.sleep(2000);
		 driver.findElement(By.name("Product Family")).sendKeys("15216");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[2]")).click();
		Thread.sleep(2000);
		
		String Column_1=driver.findElement(By.cssSelector("div.table-txt")).getText();
		String Column_2=driver.findElement(By.xpath("//th[3]/div")).getText();
		String Column_3=driver.findElement(By.xpath("//th[4]/div")).getText();
		String Column_4=driver.findElement(By.xpath("//th[5]/div")).getText();
		String Column_5=driver.findElement(By.xpath("//th[6]/div")).getText();
		String Column_6=driver.findElement(By.xpath("//th[7]/div")).getText();
		
		Assert.assertEquals(Column_1, "Item Name");
		System.out.println("First Column should be:"+Column_1);
		Assert.assertEquals(Column_2, "Description");
		System.out.println("Second Column should be:"+Column_2);
		Assert.assertEquals(Column_3, "Product Family");
		System.out.println("Third Column should be:"+Column_3);
		Assert.assertEquals(Column_4, "Product Type");
		System.out.println("Fourth Column should be:"+Column_4);

		Assert.assertEquals(Column_5, "Product Sub-group");
		System.out.println("Fifth Column should be:"+Column_5);
		Assert.assertEquals(Column_6, "Delivery Option");
		System.out.println("Sixth Column should be:"+Column_6);

		driver.close();
	}
	@Test
	public void Verify_Total_No_Offers_WithPictorial_View() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver",Brow);
		FirefoxProfile profile=new FirefoxProfile();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 //Thread.sleep(5000);
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("Technology Group")).sendKeys("ATTG");
		 Thread.sleep(2000);
		 driver.findElement(By.name("Business Unit")).sendKeys("OTBU");
		 Thread.sleep(2000);
		 driver.findElement(By.name("Product Family")).sendKeys("15216");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[2]")).click();
		 Thread.sleep(10000);
		 String Total_Offers=driver.findElement(By.xpath("//li/div/span")).getText();
		 int Total_Offers_Count=Integer.parseInt(Total_Offers);
		 System.out.println(Total_Offers_Count);
		 String num=driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show'])[1]/following::span[1]")).getText();
		 System.out.println(num);
		 String Page_Count=num.split("of ")[1];
		 int Total_Records=Integer.parseInt(Page_Count);
		 System.out.println(Total_Records);
		 Assert.assertEquals(Total_Offers_Count, Total_Records);
		 System.out.println("Total Records Count with Pictorial View is:"+Total_Offers_Count+"    "+"Total Records Count:"+Total_Records);
}

		
	@Test
	public void Verify_the_Item_type_Count_with_Total_Record() throws InterruptedException{
		
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("Technology Group")).sendKeys("ATTG");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("Business Unit")).sendKeys("OTBU");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("Product Family")).sendKeys("15216");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[2]")).click();
		 Thread.sleep(10000);
		 String Total_Offers=driver.findElement(By.xpath("//li/div/span")).getText();
		 int Total_Offers_Count=Integer.parseInt(Total_Offers);
		 System.out.println(Total_Offers_Count);
		 String num=driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show'])[1]/following::span[1]")).getText();
		 System.out.println(num);
		 String Page_Count=num.split("of ")[1];
		 int Total_Records=Integer.parseInt(Page_Count);
		 System.out.println(Total_Records);
		 Assert.assertEquals(Total_Offers_Count, Total_Records);
		 System.out.println("Total Records Count with Pictorial View is:"+Total_Offers_Count+"    "+"Total Records Count:"+Total_Records);
		 String ITEM_TYPE_1=driver.findElement(By.xpath("//li[2]/div[2]/ul/li/div/span")).getText();
		 String ITEM_TYPE_2=driver.findElement(By.xpath("//li[2]/div/span")).getText();
		 
		 int ITEM_1=Integer.parseInt(ITEM_TYPE_1);
		 int ITEM_2=Integer.parseInt(ITEM_TYPE_2);
		 System.out.println(ITEM_1+"SS"+ITEM_2);
		 
		 int TOTAL_ITEM_TYPE=ITEM_1+ITEM_2;
		 System.out.println("Total Item type Records:"+TOTAL_ITEM_TYPE);
		 Assert.assertEquals(TOTAL_ITEM_TYPE, Total_Offers_Count);
		 driver.quit();
		
		// List<WebElement> elements = driver.findElements(By.xpath("//div[@id='container']"));
		 
		 
		 
}
	public void Verify_the_PF_Value_on_Pictorial_View_And_PID_LIST() throws InterruptedException{
 		
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("Technology Group")).click();
		 Thread.sleep(3000);
		 String TG_Name=driver.findElement(By.id("ngb-typeahead-1-0")).getText();
		 System.out.println(TG_Name);
		 driver.findElement(By.name("Technology Group")).sendKeys(TG_Name);
		 Thread.sleep(5000);
		 driver.findElement(By.name("Business Unit")).click();
		 Thread.sleep(5000);
		 String BU_Name=driver.findElement(By.id("ngb-typeahead-2-0")).getText();
		 System.out.println(BU_Name);
		 driver.findElement(By.name("Business Unit")).sendKeys(BU_Name);
		 Thread.sleep(5000);
		 driver.findElement(By.name("Product Family")).click();
		 Thread.sleep(3000);
		String PF_Name=driver.findElement(By.id("ngb-typeahead-3-0")).getText();
		System.out.println(PF_Name);
		driver.findElement(By.name("Product Family")).sendKeys(PF_Name);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[2]")).click();
		Thread.sleep(10000);
		
		String Message=driver.findElement(By.className("no-ato-span")).getText();
		
		if(Message.isEmpty()){
		String PF_NAME_PICTORIAL=driver.findElement(By.xpath("//div[2]/ul/li/div")).getText();
		String ss=driver.findElement(By.xpath("//li/div/span")).getText();
		 
		 
		System.out.println("UI : "+ PF_NAME_PICTORIAL);
		String[] arrSplit = PF_NAME_PICTORIAL.split("\n");
		String product_family=arrSplit[0];
	   	System.out.println("Found PF : "+product_family );
	    System.out.println("Search PF Nme is:"+PF_Name+"   "+"Pictorial View PF is:"+product_family);

		 Assert.assertEquals(product_family, PF_Name);
		 String PF_NAME_PID_LIST=driver.findElement(By.xpath("//td[4]/div")).getText();
		 Assert.assertEquals(PF_NAME_PID_LIST, PF_Name);
		}
		else{
			System.out.println("No ATO's present matching this search");
		}
		//System.out.println("PF name displayion on PID LIST:"+PF_Name+"   "+"Pictorial View PF is:"+PF_VALUE);
		// driver.quit();

	  }

 	
 		  		

 		 
		@Test	
		public void Verify_total_Count_with_TG_PF_BU() throws InterruptedException{
		
		 System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(20000);
		 driver.findElement(By.className("filter")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("Technology Group")).sendKeys("CSPTG");
		 Thread.sleep(4000);
		 driver.findElement(By.name("Business Unit")).sendKeys("DCSABU");
		 Thread.sleep(4000);
		 driver.findElement(By.name("Product Family")).sendKeys("C1N6000");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[2]")).click();
		 Thread.sleep(10000);
		 
		 String Total_Count_UI=driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Show'])[1]/following::span[1]")).getText();
		 System.out.println(Total_Count_UI);
		 String Total_Count1=Total_Count_UI.split("of ")[1];
		 Total_Count1.trim();
		int Total_Count= Integer.parseInt(Total_Count1);
		
		 
		ArrayList<String> Hierarchy_Count=new ArrayList<String>();
		
		for(int i=1;i<=Total_Count;i++)
		{
			String ITEM_NAME_RECORD=driver.findElement(By.xpath("//tr["+i+"]/td[2]/div")).getText();
			Hierarchy_Count.add(ITEM_NAME_RECORD);
		}
		System.out.println("Hierarchy Count"+Hierarchy_Count);
		
		
		 
		 try {
	  			Class.forName("oracle.jdbc.driver.OracleDriver");
	  			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ldap://ldap-ldstg3.cisco.com:5000/cn=OracleContext,dc=cisco,dc=com/TS3CG1_SRVC_OTH","XXWOC","Pr1R4M9M");
	  			//if(con!=null)System.out.println("found");
	  			 
	  			Statement stmt=con.createStatement(); 
	  			int count_db=0;
	  			ArrayList<String> item_name=new ArrayList<String>();
	  			
	  			ResultSet rs=stmt.executeQuery("SELECT ir.ITEM_NAME Item_Name,ir.item_type,ir.DESCRIPTION DESCRIPTION,ir.PRODUCT_TYPE,msi.inventory_item_status_code,(SELECT C_EXT_ATTR14 FROM apps.ego_mtl_sy_items_ext_b WHERE inventory_item_id =(SELECT inventory_item_id FROM mtl_system_items WHERE segment1 = ih.item_name AND organization_id = 1) AND organization_id = 1 AND attr_group_id = 216) Smart_Account,(SELECT C_EXT_ATTR24 FROM apps.ego_mtl_sy_items_ext_b WHERE inventory_item_id =(SELECT inventory_item_id FROM mtl_system_items WHERE segment1 = ih.item_name AND organization_id = 1) AND organization_id = 1 AND attr_group_id = 216),(SELECT C_EXT_ATTR1 FROM apps.ego_mtl_sy_items_ext_b WHERE inventory_item_id = (SELECT inventory_item_id FROM mtl_system_items WHERE segment1 = ih.item_name AND organization_id = 1) AND organization_id = 1 AND attr_group_id = 250),ir.BUSINESS_GROUP,ir.TECHNOLOGY_GROUP,ir.BUSINESS_UNIT,ir.PRODUCT_FAMILY,ir.ITEM_TYPE, (SELECT C_EXT_ATTR19 OFFER_TYPE FROM apps.EGO_MTL_SY_ITEMS_EXT_B ems, apps.mtl_system_items msi1 WHERE 1 = 1 AND msi1.organization_id = 1 AND msi1.organization_id = ems.organization_id AND ems.inventory_item_id = msi1.inventory_item_id AND msi1.segment1 = ih.item_name AND ATTR_GROUP_ID IN (SELECT ATTR_GROUP_ID FROM apps.ego_attr_groups_v WHERE attr_group_name ='EGENIE_PRODUCT_ATTRIBUTES')) offer_type, ir.ITEM_CATEGORY,(SELECT c_ext_attr1 FROM apps.ego_mtl_sy_items_ext_b WHERE inventory_item_id = (SELECT inventory_item_id FROM mtl_system_items WHERE segment1 = ih.item_name AND organization_id = 1) AND organization_id = 1 AND attr_group_id = 331) unit_of_measure FROM apps.xxitm_ege_item_request ir, apps.mtl_system_items msi,apps.xxitm_item_prod_hierarchy IH WHERE 1 = 1 AND msi.segment1 = ir.item_name AND ir.item_name = ih.item_name AND msi.organization_id = 1 AND IH.ORG_CODE = 'GLO' AND IH.PRODUCT_FAMILY IN ('C1N6000') AND ir.REQUEST_ID = (SELECT MAX (REQUEST_ID) FROM apps.xxitm_ege_item_request ir1 WHERE ir1.item_name = ir.item_name) AND ir.wf_status = 'APPROVED' AND ir.item_type IN ('ATO MODEL','SPARE', 'CONFIG SPARE', 'BUNDLE')");
      		
	  			 while(rs.next()){
	  				 
	  				 String Item_name_count=rs.getString(1);
	  				 item_name.add(Item_name_count);
	  				 System.out.println(Item_name_count);
	  		     
	  			 }
	  			 System.out.println(item_name.size());
	  			 
	  			
	  			
	  			Assert.assertEquals(Total_Count, item_name.size());
	  			 
	  			 System.out.println("Count is same in DB and ui"+"  "+"UI"+Total_Count+"   "+"db"+item_name.size());
	  			 Collections.sort(Hierarchy_Count);
	  			 Collections.sort(item_name);
	  			 System.out.println("Sorted List Hierachy : "+Hierarchy_Count);
	  			 System.out.println("Sorted List item : "+item_name);
	  			 Assert.assertEquals(Hierarchy_Count, item_name);
	  			
	  			 System.out.println("Records are match on UI and DB"+"  "+"UI:"+Hierarchy_Count+"  "+item_name);
	  			 
	  		
				
					
					
	  			
	  		} catch (ClassNotFoundException | SQLException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  			 
	  		}
		    driver.close();
		    
}
		@Test
	    public void Loggin_User_Name_Role() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver",Brow);
		 FirefoxProfile profile=new FirefoxProfile();
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
		 driver.findElement(By.id("login-button")).click();
		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
		 String pTitle=driver.getTitle();
		 System.out.println(pTitle);
		 Assert.assertEquals(pTitle, "Customer Success Portal");
		 System.out.println("Page Verified");
		 Thread.sleep(8000);
		 String Uname=driver.findElement(By.cssSelector("div.textUser")).getText();
		 String[] Newname=Uname.split("\n");
		 String User_Name=Newname[0];
		 String URole=driver.findElement(By.className("textGuest")).getText();
		 //String URole=driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div[2]/header/div/div[3]/a[4]/div[1]/span")).getText();
		 
		 System.out.println("Name:"+User_Name+"   "+"Role:"+URole);
		 
		 Assert.assertEquals(User_Name, User_Name);
		 Assert.assertEquals(URole, URole);
		 
		 System.out.println("Loggin User name is:"+User_Name+"   "+"User Role is:"+URole);
		}
		
		
		@Test
		public void User_Logout() throws InterruptedException{
			
			System.setProperty("webdriver.gecko.driver",Brow);
			 FirefoxProfile profile=new FirefoxProfile();
			 WebDriver driver=new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
			 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
			 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
			 driver.findElement(By.id("login-button")).click();
			 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
			 String pTitle=driver.getTitle();
			 System.out.println(pTitle);
			 Assert.assertEquals(pTitle, "Customer Success Portal");
			 System.out.println("Page Verified");
			 Thread.sleep(8000);
			 
			 Actions action=new Actions(driver);
			 action.moveToElement(driver.findElement(By.cssSelector("div.textUser"))).build().perform();
			 
			// driver.findElement(By.xpath("/html/body/app-root/app-main/div/main/div[2]/header/div/div[3]/a[4]/div[1]")).click();
			// Thread.sleep(5000);
			 driver.findElement(By.xpath("//div[2]/a")).click();
			 
			 String URL=driver.getCurrentUrl();
			 Assert.assertEquals(URL,URL);
			 System.out.println("User logout successfully:"+URL);
		}	
		
		@Test
		public void User_should_land_on_Home_Page() throws InterruptedException{
		
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
		 Thread.sleep(8000);
		 driver.findElement(By.cssSelector("div.row:nth-child(3) > div:nth-child(3) > h6:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.linkText("Home")).click();
		 Thread.sleep(5000);
		 String Verify_URL=driver.getCurrentUrl();
		 Assert.assertEquals(Verify_URL, "https://csx-stage.cisco.com/customersuccess/#/");
		 System.out.println("URL IS:"+Verify_URL);
		 
		 
		}
	 
		
		@Test
		public void Verify_the_Result_with_TG_BU_PF_Item_type_Prod_Type_Prod_subType() throws InterruptedException{
	 		
	 		 System.setProperty("webdriver.gecko.driver",Brow);
	 		 FirefoxProfile profile=new FirefoxProfile();
	 		 WebDriver driver=new FirefoxDriver();
	 		 driver.manage().window().maximize();
	 		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
	 		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
	 		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
	 		 driver.findElement(By.id("login-button")).click();
	 		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
	 		 String pTitle=driver.getTitle();
	 		 System.out.println(pTitle);
	 		 Assert.assertEquals(pTitle, "Customer Success Portal");
	 		 System.out.println("Page Verified");
	 		Thread.sleep(20000);
	 		 driver.findElement(By.className("filter")).click();
	 		 Thread.sleep(5000);
	 		 driver.findElement(By.name("Technology Group")).click();
	 		 Thread.sleep(3000);
	 		 String TG_Name=driver.findElement(By.id("ngb-typeahead-1-0")).getText();
	 		 System.out.println(TG_Name);
	 		 driver.findElement(By.name("Technology Group")).sendKeys(TG_Name);
	 		 Thread.sleep(5000);
	 		 driver.findElement(By.name("Business Unit")).click();
	 		 Thread.sleep(5000);
	 		 String BU_Name=driver.findElement(By.id("ngb-typeahead-2-0")).getText();
	 		 System.out.println(BU_Name);
	 		 driver.findElement(By.name("Business Unit")).sendKeys(BU_Name);
	 		 Thread.sleep(5000);
	 		 driver.findElement(By.name("Product Family")).click();
	 		 Thread.sleep(3000);
			String PF_Name=driver.findElement(By.id("ngb-typeahead-3-0")).getText();
			System.out.println(PF_Name);
	 		driver.findElement(By.name("Product Family")).sendKeys(PF_Name);
	 		Thread.sleep(7000);
	 		
	 		driver.findElement(By.name("Item Type")).sendKeys("BUNDLE");
	 		 Thread.sleep(3000);
			String Item_Type=driver.findElement(By.id("ngb-typeahead-4-0")).getText();
			System.out.println(Item_Type);
	 		driver.findElement(By.name("Item Type")).click();
	 		Thread.sleep(7000);
	 		
	 		driver.findElement(By.name("Product Type")).sendKeys("BASE");
	 		 Thread.sleep(3000);
	 		String Prod_Type=driver.findElement(By.id("ngb-typeahead-5-0")).getText();
			System.out.println(Prod_Type);
	 		driver.findElement(By.name("Product Type")).click();
	 		Thread.sleep(7000);
	 		
	 		
	 		driver.findElement(By.name("Product Subtype")).sendKeys("SPARE");
	 		 Thread.sleep(3000);
	 		String Prod_Sub_Type=driver.findElement(By.id("ngb-typeahead-6-1")).getText();
			System.out.println(Prod_Sub_Type);
	 		driver.findElement(By.name("Product Subtype")).click();
	 		Thread.sleep(10000);
	 		driver.findElement(By.name("Item Type")).click();
	 		Thread.sleep(7000);
	 		driver.findElement(By.xpath("//button[2]")).click();
	 		Thread.sleep(10000);
	 		
	 		
	 		String Message=driver.findElement(By.className("no-ato-span")).getText();	 		
	 		if(Message.isEmpty()){
	 			
	 			Assert.assertEquals(driver.findElement(By.xpath("//td[4]/div")).getText(),PF_Name);
	 			System.out.println("product type match:"+PF_Name);
	 		}
	 		else{
	 			System.out.println("No ATO's present matching this search");
	 		}
		}
		
	@Test
		public void Verify_Basic_Search_should_disable_with_Advance_Search() throws InterruptedException{
	 		
	 		 System.setProperty("webdriver.gecko.driver",Brow);
	 		 FirefoxProfile profile=new FirefoxProfile();
	 		 WebDriver driver=new FirefoxDriver();
	 		 driver.manage().window().maximize();
	 		 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
	 		 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
	 		 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
	 		 driver.findElement(By.id("login-button")).click();
	 		 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
	 		 String pTitle=driver.getTitle();
	 		 System.out.println(pTitle);
	 		 Assert.assertEquals(pTitle, "Customer Success Portal");
	 		 System.out.println("Page Verified");
	 		 Thread.sleep(5000);
	 		 if(driver.findElement(By.className("filter")).isEnabled()){
	 		 Thread.sleep(20000);
	 		 driver.findElement(By.className("filter")).click();
	 		 Thread.sleep(5000);
	 		
	 		Assert.assertEquals(driver.findElement(By.cssSelector("div.form-group__text.select")).isSelected(), false);
	 		System.out.println("Basic Search is disabled with Advance Search,Please Close Advance Search First");
	 		 }
	 		 else{
	 			 System.out.println("Advance search is not clickable");
	 		 }
		
		}
		
public void Login_withAdmin() throws InterruptedException{
			
			String Brow="C:\\setup\\geckodriver.exe";
			 System.setProperty("webdriver.gecko.driver",Brow);
			 FirefoxProfile profile=new FirefoxProfile();
			 WebDriver driver=new FirefoxDriver();
			 Actions action=new Actions(driver);
			 driver.manage().window().maximize();
			 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
			 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
			 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
			 driver.findElement(By.id("login-button")).click();
			 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
			 String pTitle=driver.getTitle();
			 System.out.println(pTitle);
			 Assert.assertEquals(pTitle, "Customer Success Portal");
			 System.out.println("Page Title Verified:"+pTitle);
			 Thread.sleep(15000);
			
			
		}
	
	   String Brow="C:\\setup\\geckodriver.exe";
	  
	   //System.setProperty("webdriver.gecko.driver",Brow);
	  
	  // WebElement table = driver.findElement(By.cssSelector("html body.cui app-root app-main div.content.mainContainer main.row div.col-md-12 div.container app-search-result app-ato-list div div table.table.table--bordered.offers-table.ato-table"));

	   
	   
	   public void Api_Error() throws InterruptedException{
		   
		     String Brow="C:\\setup\\geckodriver.exe";
			 System.setProperty("webdriver.gecko.driver",Brow);
			 FirefoxProfile profile=new FirefoxProfile();
			 WebDriver driver=new FirefoxDriver();
			 Actions action=new Actions(driver);
			 driver.manage().window().maximize();
			 driver.get("https://sso-test.cisco.com/autho/forms/CECLogin.html");
			 driver.findElement(By.id("userInput")).sendKeys("shiwasin");
			 driver.findElement(By.id("passwordInput")).sendKeys("Reyansh@30june");
			 driver.findElement(By.id("login-button")).click();
			 driver.get("https://csx-stage.cisco.com/customersuccess/#/");
			 String pTitle=driver.getTitle();
			 System.out.println(pTitle);
			 Assert.assertEquals(pTitle, "Customer Success Portal");
			 System.out.println("Page Title Verified:"+pTitle);
			
			 
			 
			 if(driver.findElement(By.cssSelector("div.spinner")).isDisplayed()){
				 
				 System.out.println("Getting API ERRORS");
				 
				 
			 }else{
				 System.out.println("WORKING FINE");
			 }
			 
		   
		   
	   }   
	   //}
	   

}