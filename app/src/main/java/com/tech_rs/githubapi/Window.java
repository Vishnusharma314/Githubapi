package com.tech_rs.githubapi;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Window extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Viewpageadpter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window);

        tabLayout=(TabLayout)findViewById(R.id.tab_layout);
        viewPager=(ViewPager)findViewById(R.id.view_pager);
        adapter=new Viewpageadpter(getSupportFragmentManager());

        //Add fragment here
        adapter.addfragment(new Fragment_profile(),"");
        adapter.addfragment(new Fragment_repository(),"");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
