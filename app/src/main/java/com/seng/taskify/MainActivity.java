package com.seng.taskify;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.graphics.Color;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Button;
import org.w3c.dom.Text;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button buttonAddTask;
    private Button buttonCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAddTask = (Button) findViewById(R.id.buttonAddTask);
        Intent incomingIntent = getIntent();

        buttonAddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddTaskActivity.class);
                startActivity(intent);
            }
        });

        buttonCategories = (Button) findViewById(R.id.buttonCategories);
        buttonCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddCategoryActivity.class);
                startActivity(intent);
            }
        });

    }

    public void onClickHome(View view){
        ConstraintLayout cl = findViewById(R.id.clListTasks);
        hideLayouts();
        cl.setVisibility(View.VISIBLE);
    }

    // When click categories
    public void onClickCategories(View view){
        ConstraintLayout cl = findViewById(R.id.clCategories);
        hideLayouts();
        cl.setVisibility(View.VISIBLE);
    }
//
//    // When click completed
//    public void onClickCompleted(View view){
//        ConstraintLayout cl = findViewById(R.id.clCompletedTasks);
//        hideLayouts();
//        cl.setVisibility(View.VISIBLE);
//    }


    private void hideLayouts(){
        ConstraintLayout cl;
        cl = findViewById(R.id.clAddTasks);
        cl.setVisibility(View.INVISIBLE);
        cl = findViewById(R.id.clListTasks);
        cl.setVisibility(View.INVISIBLE);
        cl = findViewById(R.id.clCategories);
        cl.setVisibility(View.INVISIBLE);
        //cl = findViewById(R.id.clCompletedTasks);
        //cl.setVisibility(View.INVISIBLE);

    }


}
