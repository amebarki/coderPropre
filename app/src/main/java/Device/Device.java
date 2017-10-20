package Device;

import BLEManager.BLEDevice;

/**
 * Created by iem on 20/10/2017.
 */

public class Device implements BLEDevice{

    private int heartRate=2;
    private String deviceName="dibolo";


    @Override
    public int geHearthRate() {
        return 2;
    }

    @Override
    public String getDeviceName() {
        return deviceName;
    }
}
