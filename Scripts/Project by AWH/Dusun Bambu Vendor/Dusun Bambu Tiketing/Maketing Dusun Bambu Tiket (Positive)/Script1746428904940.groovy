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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String jumlahTiket = "5"

String jenisTiket = "1"
//Gratis:4 , P1:1, P3:3

WebUI.openBrowser('https://dev.awh.co.id/area-undangan/index.php/auth')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_username'), 'marketing-dusbam-1')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_password'), '1234')

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/label_Tetap Masuk'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/button_Login'))

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Marketing Dusbam/Tombol Tambah tiket yang akan dicetak'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Marketing Dusbam/Tombol_Pilih_Jenis Tiket'),jenisTiket, false)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Marketing Dusbam/Form_Jumlah_Tiket'), jumlahTiket)

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Marketing Dusbam/Tombol_Simpan_Tambah_Tiket'))

WebUI.waitForAlert(2)
if (WebUI.verifyTextPresent(jumlahTiket,false)) {
	println("✅ Tambah data tiket berhasil!")
}
else {
	println("❎ Tambah data tiket gagal")
}




