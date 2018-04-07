package org.ournet.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.ournet.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainActivity extends AppCompatActivity {

    private static final Logger log = LoggerFactory.getLogger(MainActivity.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
        setContentView(R.layout.activity_main_screen);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Context cont= getApplicationContext();
                Intent galleryIntent = new Intent(getApplicationContext(), testcall.class);
                startActivity(galleryIntent);
            }
        });

            Button showGalleryBtn = (Button) findViewById(R.id.btn_show_gallery);
            showGalleryBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

            Button showGalleryBtn1 = (Button) findViewById(R.id.btn_show_gallery);
            showGalleryBtn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent galleryIntent = new Intent(MainActivity.this, SpaceGalleryActivity.class);
                    startActivity(galleryIntent);
                }
            });

        } catch(Exception e){
            log.error("intentando hacer logging",e.getMessage());
            Toast toast = Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}
