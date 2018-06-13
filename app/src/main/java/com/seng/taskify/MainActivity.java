package com.seng.taskify;


import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // when hit add task
    public void onClickAddTask(View view){
        ConstraintLayout cl = findViewById(R.id.clAddTasks);
        hideLayouts();
        cl.setVisibility(View.VISIBLE);
    }

    // when press home button, return button, or finished button
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

    // When click completed
    public void onClickCompleted(View view){
        ConstraintLayout cl = findViewById(R.id.clCompletedTasks);
        hideLayouts();
        cl.setVisibility(View.VISIBLE);
    }

    private void hideLayouts(){
        ConstraintLayout cl;
        cl = findViewById(R.id.clAddTasks);
        cl.setVisibility(View.INVISIBLE);
        cl = findViewById(R.id.clListTasks);
        cl.setVisibility(View.INVISIBLE);
        cl = findViewById(R.id.clCategories);
        cl.setVisibility(View.INVISIBLE);
        cl = findViewById(R.id.clCompletedTasks);
        cl.setVisibility(View.INVISIBLE);
    }


}
