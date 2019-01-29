package com.app.tilesoverlay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_moon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TileOverlayActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("URL", Constant.MAP_URL_FORMAT_MOON);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

        findViewById(R.id.btn_world).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TileOverlayActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("URL", Constant.MAP_URL_FORMAT_WORLD);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}