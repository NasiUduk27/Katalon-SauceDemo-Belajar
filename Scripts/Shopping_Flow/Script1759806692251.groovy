import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

'Mengerahkan ke website saucedemo.com'
WebUI.navigateToUrl('https://www.saucedemo.com/')

'Menginput data username'
WebUI.setText(findTestObject('Page_Swag Labs/input_username'), 'standard_user')

'Menginput data password\r\n'
WebUI.setEncryptedText(findTestObject('Page_Swag Labs/input_password'), 'qcu24s4901FyWDTwXGr6XA==')

'Klik tombol login'
WebUI.click(findTestObject('Page_Swag Labs/button_login'))

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/button_add_to_cart'), 5)

WebUI.click(findTestObject('Page_Swag Labs/button_add_to_cart'))

WebUI.click(findTestObject('Page_Swag Labs/icon_cart'))

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/button_checkout'), 5)

WebUI.click(findTestObject('Page_Swag Labs/button_checkout'))

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/input_first_name'), 5)

WebUI.setText(findTestObject('Page_Swag Labs/input_first_name'), 'john')

WebUI.setText(findTestObject('Page_Swag Labs/input_last_name'), 'doe')

WebUI.setText(findTestObject('Page_Swag Labs/input_postal_code'), '1234')

WebUI.click(findTestObject('Page_Swag Labs/button_continue_checkout'))

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/button_finish_checkout'), 5)

WebUI.click(findTestObject('Page_Swag Labs/button_finish_checkout'))

WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/checkout_success'), 5)

WebUI.closeBrowser()

