package com.firebaseapp.pccalllist.academyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {
    private static final String MSG_EXTRA = "msg";

     public  static void show(Context context, String str){
         Intent intent=new Intent(context,TextActivity.class);
         intent.putExtra(MSG_EXTRA,str);
         context.startActivity(intent);

     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        final String msg=getIntent().getStringExtra(MSG_EXTRA);
        ((TextView)findViewById(R.id.tv_text)).setText(msg);
    }

}
