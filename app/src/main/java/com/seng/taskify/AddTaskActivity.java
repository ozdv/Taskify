package com.seng.taskify;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddTaskActivity extends AppCompatActivity {


    private TextView theDate;
    private Button btnGoCalendar;
    private Button buttonFinished;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        theDate = (TextView) findViewById(R.id.date);
        btnGoCalendar = (Button) findViewById(R.id.btnGoCalendar);

        Intent incomingIntent = getIntent();
        String date = incomingIntent.getStringExtra("date");
        theDate.setText(date);

        btnGoCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddTaskActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

        buttonFinished = (Button) findViewById(R.id.buttonFinished);
        incomingIntent = getIntent();
        buttonFinished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddTaskActivity.this, FinishedActivity.class);
                startActivity(intent);
            }
        });

    }



}
