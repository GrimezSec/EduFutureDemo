package com.example.edufuturedemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SelecetInterest extends AppCompatActivity {
    String[] item = {"Plane","Camping","Reading","GYM","Gaming","Drawing","Coding"};
    String[] item2 = {"Riddle","Plant Breeding","Travel","Robotic","Soccer"};
    String[] item3 = {"Math","Foreign Language","Litarature","Geography"};
    String[] item4 = {"Philosophy","History","Physics","Biology"};
    String[] item5 = {"Computer Engineering","Law","Finance","Medic","History Teaching"};
    String[] item6 = {"Computer Science","Aircraft Engineering","Ship Captain"};

    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> adapterItems;
    ArrayAdapter<String> adapterItems2;
    ArrayAdapter<String> adapterItems3;
    ArrayAdapter<String> adapterItems4;
    ArrayAdapter<String> adapterItems5;
    ArrayAdapter<String> adapterItems6;
    @SuppressLint("MissingInflatedId")

    //submit butonu tanımlama
    Button submit_interest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_interest);
        submit_interest = (Button) findViewById(R.id.submit_interesting);
        submit_interest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelecetInterest.this, advice.class));
            }
        });

        autoCompleteTextView= findViewById(R.id.auto_complete_textview);
        adapterItems = new ArrayAdapter<String>(this,R.layout.list_item, item);
        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String item = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(SelecetInterest.this, "item"+ item,Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTextView= findViewById(R.id.auto_complete_textview2);
        adapterItems2 = new ArrayAdapter<String>(this,R.layout.list_item2, item2);
        autoCompleteTextView.setAdapter(adapterItems2);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String item2 = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(SelecetInterest.this, "item"+ item2,Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTextView= findViewById(R.id.auto_complete_textview3);
        adapterItems3 = new ArrayAdapter<String>(this,R.layout.list_item3, item3);
        autoCompleteTextView.setAdapter(adapterItems3);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String item3 = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(SelecetInterest.this, "item"+ item3,Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTextView= findViewById(R.id.auto_complete_textview4);
        adapterItems4 = new ArrayAdapter<String>(this,R.layout.list_item4, item4);
        autoCompleteTextView.setAdapter(adapterItems4);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String item4 = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(SelecetInterest.this, "item"+ item4,Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTextView= findViewById(R.id.auto_complete_textview5);
        adapterItems5 = new ArrayAdapter<String>(this,R.layout.list_item5, item5);
        autoCompleteTextView.setAdapter(adapterItems5);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String item5 = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(SelecetInterest.this, "item"+ item5,Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTextView= findViewById(R.id.auto_complete_textview6);
        adapterItems6 = new ArrayAdapter<String>(this,R.layout.list_item6, item6);
        autoCompleteTextView.setAdapter(adapterItems6);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String item6 = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(SelecetInterest.this, "item"+ item6,Toast.LENGTH_SHORT).show();
            }
        });
    }

}