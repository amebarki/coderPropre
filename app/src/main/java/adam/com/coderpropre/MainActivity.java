package adam.com.coderpropre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import BLEManager.BLEManager;
import Device.Device;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button button_connect;
    private Button button_detail;
    private TextView connectTextView;
    private Device device_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_connect = (Button) findViewById(R.id.main_connect_button);
        button_detail = (Button) findViewById(R.id.main_detail_button);
        connectTextView = (TextView) findViewById(R.id.main_connect_textView);
        device_main = new Device();
        this.initialize();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == button_connect.getId()) {
            BLEManager.getInstance().setIsConnect();
            BLEManager.getInstance().connectDevice(device_main);

        }
        if (view.getId() == button_detail.getId()) {
           // Intent i = new Intent(getBaseContext(), DetailActivity.class);
           // startActivity(i);
            connectTextView.setText(BLEManager.getInstance().getRate() + "");
        }
    }


    public void initialize() {
        button_connect.setOnClickListener(this);
        button_detail.setOnClickListener(this);
        if (BLEManager.getInstance().getIsConnect()) {
            connectTextView.setText("TRUE");
            button_connect.setText("Connect");
        } else {
            connectTextView.setText("FALSE");
            button_connect.setText("Disconnect");
        }
    }
}
