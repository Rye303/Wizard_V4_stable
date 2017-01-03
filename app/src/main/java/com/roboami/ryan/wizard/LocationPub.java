package com.roboami.ryan.wizard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LocationPub extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_pub);

        getPlayerStats();

        Button Pub_ButtonStables = (Button)findViewById(R.id.Pub_ButtonStables);
        Pub_ButtonStables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PubStables.class);
                startActivity(intent);
            }
        });

        Button Pub_ButtonBridge = (Button)findViewById(R.id.Pub_ButtonBridge);
        Pub_ButtonBridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LocationBridge.class);
                startActivity(intent);
            }
        });
    }

    public void getPlayerStats(){
        Intent i = getIntent();
        PlayerStats playerstats = i.getExtras().getParcelable("stats");

        String msg = String.format("%s \n%s",playerstats.Name,playerstats.CharClass);
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }
}
