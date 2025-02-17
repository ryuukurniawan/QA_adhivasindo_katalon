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

WebUI.openBrowser('https://client.awh.co.id/undangan/auth')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_username'), 'asda1616')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_password'), '9OB1bH3fp6')

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/label_Tetap Masuk'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/button_Login'))

WebUI.click(findTestObject('Undangan by AWH/Client Area Undangan/Musik Object/span_Manage Undangan'))

WebUI.click(findTestObject('Undangan by AWH/Client Area Undangan/Musik Object/span_Musik'))

//'69','68','133','132','131','130','129','128','66','64','63','61','60','48','126','125','124','123','122','121','67','106','107','71','65','62','70',

List<String> undanganIDs = Arrays.asList(
	'69','68','133','132','131','130','129','128','66','64','63','61','60','48','126',
	'125','124','123','122','121','67','106','107','71','65','62','70','127')

for (String undaganid : undanganIDs) {
	//'53','54','55','56','57','58','59',
	List<String> songValues = Arrays.asList(
		'55','56','57','58','59','60','61')
	
	for(String songvalue : songValues) {
		
		WebUI.click(findTestObject('Undangan by AWH/Client Area Undangan/Musik Object/button tambah musik ke undangan'))
		
		WebUI.waitForElementPresent(findTestObject('Undangan by AWH/Client Area Undangan/Musik Object/select_Acara'), 3)
		
		WebUI.selectOptionByValue(findTestObject('Undangan by AWH/Client Area Undangan/Musik Object/select_Acara'), '2', false)
		
		WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Musik Object/input_Themes_id_themes_id'), undaganid)

		WebUI.selectOptionByValue(findTestObject('Undangan by AWH/Client Area Undangan/Musik Object/select_-- Pilih Musik --'), songvalue, false)
		
		WebUI.click(findTestObject('Undangan by AWH/Client Area Undangan/Musik Object/label_Active'))
		
		WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Musik Object/button_Simpan'))
	}
}

WebUI.closeBrowser()