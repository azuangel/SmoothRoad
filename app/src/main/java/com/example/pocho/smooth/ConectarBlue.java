package com.example.pocho.smooth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConectarBlue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conectar_blue);
    }
    public void conectar (View view){
        Intent intent = new Intent (this, devices.class);
        startActivity(intent);
    }
}
