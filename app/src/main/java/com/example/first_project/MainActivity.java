package com.example.first_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginBtn = findViewById(R.id.login_btn);
        EditText etName = findViewById(R.id.name_et);
        EditText etPass = findViewById(R.id.pass_et);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = etName.getText().toString();
                String pass = etPass.getText().toString();

                Log.i("NAME",name);
                Log.i("NAME",pass);

                if (name.equals("c") && pass.equals("zxc")){
                    Intent i = new Intent(MainActivity.this,Home.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Check Creds !", Toast.LENGTH_SHORT);
                }
            }
        });



    }
}