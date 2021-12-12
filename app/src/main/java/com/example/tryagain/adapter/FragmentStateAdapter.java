package com.example.tryagain.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;

public class FragmentStateAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {

    ArrayList<Fragment>fragments;

    public FragmentStateAdapter(@NonNull FragmentActivity fragmentActivity,ArrayList<Fragment>fragments) {
        super(fragmentActivity);
        this.fragments=fragments;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
