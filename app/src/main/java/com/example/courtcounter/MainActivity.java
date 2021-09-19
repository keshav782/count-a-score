package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        int scoreteamA = 0;
        int scoreteamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }
    public void display_for_three(View view){
        scoreteamA = scoreteamA+3;
        displayForTeamA(scoreteamA);
    }
    public void display_for_two(View view){
        scoreteamA = scoreteamA+2;
        displayForTeamA(scoreteamA);
    }
    public void display_for_one(View view){
       scoreteamA=scoreteamA+1;
       displayForTeamA(scoreteamA);
    }
    public void display_for_threeb(View view){
        scoreteamB = scoreteamB+3;
        displayForTeamB(scoreteamB);
    }
    public void display_for_twob(View view){
        scoreteamB = scoreteamB+2;
        displayForTeamB(scoreteamB);
    }
    public void display_for_oneb(View view){
        scoreteamB = scoreteamB+1;
        displayForTeamB(scoreteamB);
    }
    public void resetscore(View view){
        scoreteamA=0;
        scoreteamB=0;
        displayForTeamB(scoreteamB);
        displayForTeamA(scoreteamA);
    }
}