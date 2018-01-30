package com.example.aditi.foodintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 =(EditText)findViewById(R.id.editText);
    }

    public void Click(View view) {
        Intent intent = new Intent(this,FoodActivity.class);
        intent.putExtra("Name",e1.getText().toString());
        startActivity(intent);
    }
}
