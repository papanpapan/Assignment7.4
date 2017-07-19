package com.example.amit.intentbundleassignment74;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText username,userpass;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.edituser);
        userpass=(EditText)findViewById(R.id.editpass);
        login=(Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=userpass.getText().toString();
                Intent intent=new Intent(MainActivity.this,IntentActivity.class);
                //intent.putExtra("UserName",user);
                //intent.putExtra("UserPassword",pass);
                Bundle bundle=new Bundle();
                bundle.putString("UserName",user);
                bundle.putString("UserPassword",pass);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
