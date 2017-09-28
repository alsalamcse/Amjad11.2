package com.draz.amjad.amjad112;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Two extends AppCompatActivity implements View.OnClickListener {
    private static final String FILENAME ="AMJAD" ;
    private EditText ET4;
    private EditText ET5;
    private Button Btn3;
    private Button Btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        ET4 = (EditText) findViewById(R.id.ET4);
        ET5 = (EditText) findViewById(R.id.ET5);
        Btn3 = (Button) findViewById(R.id.Btn3);
        Btn4 = (Button) findViewById(R.id.Btn4);
    }


    @Override
    public void onClick(View v) {
        if (v==Btn3 )
        {
            SharedPreferences prefs =getSharedPreferences(FILENAME,MODE_PRIVATE);
            String user = prefs . getString("user",null);
            String passw = prefs.getString("passw",null);
            if (user!=null || passw!=null) {
                Toast.makeText(Two.this, "WELCOME TO THE CLUB", Toast.LENGTH_SHORT).show();

            }
            if (Btn4==v)
            {
                Intent intent = new Intent(this,Three.class);
                startActivity(intent);
            }






        }
    }
}
