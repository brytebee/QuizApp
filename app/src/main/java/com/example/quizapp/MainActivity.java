package com.example.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreCount = 0;
    /* The global variable posses a challenge in that one a choice was made
    *  and it was the correct option but then, the user changed their mind
    *  the scoreCount value is retained. How could I have written a better code? Thanks in advance.
    * */

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
        // creating the user's name
        EditText name = findViewById(R.id.name);
        String studentName =  name.getText().toString();

        // getting question 3 input by user
        EditText q3Answer = findViewById(R.id.q3Answer);
        String q3CorrectAnswer = q3Answer.getText().toString();

        // checking user input against correct answer
        if (q3CorrectAnswer == "January 04"){
            scoreCount += 1;
        }else scoreCount += 0;

        // getting question 6 input by user
        CheckBox earthCheckbox = findViewById(R.id.earth_checkbox);     // is there a faster way
        boolean earth = earthCheckbox.isChecked();                      // I could have done this?
        CheckBox plutoCheckbox = findViewById(R.id.pluto_checkbox);
        boolean pluto = plutoCheckbox.isChecked();
        CheckBox mercuryCheckbox = findViewById(R.id.mercury_checkbox);
        boolean mercury = mercuryCheckbox.isChecked();
        CheckBox americaCheckbox = findViewById(R.id.america_checkbox);
        boolean america = americaCheckbox.isChecked();


        // ensuring user selections are accurate
        if(america){
            scoreCount += 0;
        }else if (earth && pluto && mercury) {
            scoreCount += 1;
        }else scoreCount += 0;

        Toast.makeText(this, "Name: " + studentName + "\nScore: " + scoreCount, Toast.LENGTH_LONG).show();
    }

    public void answerFour(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which RadioButton was clicked
        switch (view.getId()) {
            case R.id.q4_first_option:
                if (checked)
                    scoreCount += 1;
            default: scoreCount += 0;
        }
    }
    public void answerFive(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which RadioButton was clicked
        switch (view.getId()) {
            case R.id.q5_second_option:
                if (checked)
                    scoreCount += 1;
            default: scoreCount += 0;
        }
    }
    public void answerSeven(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which RadioButton was clicked
        switch (view.getId()) {
            case R.id.q7_third_option:
                if (checked)
                    scoreCount += 1;
            default: scoreCount += 0;
        }
    }
    public void answerEight(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which RadioButton was clicked
        switch (view.getId()) {
            case R.id.q8_fourth_option:
                if (checked)
                    scoreCount += 1;
            default: scoreCount += 0;
        }
    }
    public void answerNine(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which RadioButton was clicked
        switch (view.getId()) {
            case R.id.q9_third_option:
                if (checked)
                    scoreCount += 1;
            default: scoreCount += 0;
        }
    }
    public void answerTen(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which RadioButton was clicked
        switch (view.getId()) {
            case R.id.q10_second_option:
                if (checked)
                    scoreCount += 1;
            default: scoreCount += 0;
        }
    }

    public void reset(View view) {
        // reset the global variable, scoreCount.
        scoreCount = 0;

        // uncheck all buttons when reset button is pressed
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup1.clearCheck();
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup2.clearCheck();
        RadioGroup radioGroup4 = findViewById(R.id.radioGroup4);
        radioGroup4.clearCheck();
        RadioGroup radioGroup5 = findViewById(R.id.radioGroup5);
        radioGroup5.clearCheck();
        RadioGroup radioGroup7 = findViewById(R.id.radioGroup7);
        radioGroup7.clearCheck();
        RadioGroup radioGroup8 = findViewById(R.id.radioGroup8);
        radioGroup8.clearCheck();
        RadioGroup radioGroup9 = findViewById(R.id.radioGroup9);
        RadioGroup radioGroup10 = findViewById(R.id.radioGroup10);
        radioGroup9.clearCheck();
        radioGroup10.clearCheck();

        // reset the name of user
        EditText name = findViewById(R.id.name);
        name.setText("");

        // reset the cursor position to name EditText
        name.requestFocus();

        // reset question three
        EditText questionThree = findViewById(R.id.q3Answer);
        questionThree.setText("");

        // reset question 6
        CheckBox earth = findViewById(R.id.earth_checkbox);
        if (earth.isChecked()) {
            earth.setChecked(false);
        }
        CheckBox pluto = findViewById(R.id.pluto_checkbox);
        if (pluto.isChecked()) {
            pluto.setChecked(false);
        }
        CheckBox mercury = findViewById(R.id.mercury_checkbox);
        if (mercury.isChecked()) {
            mercury.setChecked(false);
        }
        CheckBox america = findViewById(R.id.america_checkbox);
        if (america.isChecked()) {
            america.setChecked(false);
        }
        // I know there is a faster way to reset these radio buttons but I could not
        // find it, help out in your review, please.
    }
}
