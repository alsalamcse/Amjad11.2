package com.draz.amjad.amjad112;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Three extends AppCompatActivity implements View.OnClickListener {
    private Button Btn5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Btn5=(Button)findViewById(R.id.Btn5);

    }

    @Override
    public void onClick(View v) {
        if (Btn5==v){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}
