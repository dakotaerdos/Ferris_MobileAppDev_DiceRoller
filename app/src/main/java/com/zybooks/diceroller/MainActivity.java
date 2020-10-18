package com.zybooks.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Dakota Erdos
    //  ISYS 221 - 001
    //  Assignmnet #3 - Dice Roller App
    //  Due: 9/25/2020

    private Spinner diceSpinner;
    private Button rollButton;
    private TextView diceOutputTextView;

    Dice dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceSpinner = findViewById(R.id.DiceSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.diceOptions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        diceSpinner.setAdapter(adapter);

        rollButton = findViewById(R.id.RollButton);

        diceOutputTextView = findViewById(R.id.RollOutputTextView);
        diceOutputTextView.setText("");

        dice = new Dice();

    }

    public void RollDice(View view) {

        String currentSelectionText = diceSpinner.getSelectedItem().toString();
        int currentSelectionInt = 0;
        switch (currentSelectionText) {
            case "Coin":
                currentSelectionInt = 2;
                break;
            case "4 Sided Die":
                currentSelectionInt = 4;
                break;
            case "6 Sided Die":
                currentSelectionInt = 6;
                break;
            case "8 Sided Die":
                currentSelectionInt = 8;
                break;
            case "10 Sided Die":
                currentSelectionInt = 10;
                break;
            case "12 Sided Die":
                currentSelectionInt = 12;
                break;
            case "20 Sided Die":
                currentSelectionInt = 20;
                break;
            case "100 Sided Die":
                currentSelectionInt = 100;
                break;
        }

        diceOutputTextView.setText(String.valueOf(dice.Roll(currentSelectionInt)));
    }
}