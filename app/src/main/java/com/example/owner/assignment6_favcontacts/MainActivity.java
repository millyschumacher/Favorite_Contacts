package com.example.owner.assignment6_favcontacts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    Button button1Call,button2Call,button3Call;
    Button button1Text,button2Text,button3Text;
    Spinner spin1Texts,spin2Texts,spin3Texts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set up the button click events
        setupButtonClickEvents();
        setupButton2ClickEvents();
        setupButton3ClickEvents();

        //Set up for the text message spinners
        spin1Texts=(Spinner) findViewById(R.id.spin1Texts);
        spin2Texts=(Spinner) findViewById(R.id.spin2Texts);
        spin3Texts=(Spinner) findViewById(R.id.spin3Texts);
    }

    private void setupButtonClickEvents() {
        //  Set up button click event listener for the call button for the first contact
        button1Call = (Button) findViewById(R.id.button1Call);
        button1Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:6513308203"));
                //is there an app to make the phone call
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        //  Set up button click event listener for the text message button for the first contact
        button1Text = (Button) findViewById(R.id.button1Text);
        button1Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:6513308203"));
                // get message choice from spin1
                sendIntent.putExtra("sms_body", spin1Texts.getSelectedItem().toString());
                startActivity(sendIntent);
            }
        });
    }

    private void setupButton2ClickEvents() {
        //  Set up button click event listener for the call button for the second contact
        button2Call = (Button) findViewById(R.id.button2Call);
        button2Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:7185512325"));
                //is there an app to make the phone call
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        //   Set up button click event listener for the text message button for the second contact
        button2Text = (Button) findViewById(R.id.button2Text);
        button2Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:7185512325"));
                // get message from spin2
                sendIntent.putExtra("sms_body", spin2Texts.getSelectedItem().toString());
                startActivity(sendIntent);
            }
        });
    }

    private void setupButton3ClickEvents() {
        //  Set up button click event listener for the call button for the third contact
        button3Call = (Button) findViewById(R.id.button3Call);
        button3Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:7185847457"));
                //is there an app to make the phone call
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });

        //   Set up button click event listener for the text message button for the third contact
        button3Text = (Button) findViewById(R.id.button3Text);
        button3Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:7185847457"));
                // get message from spin3
                sendIntent.putExtra("sms_body", spin3Texts.getSelectedItem().toString());
                startActivity(sendIntent);
            }
        });
    }
}