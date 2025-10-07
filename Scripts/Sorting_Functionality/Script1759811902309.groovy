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

WebUI.click(findTestObject('Page_Swag Labs/sorting_a_to_z'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/result_sort_a_to_z_first'))

WebUI.closeBrowser()

