package com.tech_rs.githubapi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Login_next extends AppCompatActivity {
    private EditText password;
    private String pa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_next);

        //get id...
        password=findViewById(R.id.pass);
        pa=password.getText().toString();
        //Shared Preference...
        Context context=getApplicationContext();
        SharedPreferences sharedPreferences=context.getSharedPreferences("logi", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("Password",pa);

        editor.commit();
        //Get Phone number and password to the sharedpreference...
        if(editor!= null)
        {
            Intent intent=new Intent(getApplicationContext(),Window.class);
            startActivity(intent);
            finish();
        }
    }
}
