package com.example.tryagain.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.tryagain.R;
import com.example.tryagain.adapter.FragmentStateAdapter;
import com.example.tryagain.fragment.Fragment1;
import com.example.tryagain.fragment.Fragment2;
import com.example.tryagain.recycler.Recycler;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setView();
    }

    public void setView(){
        ViewPager2 viewPager2 = findViewById(R.id.view_pager);
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        fragments.add(new Recycler());
        FragmentStateAdapter adapter = new FragmentStateAdapter(this,fragments);
        viewPager2.setAdapter(adapter);
    }
}