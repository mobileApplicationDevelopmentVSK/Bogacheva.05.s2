package com.example.smartlab;

import static androidx.core.content.ContextCompat.startActivity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smartlab.placeholder.PlaceholderContent;

import java.util.List;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {


    private Fragment Onboard2;
    private Fragment Onboard1;
    private Fragment Onboard3;

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return Onboard1;
        } else if (position == 2) {
            return Onboard2;
        } else {
            return Onboard3;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}

