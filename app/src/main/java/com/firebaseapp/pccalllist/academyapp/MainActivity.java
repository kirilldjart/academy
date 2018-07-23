package com.firebaseapp.pccalllist.academyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      //  EditText editText;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText=findViewById(R.id.edit_msg);
        findViewById(R.id.btn_activity).setOnClickListener(view -> {TextActivity.show(this, editText.getText().toString() );} );
        findViewById(R.id.btn_email).setOnClickListener(view -> {

            Intent sendIntent=new Intent();
            sendIntent.setAction(Intent.ACTION_SENDTO);
            sendIntent.putExtra(Intent.EXTRA_TEXT, editText.getText().toString());
            sendIntent.putExtra(Intent.EXTRA_EMAIL, "drobushevsky_kirill@mail.ru");
            sendIntent.putExtra(Intent.EXTRA_SUBJECT, "The message I wrote on my app");
            //sendIntent.putExtra(Intent.EXTRA_STREAM, attachment);
            sendIntent.setType("text/plain");

                // Always use string resources for UI text.
                // This says something like "Share this photo with"
                 String title = getResources().getString(R.string.chooser_title);
            // Create intent to show the chooser dialog
            Intent chooser = Intent.createChooser(sendIntent, title);


            if (sendIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(chooser);
            }

         } );


    }
}
