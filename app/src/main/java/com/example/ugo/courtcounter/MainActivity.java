package com.example.ugo.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    /**
     * Displays the given score for Team A.
     */


    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void freeThrow (View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void add_2pnts (View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void add_3pnts (View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    private void displayTeamA(int scoreTeamA) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + scoreTeamA);
    }

    private void freeThrow (int scoreTeamA) {
        TextView scoreForTeamA = (TextView) findViewById(R.id.team_a_score);
    }

    private void add_2pnts (int scoreTeamA) {
        TextView scoreTextview = (TextView) findViewById(R.id.team_a_score);
    }

    private void add_3pnts (int scoreTeamA) {
        TextView scoreTextview = (TextView) findViewById(R.id.team_a_score);
    }


    /**
     * Displays the given score for Team B.
     */


    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_u_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void freeThrowForTeamB (View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void add_2pntsForTeamB (View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void add_3pntsForTeamB (View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    private void displayTeamB(int scoreTeamB) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_u_score);
        quantityTextView.setText("" + scoreTeamB);}

    private void freeThrowForTeamB (int scoreTeamB) {
        TextView scoreForTeamB = (TextView) findViewById(R.id.team_u_score);
    }

    private void add_2pntsForTeamB (int scoreTeamB) {
        TextView scoreForTeamB = (TextView) findViewById(R.id.team_u_score);
    }

    private void add_3pntsForTeamB (int scoreTeamB) {
        TextView scoreForTeamB = (TextView) findViewById(R.id.team_u_score);
    }

    /**
     * Displays the given score for Reset.
     */

    /**
     * int scoreReset = 0;
     public void displayRESET(int scoreTeamA) {
     TextView scoreView = (TextView) findViewById(R.id.score_reset);
     scoreView.setText(String.valueOf(scoreReset));
     }
      */


    public void resetScore (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

    /**
     *private void display(int resetScore) {
     TextView quantityTextView = (TextView) findViewById(R.id.score_reset);
     quantityTextView.setText("" + resetScore);}

     private void resetScore (int scoreTeamA) {
     TextView scoreForTeamA = (TextView) findViewById(R.id.score_reset);
     }
     */




}



