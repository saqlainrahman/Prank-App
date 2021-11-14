package com.rktechno.prankapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerFragmentAdapter extends FragmentStateAdapter {

    private String[] titles = new String[]{"Razor","Fart","Scary","Others"};

    public ViewPagerFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new RazorFragment();
            case 1:
                return new FartFragment();
            case 2:
                return new ScaryFragment();
            case 3:
                return new AnimalFragment();
        }
        return new RazorFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
