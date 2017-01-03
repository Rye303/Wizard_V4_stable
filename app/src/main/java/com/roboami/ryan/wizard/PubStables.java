package com.roboami.ryan.wizard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PubStables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pub_stables);

        Button Stables_ButtonPub = (Button)findViewById(R.id.Stables_ButtonPub);
        Stables_ButtonPub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LocationPub.class);
                startActivity(intent);
            }
        });
    }
}
