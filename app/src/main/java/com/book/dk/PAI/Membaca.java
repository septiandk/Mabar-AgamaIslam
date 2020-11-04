package com.book.dk.PAI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Membaca extends AppCompatActivity {

    private static final int TIME_DELAY = 2000;
    private static long back_pressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membaca);
        ListFragment listFragment = new ListFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, listFragment);
        fragmentTransaction.commit();
    }

}
