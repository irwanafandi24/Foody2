package com.example.miafandi.foody;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InputMasakanActivity extends AppCompatActivity {

    private Button btn_jualMasakan;
    private TextView t
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_masakan);

        Toolbar tb= (Toolbar) findViewById(R.id.toolbarMenuJualMasak);
        tb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
