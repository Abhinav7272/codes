package com.example.mydemofragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MenuDetailsFragment frag=(MenuDetailsFragment) getFragmentManager().findFragmentById(R.id.Detail_frag);
        frag.setMenuID(1);

    }
}