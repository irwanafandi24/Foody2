package com.example.miafandi.foody.Profil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.miafandi.foody.MainActivity;
import com.example.miafandi.foody.R;

public class MenuLainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView txtBantuan, txtInformasi, txtAbout, txtHubungi;
    private ImageButton  btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lain);

        txtAbout = (TextView) findViewById(R.id.txtAbout);
        txtInformasi = (TextView) findViewById(R.id.txtInformasi);
        txtBantuan = (TextView) findViewById(R.id.txtBantuan);
        txtHubungi = (TextView) findViewById(R.id.txtTelphone);

        btnBack = (ImageButton) findViewById(R.id.btnBackMenulain);

        txtHubungi.setOnClickListener(this);
        txtBantuan.setOnClickListener(this);
        txtInformasi.setOnClickListener(this);
        txtAbout.setOnClickListener(this);

        btnBack.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();

        if (v==txtAbout){

        }else if(v==txtBantuan){

        }else if(v==txtHubungi){

        }else if(v==txtInformasi){

        }else{
            i.setClass(this.getApplicationContext(), MainActivity.class);
        }
        startActivity(i);
    }
}
