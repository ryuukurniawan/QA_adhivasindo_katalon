import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
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
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pos.awh.co.id/admin/road-to-event')

WebUI.click(findTestObject('Object Repository/POS Store Repo/Record object/Page_/div_PILIH'))

WebUI.click(findTestObject('Object Repository/POS Store Repo/Record object/Page_/div_Silahkan Pilih Services_card-body'))

WebUI.click(findTestObject('Object Repository/POS Store Repo/Record object/Page_REGISTER INTEGRASI BY AWH/div_DAFTAR'))

// Temukan Test Object
TestObject testObject = findTestObject('Object Repository/POS Store Repo/Record object/Page_REGISTER PHOTOBOOTH BY AWH/add_photobooth')

if (testObject == null) {
	println('Test Object tidak ditemukan.')

	WebUI.closeBrowser()

	return null
}

// Cari elemen tombol 'Add to Cart'
List<WebElement> addToCartButtons = WebUiCommonHelper.findWebElements(testObject, 10)

if ((addToCartButtons == null) || addToCartButtons.isEmpty()) {
	println('Tidak ada tombol \'Add to Cart\' ditemukan.')

	WebUI.closeBrowser()

	return null
}

// Klik semua tombol
for (WebElement button : addToCartButtons) {
	WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(button))

	WebUI.delay(1)
}

WebUI.click(findTestObject('Object Repository/POS Store Repo/Record object/Page_REGISTER PHOTOBOOTH BY AWH/img_Go To Payment_btn-icon mt-1'))

WebUI.click(findTestObject('Object Repository/POS Store Repo/Record object/Page_REGISTER PHOTOBOOTH BY AWH/button_Go To Payment'))

WebUI.setText(findTestObject('Object Repository/POS Store Repo/Record object/Page_REGISTER INTEGRASI BY AWH/input_Isi Data Diri Ya_nama'), 
    'Ryuu Testing')

WebUI.setText(findTestObject('Object Repository/POS Store Repo/Record object/Page_REGISTER INTEGRASI BY AWH/input_Isi Data Diri Ya_no_handphone'), 
    '081381255117')

WebUI.click(findTestObject('Object Repository/POS Store Repo/Record object/Page_REGISTER INTEGRASI BY AWH/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/POS Store Repo/Record object/Page_REGISTER INTEGRASI BY AWH/button_Bayar Sekarang'))

WebUI.closeBrowser()

