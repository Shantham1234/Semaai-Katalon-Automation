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

Mobile.startExistingApplication('com.semaai.toko.staging')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Coba cari Gramoxone (5)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (6)'), 'Amegrass  80 WP - 500 gr')

Mobile.tap(findTestObject('Object Repository/android.view.View (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Amegrass 80 WP - 500 gr (1)'), 0)

Mobile.scrollToText('Perbandingan')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Perbandingan'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button -  Keranjang (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lihat (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckBox (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Lanjut Bayar (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Pilih metode pengiriman (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Reguler'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Konfirmasi (8)'), 0)

Mobile.scrollToText('Buat Pesanan')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Pilih metode pengiriman (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Reguler'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Konfirmasi (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Pilih metode pembayaran (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Bayar di tempat (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Konfirmasi (9)'), 0)

Mobile.scrollToText('Buat Pesanan')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Buat Pesanan (3)'), 0)

Mobile.closeApplication()