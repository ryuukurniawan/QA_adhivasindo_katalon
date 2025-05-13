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

//Ini adalah variable untuk mendefinisikan data tamu biar ga ribet ke bawah

String namaTamu = "Nama Tamu"

String alamatTamu = "Alamat Tamu"

String noTelpn = "0181381255117"

String jenisTamu = "VIP"


WebUI.openBrowser('https://dev.awh.co.id/area-undangan/index.php/auth')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_username'), 'ryuutestin47')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_password'), 'AfpLeWfHzJ')

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/label_Tetap Masuk'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/button_Login'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/span_Buku Tamu'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Tombol Tambah Data Tamu'))

WebUI.setText(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Form Input Nama Tamu'), namaTamu)

WebUI.setText(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Form Input Alamat Tamu'), alamatTamu)

WebUI.setText(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/iForm Input No Telpn Tamu'), noTelpn)

WebUI.selectOptionByValue(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Dropdown Jenis Undangan'),jenisTamu, false)

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Tombol Input Undangan Individu'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Tombol Simpan Data Tamu'))

WebUI.waitForAlert(2)
if (WebUI.verifyTextPresent(namaTamu,false)) {
	println("✅ Tambah data tamu berhasil!")
}
else {
	println("❎ Tambah data tamu gagal")
}

WebUI.closeBrowser()
