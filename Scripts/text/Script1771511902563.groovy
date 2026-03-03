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

//Mobile.startApplication('C:\\Users\\asus2\\Katalon Studio\\testingmobilee\\androidapp\\APIDemos.apk', true)
//
//Mobile.tap(findTestObject('Object Repository/text/android.widget.TextView - Text'), 0)
//
//Mobile.tap(findTestObject('Object Repository/text/android.widget.TextView - KeyEventText'), 0)
//
//Mobile.setText(findTestObject('Object Repository/text/android.widget.TextView'), 'Jolie', 0)
//
//Mobile.tap(findTestObject('Object Repository/text/android.widget.Button - Clear'), 0)
//
//Mobile.setText(findTestObject('Object Repository/text/android.widget.TextView'), 'Jolie Felicia', 0)
//
//Mobile.pressBack()
//
//Mobile.pressBack()
//
//Mobile.closeApplication()
//
//Mobile.startApplication('C:\\Users\\asus2\\Katalon Studio\\testingmobilee\\androidapp\\APIDemos.apk', true)
//
//Mobile.tap(findTestObject('Object Repository/text/android.widget.TextView - Text (1)'), 0)
//
//Mobile.tap(findTestObject('Object Repository/text/android.widget.TextView - LogTextBox'), 0)
//
//Mobile.tap(findTestObject('Object Repository/text/android.widget.Button - Add'), 0)
//
//Mobile.setText(findTestObject('Object Repository/text/android.widget.TextView - This is a test'), 'Jolie', 0)
//
//// Set a timeout of 10 seconds instead of 0
//String textValue = Mobile.getText(findTestObject('Object Repository/text/android.widget.TextView - Jolie'), 10, FailureHandling.STOP_ON_FAILURE)
//
//// Log the retrieved text to the console
//println('The retrieved text is: ' + textValue)
//
//Mobile.setText(findTestObject('text/android.widget.TextView - Jolie'), 'Jolie Felicia', 0)
//
//Mobile.tap(findTestObject('Object Repository/text/android.widget.Button - Do nothing'), 0)
//
//Mobile.tap(findTestObject('Object Repository/text/android.widget.Button - Add'), 0)
//
//Mobile.tap(findTestObject('Object Repository/text/android.widget.Button - Add'), 0)
//
//Mobile.tap(findTestObject('Object Repository/text/android.widget.Button - Add'), 0)
//
//Mobile.closeApplication()
Mobile.startApplication('C:\\Users\\asus2\\Katalon Studio\\testingmobilee\\androidapp\\APIDemos.apk', true)

Mobile.tap(findTestObject('text/text2/android.widget.TextView - Text'), 30)

Mobile.tap(findTestObject('text/text2/android.widget.TextView - Linkify'), 30)

Mobile.tap(findTestObject('text/text2/linkify/text1'), 0)

Mobile.takeScreenshot()

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('text/text2/android.widget.TextView - Unicode'), 30)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

