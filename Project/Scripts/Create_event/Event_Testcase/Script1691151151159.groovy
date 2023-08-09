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

WebUI.navigateToUrl('https://calendly.com/')

WebUI.click(findTestObject('Object Repository/Page_Free Online Appointment Scheduling Sof_f04a6a/button_Cookie Settings_onetrust-close-btn-h_80df1f'))

WebUI.click(findTestObject('Object Repository/Page_Free Online Appointment Scheduling Sof_f04a6a/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Page_Welcome back to Calendly. Log in to yo_d7c56c/input_Calendly_email'), 
    'rangisettijhansi@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Welcome back to Calendly. Log in to yo_d7c56c/button_Log in'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in - Calendly/input_Enter your password_password'), '1WYlni7sVJ8tWhJ/yk+Lvg==')

WebUI.click(findTestObject('Object Repository/Page_Log in - Calendly/div_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/button_Book an event with yourself_u1xbh6v5_137e74'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/svg'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/div_Meeting poll'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/svg_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/button_15 minutes'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/div_All day_eQPBrvcnu1AmZL8t3Sq1 zef5fzHcUh_6dd6de'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/div_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Calendly/input_Meeting name_name'), 'Yoga')

WebUI.click(findTestObject('Object Repository/Page_Calendly/div_Address, web conferencing, phone call'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/div_In-person meeting'))

WebUI.setText(findTestObject('Object Repository/Page_Calendly/input_Address_physicalAddress'), 'Ap')

WebUI.setText(findTestObject('Object Repository/Page_Calendly/input_Location Details_physicalDetails'), 'Guntur')

WebUI.click(findTestObject('Object Repository/Page_Calendly/p_Allow poll participants to see each other_17fc08'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/div_Publish meeting poll'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/path'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/span_New Event Type_A7tqJ6C1P8YpEgrEWrXi _X_8c9294'))

WebUI.click(findTestObject('Object Repository/Page_Calendly/div_Edit'))

WebUI.click(findTestObject('Object Repository/Page_My Calendly - Edit One-on-One Event Ty_3a75c9/div_What event is this30 Minute Meeting, No_aa4484'))

WebUI.closeBrowser()

