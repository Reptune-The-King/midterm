/**
 * @author Roberto Lopez
 */
package edu.angelo.midtermprojectlopez;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import edu.angelo.midtermprojectlopez.GameTracker;



public class MainActivity extends AppCompatActivity {

    private final int numRows = 3;
    private final int numColumns = 3;

    //declare gameTracker and button array
    private GameTracker gameBoard;
    private Button[][] gameButtons;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize gameBoard and buttons
        gameBoard = new GameTracker(numRows, numColumns);
        gameButtons = new Button[][] {
                { findViewById(R.id.button00), findViewById(R.id.button01), findViewById(R.id.button02)},
                { findViewById(R.id.button10), findViewById(R.id.button11), findViewById(R.id.button12)},
                { findViewById(R.id.button20), findViewById(R.id.button21), findViewById(R.id.button22)}
        };//this is to set up the board

    }

    //or can use text to be able to change it instead of images and make the text huge

    //change this
    public void runMe(View view){
        //to intialize the textView1
        //final TextView textView3 = findViewById(R.id.textView3);
        //textView3.setText("Nice clicking.");

        final Button button00 = findViewById(R.id.button00);
        //button00.setBackgroundColor(Color.rgb(84,46,4));
        //button00.setTextColor(Color.BLACK);
        button00.setText("X");
     }




}
