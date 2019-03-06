package com.tech_rs.githubapi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //take id...
        button=findViewById(R.id.user_next);
        username=findViewById(R.id.username);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Login_next.class);
                startActivity(intent);
            }
        });

        String user=username.getText().toString();
        //Shared Preference...
        Context context=getApplicationContext();
        SharedPreferences sharedPreferences=context.getSharedPreferences("logi", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("Password",user);

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
