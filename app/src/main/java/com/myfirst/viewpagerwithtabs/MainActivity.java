package com.myfirst.viewpagerwithtabs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 mViewPager2;
    private TabLayout mTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setPagerAdapter();
    }

    private void setPagerAdapter() {
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(),getLifecycle());
        mViewPager2.setAdapter(pagerAdapter);
        new TabLayoutMediator(mTab, mViewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Names");
                        break;
                    case 1:
                        tab.setText("Places");
                        break;
                    case 2:
                        tab.setText("Tourism");
                }
            }
        }).attach();
    }

    private void initViews() {
        mViewPager2 = findViewById(R.id.viewPager2);
        mTab = findViewById(R.id.tab);
    }
}