package adam.com.coderpropre;

import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import BLEManager.BLEManager;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{


    public Button rateButton;
    public TextView rateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        rateButton = (Button) findViewById(R.id.rate);
        rateTextView = (TextView) findViewById(R.id.rateTextView);
        rateButton.setOnClickListener(this);
        rateTextView.setText(BLEManager.getInstance().getNumberRate() + "");
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == rateButton.getId())
        {
            BLEManager.getInstance().increaseRate();
            rateTextView.setText(BLEManager.getInstance().getNumberRate() + "");

        }
    }
}
