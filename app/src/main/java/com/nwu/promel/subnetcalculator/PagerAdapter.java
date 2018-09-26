package com.nwu.promel.subnetcalculator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int NoOfF;

    public PagerAdapter(FragmentManager fm,int NumberOfF){
        super(fm);
        this.NoOfF=NumberOfF;
    }
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                F1 tab1=new F1();
                return tab1;
            case 1:
                F2 tab2=new F2();
                return tab2;
            case 2:
                F3 tab3=new F3();
                return tab3;

            default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return NoOfF;
    }
}
