package com.example.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndQuizActivity extends AppCompatActivity {

    TextView mCongrats, mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_quiz);

        mCongrats = (TextView)findViewById(R.id.congrats);
        mFinalScore = (TextView)findViewById(R.id.result);
        mRetryButton = (Button)findViewById(R.id.retry_button);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("You scored " + score + " out of 10");

        if (score == 10) {
            mCongrats.setText("Outstanding!");
        }else if (score == 9) {
            mCongrats.setText("Great Result!");
        }else if (score == 8) {
            mCongrats.setText("Nice!");
        }else if (score == 7) {
            mCongrats.setText("Not bad :)");
        }else if (score<7) {
            mCongrats.setText("It could be better - maybe it's time for a nature movie?;)");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EndQuizActivity.this, StartQuizActivity.class));
            }
        });

    }
}
