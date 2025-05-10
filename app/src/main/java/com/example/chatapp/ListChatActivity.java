package com.example.chatapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListChatActivity extends AppCompatActivity {

    String[] chatList = {
            "INDRA: SELAMAT PAGI",
            "AGUS: Selamat UTS!",
            "YAYA: Selesai daftar!",
            "Bot: Ini chat simulasi."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chat);

        ListView listView = findViewById(R.id.list_chat);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, chatList);
        listView.setAdapter(adapter);
    }
}
