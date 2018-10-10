package com.example.mul01.sotobranggahan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Telefon(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:085659083907"));
        startActivity(intent);
    }
    public void Menu(View view) {
        Intent intent = new Intent(MainActivity.this, MenuSoto.class);
        startActivity(intent);
    }


}
