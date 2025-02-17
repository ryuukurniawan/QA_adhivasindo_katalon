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

WebUI.scrollToElement(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Page_REGISTER INTEGRASI BY AWH/Form Input Voucher'), 
    2)

// List of vouchers to test
List<String> voucherCodes = Arrays.asList(
	'DHIVA181024', 'DHIVA261024', 'DHIVA160301','DHIVA160303','DHIVA170906','DHIVA210110','DHIVA210211','DHIVA210818','DHIVA221121','DHIVA081221','DHIVA180322',
	'DHIVA020922','DHIVA070922','DHIVA200323','DHIVA250723','DHIVA010823','DHIVA020923','DHIVA050923','DHIVA121223','DHIVA020124','DHIVA190124','DHIVA200124','DHIVA220124',
	'DHIVA250124','DHIVA010424','DHIVA270324','DHIVA090724','DHIVA260724','DHIVA010724','DHIVA020724','DHIVA220724','DHIVA151122','DHIVA6705220004','DHIVA6702223045',
	'DHIVA6701223104','DHIVA6701223034','DHIVA6706223151','DHIVA6702220093','DHIVA6704220082','DHIVA6704220125','DHIVA21402001','DHIVA170924','DHIVA6704220074','DHIVA6704220020',
	'DHIVA6703220104','DHIVA6703220059','DHIVA031024','DHIVA21402001','DHIVA111124','DHIVA211124','DHIVA291124','DHIVA041224','DHIVA231224','DHIVA311224','DHIVA301224','DHIVA141224',
	'DHIVA161224','DHIVA030125','DHIVA040125','DHIVA130125','DHIVA6705220033','DHIVA6704220118')

for (String voucher : voucherCodes) {
    try {
        // Set voucher code
        WebUI.setText(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Page_REGISTER INTEGRASI BY AWH/Form Input Voucher'), voucher)

        // Click Apply button
        WebUI.click(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Page_REGISTER INTEGRASI BY AWH/button_Apply'))

        // Wait for the result to process
        WebUI.delay(2)

        println("Memulai pengecekan teks...")

        // Check if "Voucher applied successfully" text is present
        if (WebUI.verifyTextPresent('Voucher applied successfully.', false, FailureHandling.CONTINUE_ON_FAILURE)) {
            println("Teks 'Voucher applied successfully.' ditemukan")
            WebUI.click(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Page_REGISTER INTEGRASI BY AWH/button_OK'))

            TestObject discountObject = findTestObject('Object Repository/POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Page_REGISTER INTEGRASI BY AWH/Discont')
            String discountText = WebUI.getText(discountObject)
			
			WebUI.comment('✅ Voucher ' + voucher + ' berhasil digunakan dengan total discount: ' + discountText)
            println('✅ Voucher ' + voucher + ' berhasil digunakan dengan total discount: ' + discountText)

        } else if (WebUI.verifyTextPresent('Mohon Maaf Voucher Tidak dapat digunakan', false, FailureHandling.CONTINUE_ON_FAILURE)) {
            println("Teks 'Mohon Maaf Voucher Tidak dapat digunakan' ditemukan")
            WebUI.click(findTestObject('POS Store Repo/POS Ruby Store Repo/ALL POS/Mini caffe Repo/Page_REGISTER INTEGRASI BY AWH/button_OK'))
            
			WebUI.comment('❎ Voucher ' + voucher + ' gagal digunakan.')
			println('❎ Voucher ' + voucher + ' gagal digunakan.')

        } else {
            println("Tidak ada teks yang sesuai ditemukan.")
        }

    } catch (Exception e) {
        println('Error saat memproses voucher: ' + e.message)
        WebUI.takeScreenshot() // Opsional: Simpan screenshot untuk debugging
    }
}

WebUI.closeBrowser()

