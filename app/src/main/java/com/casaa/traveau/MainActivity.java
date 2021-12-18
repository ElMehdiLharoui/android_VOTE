package com.casaa.traveau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viteF(View view) {

        RadioButton oui=(RadioButton) findViewById(R.id.radioButton5);
        RadioButton non=(RadioButton) findViewById(R.id.radioButton6);
         int i=0;
        if(oui.getText().toString().isEmpty()) i=1;
        if(non.getText().toString().isEmpty()) i=2;

        Intent page2 = new Intent(this,MainActivity2.class);
        Bundle n =new Bundle();


              n.putString("val", oui.getText().toString());


              n.putString("val1",non.getText().toString());





        page2.putExtras(n);
     startActivity(page2);
    }
}