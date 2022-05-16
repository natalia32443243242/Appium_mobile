package drivers

import org.openqa.selenium.remote.DesiredCapabilities
import java.io.File

class DriverCapabilities {
    companion object {
        fun androidBaseCapabilities(): DesiredCapabilities {
            val caps = DesiredCapabilities()
            val app = "/Users/Fer/Library/Developer/Xcode/DerivedData/WebDriverAgent-fxmsedpwfaalxlbcwefbceeuodem/Build/Products/Debug-iphonesimulator/IntegrationApp.app"
            val appObject = File(app)
            caps.setCapability("platformName", "iOS")
            caps.setCapability("platformVersion", "15.2")
            caps.setCapability("deviceName", "iPhone 8")




            caps.setCapability("app", appObject.absolutePath)
            return caps
        }
    }
}