package com.example.pocho.smooth;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONObject;

public class login extends AppCompatActivity {

    //private TextView lblGotoRegister;
    private Button btnLogin;
    private EditText inputEmail;
    private EditText inputNombre;
    SharedPreferences sharedP = getSharedPreferences("registros", Context.MODE_PRIVATE);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_2);

        inputEmail = (EditText) findViewById(R.id.txtEmail);
        inputNombre = (EditText) findViewById(R.id.txtUserName);
        btnLogin = (Button) findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String email = inputEmail.getText().toString();
                String nombre = inputNombre.getText().toString();
                createSharedPreference(sharedP,email,"email" );
                createSharedPreference(sharedP,nombre,"nombre" );

            }
        });






    }

    private boolean createSharedPreference(SharedPreferences sharedPref, String input, String key){
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(key, input);
        return editor.commit();
    }
}
