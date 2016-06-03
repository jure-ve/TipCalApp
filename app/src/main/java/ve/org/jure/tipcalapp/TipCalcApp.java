package ve.org.jure.tipcalapp;

import android.app.Application;

/**
 * Created by jure on 6/2/16.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://jure.org.ve/";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
