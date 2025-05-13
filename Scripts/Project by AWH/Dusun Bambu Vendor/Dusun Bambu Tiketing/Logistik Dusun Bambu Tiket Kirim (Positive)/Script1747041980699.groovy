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

String codeBacthTiket = '209633'

String minTiket = '1'

String maxTiket = '5'

String noLoket = '1'

// Loket 1:1 , Loket 2:2, Loket 3:3 dst
WebUI.openBrowser('https://dev.awh.co.id/area-undangan/index.php/auth')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_username'), 'logistik-dusbam-1')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_password'), '1234')

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/label_Tetap Masuk'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/button_Login'))

WebUI.click(findTestObject('Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Logistik Dusbam/Tombol kirim tiket ke loket'))

WebUI.click(findTestObject('Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Logistik Dusbam/Tombol kirim menggunakan nomor urut tiket'))

WebUI.setText(findTestObject('Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Logistik Dusbam/Form input kode batch kirim tiket'), 
    codeBacthTiket)

WebUI.click(findTestObject('Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Logistik Dusbam/Tombol cek kode bacth tiket'))

WebUI.selectOptionByValue(findTestObject('Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Logistik Dusbam/Form pilihan loket pada kirim tiket'), 
    noLoket, false)

WebUI.setText(findTestObject('Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Logistik Dusbam/Form input no urut tiket min'), 
    minTiket)

WebUI.setText(findTestObject('Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Logistik Dusbam/Form input no urut tiket max'), 
    maxTiket)

WebUI.click(findTestObject('Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Logistik Dusbam/Tombol konfirmasi kirim tiketss'))

