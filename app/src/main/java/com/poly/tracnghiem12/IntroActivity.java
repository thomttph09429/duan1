package com.poly.tracnghiem12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.poly.tracnghiem12.Adapter.IntroViewPagerAdapter;

public class IntroActivity extends AppCompatActivity {
    ViewPager screenViewPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    public int mcuruntpage;
    private TextView[] tvnDots;
    ConstraintLayout constraintLayout;
    Button btnback, btnnext;
    private PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        prefManager = new PrefManager(this);
        if (!prefManager.isFirstTimeLaunch()) {
            launchHomeScreen();
            finish();
        }


        btnnext = findViewById(R.id.btnnext);
        btnback = findViewById(R.id.btnback);


        constraintLayout = findViewById(R.id.contraintlayout);
        constraintLayout.setBackgroundColor(Color.rgb(255, 185, 15));

        screenViewPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(IntroActivity.this);
        screenViewPager.setAdapter(introViewPagerAdapter);
        screenViewPager.addOnPageChangeListener(onPageChangeListener);

        btnback.setEnabled(false);
        btnback.setVisibility(View.INVISIBLE);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenViewPager.setCurrentItem(mcuruntpage - 1);

            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenViewPager.setCurrentItem(mcuruntpage + 1);

            }
        });

    }

    ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            mcuruntpage = position;
            if (mcuruntpage == 0) {
                btnback.setEnabled(false);
                btnnext.setEnabled(true);
                btnback.setVisibility(View.INVISIBLE);
                btnback.setText("");
                btnnext.setText("next");
                constraintLayout.setBackgroundColor(Color.rgb(255, 185, 15));
            } else if (mcuruntpage == 1) {
                btnback.setEnabled(true);
                btnnext.setEnabled(true);
                btnback.setVisibility(View.VISIBLE);
                btnback.setText("back");
                btnnext.setText("next");
                constraintLayout.setBackgroundColor(Color.rgb(255, 185, 15));


            } else if (mcuruntpage == 2) {
                btnback.setEnabled(true);
                btnnext.setEnabled(true);
                btnback.setVisibility(View.VISIBLE);
                btnback.setText("back");
                btnnext.setText("Finish");
                constraintLayout.setBackgroundColor(Color.rgb(255, 185, 15));
                btnnext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(IntroActivity.this, Login_Activity.class);
                        startActivity(intent);
                    }
                });


            }


        }


        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };


    private void launchHomeScreen() {
        prefManager.setFirstTimeLaunch(false);
        startActivity(new Intent(IntroActivity.this, HomeActivity.class));
        finish();
    }
}