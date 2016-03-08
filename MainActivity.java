package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void points3ForA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void points2ForA(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void freeThrowForA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void points3ForB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void points2ForB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void freeThrowForB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        scoreB = 0;
        scoreA = 0;
        displayForTeamB(scoreB);
        displayForTeamA(scoreA);
    }

}
