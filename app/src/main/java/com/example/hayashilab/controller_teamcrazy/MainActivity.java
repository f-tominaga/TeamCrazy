package com.example.hayashilab.controller_teamcrazy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {

    TextView txtIP;
    TextView txtPort;

    ToggleButton btnConnectTCP;

    SeekBar skbrVelocity;
    TextView txtVelocity;

    Button btnLeft;
    Button btnRight;
    Button btnFoward;
    Button btnBackward;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIP = (TextView)findViewById(R.id.txtIP);
        txtPort = (TextView)findViewById(R.id.txtPort);

        btnConnectTCP = (ToggleButton)findViewById(R.id.btnConnectTPC);

        skbrVelocity = (SeekBar)findViewById(R.id.skbrVelocity);
        txtVelocity = (TextView)findViewById(R.id.txtVelocity);

        btnLeft = (Button)findViewById(R.id.btnLeft);
        btnRight = (Button)findViewById(R.id.btnRight);
        btnFoward = (Button)findViewById(R.id.btnFoward);
        btnBackward = (Button)findViewById(R.id.btnBackward);







        //ウィジェットが少ないので無名クラスによるイベント管理

        /*** TCP/IP 接続ボタン ***/
        btnConnectTCP.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                    }
                }
        );



        /*** 出力制御用シークバー ***/
        skbrVelocity.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        txtVelocity.setText(String.valueOf(progress));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
