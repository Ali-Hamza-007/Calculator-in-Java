package com.example.calculatorapp;
import java.text.DecimalFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultTv, solutionTv;
    MaterialButton btnC, btnBracketClose, btnBracketOpen, btnDivide, btn7, btn8, btn9, btnMultiply, btn4, btn5, btn6, btnPlus, btn1, btn2, btn3, btnMinus, btnAC, btn0, btndot, btnequals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        resultTv = findViewById(R.id.result_tv);
        solutionTv = findViewById(R.id.solution_tv);

        btnC = _assignId(R.id.button_c);
//        btnBracketClose = _assignId(R.id.button_close_bracket);
//        btnBracketOpen = _assignId(R.id.button_open_bracket);
        btnDivide = _assignId(R.id.button_divide);
        btn7 = _assignId(R.id.button_7);
        btn8 = _assignId(R.id.button_8);
        btn9 = _assignId(R.id.button_9);
        btnMultiply = _assignId(R.id.button_multiply);
        btn4 = _assignId(R.id.button_4);
        btn5 = _assignId(R.id.button_5);
        btn6 = _assignId(R.id.button_6);
        btnPlus = _assignId(R.id.button_plus);
        btn1 = _assignId(R.id.button_1);
        btn2 = _assignId(R.id.button_2);
        btn3 = _assignId(R.id.button_3);
        btnMinus = _assignId(R.id.button_minus);
        btnAC = _assignId(R.id.button_ac);
        btndot = _assignId(R.id.button_dot);
        btn0 = _assignId(R.id.button_0);
        btnequals = _assignId(R.id.button_equals);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTv.getText().toString();


        if (buttonText.equals("AC")) {
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }


        if (buttonText.equals("C")) {
            if (!dataToCalculate.isEmpty()) {
                dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length() - 1);
                solutionTv.setText(dataToCalculate);
            }
            return;
        }

        if (buttonText.equals("=")) {
            performCalculation(dataToCalculate);
            return;
        }


        if (buttonText.equals(".") && dataToCalculate.isEmpty()) {
            dataToCalculate = "0.";
            solutionTv.setText(dataToCalculate);
            return;
        }


        // Prevent starting with an operator that requires two numbers
        if (dataToCalculate.isEmpty() && (buttonText.equals("+") || buttonText.equals("*") || buttonText.equals("/"))) {
            return;
        }

        dataToCalculate = dataToCalculate + buttonText;
        solutionTv.setText(dataToCalculate);
    }

    private void performCalculation(String input) {
        try {
            // Split based on operators
            String[] parts = input.split("[\\+\\-\\*\\/]");

            // Basic validation for simple two-number math
            if (parts.length < 2) return;

            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);
            double result = 0;

            if (input.contains("+")) result = num1 + num2;
            else if (input.contains("-")) result = num1 - num2;
            else if (input.contains("*")) result = num1 * num2;
            else if (input.contains("/")) {
                if (num2 == 0) {
                    resultTv.setText("Error");
                    return;
                }
                result = num1 / num2;


            }

            // Remove .0 if the result is a whole number
            DecimalFormat df = new DecimalFormat("0.#######");
            String finalResult = df.format(result);
            solutionTv.setText("");
            resultTv.setText(finalResult);
            return;


        } catch (Exception e) {
            resultTv.setText("Error");
        }
    }

    // Helper method to link UI and set click listeners
    MaterialButton _assignId(int id) {
        MaterialButton btn = findViewById(id);
        btn.setOnClickListener(this);
        return btn;
    }
}