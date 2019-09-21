package com.madla.madlaherrellwaynelabact2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

        Button button2 = (Button) findViewById(R.id.btnSave);
        button2.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("PREF1", MODE_PRIVATE);
                String s1 = et.getText().toString();
                String s2 = et.getText().toString();
                String s3 = et.getText().toString();
                String s4 = et.getText().toString();
                String s5 = et.getText().toString();
                String s6 = et.getText().toString();
                String s7 = et.getText().toString();
                String s8 = et.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();

                editor.putString();
                editor.commit();

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
