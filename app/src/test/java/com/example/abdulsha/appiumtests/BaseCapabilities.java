package com.example.abdulsha.appiumtests;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseCapabilities {
    public static AndroidDriver setCapabilities() throws MalformedURLException {

        // Created object of DesiredCapabilities class.
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set android deviceName desired capability. Set your device name.
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\abdulsha\\AndroidStudioProjects\\AppiumApplication\\app\\src\\ApiDemos-debug.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;

    }
}
