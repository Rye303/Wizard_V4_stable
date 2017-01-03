package com.roboami.ryan.wizard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Button mainscreen_button = (Button)findViewById(R.id.mainscreen_button);
        mainscreen_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                SendStats();
            }
        });
    }

    public void SendStats(){
        Intent intent = new Intent(getApplicationContext(),LocationPub.class);
        PlayerStats playerstats = new PlayerStats();
        playerstats.Name = "Rye";
        playerstats.CharClass = "Wizard";
        intent.putExtra("stats",playerstats);
        startActivity(intent);
    }
}
