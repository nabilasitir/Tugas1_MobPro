package com.example.mul01.sotobranggahan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MenuSoto extends AppCompatActivity {

    EditText jmlSotoAyam,jmlSotoDaging,jmlSotoSpecial,jmlEsTeh,jmlEsJeruk;
    Integer jmlsotoayam=0, jmlsotodaging=0, jmlsotospecial=0, jmlesteh=0, jmlesjeruk=0;
    Integer totalSotoAyam=0, totalSotoDaging=0, totalSotoSpecial=0, totalEsTeh=0, totalEsJeruk=0;
    String menu;
    String harga;
    String jumlah;
    Integer totalbayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_soto);
        jmlSotoAyam = findViewById(R.id.jmlsotoayam);
        jmlSotoDaging = findViewById(R.id.jmlsotodaging);
        jmlSotoSpecial = findViewById(R.id.jmlsotospecial);
        jmlEsTeh = findViewById(R.id.jmlesteh);
        jmlEsJeruk = findViewById(R.id.jmlesjeruk);
    }

    public void hitung (){
        jmlsotoayam = Integer.parseInt(jmlSotoAyam.getText().toString());
        totalSotoAyam = jmlsotoayam * 15000;
        jmlsotodaging = Integer.parseInt(jmlSotoDaging.getText().toString());
        totalSotoDaging = jmlsotodaging * 20000;
        jmlsotospecial = Integer.parseInt(jmlSotoSpecial.getText().toString());
        totalSotoSpecial = jmlsotospecial * 25000;
        jmlesteh = Integer.parseInt(jmlEsJeruk.getText().toString());
        totalEsTeh = jmlesteh * 4000;
        jmlesjeruk = Integer.parseInt(jmlEsJeruk.getText().toString());
        totalEsJeruk = jmlesteh * 8000;

        totalbayar = totalSotoAyam + totalSotoDaging +totalSotoSpecial +totalEsTeh +totalEsJeruk;


    }

    public void Pesan (View view) {
        menu   ="";
        harga  ="";
        jumlah ="";

        if (jmlsotoayam == 0){
        }
        else {
            menu+= "Soto Ayam\n";
            harga+= ""+totalSotoAyam+"\n";
            jumlah+= ""+jmlsotoayam+"\n";
        }
        if (jmlsotodaging == 0){
        }
        else {
            menu+= "Soto Daging\n";
            harga+= ""+totalSotoDaging+"\n";
            jumlah+= ""+jmlsotodaging+"\n";
        }
        if (jmlsotospecial == 0){
        }
        else {
            menu+= "Soto Special\n";
            harga+= ""+totalSotoSpecial+"\n";
            jumlah+= ""+jmlsotospecial+"\n";
        }
        if (jmlesteh == 0){
        }
        else {
            menu+= "Es Teh Manis\n";
            harga+= ""+totalEsTeh+"\n";
            jumlah+= ""+jmlesteh+"\n";
        }
        if (jmlesjeruk == 0){
        }
        else {
            menu+= "Es Jeruk\n";
            harga+= ""+totalEsJeruk+"\n";
            jumlah+= ""+jmlesjeruk+"\n";
        }
        Intent intent = new Intent(MenuSoto.this, Pesanan.class);
        intent.putExtra("total", totalbayar);
        intent.putExtra("menu", menu);
        intent.putExtra("harga", harga);
        intent.putExtra("totalperitem", jumlah);
        startActivity(intent);
    }

}
