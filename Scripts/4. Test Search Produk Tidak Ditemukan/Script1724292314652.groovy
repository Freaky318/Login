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

WebUI.navigateToUrl('https://developer.1000saudara.com/Merchant/Login')

WebUI.setText(findTestObject('Object Repository/Page_www.1000saudara.com  Merchant Login/input_Nomor handphone_usernametxt'), 
    '089665107636')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_www.1000saudara.com  Merchant Login/input_Kata sandi_passwordtxt'), 
    'A8qEUeMMX2zexEfBbvCC9A==')

WebUI.click(findTestObject('Object Repository/Page_www.1000saudara.com  Merchant Login/div_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_www.1000saudara.com  Merchant/input_Kehadiran_txtSearchProduct'), 'semen tiga roda')

WebUI.sendKeys(findTestObject('Object Repository/Page_www.1000saudara.com  Merchant/input_Kehadiran_txtSearchProduct'), 
    Keys.chord(Keys.ENTER))

