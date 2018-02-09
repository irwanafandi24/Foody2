package com.example.miafandi.foody.Profil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.miafandi.foody.R;

public class EditProfileActivity extends AppCompatActivity {

    private Button btnSimpan;
    private TextView txtNama, txtLokasi, txttanggal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
    }
}
