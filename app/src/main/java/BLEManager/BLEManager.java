package BLEManager;

/**
 * Created by iem on 20/10/2017.
 */

public class BLEManager {
    private static final BLEManager bleManager = new BLEManager();
    private Boolean isConnect;
    private int numberRate;

    public static BLEManager getInstance() {
        return bleManager;
    }

    private BLEManager() {
        isConnect=false;
        numberRate = 10;
    }


    public void setIsConnect(){
        if (isConnect)
            isConnect=false;
        else
            isConnect=true;
    }

    public void increaseRate(){
        numberRate++;
    }

    public int getNumberRate()
    {
        return numberRate;
    }

    public Boolean getIsConnect(){
        return isConnect;
    }

}
