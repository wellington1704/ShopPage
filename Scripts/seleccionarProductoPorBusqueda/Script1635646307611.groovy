import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import utileria.accion as accion

WebUI.callTestCase(findTestCase("Test Cases/seleccionarProducto"), [:], FailureHandling.STOP_ON_FAILURE);

TestData itemdat = findTestData("itemdat");

int rows = itemdat.getRowNumbers();

String itemname;

for(int i = 1; i<= rows; i++) {
	String status = itemdat.getObjectValue('ejecutar', i).toString();
	
	//if status = true
	if(status.equalsIgnoreCase("TRUE")) {
	
		//if the search bar is present
		if(accion.present("//header/div[1]/div[1]")) {
			
			itemname = itemdat.getObjectValue('itemname', i).toString();
			
			accion.agregarPuntoDeVerificacion("Page Screen is displayed", true, true);
			
			//insert item
			accion.click("//input[@type='search']");
			accion.setText("//input[@type='search']", itemname);
			accion.click("//button[@type='submit']")
			accion.click("//button[contains(text(),'ADD TO CART')]")
			accion.click("//header/div[1]/div[3]/a[4]/img[1]")
			accion.click("//button[contains(text(),'PROCEED TO CHECKOUT')]")
			accion.click("//button[contains(text(),'Place Order')]")
			accion.click("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")
			accion.click("//option[contains(text(),'Afghanistan')]")
			accion.click("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/input[1]")
			accion.click("//button[contains(text(),'Proceed')]")
			
			
			
			
			
			
		}
		
	}
}