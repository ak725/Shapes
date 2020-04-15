package com.example.shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.shapes.Views.Toggle;

public class MainActivity extends AppCompatActivity {


    private Toggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMe = findViewById(R.id.button_click_me);
        toggle = findViewById(R.id.ShapeSelectorView_selector);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMessage();
            }
        });

    }

    private void ShowMessage() {
        Toast.makeText(this, toggle.getSelectedShape(),Toast.LENGTH_LONG).show();
    }
}