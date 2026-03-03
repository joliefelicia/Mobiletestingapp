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

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Graphics'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Compass'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.view.View'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - ColorFilters'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.view.View (1)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.TextView - CameraPreview'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.TextView - Clipping'), 0)

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.TextView - Graphics'), 0)

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.TextView - ColorMatrix'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.TextView - CreateBitmap'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.TextView - Arcs'), 0)

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.view.View'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.TextView - AnimateDrawables'), 0)

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.view.View (1)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.TextView - AlphaBitmap'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.TextView - BitmapDecode'), 0)

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.TextView - Graphics'), 0)

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.TextView - BitmapPixels'), 0)

Mobile.tap(findTestObject('Object Repository/Application/application 2/android.widget.FrameLayout'), 0)

Mobile.closeApplication()

