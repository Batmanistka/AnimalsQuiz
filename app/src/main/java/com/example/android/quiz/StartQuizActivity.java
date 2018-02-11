package com.example.android.quiz;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class StartQuizActivity extends AppCompatActivity {

    private Questions mQuestions = new Questions();

    private TextView mQuestionNumberView;
    private TextView mQuestionView;
    private ImageView mImageView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    public String mAnswer;
    public int mScore;
    private int mQuestionValue;
    private int mQuestionNumber;
    public String name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        mScore = 0;
        mQuestionValue = 0;
        mQuestionNumber = 1;

        Intent cdName = getIntent();
        name = cdName.getStringExtra("user_name");


        mQuestionNumberView = (TextView) findViewById(R.id.question_number_view);
        mQuestionView = (TextView) findViewById(R.id.question);
        mImageView = (ImageView) findViewById(R.id.image);
        mButtonChoice1 = (Button) findViewById(R.id.answer_1);
        mButtonChoice2 = (Button) findViewById(R.id.answer_2);
        mButtonChoice3 = (Button) findViewById(R.id.answer_3);
        mButtonChoice4 = (Button) findViewById(R.id.answer_4);
        updateQuestion();



        //When user click first button
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if button is clicked counter get + 1
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    mQuestionNumber = mQuestionNumber + 1;
                    updateQuestionNumber(mQuestionNumber);
                    // set the color green if answer is correct.
                    mButtonChoice1.setBackgroundColor(getResources().getColor(R.color.my_green));
                    // change to original after 3 secs.
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            mButtonChoice1.setBackgroundColor(getResources().getColor(R.color.my_gray));
                        }
                    }, 700);

                    Toast.makeText(StartQuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                    if (mQuestionValue == Questions.mQuestions.length) {
                        Intent i = new Intent(StartQuizActivity.this, EndQuizActivity.class);
                        i.putExtra("user_name", name);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        StartQuizActivity.this.finish();
                        startActivity(i);
                    }else {
                        updateQuestion();
                    }

                } else {
                    // set the color red if answer is incorrect
                    mButtonChoice1.setBackgroundColor(getResources().getColor(R.color.my_red));
                    // change to original after 3 secs.
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            mButtonChoice1.setBackgroundColor(getResources().getColor(R.color.my_gray));
                        }
                    }, 700);
                    Toast.makeText(StartQuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    mQuestionNumber = mQuestionNumber + 1;
                    updateQuestionNumber(mQuestionNumber);

                    if (mQuestionValue == Questions.mQuestions.length) {
                        Intent i = new Intent(StartQuizActivity.this, EndQuizActivity.class);
                        i.putExtra("user_name", name);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        StartQuizActivity.this.finish();
                        startActivity(i);
                    }else {
                        updateQuestion();
                    }
                }
            }
        });


        //When user click second button
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if button is clicked counter get + 1

                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    mQuestionNumber = mQuestionNumber + 1;
                    updateQuestionNumber(mQuestionNumber);

                    // set the color green if answer is correct.
                    mButtonChoice2.setBackgroundColor(getResources().getColor(R.color.my_green));
                    // change to original after 3 secs.
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            mButtonChoice2.setBackgroundColor(getResources().getColor(R.color.my_gray));
                        }
                    }, 700);

                    Toast.makeText(StartQuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                    if (mQuestionValue == Questions.mQuestions.length) {
                        Intent i = new Intent(StartQuizActivity.this, EndQuizActivity.class);
                        i.putExtra("user_name", name);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        StartQuizActivity.this.finish();
                        startActivity(i);
                    }else {
                        updateQuestion();
                    }


                } else {
                    // set the color red if answer is incorrect
                    mButtonChoice2.setBackgroundColor(getResources().getColor(R.color.my_red));
                    // change to original after 3 secs.
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            mButtonChoice2.setBackgroundColor(getResources().getColor(R.color.my_gray));
                        }
                    }, 700);

                    Toast.makeText(StartQuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    mQuestionNumber = mQuestionNumber + 1;
                    updateQuestionNumber(mQuestionNumber);

                    if (mQuestionValue == Questions.mQuestions.length) {
                        Intent i = new Intent(StartQuizActivity.this, EndQuizActivity.class);
                        i.putExtra("user_name", name);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        StartQuizActivity.this.finish();
                        startActivity(i);
                    }else {
                        updateQuestion();
                    }
                }
            }
        });


        //When user click third button
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if button is clicked counter get + 1

                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    mQuestionNumber = mQuestionNumber + 1;
                    updateQuestionNumber(mQuestionNumber);

                    // set the color green if answer is correct.
                    mButtonChoice3.setBackgroundColor(getResources().getColor(R.color.my_green));
                    // change to original after 5 secs.
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            mButtonChoice3.setBackgroundColor(getResources().getColor(R.color.my_gray));
                        }
                    }, 700);

                    Toast.makeText(StartQuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                    if (mQuestionValue == Questions.mQuestions.length) {
                        Intent i = new Intent(StartQuizActivity.this, EndQuizActivity.class);
                        i.putExtra("user_name", name);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        StartQuizActivity.this.finish();
                        startActivity(i);
                    }else {
                        updateQuestion();

                    }

                } else {

                    // set the color red if answer is incorrect
                    mButtonChoice3.setBackgroundColor(getResources().getColor(R.color.my_red));
                    // change to original after 3 secs.
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            mButtonChoice3.setBackgroundColor(getResources().getColor(R.color.my_gray));
                        }
                    }, 700);

                    Toast.makeText(StartQuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    mQuestionNumber = mQuestionNumber + 1;
                    updateQuestionNumber(mQuestionNumber);

                    if (mQuestionValue == Questions.mQuestions.length) {
                        Intent i = new Intent(StartQuizActivity.this, EndQuizActivity.class);
                        i.putExtra("user_name", name);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        StartQuizActivity.this.finish();
                        startActivity(i);
                    }else {
                        updateQuestion();
                    }
                }

            }
        });


        //When user click fourth button
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if button is clicked counter get + 1

                if (mButtonChoice4.getText() == mAnswer) {
                    //updates the score
                    mScore = mScore + 1;
                    //converts int variable to a string and adds it to mScore
                    mQuestionNumber = mQuestionNumber + 1;
                    updateQuestionNumber(mQuestionNumber);

                    // set the color green if answer is correct.
                    mButtonChoice4.setBackgroundColor(getResources().getColor(R.color.my_green));
                    // change to original after 3 secs.
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            mButtonChoice4.setBackgroundColor(getResources().getColor(R.color.my_gray));
                        }
                    }, 700);

                    Toast.makeText(StartQuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                    if (mQuestionValue == Questions.mQuestions.length) {
                        Intent i = new Intent(StartQuizActivity.this, EndQuizActivity.class);
                        i.putExtra("user_name", name);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        StartQuizActivity.this.finish();
                        startActivity(i);

                    }else {
                        updateQuestion();
                    }

                } else {

                    // set the color red if answer is incorrect
                    mButtonChoice4.setBackgroundColor(getResources().getColor(R.color.my_red));
                    // change to original after 3 secs.
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            mButtonChoice4.setBackgroundColor(getResources().getColor(R.color.my_gray));
                        }
                    }, 700);

                    Toast.makeText(StartQuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    mQuestionNumber = mQuestionNumber + 1;
                    updateQuestionNumber(mQuestionNumber);


                    if (mQuestionValue == Questions.mQuestions.length) {
                        Intent i = new Intent(StartQuizActivity.this, EndQuizActivity.class);
                        i.putExtra("user_name", name);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        StartQuizActivity.this.finish();
                        startActivity(i);
                    }else {
                        updateQuestion();
                    }
                }
            }
        });
    }

    public void updateQuestion() {
        mQuestionView.setText(mQuestions.getQuestion(mQuestionValue));
        mImageView.setImageResource(mQuestions.getImageView[mQuestionValue]);
        mButtonChoice1.setText(mQuestions.getChoice1(mQuestionValue));
        mButtonChoice2.setText(mQuestions.getChoice2(mQuestionValue));
        mButtonChoice3.setText(mQuestions.getChoice3(mQuestionValue));
        mButtonChoice4.setText(mQuestions.getChoice4(mQuestionValue));
        mAnswer = mQuestions.getCorrectAnswer(mQuestionValue);
        mQuestionValue++;
    }

    public void updateQuestionNumber(int mQuestionNumber) {
        mQuestionNumberView.setText("Question " + mQuestionNumber + "/10");

    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // saving the content of textview using the key
        outState.putInt("Question_Number", mQuestionNumber);
        outState.putInt("Question_Value", mQuestionValue);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mQuestionNumber = savedInstanceState.getInt("Question_Number");
        mQuestionValue = savedInstanceState.getInt("Question_Value");
    }


}
