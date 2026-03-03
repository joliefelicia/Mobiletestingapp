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

Mobile.startApplication('C:\\Users\\asus2\\Katalon Studio\\testingmobilee\\androidapp\\APIDemos.apk', true)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - Content'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - Assets'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - Read Asset'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - Clipboard'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - Data Types'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.Button - Copy Text'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.Button - Copy Text (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.Button - Copy Text (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.Button - Copy Intent'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.Button - Copy URI'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.CheckedTextView - Uri clip'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.CheckedTextView - Text clip'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.Button - Copy Text (2)'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - Packages'), 0)

Mobile.tap(findTestObject('Application/content/android.widget.TextView - Install Apk'), 0)

Mobile.tap(findTestObject('Application/content/android.widget.Button - Uninstall wResult'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Application/content/android.widget.TextView - Provider'), 0)

Mobile.tap(findTestObject('Application/content/android.widget.TextView - Pick Contact'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.Button - Pick a Contact'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - Pilih kontak'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - PERJANJIAN POLI REGULER (BPJS) RS. Jantung Sehat'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.Button - Pick a Contact'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - File Manager'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - Penyimpanan bersama internal'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - Download'), 0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - 10000000_100251932359265_2714152678953962931_n_050613.mp4'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application/content/android.widget.TextView - Oke'), 0)

Mobile.closeApplication()

