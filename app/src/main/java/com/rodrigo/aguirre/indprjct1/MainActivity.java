package com.rodrigo.aguirre.indprjct1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;
    ImageView m;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.scrnTextView);
        m = findViewById(R.id.scrnImage);
        b = findViewById(R.id.scrnBtn);
    }

    //goes onto the next screen from splash screen
    public void btn1(View v){
        Intent intent = new Intent(this, LgnRgstr.class);
        startActivity(intent);
    }
}