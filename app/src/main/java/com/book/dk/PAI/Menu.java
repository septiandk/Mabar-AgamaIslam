package com.book.dk.PAI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Readmybook();
        learnwriting();
        mycommunity();
        mystore();
    }

    public void Readmybook(){
        ImageView btn = (ImageView) findViewById(R.id.read_menu);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, Membaca.class));
            }
        });
    }
    public void learnwriting(){
        ImageView btn = (ImageView) findViewById(R.id.writing_menu);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, Menulis.class));
            }
        });
    }
    public void mycommunity(){
        ImageView btn = (ImageView) findViewById(R.id.community_menu);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, community.class));
            }
        });
    }
    public void mystore(){
        ImageView btn = (ImageView) findViewById(R.id.store_menu);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, store.class));
            }
        });
    }
}
