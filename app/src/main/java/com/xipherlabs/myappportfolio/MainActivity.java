package com.xipherlabs.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button streamer=(Button) findViewById(R.id.btn_streamer);
        Button super_duo1=(Button) findViewById(R.id.btn_super_duo1);
        Button super_duo2=(Button) findViewById(R.id.btn_super_duo2);
        Button ant_terminator=(Button) findViewById(R.id.btn_ant_terminator);
        Button materialize=(Button) findViewById(R.id.btn_materialize);
        Button capstone=(Button) findViewById(R.id.btn_capstone);

        streamer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch Streamer App!", Toast.LENGTH_SHORT).show();
            }
        });

        super_duo1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch Scores App!", Toast.LENGTH_SHORT).show();
            }
        });

        super_duo2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch Library App!", Toast.LENGTH_SHORT).show();
            }
        });

        ant_terminator.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch Build it Bigger App!", Toast.LENGTH_SHORT).show();
            }
        });

        materialize.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch XYZ Reader App!", Toast.LENGTH_SHORT).show();
            }
        });

        capstone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Capstone App!", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
