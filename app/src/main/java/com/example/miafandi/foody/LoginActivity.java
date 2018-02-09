package com.example.miafandi.foody;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.miafandi.foody.AppConfig.PreferenceIntro;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin, btnDaftar;
    private PreferenceIntro preferenceIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        preferenceIntro = new PreferenceIntro(LoginActivity.this);
        preferenceIntro.checkProceed();

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnDaftar = (Button) findViewById(R.id.btnDaftar);

        //move to popup login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(LoginActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_dialog_login, null);

                final EditText user = (EditText) mView.findViewById(R.id.username);
                final EditText passwd = (EditText) mView.findViewById(R.id.password);
                Button btnMasuk = (Button) mView.findViewById(R.id.btnMasuk);
                TextView lupaSandi = (TextView) mView.findViewById(R.id.lupaKataSandi);
                TextView cancleBtn = (TextView) mView.findViewById(R.id.cancle);

                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();

                btnMasuk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!user.getText().toString().isEmpty() && !passwd.getText().toString().isEmpty()){
                            Toast.makeText(LoginActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(LoginActivity.this, "Please fill all field", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                lupaSandi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
                        startActivity(intent);
                    }
                });

                cancleBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
            }
        });

        //move to register
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
