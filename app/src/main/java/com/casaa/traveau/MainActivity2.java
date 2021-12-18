package com.casaa.traveau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView ed =(TextView) findViewById(R.id.a);
        Bundle B =getIntent().getExtras();
        String oui = B.getString("val");
        String non = B.getString("val1");
        ed.setText(" merci pour votre vote votre choix est :"+ oui);
        ed.setText("merci pour votre vote votre choix est :"+ non);






        }

    public void retour(View view) {

        Intent page2 = new Intent(this,MainActivity.class);
        startActivity(page2);

    }
}