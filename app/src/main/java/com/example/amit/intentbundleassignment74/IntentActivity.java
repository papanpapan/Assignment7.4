package com.example.amit.intentbundleassignment74;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {
    ImageView imageView;
    Intent intent;
    TextView text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        text1=(TextView)findViewById(R.id.tex1);
        text2=(TextView)findViewById(R.id.tex2);
        imageView=(ImageView)findViewById(R.id.imageView);
        //intent=getIntent();
        Bundle bundle=getIntent().getExtras();
        String user=bundle.getString("UserName");
        String pass=bundle.getString("UserPassword");
        //String user=intent.getStringExtra("UserName");
        //String pass=intent.getStringExtra("UserPassword");
        text1.setText(user);
        text2.setText(pass);

    }
}
