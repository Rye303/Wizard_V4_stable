package com.roboami.ryan.wizard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocationBridge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_bridge);

        Button Bridge_ButtonBoat = (Button)findViewById(R.id.Bridge_ButtonBoat);
        Bridge_ButtonBoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BridgeBoat.class);
                startActivity(intent);
            }
        });

        Button Bridge_ButtonPub = (Button)findViewById(R.id.Bridge_ButtonPub);
        Bridge_ButtonPub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LocationPub.class);
                startActivity(intent);
            }
        });

        Button Bridge_ButtonTower = (Button)findViewById(R.id.Bridge_ButtonTower);
        Bridge_ButtonTower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LocationTower.class);
                startActivity(intent);
            }
        });
    }
}
