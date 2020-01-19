package com.example.android.footballscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int totalShotsTeamA = 0;
    int totalShotsTeamB = 0;
    int shotsOnTargetTeamA = 0;
    int shotsOnTargetTeamB = 0;
    int cornerKickTeamA = 0;
    int cornerKickTeamB = 0;
    int freeKickTeamA = 0;
    int freeKickTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int possessionTeamA = 0;
    int possessionTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

	public void displayTotalShotsForTeamA(int totalshots) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_total_shots);
        scoreView.setText(String.valueOf(totalshots));
    }
    public void displayShotsOnTargetForTeamA(int shotsontarget) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_shots_on_target);
        scoreView.setText(String.valueOf(shotsontarget));
    }
    public void displayCornerKickForTeamA(int cornerkick){
    	TextView scoreView = (TextView) findViewById(R.id.team_a_corner_kick);
        scoreView.setText(String.valueOf(cornerkick));
    }
    public void displayFreeKickForTeamA(int freekick){
    	TextView scoreView = (TextView) findViewById(R.id.team_a_free_kick);
        scoreView.setText(String.valueOf(freekick));
    }
    public void displayFoulForTeamA(int foul){
    	TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }
    public void displayPossessionForTeamA(int possession){
    	TextView scoreView = (TextView) findViewById(R.id.team_a_possession);
        scoreView.setText(String.valueOf(possession));
    }  

    
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

	public void totalShotsForTeamA(View view){
    	totalShotsTeamA = totalShotsTeamA + 1;
    	displayTotalShotsForTeamA(totalShotsTeamA);
    }    

    public void shotsOnTargetForTeamA (View view){
    	shotsOnTargetTeamA = shotsOnTargetTeamA + 1;
    	displayShotsOnTargetForTeamA(shotsOnTargetTeamA);
    }

    public void cornerKickForTeamA (View view){
    	cornerKickTeamA = cornerKickTeamA + 1;
    	displayCornerKickForTeamA(cornerKickTeamA);
    }

    public void freeKickForTeamA (View view){
    	freeKickTeamA = freeKickTeamA + 1;
    	displayFreeKickForTeamA(freeKickTeamA);
    }

    public void foulForTeamA (View view){
    	foulTeamA = foulTeamA + 1;
    	displayFoulForTeamA(foulTeamA);
    }

    public void possessionForTeamA (View view){
    	possessionTeamA = possessionTeamA + 10;
    	displayPossessionForTeamA(possessionTeamA);
    }
    
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTotalShotsForTeamB(int totalshots) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_total_shots);
        scoreView.setText(String.valueOf(totalshots));
    }
    public void displayShotsOnTargetForTeamB(int shotsontarget) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_shots_on_target);
        scoreView.setText(String.valueOf(shotsontarget));
    }
    public void displayCornerKickForTeamB(int cornerkick){
    	TextView scoreView = (TextView) findViewById(R.id.team_b_corner_kick);
        scoreView.setText(String.valueOf(cornerkick));	
    }
    public void displayFreeKickForTeamB(int freekick){
    	TextView scoreView = (TextView) findViewById(R.id.team_b_free_kick);
        scoreView.setText(String.valueOf(freekick));	
    }
    public void displayFoulForTeamB(int foul){
    	TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));	
    }
    public void displayPossessionForTeamB(int possession){
    	TextView scoreView = (TextView) findViewById(R.id.team_b_possession);
        scoreView.setText(String.valueOf(possession));	
    }  

    
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

	public void totalShotsForTeamB(View view){
    	totalShotsTeamB = totalShotsTeamB + 1;
    	displayTotalShotsForTeamB(totalShotsTeamB);
    }    

    public void shotsOnTargetForTeamB (View view){
    	shotsOnTargetTeamB = shotsOnTargetTeamB + 1;
    	displayShotsOnTargetForTeamB(shotsOnTargetTeamB);
    }

    public void cornerKickForTeamB (View view){
    	cornerKickTeamB = cornerKickTeamB + 1;
    	displayCornerKickForTeamB(cornerKickTeamB);
    }

    public void freeKickForTeamB (View view){
    	freeKickTeamB = freeKickTeamB + 1;
    	displayFreeKickForTeamB(freeKickTeamB);
    }

    public void foulForTeamB (View view){
    	foulTeamB = foulTeamB + 1;
    	displayFoulForTeamB(foulTeamB);
    }

    public void possessionForTeamB (View view){
    	possessionTeamB = possessionTeamB + 10;
    	displayPossessionForTeamB(possessionTeamB);
    }

    

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        totalShotsTeamA = 0;
    	totalShotsTeamB = 0;
    	shotsOnTargetTeamA = 0;
    	shotsOnTargetTeamB = 0;
    	cornerKickTeamA = 0;
    	cornerKickTeamB = 0;
    	freeKickTeamA = 0;
    	freeKickTeamB = 0;
    	foulTeamA = 0;
    	foulTeamA = 0;
    	possessionTeamA = 0;
    	possessionTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayTotalShotsForTeamA(totalShotsTeamA);
        displayTotalShotsForTeamB(totalShotsTeamB);
        displayShotsOnTargetForTeamA(shotsOnTargetTeamA);
        displayShotsOnTargetForTeamB(shotsOnTargetTeamB);
        displayCornerKickForTeamA(cornerKickTeamA);
        displayCornerKickForTeamB(cornerKickTeamB);
        displayFreeKickForTeamA(freeKickTeamA);
        displayFreeKickForTeamB(freeKickTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
        displayPossessionForTeamA(possessionTeamA);
        displayPossessionForTeamB(possessionTeamB);

    }
}
