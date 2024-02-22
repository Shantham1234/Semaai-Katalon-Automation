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

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (18)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Masukkan Keranjang (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button -  Keranjang (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lihat (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Lanjut Bayar (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Pilih metode pengiriman (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (19)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Konfirmasi (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Pakai kuponmu untuk berhemat (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Pakai Kupon (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Pilih metode pembayaran (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Bayar Tempo'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (20)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Konfirmasi (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Switch (1)'), 0)

Mobile.scrollToText('Buat Pesanan')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Buat Pesanan (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Kirim OTP ke SMS'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (9)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (10)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (11)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (12)'), '1', 0)

