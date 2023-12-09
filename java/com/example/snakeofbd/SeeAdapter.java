package com.example.snakeofbd;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SeeAdapter extends FragmentPagerAdapter {
    int tabcount;

    public SeeAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0 : return new AllPost();
            case 1 : return new MyPost();
            case 2 : return new BookMark();
            case 3: return new AddPost();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
