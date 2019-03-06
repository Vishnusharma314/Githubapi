package com.tech_rs.githubapi;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Viewpageadpter extends FragmentPagerAdapter {
    private final List<Fragment> lstframent=new ArrayList<>();
    private final List<String> lsttitles=new ArrayList<>();

    public Viewpageadpter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return lstframent.get(position);
    }

    @Override
    public int getCount() {
        return lsttitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lsttitles.get(position);
    }



    public void addfragment(Fragment fragment,String title)
    {
        lstframent.add(fragment);
        lsttitles.add(title);
    }
}
