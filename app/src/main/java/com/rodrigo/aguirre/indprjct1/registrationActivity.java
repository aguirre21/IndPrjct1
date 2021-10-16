package com.rodrigo.aguirre.indprjct1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class registrationActivity extends AppCompatActivity {

    TextView tfn, tln, tdb, tmail, tpss;
    EditText efn, eln, edb, email, epss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        tfn = findViewById(R.id.fn_View);
        tln = findViewById(R.id.ln_View);
        tdb = findViewById(R.id.db_View);
        tmail = findViewById(R.id.email_View);
        tpss = findViewById(R.id.psswrd_View);

        efn = findViewById(R.id.fn_Edit);
        eln = findViewById(R.id.ln_Edit);
        edb = findViewById(R.id.db_Edit);
        email = findViewById(R.id.email_Edit);
        epss = findViewById(R.id.psswrd_Edit);
    }

    //checks to to see if a field is empty
    public void cmplt_reg(View v){

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        //Pattern pattern1 = Pattern.compile(".com");


        int lngth = efn.getText().length();
        int lngth1 = eln.getText().length();
        int lngth2 = edb.getText().length();
        int lngth4 = epss.getText().length();

        Matcher m = pattern.matcher(email.getText().toString());

        if(lngth < 3 || lngth > 30){
            Toast.makeText(getApplicationContext(), "Please enter first name larger than 3 and " +
                    "smaller than 30 characters", Toast.LENGTH_LONG).show();
        }
        else if(lngth1 < 3 || lngth1 > 30){
            Toast.makeText(getApplicationContext(), "Please enter last name larger than 3 and " +
                    "smaller than 30 characters", Toast.LENGTH_LONG).show();
        }
        else if(lngth2 < 1){
            Toast.makeText(getApplicationContext(), "Please enter date of birth", Toast.LENGTH_SHORT).show();
        }
        else if(!m.matches())
        {
            Toast.makeText(getApplicationContext(),"Please enter valid email.", Toast.LENGTH_LONG).show();
        }
        else if(lngth4 < 8){
            Toast.makeText(getApplicationContext(), "Password must be at least 8 characters long", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent(this, LgnRgstr.class);
            startActivity(intent);
        }
    }
}