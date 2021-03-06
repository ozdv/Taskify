package com.seng.taskify;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FinishedActivity extends AppCompatActivity {

    private Button checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished);

        checkBox = (android.widget.Button) findViewById(R.id.checkBox);
        Intent incomingIntent = getIntent();

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinishedActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

}
