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

'Membuka browser baru\r\n'
WebUI.openBrowser('')

'Mengarahkan ke website saucedemo.com\r\n'
WebUI.navigateToUrl('https://www.saucedemo.com/')

'Mengisi username yang valid\r\n'
WebUI.setText(findTestObject('Page_Swag Labs/input_username'), 'standard_user')

'Mengisi password yang valid'
WebUI.setEncryptedText(findTestObject('Page_Swag Labs/input_password'), 'qcu24s4901FyWDTwXGr6XA==')

'Menekan tombol enter setelah mengisi username dan password'
WebUI.sendKeys(findTestObject('Page_Swag Labs/input_password'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/button_add_to_cart'), 5)

WebUI.click(findTestObject('Page_Swag Labs/button_add_to_cart'))

WebUI.click(findTestObject('Page_Swag Labs/button_add_cart_bike'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/badge_cart_quantity'), '2')

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/button_remove_item'), 5)

WebUI.click(findTestObject('Page_Swag Labs/button_remove_item'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/badge_cart_quantity'), '1')

'Tutup browser'
WebUI.closeBrowser()

