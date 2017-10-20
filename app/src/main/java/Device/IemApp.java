package Device;

import android.app.Application;

import BLEManager.BLEManager;

/**
 * Created by iem on 20/10/2017.
 */

public class IemApp extends Application {

    private static IemApp application;
    private BLEManager bleManager;


    public static IemApp application(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        this.bleManager = BLEManager.getInstance();
    }

    public BLEManager getBleManager(){
        return bleManager;
    }
}
