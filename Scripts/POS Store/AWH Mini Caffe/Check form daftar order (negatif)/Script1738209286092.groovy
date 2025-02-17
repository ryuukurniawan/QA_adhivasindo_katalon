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

WebUI.openBrowser('https://pos.awh.co.id/admin/road-to-event')

WebUI.maximizeWindow()

WebUI.click(findTestObject('POS Store Repo/First Awh Store Click'))

WebUI.click(findTestObject('POS Store Repo/POS Ruby Store Repo/Button All POS'))

WebUI.click(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini Caffee Interface Button'))

WebUI.click(findTestObject('Object Repository/POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Add one menu'))

WebUI.click(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Object Mini Caffe Spy/Keranjang Belanja'))

WebUI.click(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Object Mini Caffe Spy/button_Go To Payment'))

WebUI.setText(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Page_REGISTER INTEGRASI BY AWH/input_Isi Data Diri Ya_nama'), 
    'Ryuu ○( ＾皿＾)っ Hehehe…')

WebUI.setText(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Page_REGISTER INTEGRASI BY AWH/input_Isi Data Diri Ya_no_handphone'), 
    '0813163-----===')

WebUI.click(findTestObject('Object Repository/POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Page_REGISTER INTEGRASI BY AWH/button_Selanjutnya'))

if (WebUI.verifyTextPresent('Nama maksimal 12 karakter', true, FailureHandling.OPTIONAL) && WebUI.verifyTextPresent('Mohon Masukan Nomor Yang Benar', 
    true, FailureHandling.OPTIONAL)) {
    WebUI.comment('✅ Kesalahan pada form bagian nama dan telpn berhasil terdeteksi !!!')

    println('✅ Kesalahan pada form bagian nama dan telpn berhasil terdeteksi !!!')

    WebUI.closeBrowser()

    return null
} else if (WebUI.verifyTextPresent('Nama maksimal 12 karakter', true, FailureHandling.OPTIONAL)) {
    WebUI.comment('✅ Kesalahan pada form bagian nama berhasil terdeteksi !!!')

    println('✅ Kesalahan pada form bagian nama berhasil terdeteksi !!!')

    WebUI.closeBrowser()

    return null
} else if (WebUI.verifyTextPresent('Mohon Masukan Nomor Yang Benar', true, FailureHandling.OPTIONAL)) {
    WebUI.comment('✅ Kesalahan pada form bagian telpn berhasil terdeteksi !!!')

    println('✅ Kesalahan pada form bagian telpn berhasil terdeteksi !!!')

    WebUI.closeBrowser()

    return null
} else {
    WebUI.comment('❎ Terdapat kesalahan pada bagian form order data yang salah berhasil masuk')

    println('❎ Terdapat kesalahan pada bagian form order data yang salah berhasil masuk')

    WebUI.closeBrowser()

    assert false : 'Test gagal karena tidak ada error yang terdeteksi!'
}

