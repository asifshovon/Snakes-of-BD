package com.example.snakeofbd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class SeePost extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem tabItem1,tabItem2,tabItem3,tabItem4;
    ViewPager viewPager;
    SeeAdapter seeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_post);tabLayout=(TabLayout)findViewById(R.id.tablayout1);
        tabItem1=(TabItem)findViewById(R.id.tab1);
        tabItem2=(TabItem)findViewById(R.id.tab2);
        tabItem3=(TabItem)findViewById(R.id.tab3);
        tabItem4=(TabItem)findViewById(R.id.tab4);
        viewPager=(ViewPager)findViewById(R.id.vpager);

        seeAdapter=new SeeAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(seeAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4)
                    seeAdapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        //listen for scroll or page change
    }
}