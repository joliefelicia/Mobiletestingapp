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

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Views'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Animation'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - 3D Transition'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Lyon'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.ImageView'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - 3D Transition'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Livermore'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - 3D Transition'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Tahoe Pier'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - 3D Transition'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Lake Tahoe'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - 3D Transition'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Grand Canyon'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - 3D Transition'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Bodie'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Interpolators'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Push'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Push up'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.CheckedTextView - Push up'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Push up'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.CheckedTextView - Cross fade'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Shake'), 0)

Mobile.setText(findTestObject('Object Repository/Application/Graphics/android.widget.EditText'), 'Jolie123', 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Login'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Buttons'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Normal'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Small'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.ToggleButton - MATI'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Normal'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Chronometer'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Start'), 0)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Stop'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Reset'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Set format string'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Clear format string'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - Auto Complete'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - 1. Screen Top'), 0)

Mobile.setText(findTestObject('Object Repository/Application/Graphics/android.widget.AutoCompleteTextView'), 'Indonesia', 
    0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.AutoCompleteTextView - Indonesia'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Give me Focus'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - 2. Screen Bottom'), 0)

Mobile.setText(findTestObject('Object Repository/Application/Graphics/android.widget.AutoCompleteTextView'), 'Indonesia', 
    0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Give me Focus (1)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.TextView - 3. Scroll'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Scroll'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - Down'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - To'), 0)

Mobile.setText(findTestObject('Object Repository/Application/Graphics/android.widget.AutoCompleteTextView (1)'), 'Indonesia', 
    0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - To'), 0)

Mobile.tap(findTestObject('Object Repository/Application/Graphics/android.widget.Button - See'), 0)

Mobile.pressBack()

Mobile.closeApplication()

