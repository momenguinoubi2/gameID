package com.example.myproject;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class LoginAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;
    public LoginAdapter(FragmentManager fm,Context context,int totalTabs){
        super(fm);
        this.context=context;
        this.totalTabs=totalTabs;

    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public Fragment getItem(int position){
        switch (position){
            case 0:
                SigninFragment signinFragment=new SigninFragment();
                System.out.println("1");
                return signinFragment;
            case 1:
                SignupFragment signupFragment=new SignupFragment();
                System.out.println("0");
                return signupFragment;
            default:
                System.out.println("null");
                return null;

        }
    }
}
