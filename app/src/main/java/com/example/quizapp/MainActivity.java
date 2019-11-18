package com.example.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreCount;
    private RadioGroup questionOneRadioGroup;
    private Button submitButton;
    private RadioButton questionOneRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void answerOne(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which RadioButton was clicked
        switch (view.getId()) {
            case R.id.q1_second_option:
                if (checked)
                    scoreCount += 1;
            default: scoreCount += 0;
        }
    }

    public void answerTwo(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which RadioButton was clicked
        switch (view.getId()) {
            case R.id.q2_fourth_option:
                if (checked)
                    scoreCount += 1;
            default: scoreCount += 0;
        }
    }

    public void submit(View view) {
        EditText name = findViewById(R.id.name);
        String studentName =  name.getText().toString();
        Toast.makeText(this, "Name: " + studentName + "\nScore: " + scoreCount, Toast.LENGTH_LONG).show();
    }
}
