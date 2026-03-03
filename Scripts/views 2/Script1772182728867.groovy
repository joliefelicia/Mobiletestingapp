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

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Views'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 1. Photos'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.ImageView'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 2. People'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.FrameLayout'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Grid'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 1. Icon Grid'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 2. Photo Grid'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.ImageView (1)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 3. Selection Mode'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Focus'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 1. Vertical'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.Button - placeholder'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Can I focus'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - GameKult'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Slashdot'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Ars Technica'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 2. Horizontal'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.Button - left'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 3. Circular'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.RelativeLayout'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 4. Internal Selection'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 5. Sequential (Tab Order)'), 
    0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Lists'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 01. Array'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Abbaye de Belloc'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Abbaye du Mont des Cats'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Abondance'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 02. Cursor (People)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 03. Cursor (Phones)'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TwoLineListItem'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 04. ListAdapter'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Layout Animation'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 1. Grid Fade'), 0)

WebUI.delay(10)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 2. List Cascade'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 3. Reverse Order'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 4. Randomize'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 5. Grid Direction'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 6. Wave Scale'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - 7. Nested Animations'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Application/views 2/nested animations/android.widget.EditText (1)'), 'Jolie', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Application/views 2/nested animations/android.widget.EditText (2)'), 'Felicia', 0)

Mobile.setText(findTestObject('Application/views 2/nested animations/android.widget.EditText(4)'), 'pramuka', 0)

Mobile.setText(findTestObject('Application/views 2/nested animations/android.widget.EditText (3)'), '0864565659184', 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.TextView - Hover Events'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.CheckBox - Make container intercept hover events'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.Button - Hover Here'), 0)

Mobile.tap(findTestObject('Object Repository/Application/views 2/android.widget.LinearLayout'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

