import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class VOIS {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "988ad0374a4153544e30");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "org.nativescript.examples");
        dc.setCapability("appActivity", "com.tns.NativeScriptActivity");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);



        //Click on "Get Started"
        Assert.assertEquals(ad.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ActionBar\"]/android.widget.ImageView")
                .getText(), "NativeScript");

        MobileElement GetStarted = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button");
        GetStarted.click();



        //Scroll down to "Reservations"
        ad.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)" +
                ".instance(0)).scrollIntoView(new UiSelector().textContains(\"Reservations\").instance(0))").click();

        //Click on "+"
        MobileElement Plus = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget" +
                ".LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/" +
                "android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView");
        Plus.click();

        //Insert "Name"
        MobileElement NameField = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.EditText");
        NameField.clear();
        NameField.setValue("Test 11:30");

        //Insert "Phone"
        MobileElement PhoneField = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.EditText");
        PhoneField.clear();
        PhoneField.setValue("01009017218");

        //Add "2 guests"
        MobileElement GuestsField = (MobileElement) ad.findElementById("org.nativescript.examples:id/number_picker_plus");
        GuestsField.click();

        //Select "Section"
        MobileElement SectionField = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.Spinner");
        SectionField.click();
        Thread.sleep(5000);

        MobileElement ThirdFloor = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
        ThirdFloor.click();
        Thread.sleep(5000);

        //Select "Table"
        MobileElement TableField = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.Spinner");
        TableField.click();
        Thread.sleep(5000);
        MobileElement Table4 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]");
        Table4.click();
        Thread.sleep(5000);

        //Select "Origin"
        MobileElement OriginField = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.Spinner");
        OriginField.click();
        Thread.sleep(5000);

        MobileElement Online = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
        Online.click();
        Thread.sleep(5000);

        //Click on "Done"
        MobileElement DoneButton = (MobileElement) ad.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ActionBar\"]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView");
        DoneButton.click();

        //Select "Old request"
        List<AndroidElement> ElementOldRequest = ad.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup"));
        ElementOldRequest.get(1).click();

        //Click to "Back"
        MobileElement XButton = (MobileElement) ad.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ActionBar\"]/android.widget.ImageButton");
        XButton.click();
        MobileElement Back = (MobileElement) ad.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ActionBar\"]/android.widget.ImageButton");
        Back.click();

        //Click on "Menu"
        MobileElement MenuButton = (MobileElement) ad.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ActionBar\"]/android.widget.ImageButton");
        MenuButton.click();

        //Click on "Code Sample"
        List<AndroidElement> ElementCodeSample = ad.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup"));
        ElementCodeSample.get(8).click();

        //Launching App Again
        ad.launchApp();

        Assert.assertEquals(ad.findElementByXPath("//android.view.ViewGroup[@content-desc=\"ActionBar\"]/android.widget.ImageView")
                .getText(), "NativeScript");





    }
}
