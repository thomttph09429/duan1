package com.poly.tracnghiem12.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.poly.tracnghiem12.R;

public class IntroViewPagerAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public IntroViewPagerAdapter(Context context) {
        this.context = context;
    }

    public int[] backgroungcolorarray = {Color.rgb(255, 185, 15),
            Color.rgb(255, 185, 15),
            Color.rgb(255, 185, 15)

    };
    public String[] screen_title = {"Chào mừng bạn đến với ứng dụng giải bài trắc nghiệm", "Một ứng dụng giải bài cho tất cả ", "có kết quả nhanh nhất"};
    public String[] description = {"tiếng anh lớp 12 ",

            "Đề thi được cập nhật liên tục",
            "Mời bạn đến bước tiếp theo để trải nghiệm câu hỏi trắc nghiệm"};
    public int[] screen_image = {R.drawable.hoctap1, R.drawable.hoctap2, R.drawable.hoctap3};


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = layoutInflater.inflate(R.layout.layout_screen, null);

        ConstraintLayout constraintLayout = layoutScreen.findViewById(R.id.contraintlayout);
        ImageView screenimage = layoutScreen.findViewById(R.id.screenimage);
        TextView tvtitle = layoutScreen.findViewById(R.id.tvtitle);
        TextView tvdescription = layoutScreen.findViewById(R.id.tvdescription);
        constraintLayout.setBackgroundColor(backgroungcolorarray[position]);
        tvtitle.setText(screen_title[position]);
        tvdescription.setText(description[position]);
        screenimage.setImageResource(screen_image[position]);
        container.addView(layoutScreen);
        return layoutScreen;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }


    @Override
    public int getCount() {
        return screen_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;

    }
}
