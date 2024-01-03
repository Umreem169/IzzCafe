package com.example.izzcafe;

import static java.sql.DriverManager.println;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuClass extends AppCompatActivity {


    Button burgerbtn , pastabtn , saladbtn , pizzbtn , icebtn , soupbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_class);

        // class menu should have menu attrubuets//

        burgerbtn = findViewById(R.id.burgerButton);
        pastabtn = findViewById(R.id.pastaButton);
        saladbtn = findViewById(R.id.saladButton);
        pizzbtn = findViewById(R.id.pizzaButton);
        icebtn = findViewById(R.id.iceCreamButton);
        soupbtn = findViewById(R.id.soupButton);

        burgerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });////////
        pastabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });////////
        saladbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });////////
        pizzbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });////////
        icebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });////////
        soupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });////////



    }
}



