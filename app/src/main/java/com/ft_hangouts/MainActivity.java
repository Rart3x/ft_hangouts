package com.ft_hangouts;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.footer);
    }

    public void callsRedirection(View view) {
        Intent intent = new Intent(this, Calls.class);
        startActivity(intent);
    }
    public void contactsRedirection(View view) {
        Intent intent = new Intent(this, Contacts.class);
        startActivity(intent);
    }
    public void messagesRedirection(View view) {
        Intent intent = new Intent(this, Messages.class);
        startActivity(intent);
    }

}