package com.poly.tracnghiem12;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.appbar.AppBarLayout;
import com.poly.tracnghiem12.Tienganh.Question_Tienganh10;
import com.poly.tracnghiem12.Tienganh.Question_Tienganh11;
import com.poly.tracnghiem12.Tienganh.Quiz_Tienganh10_Helper;
import com.poly.tracnghiem12.Tienganh.Quiz_Tienganh11_Helper;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Quiz_Tienganh11_Activity extends AppCompatActivity {

    private static final long COUNTDOWN_IN_MILIS = 1800000;
    private ColorStateList textColorDefaultcd;
    private CountDownTimer countDownTimer;
    private long timeleftinmilis;
    String categoryvalue;


    TextView tv_high_socre, tv_question_count, tv_count_down, tvquestion;
    RadioGroup radio_droup;
    RadioButton rb1, rb2, rb3, rb4;
    Button btn_confirm;
    int tongdiem=0;
    int caudung = 0;
    int causai = 0;

    String tendethi;

    private ColorStateList textColorDefaultRb;
    private int questioncouter;
    private int questionCountTotal;
    private Question_Tienganh11 currentQuestion;
    private int score;
    private boolean ansWered;

    List<Question_Tienganh11> questionList;
    Quiz_Tienganh11_Helper quiz_tienganh11_helper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__tienganh11_);

        quiz_tienganh11_helper = new Quiz_Tienganh11_Helper(this);


        Intent intentcategory = getIntent();
         tendethi = intentcategory.getStringExtra("tendethi");
        setTitle(tendethi);
        categoryvalue = intentcategory.getStringExtra("category");


        tv_count_down = findViewById(R.id.tv_count_down);
        tv_question_count = findViewById(R.id.tv_question_count);
        tvquestion = findViewById(R.id.tvquestion);
        radio_droup = findViewById(R.id.radio_droup);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        btn_confirm = findViewById(R.id.btn_confirm);

        textColorDefaultRb = rb1.getTextColors();
        textColorDefaultcd = tv_count_down.getTextColors();

        Quiz_Tienganh11_Helper quizHelper = new Quiz_Tienganh11_Helper(this);
        questionList = quizHelper.getquestiontienganh11(categoryvalue);
        questionCountTotal = questionList.size();
        Collections.shuffle(questionList);

        shownextquestion();
        timeleftinmilis = COUNTDOWN_IN_MILIS;
        startcountdown();

        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!ansWered) {
                    if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked()) {
                        checkanswer();

                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Quiz_Tienganh11_Activity.this);
                        builder.setMessage("Vui lòng chọn 1 câu trả lời");
                        builder.setPositiveButton("Đã hiểu", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        builder.create();
                        builder.show();

                    }
                } else {
                    shownextquestion();
                }
            }
        });


    }

    private void showsolution() {
        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_optionred));
        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_optionred));
        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_optionred));
        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_optionred));
        switch (currentQuestion.getAnswer()) {
            case 1:
                rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaulgreen_optionred));
                break;
            case 2:
                rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaulgreen_optionred));
                break;
            case 3:
                rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaulgreen_optionred));
                break;
            case 4:
                rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaulgreen_optionred));
                break;
        }
        if (questioncouter < questionCountTotal) {
            btn_confirm.setText("tiếp tục");
        } else {
            btn_confirm.setText("kết thúc");
        }

    }

    public void shownextquestion() {
        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_option));
        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_option));
        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_option));
        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_option));
        radio_droup.clearCheck();
        if (questioncouter < questionCountTotal) {
            currentQuestion = questionList.get(questioncouter);
            tvquestion.setText(currentQuestion.getQuestion());
            rb1.setText(currentQuestion.getOption1());
            rb2.setText(currentQuestion.getOption2());
            rb3.setText(currentQuestion.getOption3());
            rb4.setText(currentQuestion.getOption4());
            questioncouter++;
            tv_question_count.setText("Câu :" + questioncouter + "/" + questionCountTotal);
            ansWered = false;
            btn_confirm.setText("Tiếp");


        } else {
            sendata();
            btn_confirm.setText("finish");

        }


    }

    private void startcountdown() {
        countDownTimer = new CountDownTimer(timeleftinmilis, 1000) {
            @Override
            public void onTick(long l) {
                timeleftinmilis = l;
                updatecountdowntext();

            }


            @Override
            public void onFinish() {
                timeleftinmilis = 0;

//                checkanswer();

            }

        }.start();
    }

    private void updatecountdowntext() {
        int minutes = (int) ((timeleftinmilis / 1000) / 60);
        int seconds = (int) (timeleftinmilis / 1000) % 60;
        String timefomatted = String.format(Locale.getDefault(), "%02d : %02d", minutes, seconds);
        tv_count_down.setText(timefomatted);
        if (timeleftinmilis < 10000) {
            tv_count_down.setTextColor(Color.RED);

        } else {
            tv_count_down.setTextColor(textColorDefaultcd);
        }

    }

    private void checkanswer() {
        ansWered = true;
//        countDownTimer.cancel();
        RadioButton rbselect = findViewById(radio_droup.getCheckedRadioButtonId());
        int answerNR = radio_droup.indexOfChild(rbselect) + 1;
        if (answerNR == currentQuestion.getAnswer()) {
//            score++
            caudung++;
            tongdiem++;


        }
        causai++;
        showsolution();

    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }

    }
    public void sendata() {
        btn_confirm.setText("Kết thúc");

        Intent intent = new Intent(Quiz_Tienganh11_Activity.this, ketquatienganh11_Activity.class);
        intent.putExtra("tongsocau", questionCountTotal);
        intent.putExtra("caudung", caudung);
        intent.putExtra("causai", causai);
        intent.putExtra("tongdiem", caudung);
        intent.putExtra("category", categoryvalue);
        intent.putExtra("tendethi", tendethi);
        startActivity(intent);

    }
}