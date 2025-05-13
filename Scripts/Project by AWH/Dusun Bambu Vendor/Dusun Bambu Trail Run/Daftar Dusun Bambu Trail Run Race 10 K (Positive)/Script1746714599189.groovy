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

String gender = "male"
// Male : male , Female : female

String identify = "ktp"
// KTP : ktp , KK : kk , PASSPORT : passport

String country = "102"
// Indonesia : 102

String state = "1805"
// DKI Jakarta : 1805 , Jawa Barat : 1825

String city = "154473"
// Jakarta Timur : 154473, Bandung : 56196, Bekasi : 56215

String blood = "O+"
// O+ : O+ , A+ : A+ dst

String sizeBaju = "XL"
// XL : XL , L : L  dst

WebUI.openBrowser('https://dusunbambutrailrun.com/')

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Tombol Daftar Dusun Bambu Trail Run'))

WebUI.scrollToElement(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Tombol Daftar Race 10K'), 
    0)

WebUI.click(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Tombol Daftar Race 10K'))

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input nama pendaftaran'), 
    name)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input bib nama'), 
    bibName)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input email'), 
    email)

WebUI.scrollToElement(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form pilih gender pendaftar'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form pilih gender pendaftar'), 
    gender, false)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input phone number'), 
    phoneNumber)

WebUI.selectOptionByValue(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form pilih kartu identitas'), 
    identify, false)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input nomor identitas'), 
    identifyNumber)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input tempat lahir'), 
    tempatLahir)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input tanggal lahir'), tanggalLahir)

WebUI.uploadFile(findTestObject('Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input upload foto'), 
    'C:\\Users\\ryuur\\Pictures\\Testing Doc\\Profile Picture Test.jpg')

WebUI.uploadFile(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input upload foto kartu identitas'), 
    'C:\\Users\\ryuur\\Pictures\\Testing Doc\\Doc Picture Test.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form pilih negara perserta'), country, false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form pilih provinsi peserta'), state, false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form pilih kota peserta'), city, false)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input alamat indentitas'), alamat)

WebUI.selectOptionByValue(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form pilih golongan darah peserta'), blood, false)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input riwayat penyakit'), riwayatPenyakit)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input komunitas lari'), komunitasLari)

WebUI.selectOptionByValue(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form pilih ukuran baju peserta'), sizeBaju, false)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input nama emergency'), emergancyName)

WebUI.setText(findTestObject('Object Repository/Project by AWH/Dusun Bambu Vendor/Dusum Bambu Trail Run/Prod/Form input phone number emergency'), emergancyPhoneNumber)







