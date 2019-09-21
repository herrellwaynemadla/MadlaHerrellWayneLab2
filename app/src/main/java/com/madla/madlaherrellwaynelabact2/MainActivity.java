package com.madla.madlaherrellwaynelabact2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et = (EditText) findViewById(R.id.editText);
        final EditText et2 = (EditText) findViewById(R.id.editText2);
        final EditText et3 = (EditText) findViewById(R.id.editText3);
        final EditText et4 = (EditText) findViewById(R.id.editText4);
        final EditText et5 = (EditText) findViewById(R.id.editText5);
        final EditText et6 = (EditText) findViewById(R.id.editText6);
        final EditText et7 = (EditText) findViewById(R.id.editText7);
        final EditText et8 = (EditText) findViewById(R.id.editText8);

        Button button2 = (Button) findViewById(R.id.btnSave);
        button2.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("PREF1", MODE_PRIVATE);
                String s1 = et.getText().toString().toLowerCase();
                String s2 = et2.getText().toString().toLowerCase();
                String s3 = et3.getText().toString().toLowerCase();
                String s4 = et4.getText().toString().toLowerCase();
                String s5 = et5.getText().toString().toLowerCase();
                String s6 = et6.getText().toString().toLowerCase();
                String s7 = et7.getText().toString().toLowerCase();
                String s8 = et8.getText().toString().toLowerCase();

                SharedPreferences.Editor editor = preferences.edit();

                editor.putString("p1", s1);
                editor.putString("p2", s2);
                editor.putString("p3", s3);
                editor.putString("p4", s4);
                editor.putString("p5", s5);
                editor.putString("p6", s6);
                editor.putString("p7", s7);
                editor.putString("p8", s8);

                editor.commit();
                Toast.makeText(getApplicationContext(),"Data saved.", Toast.LENGTH_LONG).show();
            }
        });

        Button button1 = (Button) findViewById(R.id.btnNext);
        button1.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
                openNextActivity();
            }
        });
    }

    public void openNextActivity() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
