package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText billAmount;
    EditText numberOfPatrons;
    EditText totalTip;
    EditText tipPerPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        billAmount = (EditText) findViewById(R.id.billAmount);
        numberOfPatrons = (EditText) findViewById(R.id.numberOfPatrons);
        totalTip = (EditText) findViewById(R.id.totalTip);
        tipPerPerson = (EditText) findViewById(R.id.tipPerPerson);
    }

    public void buttonTwentyFivePercentTip(View view) {
        String totalBillAmount = billAmount.getText().toString();
        Double totalBill = Double.parseDouble(totalBillAmount);
        String patrons = numberOfPatrons.getText().toString();
        Double patronsNum = Double.parseDouble(patrons);

        Double tip = (totalBill * .25);
        Double tipPerPatron = (totalBill * .25) / patronsNum;

        totalTip.setText(tip.toString());
        tipPerPerson.setText(tipPerPatron.toString());
    }

    public void buttonTwentyPercentTip(View view) {

        String totalBillAmount = billAmount.getText().toString();
        Double totalBill = Double.parseDouble(totalBillAmount);
        String patrons = numberOfPatrons.getText().toString();
        Double patronsNum = Double.parseDouble(patrons);

        Double tip = (totalBill * .20);
        Double tipPerPatron = (totalBill * .20) / patronsNum;

        totalTip.setText(tip.toString());
        tipPerPerson.setText(tipPerPatron.toString());

    }

    public void buttonFifteenPercentTip(View view) {

        String totalBillAmount = billAmount.getText().toString();
        Double totalBill = Double.parseDouble(totalBillAmount);
        String patrons = numberOfPatrons.getText().toString();
        Double patronsNum = Double.parseDouble(patrons);

        Double tip = (totalBill * .15);
        Double tipPerPatron = (totalBill * .15) / patronsNum;

        totalTip.setText(tip.toString());
        tipPerPerson.setText(tipPerPatron.toString());

    }

    public void buttonTenPercentTip(View view) {

        String totalBillAmount = billAmount.getText().toString();
        Double totalBill = Double.parseDouble(totalBillAmount);
        String patrons = numberOfPatrons.getText().toString();
        Double patronsNum = Double.parseDouble(patrons);

        Double tip = (totalBill * .10);
        Double tipPerPatron = (totalBill * .10) / patronsNum;

        totalTip.setText(tip.toString());
        tipPerPerson.setText(tipPerPatron.toString());

    }
}