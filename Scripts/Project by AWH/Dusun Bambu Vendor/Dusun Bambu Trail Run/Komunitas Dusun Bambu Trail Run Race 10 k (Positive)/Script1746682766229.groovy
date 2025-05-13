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

WebUI.openBrowser('https://dusunbambutrailrun.com/')

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Tombol Daftar Dusun Bambu Trail Run'))

WebUI.scrollToElement(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Tombol Daftar Race 10K'), 0)

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Tombol Daftar Race 10K'))

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Tombol Input Komunitas'))

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input kode referal komunitas'), namaKomunitas)

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Tombol cek kode referal komunitas'))

WebUI.waitForAlert(3)

WebUI.scrollToElement(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Element Harga Daftar'), 0)

if (WebUI.verifyTextPresent('Rp 450.000,-', false, FailureHandling.CONTINUE_ON_FAILURE)) {
	println('Teks Rp 450.000,- ditemukan')
		
	WebUI.comment('✅ komunitas ' + namaKomunitas + ' sudah sesuai')
	println('✅ komunitas ' + namaKomunitas + ' sudah sesuai')

}  else {
	println('❎ pendaftaran komunitas gagal')
}

WebUI.closeBrowser()