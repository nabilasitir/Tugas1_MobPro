package com.example.mul01.sotobranggahan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pesanan extends AppCompatActivity {

    TextView MenuItem, JumlahItem, TotalItem, Bayar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);
        MenuItem =  findViewById(R.id.menuitem);
        JumlahItem = findViewById(R.id.jumlahitem);
        TotalItem = findViewById(R.id.totalitem);
        Bayar = findViewById(R.id.bayar);


}
    public void Detail (View view) {
        Intent intent = new Intent(Pesanan.this, Message.class);
        startActivity(intent);
    }

}
