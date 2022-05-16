package tests

import drivers.DriverCapabilities
import drivers.DriverInit
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.offset.PointOption
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.Dimension
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

class TS_Scrolling : DriverInit() {
    override var caps: DesiredCapabilities? = DriverCapabilities.androidBaseCapabilities()

    @Test
    fun scrollDown() {
        driver!!.navigate().to("https://www.google.com")
        driver!!.findElement(By.id("buscar")).sendKeys("panel sistemas")





    }
}