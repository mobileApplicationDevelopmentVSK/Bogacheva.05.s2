package com.example.smartlab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ViewPager2 pager = findViewById(R.id.pager);
        FragmentStateAdapter pageAdapter = new FragmentStateAdapter(MainActivity2.this) {
            private Fragment BlankFragment3;
            private Fragment BlankFragment2;
            private Fragment BlankFragment;

            @Override
            public int getItemCount() {
                return 3;
            }

            @NonNull
            @Override
            public Fragment createFragment(int position) {
                if (position == 1) {
                    return BlankFragment;
                } else if (position == 2) {
                    return BlankFragment2;
                } else {
                    return BlankFragment3;
                }
            }
        };
        pager.setAdapter(pageAdapter);
    }
}