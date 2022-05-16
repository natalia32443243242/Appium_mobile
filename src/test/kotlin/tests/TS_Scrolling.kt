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
        // Navigate to view option
        driver!!.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click()

        // Scrolling down method
        fun scrollToBottom() {
            val dim: Dimension = driver!!.manage().window().size
            val height = dim.getHeight()
            val width = dim.getWidth()
            val x = width / 2
            val topY = (height * 0.80).toInt()
            val bottomY = (height * 0.20).toInt()
            val startPoint = PointOption.point(x, topY)
            val endPoint = PointOption.point (x, bottomY)
            val ts: TouchAction<*> = TouchAction(driver)
            ts.press(startPoint).moveTo(endPoint).release().perform()
        }

        // Using scrolling down method
        scrollToBottom()

        // Set an explicit FluentWait every 5000 milliseconds during 60 seconds
         val wait = WebDriverWait(driver, 60, 5000)
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc=\"ImageView\"]")))

        // Enter to ImageView option
        driver!!.findElement(By.xpath("//android.widget.TextView[@content-desc=\"ImageView\"]")).click()
    }
}