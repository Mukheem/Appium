package com.example.abdulsha.appiumtests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

public class NativeAppTest extends BaseCapabilities {

    AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver=setCapabilities();
    }

    @Test
    public void testFirst() {
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("Hello Text field");
        driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
    }

    @After
    public void End() {
        driver.quit();
    }
}
