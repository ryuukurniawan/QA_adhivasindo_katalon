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


String codeBacthTiket = "209633"

String namaGrup = "test0905"

String minTiket = "1"

String maxTiket = "5"

WebUI.openBrowser('https://dev.awh.co.id/area-undangan/index.php/auth')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_username'), 'loket1-dusbam-1')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_password'), '1234')

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/label_Tetap Masuk'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/button_Login'))

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Loket Dusbam/Tombol order menggunakan nomor urut tiket'))

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Loket Dusbam/Form input nama grup order'), namaGrup)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Loket Dusbam/Form input kode bacth'), codeBacthTiket)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Loket Dusbam/Form input nomor urut min'), minTiket)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Loket Dusbam/Form input nomor urut max'),maxTiket)

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Loket Dusbam/Tombol konfirmasi order'))

WebUI.waitForAlert(4)

if(WebUI.verifyTextPresent(namaGrup, false , FailureHandling.CONTINUE_ON_FAILURE)) {
	println("✅ Order tiket dengan nama grup "+ namaGrup +" berhasil!")
}else{
	println("❎ Order tiket gagal")
}

WebUI.closeBrowser()
