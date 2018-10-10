package com.example.mul01.sotobranggahan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pesanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);
    }
    public void Detail (View view) {
        Intent intent = new Intent(Pesanan.this, Message.class);
        startActivity(intent);
    }

}
