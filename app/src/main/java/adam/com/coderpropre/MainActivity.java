package adam.com.coderpropre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import BLEManager.BLEManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    public Button connectButton;
    public Button detailButton;
    public TextView connectTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectButton = (Button) findViewById(R.id.connect);
        detailButton = (Button) findViewById(R.id.detail);
        connectTextView = (TextView) findViewById(R.id.connectTextView);
        connectButton.setOnClickListener(this);
        detailButton.setOnClickListener(this);
        if(BLEManager.getInstance().getIsConnect())
        {
            connectTextView.setText("TRUE");
            connectButton.setText("Connect");
        }
        else
        {
            connectTextView.setText("FALSE");
            connectButton.setText("Disconnect");
        }
    }

    @Override
    public void onClick(View view)
    {
        if(view.getId() == connectButton.getId())
        {
            BLEManager.getInstance().setIsConnect();
            if(BLEManager.getInstance().getIsConnect())
            {
                connectTextView.setText("TRUE");
                connectButton.setText("Connect");
            }
            else
            {
                connectTextView.setText("FALSE");
                connectButton.setText("Disconnect");
            }
        }
        if(view.getId() == detailButton.getId())
        {
            Intent i = new Intent(getBaseContext(), DetailActivity.class);
            startActivity(i);
        }
    }
}
