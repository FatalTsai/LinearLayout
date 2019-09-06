package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TabWidget;
import android.widget.TextView;

import android.view.View;


public class MainActivity extends AppCompatActivity {

        EditText sname,fname,phone;
        TextView txv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname = (EditText) findViewById(R.id.firstname);
        sname = (EditText) findViewById(R.id.lastname);
        phone =(EditText) findViewById(R.id.phone);
        txv = (TextView) findViewById(R.id.txv);
    }

    public void onclick(View v){

        txv.setText(sname.getText().toString()+
                fname.getText()+
                "\'s  phone number is "+phone.getText());



    }





}
