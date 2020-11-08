package com.example.android_1_LoginLogout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button switchbutton = (Button)findViewById(R.id.button1);
        switchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchbutton.setText("Logout");
            }
        });
    }
}