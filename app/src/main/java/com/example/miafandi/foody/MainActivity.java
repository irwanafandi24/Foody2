package com.example.miafandi.foody;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.example.miafandi.foody.Utils.BottomNavigationViewHelper;
import com.example.miafandi.foody.Home.HomeFragment;
import com.example.miafandi.foody.Resep.ResepFragment;
import com.example.miafandi.foody.Map.MapFragment;
import com.example.miafandi.foody.Profil.ProfileFragment;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (item.getItemId()) {
                case R.id.btmNavHome:
                    transaction.replace(R.id.content, new HomeFragment()).commit();
                    return true;
                case R.id.btmNavMap:
                    transaction.replace(R.id.content, new MapFragment()).commit();
                    return true;
                case R.id.btmNavResep:
                    transaction.replace(R.id.content, new ResepFragment()).commit();
                    return true;
                case R.id.btmNavProfile:
                    transaction.replace(R.id.content, new ProfileFragment()).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content, new HomeFragment()).commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottomNavViewBar);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //setup bottom nav view
        setupBottomNavigationView();
    }

    //BottomNavigationView setUp ==> Utils/BottomNavigationViewHelper
    private void setupBottomNavigationView(){
        Log.d(TAG,"setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
    }
}
