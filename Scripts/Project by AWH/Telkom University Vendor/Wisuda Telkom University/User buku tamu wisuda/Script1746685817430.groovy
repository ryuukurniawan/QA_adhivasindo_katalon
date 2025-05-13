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

String jenisUser = '5'
// Master Of Ceremony = 4 , Operation = 5, Coordinator = 6

WebUI.openBrowser('https://client.awh.co.id/undangan/auth')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_username'), 'telkomuniv48')

WebUI.setText(findTestObject('Undangan by AWH/Client Area Undangan/Login Object/input_Tetap Masuk_password'), 'IEriS1NBuT')

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/label_Tetap Masuk'))

WebUI.click(findTestObject('Object Repository/Undangan by AWH/Client Area Undangan/Login Object/button_Login'))

WebUI.click(findTestObject('Object Repository/Project by AWH/Telkom Univesity Vendor/Wisuda Telkom University/Tombol edit buku tamu sesi 1'))

WebUI.click(findTestObject('Object Repository/Project by AWH/Telkom Univesity Vendor/Wisuda Telkom University/Tombol halaman users'))

WebUI.click(findTestObject('Object Repository/Project by AWH/Telkom Univesity Vendor/Wisuda Telkom University/Tombol tambah akun user'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Project by AWH/Telkom Univesity Vendor/Wisuda Telkom University/Form pilih user'), jenisUser, false)

WebUI.click(findTestObject('Object Repository/Project by AWH/Telkom Univesity Vendor/Wisuda Telkom University/Tombol konfirmasi akun user'))


