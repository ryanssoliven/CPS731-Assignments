package com.example.TripBooking;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    int ticketsEntered;
    int computedTickets;
    int year;
    int month;
    int dayOfMonth;
    Calendar calendar;
    Button selectDate;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText edtTicketsEntered= findViewById(R.id.edtTickets);
        final RadioButton PtoK= findViewById(R.id.seasonPass);
        final RadioButton KtoP=findViewById(R.id.singlePass);
        final TextView result=findViewById(R.id.txtResult);
        Button computeW= findViewById(R.id.btnconvert);
        Button selectDate = findViewById(R.id.btnDate);
        selectDate.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                            }
                        }, year, month, dayOfMonth);
                datePickerDialog.show();
            }
        });
        computeW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ticketsEntered=Integer.parseInt(edtTicketsEntered.getText().toString());
                DecimalFormat tenth= new DecimalFormat("#.#");
                if(PtoK.isChecked()){
                    computedTickets = 40 * ticketsEntered;
                    result.setText("Your " + ticketsEntered + " Season Pass Tickets " + "are confirmed on " + month + "/"+dayOfMonth + ", " + year + "\n" + "Total Cost: $" + computedTickets);

            }
            else if(KtoP.isChecked()){
                computedTickets = 15 * ticketsEntered;
                    result.setText("Your " + ticketsEntered + " Single Pass Tickets " + "are confirmed on " + month + "/"+dayOfMonth + ", " + year + "\n" + "Total Cost: $" + computedTickets);

                }
            }
        });
    }
}