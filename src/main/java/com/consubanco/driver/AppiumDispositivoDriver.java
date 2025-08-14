package com.consubanco.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumDispositivoDriver {

    private static AndroidDriver driver;

    public static AppiumDispositivoDriver conLasCapabilities() {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "HHCC-A9");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.cloudgrey.the_app");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.cloudgrey.the_app.MainActivity");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            capabilities.setCapability(MobileCapabilityType.UDID, "MVFY594D9PQC99BQ");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            capabilities.setCapability("newCommandTimeout", 180);



            // Configuración adicional
            capabilities.setCapability("appium:timeout", 30000);

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } catch (MalformedURLException e) {
            throw new RuntimeException("Error en la URL de Appium Server", e);
        }
        return new AppiumDispositivoDriver();
    }

    public AndroidDriver enElDispositivo() {
        return driver;
    }
}
