package com.example.ticketsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double ticketCost=3.25;
    double totalCost;
    String spnChoice;
    double numberOfTickets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText NumTickets= findViewById(R.id.edtTickets);
        final TextView Result= findViewById(R.id.txtResult);
        final Spinner TicktsGroup=findViewById(R.id.spnGroup);
        Button findCost=findViewById(R.id.btnFindCost);

        findCost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOfTickets= Double.parseDouble(NumTickets.getText().toString());
                spnChoice= TicktsGroup.getSelectedItem().toString();
                totalCost= 3.0 + (ticketCost * numberOfTickets);
                DecimalFormat currencey= new DecimalFormat("$###,###.##");
                Result.setText("Your Fare in " + spnChoice + " car is " + currencey.format(totalCost) +"." );

            }
        });


    }
}