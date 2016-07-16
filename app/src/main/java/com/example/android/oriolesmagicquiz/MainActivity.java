package com.example.android.oriolesmagicquiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int mscore;
    String q5R = "Ripken";
    String q5CR = "Cal Ripken";
    String q5Cal = "Cal";
    String q5Rip = "ripken";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void checkResult(View v) {
        //Access the RadioGroup view and save it to a variable.
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.q1RadioBox);
        //Get the id of the RadioButton that is checked and save it
        //as an integer variable.
        int solutionId = radioGroup.getCheckedRadioButtonId();

        //Use if statements to respond based on whether
        //it is the id of the correct answer.
        if (solutionId == R.id.answer1) {
            mscore = mscore ++;
        } else {
            mscore = mscore + 0;
        }
        //Access the RadioGroup2 view and save it to a variable.
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.q2RadioBox);
        //Get the id of the RadioButton that is checked and save it
        //as an integer variable.
        int solutionId2 = radioGroup2.getCheckedRadioButtonId();

        //Use if statements to respond based on whether
        //it is the id of the correct answer.
        if (solutionId2 == R.id.answer2) {
            mscore = mscore ++;
        } else {
            mscore = mscore + 0;
        }


        CheckBox ws1966 = (CheckBox) findViewById(R.id.checkbox_1966);
        if (ws1966.isChecked()) {
            mscore = mscore ++;
        } else {
            mscore = mscore + 0;
        }

        CheckBox ws1983 = (CheckBox) findViewById(R.id.checkbox_1983);
        if (ws1983.isChecked()) {
            mscore = mscore ++;
        } else {
            mscore = mscore + 0;
        }

        CheckBox ws1970 = (CheckBox) findViewById(R.id.checkbox_1970);
        if (ws1970.isChecked()) {
            mscore = mscore ++;
        } else {
            mscore = mscore + 0;
        }

        CheckBox ws1984 = (CheckBox) findViewById(R.id.checkbox_1984);
        if (ws1984.isChecked()) {
            mscore = mscore + 0;
        }


        CheckBox ws1961 = (CheckBox) findViewById(R.id.checkbox_1961);
        if (ws1961.isChecked()) {
            mscore = mscore + 0;
        }

        EditText questionFive = (EditText) findViewById(R.id.question_5);
        String questionFiveAnswer = questionFive.getText().toString();
        if (questionFiveAnswer.equalsIgnoreCase(q5R) || questionFiveAnswer.equalsIgnoreCase(q5CR) || questionFiveAnswer.equalsIgnoreCase(q5Cal) || questionFiveAnswer.equalsIgnoreCase(q5Rip)) {
            mscore = mscore ++;
        }


        EditText enterName = (EditText) findViewById(R.id.name_entry);
        String name = enterName.getText().toString();

        Context context = getApplicationContext();
        CharSequence text = name + " your score is: " + mscore + " points out of a possible 6 points";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}


