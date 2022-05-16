package drivers

import org.openqa.selenium.remote.DesiredCapabilities
import java.io.File

class DriverCapabilities {
    companion object {
        fun androidBaseCapabilities(): DesiredCapabilities {
            val caps = DesiredCapabilities()
            val app = "src/test/resources/IntegrationApp.app"
            val appObject = File(app)
            caps.setCapability("platformName", "iOS")
            caps.setCapability("platformVersion", "15.4")
            caps.setCapability("deviceName", "iPhone 13 Pro Max")




            caps.setCapability("app", appObject.absolutePath)
            return caps
        }
    }
}