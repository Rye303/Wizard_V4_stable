package com.roboami.ryan.wizard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocationTower extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_tower);

        Button Tower_ButtonBridge = (Button)findViewById(R.id.Tower_ButtonBridge);
        Tower_ButtonBridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LocationBridge.class);
                startActivity(intent);
            }
        });

        Button Tower_ButtonDungeon = (Button)findViewById(R.id.Tower_ButtonDungeon);
        Tower_ButtonDungeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TowerDungeon.class);
                startActivity(intent);
            }
        });
    }
}
