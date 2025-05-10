package com.example.chatapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText editName;
    Button btnRegister;
    ImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editName = findViewById(R.id.edit_name);
        btnRegister = findViewById(R.id.btn_register);
        imgProfile = findViewById(R.id.img_profile);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                Log.d("REGISTER_LOG", "User mendaftar: " + name);
                Toast.makeText(RegisterActivity.this, "Daftar: " + name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
