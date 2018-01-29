package com.example.miafandi.foody.Home;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.miafandi.foody.Adapter.GridAdapter;
import com.example.miafandi.foody.R;

import static android.support.v4.app.ActivityCompat.invalidateOptionsMenu;

public class HomeFragment extends Fragment {
    AppBarLayout Appbar;
    CollapsingToolbarLayout CoolToolbar;
    ImageView img;
    Toolbar toolbar;
    Boolean ExpandedActionBar = true;

    //grid
    ViewPager viewPager;
    RecyclerView mRecycleView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        // View Pagger
        viewPager = (ViewPager) rootView.findViewById(R.id.viewPager);

        toolbar = (Toolbar) rootView.findViewById(R.id.toolbarHome);
        Appbar = (AppBarLayout) rootView.findViewById(R.id.HomeAppbar);
        CoolToolbar = (CollapsingToolbarLayout) rootView.findViewById(R.id.collapse_toolbar);
        img = (ImageView) rootView.findViewById(R.id.headImage);

        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        Appbar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if(Math.abs(verticalOffset) > 200){
                    ExpandedActionBar = false;
                    CoolToolbar.setTitle("Foody");
                    //invalidateOptionsMenu(Activity);
                }else{
                    ExpandedActionBar = true;
                    CoolToolbar.setTitle(" ");
                }
            }
        });

        //Grid View
        mRecycleView = (RecyclerView) rootView.findViewById(R.id.recycleHome);
        mRecycleView.setHasFixedSize(true);

        mLayoutManager = new GridLayoutManager(getActivity(),2);
        mRecycleView.setLayoutManager(mLayoutManager);

        mAdapter = new GridAdapter();
        mRecycleView.setAdapter(mAdapter);

        return rootView;
    }
}
