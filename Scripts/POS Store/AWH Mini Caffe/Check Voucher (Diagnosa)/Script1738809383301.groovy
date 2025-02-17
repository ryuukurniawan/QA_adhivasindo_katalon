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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('https://pos.awh.co.id/admin/road-to-event')

WebUI.maximizeWindow()

WebUI.click(findTestObject('POS Store Repo/First Awh Store Click'))

WebUI.click(findTestObject('POS Store Repo/POS Ruby Store Repo/Button All POS'))

WebUI.click(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini Caffee Interface Button'))

// Temukan Test Object
TestObject testObject = findTestObject('Object Repository/POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Button Add Product')

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

WebUI.click(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Object Mini Caffe Spy/Keranjang Belanja'))

WebUI.click(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Object Mini Caffe Spy/button_Go To Payment'))

WebUI.setText(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Page_REGISTER INTEGRASI BY AWH/input_Isi Data Diri Ya_nama'), 
    'Ryuu Testing')

WebUI.setText(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Page_REGISTER INTEGRASI BY AWH/input_Isi Data Diri Ya_no_handphone'), 
    '081381255117')

WebUI.click(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Page_REGISTER INTEGRASI BY AWH/button_Selanjutnya'))