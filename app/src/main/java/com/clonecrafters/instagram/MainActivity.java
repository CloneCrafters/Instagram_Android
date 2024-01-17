package com.clonecrafters.instagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private FragmentManager fragmentManager;
    private TopLayoutFragment topLayoutFragment;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateFramgment_TopLayout();
    }

    private void CreateFramgment_TopLayout()
    {
        fragmentManager = getSupportFragmentManager();

        topLayoutFragment = new TopLayoutFragment();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, topLayoutFragment).commitAllowingStateLoss();
    }
}