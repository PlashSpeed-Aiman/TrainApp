package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myText  = findViewById(R.id.Text1);
        Button myButton = findViewById(R.id.button2);
        Button myButtonLogin = findViewById(R.id.button);
        TextView plainText = findViewById(R.id.Edit);
        myText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myText.setText(Deez_NUTS.PressDeezNuts());

            }
        });
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myText.setText("The Anus's Name is " + plainText.getText());
            }
        });

        myButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),TrainPage.class);
                startActivity(intent);
            }
        });
    }
}