package com.example.first_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView usernameTv = findViewById(R.id.user_name_tv);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String name = bundle.getString("Name","");
            usernameTv.setText(name);
        }



    }
}