package com.madla.madlaherrellwaynelabact2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        final EditText et9 = (EditText) findViewById(R.id.editText9);
        Button button3 = (Button) findViewById(R.id.btnVerify);
        button3.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("PREF1", MODE_PRIVATE);
                String s9 = et9.getText().toString().toLowerCase();
                String ds1 = preferences.getString("p1",null);
                String ds2 = preferences.getString("p2",null);
                String ds3 = preferences.getString("p3",null);
                String ds4 = preferences.getString("p4",null);
                String ds5 = preferences.getString("p5",null);
                String ds6 = preferences.getString("p6",null);
                String ds7 = preferences.getString("p7",null);
                String ds8 = preferences.getString("p8",null);

                if (ds1.equals(s9) || ds2.equals(s9)|| ds3.equals(s9) || ds4.equals(s9) ||
                        ds5.equals(s9) || ds6.equals(s9) || ds7.equals(s9) || ds8.equals(s9)){
                    Toast.makeText(getApplicationContext(),"School is participating in UAAP.", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"School is not participating in UAAP.", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

}
