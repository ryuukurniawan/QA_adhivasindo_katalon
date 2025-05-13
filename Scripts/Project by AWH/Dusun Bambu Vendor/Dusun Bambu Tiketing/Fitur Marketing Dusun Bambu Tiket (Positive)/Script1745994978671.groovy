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

String kodeBatch = "628260"

String keyWord = "6282"

String namaProfile = "Marketing Teamr"

WebUI.openBrowser('https://dev.awh.co.id/area-undangan/index.php/auth')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_username'), 'marketing-dusbam-1')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_password'), '1234')

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/label_Tetap Masuk'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/button_Login'))

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Marketing Dusbam/Form_Pencarian'), keyWord)

WebUI.waitForAlert(2)
if (WebUI.verifyTextPresent(kodeBatch,false)) {
	println("✅ Pencarian data tiket berhasil!")
}
else {
	println("❎ Pencarian data tiket gagal")
}

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Marketing Dusbam/Tombol_Refresh'))

WebUI.waitForAlert(2)
if (WebUI.verifyTextPresent(keyWord,false,FailureHandling.OPTIONAL)) {
	println("✅ Refresh halaman tiket gagal")
}
else {
	println("❎ Refresh halaman tiket berhasil")
}

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Marketing Dusbam/Tombol_Edit_Profil'))

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Marketing Dusbam/Form Input Nama Edit Profile'), namaProfile)

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Marketing Dusbam/Tombol Submit Edit Profile'))

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusun Bambu Tiketing/Marketing Dusbam/Tombol Konfirmasi Edit Profile'))

WebUI.waitForAlert(2)
if (WebUI.verifyTextPresent("PROFIL BERHASIL DI UPDATE",false)) {
	println("✅ Edit data profil berhasil!")
}
else {
	println("❎ Edit data profil gagal")
}

WebUI.closeBrowser()