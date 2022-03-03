
===================================================================================
                                          Selenium Testing
===================================================================================

Step 1: create one JAVA Project-Add package--Add class
Step 2: Add class librabry and chrome driver path
Step 3:  very IMP delete module.info file



----------------------------------------------------------------------------------
Locator testing:
-----------------------------------------------
chrome search Box:
id="search_query_top"
name="submit_search"
--------------------------------------------------------------------
driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
driver.findElement(By.name("submit_search")).click(); 
driver.findElement(By.linkText("Printed Chiffon Dress")).click();
-------------------------------------------------------------------



--------------------------------------------------------------------
PATH to search element
-------------------------------------------------------------------
to search 
step 1: //
step 2:tag of element
//span[@id='id name']

example:
//span[@id='our_price_display']
//p[@class='our_price_display']
//span[@id='our_price_display' and text()='$16.40']
//span[@id='our_price_display' or text()='$16.40']
(//span)[last()]
 
 https://www.w3schools.com/xml/xml_xpath.asp
 https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors
 
 
 
 
 
--------------------------------------------------------------------
Alert and Its types
-------------------------------------------------------------------
 
driver.findElementsByXPath("//button[contains(text(),'Text in your webpage')]");
