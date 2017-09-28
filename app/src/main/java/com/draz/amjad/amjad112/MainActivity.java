package com.draz.amjad.amjad112;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String FILENAME ="AMJAD" ;
    private EditText ET1;
    private EditText ET2;
    private EditText ET3;
    private Button Btn1;
    private Button Btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn1 = (Button) findViewById(R.id.Btn1);
        Btn2 = (Button) findViewById(R.id.Btn2);
        ET1= (EditText) findViewById(R.id.ET1);
        ET2= (EditText) findViewById(R.id.ET2);
        ET3= (EditText) findViewById(R.id.ET3);
    }


    @Override
    public void onClick(View v) {
        if (v==Btn1) {
            SharedPreferences prefs = getSharedPreferences(FILENAME, MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("user", ET1.getText().toString());
            editor.putString("passw", ET3.getText().toString());
            editor.putString("mail", ET2.getText().toString());
            editor.commit();

            Toast.makeText(MainActivity.this, "WELCOME TO THE CLUB", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}