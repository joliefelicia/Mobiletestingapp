import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import internal.GlobalVariable as GlobalVariable

Mobile.comment('Story: animation')

Mobile.comment('Given that user has started an application')

//'Path of the Apk File Store in path variable'
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AppPath, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)

Mobile.comment('And he navigates the application to Activity form')

Mobile.tap(findTestObject('Application/application 2/android.widget.TextView - Animation'), 10)

Mobile.tap(findTestObject('Application/application 2/android.widget.TextView - Custom Evaluator'), 10)

Mobile.tap(findTestObject('Application/application 2/android.widget.Button - Play'), 10)

Mobile.delay(10)

Mobile.closeApplication()

