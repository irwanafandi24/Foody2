package com.example.miafandi.foody.Profil;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.miafandi.foody.MainActivity;
import com.example.miafandi.foody.R;

import org.w3c.dom.Text;

public class ProfileFragment extends Fragment implements View.OnClickListener{

    private Button btn_detil, btn_upgrade, btn_jualMasakan, btn_jualCatering;
    private TextView txt_uang, txt_pesan, txt_notifikasi, txt_pelanggan, txt_feedback, txt_promosi, txtakun, txt_menuLain;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        btn_detil = (Button) rootView.findViewById(R.id.btnDetil);
        btn_upgrade = (Button) rootView.findViewById(R.id.btnUpgrade);
        btn_jualMasakan = (Button) rootView.findViewById(R.id.btnJualMasakan);
        btn_jualCatering = (Button) rootView.findViewById(R.id.btnJualCatering);

        txt_uang = (TextView) rootView.findViewById(R.id.txtUang);
        txt_pesan = (TextView) rootView.findViewById(R.id.txtPesan);
        txt_notifikasi = (TextView) rootView.findViewById(R.id.txtNotifikasi);
        txt_pelanggan = (TextView) rootView.findViewById(R.id.txtPelanggan);
        txt_feedback = (TextView) rootView.findViewById(R.id.txtFeedback);
        txt_promosi = (TextView) rootView.findViewById(R.id.txtPromosi);
        txtakun = (TextView) rootView.findViewById(R.id.txtAkun);
        txt_menuLain = (TextView) rootView.findViewById(R.id.txtMenuLain);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();

        if(v==btn_detil){

        }else if(v==btn_jualCatering){

        }else if(v==btn_jualMasakan){

        }else if(v==btn_upgrade){

        }else if(v==txt_pesan){

        }else if(v==txt_notifikasi){

        }else if(v==txt_pelanggan){

        }else if(v==txt_feedback){

        }else if(v==txt_promosi){

        }else if(v==txtakun){

        }else{
            startActivity(i.setClass(this.getContext(),MenuLainActivity.class));
        }

    }
}
