package fr.codevallee.formation.android_tp10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends Tracer {
    private NumberStack numberStack = new NumberStack();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Functional buttons
        initializeFunctionalButtons();

        // Digit buttons
        initializeDigitButtons();

        // Enter button
        initializeEnterButton();

        // Operator buttons
        initializeOperatorButtons();
    }

    private void addDigitToInput(char digit) {
        TextView inputNumber = (TextView) findViewById(R.id.inputNumber);

        if(inputEmpty()) {
            inputNumber.setText("" + digit);
        }
        else {
            String inputNumberText = inputNumber.getText().toString();
            inputNumber.setText(inputNumberText + digit);
        }
    }

    private boolean inputEmpty() {
        TextView inputNumber = (TextView) findViewById(R.id.inputNumber);
        String inputNumberText = inputNumber.getText().toString();

        return inputNumberText.equals("") || inputNumberText.equals("0");
    }

    private boolean inputReallyEmpty() {
        TextView inputNumber = (TextView) findViewById(R.id.inputNumber);
        String inputNumberText = inputNumber.getText().toString();

        return inputNumberText.equals("");
    }

    private void beforeOperation() {
        if(inputReallyEmpty()) {
            Integer last = numberStack.pop();
            TextView inputNumber = (TextView) findViewById(R.id.inputNumber);
            inputNumber.setText(last.toString());
        }
    }

    private void initializeOperatorButtons() {
        Button plusButton = (Button) findViewById(R.id.plusButton);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numberStack.size() >= 2 || (!inputReallyEmpty() && numberStack.size() >= 1)) {
                    beforeOperation();
                    Integer last = numberStack.pop();
                    TextView inputNumber = (TextView) findViewById(R.id.inputNumber);
                    String inputNumberText = inputNumber.getText().toString();

                    Integer result = last + Integer.parseInt(inputNumberText);
                    numberStack.push(result);
                    clearInputField();

                    refreshNumberStack();
                }
            }
        });

        Button minusButton = (Button) findViewById(R.id.minusButton);
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numberStack.size() >= 2 || (!inputReallyEmpty() && numberStack.size() >= 1)) {
                    beforeOperation();
                    Integer last = numberStack.pop();
                    TextView inputNumber = (TextView) findViewById(R.id.inputNumber);
                    String inputNumberText = inputNumber.getText().toString();

                    Integer result = last - Integer.parseInt(inputNumberText);
                    numberStack.push(result);
                    clearInputField();

                    refreshNumberStack();
                }
            }
        });

        Button timesButton = (Button) findViewById(R.id.timesButton);
        timesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numberStack.size() >= 2 || (!inputReallyEmpty() && numberStack.size() >= 1)) {
                    beforeOperation();
                    Integer last = numberStack.pop();
                    TextView inputNumber = (TextView) findViewById(R.id.inputNumber);
                    String inputNumberText = inputNumber.getText().toString();

                    Integer result = last * Integer.parseInt(inputNumberText);
                    numberStack.push(result);
                    clearInputField();

                    refreshNumberStack();
                }
            }
        });

        Button divideButton = (Button) findViewById(R.id.divideButton);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numberStack.size() >= 2 || (!inputReallyEmpty() && numberStack.size() >= 1)) {
                    TextView inputNumber = (TextView) findViewById(R.id.inputNumber);
                    String inputNumberText = inputNumber.getText().toString();
                    if (inputNumberText.equals("0") || numberStack.peek() == 0) {
                        return;
                    }

                    beforeOperation();
                    Integer last = numberStack.pop();
                    inputNumberText = inputNumber.getText().toString();

                    Integer result = last / Integer.parseInt(inputNumberText);
                    numberStack.push(result);
                    clearInputField();

                    refreshNumberStack();
                }
            }
        });
    }

    private void initializeEnterButton() {
        Button enterButton = (Button) findViewById(R.id.enterButton);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!MainActivity.this.inputReallyEmpty()) {
                    TextView inputNumber = (TextView) findViewById(R.id.inputNumber);
                    String inputNumberText = inputNumber.getText().toString();

                    numberStack.push(Integer.parseInt(inputNumberText));
                    Log.d("Info", numberStack.toString());
                    refreshNumberStack();
                    clearInputField();
                }
            }
        });
    }

    private void initializeDigitButtons() {
        Button oneButton = (Button) findViewById(R.id.oneButton);
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDigitToInput('1');
            }
        });

        Button twoButton = (Button) findViewById(R.id.twoButton);
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDigitToInput('2');
            }
        });

        Button threeButton = (Button) findViewById(R.id.threeButton);
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDigitToInput('3');
            }
        });

        Button fourButton = (Button) findViewById(R.id.fourButton);
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDigitToInput('4');
            }
        });

        Button fiveButton = (Button) findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDigitToInput('5');
            }
        });

        Button sixButton = (Button) findViewById(R.id.sixButton);
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDigitToInput('6');
            }
        });

        Button sevenButton = (Button) findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDigitToInput('7');
            }
        });

        Button eightButton = (Button) findViewById(R.id.eightButton);
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDigitToInput('8');
            }
        });

        Button nineButton = (Button) findViewById(R.id.nineButton);
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDigitToInput('9');
            }
        });

        Button zeroButton = (Button) findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDigitToInput('0');
            }
        });
    }

    private void initializeFunctionalButtons() {
        Button clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearInputField();
                clearNumberStack();
            }
        });

        Button popButton = (Button) findViewById(R.id.popButton);
        popButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberStack.pop();
                refreshNumberStack();
            }
        });

        Button swapButton = (Button) findViewById(R.id.swapButton);
        swapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer last, before;
                last = numberStack.pop();
                before = numberStack.pop();

                numberStack.push(last);
                numberStack.push(before);

                refreshNumberStack();
            }
        });

        ImageButton eraseButton = (ImageButton) findViewById(R.id.eraseButton);
        eraseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearInputField();
            }
        });

        ImageButton helpButton = (ImageButton) findViewById(R.id.helpButton);
        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String language = Locale.getDefault().getDisplayLanguage();
                String uri;
                switch (language) {
                    case "français":
                        uri = "https://fr.wikipedia.org/wiki/Notation_polonaise_inverse";
                        break;
                    default:
                        uri = "https://en.wikipedia.org/wiki/Reverse_Polish_notation";
                        break;
                }

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                Log.d("Info", uri);
                startActivity(intent);
            }
        });
    }

    private void clearInputField() {
        TextView inputNumber = (TextView) findViewById(R.id.inputNumber);
        inputNumber.setText("");
    }

    private void clearNumberStack() {
        numberStack.clear();
        TextView stackNumber1 = (TextView) findViewById(R.id.stackNumber1);
        TextView stackNumber2 = (TextView) findViewById(R.id.stackNumber2);
        TextView stackNumber3 = (TextView) findViewById(R.id.stackNumber3);
        TextView stackNumber4 = (TextView) findViewById(R.id.stackNumber4);
        stackNumber1.setText("");
        stackNumber2.setText("");
        stackNumber3.setText("");
        stackNumber4.setText("");
    }

    private void refreshNumberStack() {
        Integer[] last = this.numberStack.getLastFour();

        TextView stackNumber1 = (TextView) findViewById(R.id.stackNumber1);
        TextView stackNumber2 = (TextView) findViewById(R.id.stackNumber2);
        TextView stackNumber3 = (TextView) findViewById(R.id.stackNumber3);
        TextView stackNumber4 = (TextView) findViewById(R.id.stackNumber4);

        stackNumber1.setText((last[0] == -1 ? "" : last[0].toString()));
        stackNumber2.setText((last[1] == -1 ? "" : last[1].toString()));
        stackNumber3.setText((last[2] == -1 ? "" : last[2].toString()));
        stackNumber4.setText((last[3] == -1 ? "" : last[3].toString()));
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        TextView inputNumber = (TextView) findViewById(R.id.inputNumber);
        inputNumber.setText(savedInstanceState.getString("input"));
        numberStack = (NumberStack) savedInstanceState.getSerializable("numberStack");
        super.onRestoreInstanceState(savedInstanceState);
        refreshNumberStack();
    }

    protected void onSaveInstanceState(Bundle outState) {
        TextView inputNumber = (TextView) findViewById(R.id.inputNumber);
        outState.putSerializable("numberStack", numberStack);
        outState.putString("input", inputNumber.getText().toString());
        super.onSaveInstanceState(outState);
    }
}
