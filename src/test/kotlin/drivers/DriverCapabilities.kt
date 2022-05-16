package drivers

import org.openqa.selenium.remote.DesiredCapabilities
import java.io.File

class DriverCapabilities {
    companion object {
        fun androidBaseCapabilities(): DesiredCapabilities {
            val caps = DesiredCapabilities()
            val app = "src/test/resources/ApiDemos-debug.apk"
            val appObject = File(app)
            caps.setCapability("platformName", "android")
            caps.setCapability("appium:platformVersion", "11")
            caps.setCapability("appium:deviceName", "sdk_gphone_arm64")
            caps.setCapability("appium:automationName", "UiAutomator2")
            caps.setCapability("app", appObject.absolutePath)
            return caps
        }
    }
}