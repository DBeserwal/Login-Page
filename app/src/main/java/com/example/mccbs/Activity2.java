package com.example.mccbs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    private Button button;
    public EditText editTextTextPersonName;
    public EditText editTextTextPersonName3;
    public EditText editTextNumberSigned;
    public EditText editTextTextEmailAddress;
    public EditText editTextNumber;
    public EditText editTextTextPersonName4;
    public EditText editTextNumber2;
    public String strfname, strlname, strmobno, strage, stradd, strpostc, stremail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button = (Button)findViewById(R.id.registerButton2);
        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextNumber = (EditText)findViewById(R.id.editTextNumber);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        editTextNumberSigned = (EditText) findViewById(R.id.editTextNumberSigned);
        editTextTextEmailAddress = (EditText) findViewById(R.id.editTextTextEmailAddress);
        editTextTextPersonName4 = (EditText) findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName3 = (EditText) findViewById(R.id.editTextTextPersonName3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newReg2();
            }
        });
    }

    public void newReg2(){
        Intent intent = new Intent(this, Activity3.class);

        strfname = editTextTextPersonName.getText().toString();
        strlname = editTextTextPersonName3.getText().toString();
        strmobno = editTextNumberSigned.getText().toString();
        strage = editTextNumber.getText().toString();
        stremail = editTextTextEmailAddress.getText().toString();
        stradd = editTextTextPersonName4.getText().toString();
        strpostc = editTextNumber2.getText().toString();

        intent.putExtra("Value1", strfname);


        startActivity(intent);
    }
}