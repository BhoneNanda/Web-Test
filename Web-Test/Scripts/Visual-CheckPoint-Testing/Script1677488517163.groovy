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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/input_Username_username'), 
    'JohnDoe')

WebUI.setEncryptedText(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.sendKeys(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.takeScreenshotAsCheckpoint('current_viewport')

WebUI.setText(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/input_Username_username'), 
    'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.sendKeys(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.takeScreenshotAsCheckpoint('current_viewport1')

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.takeScreenshotAsCheckpoint('current_viewport2')

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.takeScreenshotAsCheckpoint('current_viewport3')

WebUI.selectOptionByValue(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.takeScreenshotAsCheckpoint('current_viewport4')

WebUI.selectOptionByValue(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.takeScreenshotAsCheckpoint('current_viewport5')

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/form_Facility                              _20adf0'))

WebUI.takeScreenshotAsCheckpoint('current_viewport6')

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.takeScreenshotAsCheckpoint('current_viewport7')

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/label_Medicaid'))

WebUI.takeScreenshotAsCheckpoint('current_viewport8')

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/input_None_programs'))

WebUI.takeScreenshotAsCheckpoint('current_viewport9')

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/label_Medicaid'))

WebUI.takeScreenshotAsCheckpoint('current_viewport10')

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/td_8'))

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/td_17'))

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.setText(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'Abcdiudfiud')

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/a_Make Appointment_1'))

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Visual_Test_Check/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.closeBrowser()

