package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int scorePlayerA = 0;
    int scorePlayerB = 0;
    int round = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle actionbar item clicks here. The action bar will
        //automatically handle clicks on the Home/Up button, so long
        //as you specify a parent acitvity in AndroidManifest.xml.
        int id = item.getItemId();

        //no inspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    /**
     * Subtrac the score for Player A by 1 point.
     */
    public void subtractOnePlayerA(View v) {
        scorePlayerA = scorePlayerA -1;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increase the score for Player A by 2 points.
     */
    public void addTwoForPlayerA(View v) {
        scorePlayerA =  scorePlayerA +2;
        displayForPlayerA( scorePlayerA);
    }

    /**
     * Increase the score for Player A by 1 point.
     */
    public void addOneForPlayerA(View v) {
        scorePlayerA =  scorePlayerA +1;
        displayForPlayerA( scorePlayerA);
    }
    /**
     * Increase the score for Player B by 1 point.
     */
    public void addOneForPlayerB(View v) {
        scorePlayerB = scorePlayerB +1;
        displayForPlayerB(scorePlayerB);
    }
    /**
     * Increase the score for Player B by 2 points.
     */
    public void addTwoForPlayerB(View v) {
        scorePlayerB = scorePlayerB +2;
        displayForPlayerB(scorePlayerB);
    }
    /**
     * Subtrac the score for Player B by 1 point.
     */
    public void subtractOnePlayerB(View v) {
        scorePlayerB = scorePlayerB -1;
        displayForPlayerB(scorePlayerB);
    }
    /**
     * Increase the round.
     */
    public void addOneRound(View v) {
        round = round +1;
        displayForRound(round);
    }
    /**
     * Displays Reset.
     */

    public void resetScore(View v) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA( scorePlayerA);
        displayForPlayerB( scorePlayerB);
    }
    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of rounds.
     */
    public void displayForRound(int score) {
        TextView scoreView = (TextView) findViewById(R.id.round);
        scoreView.setText(String.valueOf(score));
    }
}