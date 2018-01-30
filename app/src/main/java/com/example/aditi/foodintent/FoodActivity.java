package com.example.aditi.foodintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {
TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        txt1 =(TextView)findViewById(R.id.result);

//        To get Data from Intent

       Bundle b1 = getIntent().getExtras();
//       Access data
       String s1 = b1.getString("name");

//       Set S1 to TextView
        txt1.setText(s1);
  }
}
