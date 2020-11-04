package com.book.dk.PAI;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        animleft();
        animright();
        MyMenu();

    }

    public void animleft()
    {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.lefttoright);
        a.reset();
        TextView txt = (TextView) findViewById(R.id.set1);
        txt.clearAnimation();
        txt.setAnimation(a);
    }
    public void animright()
    {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.righttoleft);
        a.reset();
        TextView txt = (TextView) findViewById(R.id.set2);
        txt.clearAnimation();
        txt.setAnimation(a);
    }
    public void MyMenu(){
        Button btn = (Button) findViewById(R.id.mymenu);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Menu.class));
                finish();
            }
        });
    }

}
