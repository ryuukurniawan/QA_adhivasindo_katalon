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

//Ini adalah variable untuk mendefinisikan data tamu biar ga ribet ke bawah

String namaTamu = "Nama Tamu Update"

String alamatTamu = "Alamat Tamu Update"

String noTelpn = "0181381255118"

String jenisTamu = "BIASA"


WebUI.openBrowser('https://dev.awh.co.id/area-undangan/index.php/auth')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_username'), 'ryuutestin47')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_password'), 'AfpLeWfHzJ')

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/label_Tetap Masuk'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/button_Login'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/span_Buku Tamu'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Tombol Kelola Data Tamu'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Tombol Edit Data Tamu'))

WebUI.clearText(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Form Input Nama Tamu Edit'))

WebUI.clearText(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Form Input Alamat Edit'))

WebUI.clearText(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Form Input No Telpn Edit'))

WebUI.setText(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Form Input Nama Tamu Edit'), namaTamu)

WebUI.setText(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Form Input Alamat Edit'), alamatTamu)

WebUI.setText(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Form Input No Telpn Edit'), noTelpn)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Tombol Jenis Tiket Edit'),jenisTamu, false)

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Tombol Input Grup Edit'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Edit Buku Tamu Undangan Pernikahan/Tombol Simpan Edit'))

WebUI.waitForAlert(2)
if (WebUI.verifyTextPresent(namaTamu,false)) {
	println("✅ Update data tamu berhasil!")
}
else {
	println("❎ Update data tamu gagal")
}

WebUI.closeBrowser()
