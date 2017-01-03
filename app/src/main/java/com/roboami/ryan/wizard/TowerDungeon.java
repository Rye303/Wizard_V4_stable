package com.roboami.ryan.wizard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TowerDungeon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tower_dungeon);

        Button Dungeon_ButtonTower = (Button)findViewById(R.id.Dungeon_ButtonTower);
        Dungeon_ButtonTower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LocationTower.class);
                startActivity(intent);
            }
        });
    }
}
