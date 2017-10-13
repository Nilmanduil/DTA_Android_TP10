package fr.codevallee.formation.android_tp10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private NumberStack numberStack = new NumberStack();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Stack lines
        TextView stackNumber1 = (TextView) findViewById(R.id.stackNumber1);
        TextView stackNumber2 = (TextView) findViewById(R.id.stackNumber2);
        TextView stackNumber3 = (TextView) findViewById(R.id.stackNumber3);
        TextView stackNumber4 = (TextView) findViewById(R.id.stackNumber4);

        // Input line
        TextView inputNumber = (TextView) findViewById(R.id.inputNumber);

        // Functional buttons
        initializeFunctionalButtons();

        // Digit buttons
        initializeDigitButtons();

        // Enter button
        initializeEnterButton();

        // Operator buttons
        initializeOperatorButtons();
    }

    private void initializeOperatorButtons() {
        Button plusButton = (Button) findViewById(R.id.plusButton);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button minusButton = (Button) findViewById(R.id.minusButton);
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button timesButton = (Button) findViewById(R.id.timesButton);
        timesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button divideButton = (Button) findViewById(R.id.divideButton);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initializeEnterButton() {
        Button enterButton = (Button) findViewById(R.id.enterButton);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initializeDigitButtons() {
        Button oneButton = (Button) findViewById(R.id.oneButton);
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button twoButton = (Button) findViewById(R.id.twoButton);
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button threeButton = (Button) findViewById(R.id.threeButton);
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button fourButton = (Button) findViewById(R.id.fourButton);
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button fiveButton = (Button) findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button sixButton = (Button) findViewById(R.id.sixButton);
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button sevenButton = (Button) findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button eightButton = (Button) findViewById(R.id.eightButton);
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button nineButton = (Button) findViewById(R.id.nineButton);
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button zeroButton = (Button) findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initializeFunctionalButtons() {
        Button clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button popButton = (Button) findViewById(R.id.popButton);
        popButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button swapButton = (Button) findViewById(R.id.swapButton);
        swapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
