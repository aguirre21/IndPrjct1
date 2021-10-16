package com.rodrigo.aguirre.indprjct1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LgnRgstr extends AppCompatActivity {

    TextView t, t1;
    EditText e, e1;
    Button b, b1;
    String pref_File;
    String user_name;
    String passWord;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lgn_rgstr);
        t = findViewById(R.id.lgnTxt);
        t1 = findViewById(R.id.psswrdTxt);
        e = findViewById(R.id.lgnEdit);
        e1 = findViewById(R.id.psswrdEdit);
        b = findViewById(R.id.lgnBtn);
        b1 = findViewById(R.id.rgstrBtn);
    }

    //go onto next activity
    public void registerAction(View v){
        Intent intent = new Intent(this, registrationActivity.class);
        startActivity(intent);
    }

    //saves data by shared preferences
    public void logInAction(View v){
        SharedPreferences sharedPreferences = getSharedPreferences(pref_File,
                Context.MODE_PRIVATE);

        String u = e.getText().toString();
        String p = e1.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(user_name, u);
        editor.putString(passWord, p);
        editor.apply();
    }

}