package com.firebaseapp.pccalllist.academyapp;

import androidx.appcompat.app.AppCompatActivity;
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


    }
}
