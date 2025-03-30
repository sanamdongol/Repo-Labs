package com.unit.app;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.unit.app.merofragemnts.HomeFragment;
import com.unit.app.merofragemnts.ProfileFragment;
import com.unit.app.merofragemnts.SettingsFragment;
import com.unit.app.merofragemnts.ShortsFragment;

public class MyHostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_host);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }


    public void onHomeButtonClicked(View view) {
        //home button click garda kk k garne ho ya nira lekha
        System.out.println("I am home button");
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container, new HomeFragment());
        transaction.commit();
    }

    public void onShortsClicked(View view) {
        //shorts  click  ko logic lekha
        System.out.println("I am shorts button");
        FragmentManager magner = getSupportFragmentManager();
        FragmentTransaction transaction = magner.beginTransaction();
        transaction.replace(R.id.fragment_container, new ShortsFragment());
        transaction.commit();
    }

    public void onProfileClicked(View view) {
        //profile click garda k garne ya nira lekha
        System.out.println("I am profile button");
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container, new ProfileFragment());
        transaction.commit();
    }

    public void onSettingsClicked(View view) {
        //Settings ko logic
        System.out.println("I am settings button");
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container, new SettingsFragment());
        transaction.commit();
    }
}