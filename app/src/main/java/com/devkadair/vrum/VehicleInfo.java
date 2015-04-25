package com.devkadair.vrum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class VehicleInfo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String vin = intent.getStringExtra(com.devkadair.vrum.VinEntry.EXTRA_VIN);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(vin);

        setContentView(textView);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(com.devkadair.vrum.R.menu.menu_vehicle_info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == com.devkadair.vrum.R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
