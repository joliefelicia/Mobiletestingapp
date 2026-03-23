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

Mobile.tap(findTestObject('Object Repository/Application/media/android.widget.TextView - Media'), 0)

Mobile.tap(findTestObject('Object Repository/Application/media/android.widget.TextView - AudioFx'), 0)

WebUI.delay(20)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/media/android.widget.TextView - MediaPlayer'), 0)

Mobile.tap(findTestObject('Object Repository/Application/media/android.widget.Button - Play Video from Local File'), 0)

WebUI.delay(10)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/media/android.widget.Button - Play Streaming Video'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/media/android.widget.Button - Play Audio from Local File'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/media/android.widget.Button - Play Audio from Resources'), 0)

WebUI.delay(20)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/media/android.widget.TextView - VideoView'), 0)

Mobile.tap(findTestObject('Object Repository/Application/media/android.widget.VideoView'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

