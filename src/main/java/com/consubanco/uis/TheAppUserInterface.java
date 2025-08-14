package com.consubanco.uis;

import net.serenitybdd.screenplay.targets.Target;

public class TheAppUserInterface {

    public static final Target TXT_VALIDACION = Target.the("").locatedBy("//android.widget.TextView[@text='The App']");
    public static final Target BTN_LOGIN_SCREEN = Target.the("").locatedBy("//android.widget.TextView[@text='Login Screen']");
    public static final Target TXT_LOGIN_SCREEN = Target.the("").locatedBy("//android.widget.TextView[@text='Login']");
    public static final Target LBL_USER_NAME = Target.the("").locatedBy("//android.widget.EditText[@content-desc='username']");
    public static final Target LBL_PASSWORD = Target.the("").locatedBy("//android.widget.EditText[@content-desc='password']");
    public static final Target BTN_LOGIN = Target.the("").locatedBy("//android.view.ViewGroup[@content-desc='loginBtn']/android.widget.TextView");
    public static final Target TXT_ALERT = Target.the("").locatedBy("//android.widget.TextView[@text='Alert']");
    public static final Target BTN_LIST_DEMO = Target.the("").locatedBy("//android.widget.TextView[@text='Scroll through a list of stuff']");
    public static final Target BTN_ALTO = Target.the("").locatedBy("//android.widget.TextView[@text='Altocumulus']");
    public static final Target TXT_VALIDATION = Target.the("").locatedBy("//android.widget.TextView[@text='Your Cloud Selection']");

}
