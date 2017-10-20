package BLEManager;

import Device.Device;

/**
 * Created by iem on 20/10/2017.
 */

public class BLEManager {
    private static BLEManager INSTANCE;
    private Boolean isConnect;
    private int numberRate;
    private Device device;

    public static BLEManager getInstance()
    {
        if(INSTANCE == null)
        {
            INSTANCE = new BLEManager();
        }
        return INSTANCE;
    }

    private BLEManager()
    {
        isConnect=false;
        numberRate = 10;
    }


    public void connectDevice(Device device)
    {
        this.device = device;
    }

    public int getRate(){
        if(this.device ==null){
            return 0;
        }else {
            return device.getHearthRate();
        }
        }

    public void setIsConnect()
    {
        if (isConnect)
            isConnect=false;
        else
            isConnect=true;
    }

    public void increaseRate()
    {
        numberRate++;
    }

    public int getNumberRate()
    {
        return numberRate;
    }

    public Boolean getIsConnect()
    {
        return isConnect;
    }

}
