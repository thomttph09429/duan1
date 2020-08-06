package com.poly.tracnghiem12;

import androidx.appcompat.app.AppCompatActivity;

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
import android.widget.Toast;

import com.poly.tracnghiem12.Tienganh10.Question_Tienganh10;
import com.poly.tracnghiem12.Tienganh10.Quiz_Tienganh10_Helper;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Quiz_Tienganh10_Activity extends AppCompatActivity {

    private static final long COUNTDOWN_IN_MILIS = 1800000;
    private ColorStateList textColorDefaultcd;
    private CountDownTimer countDownTimer;
    private long timeleftinmilis;




    TextView tv_high_socre, tv_question_count, tv_count_down, tvquestion;
    RadioGroup radio_droup;
    RadioButton rb1, rb2, rb3, rb4;
    Button btn_confirm;


    private ColorStateList textColorDefaultRb;
    private int questioncouter;
    private int questionCountTotal;
    private Question_Tienganh10 currentQuestion;
    private int score;
    private boolean ansWered;

    List<Question_Tienganh10> questionList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__tienganh10_);
        Intent intent = getIntent();
        String tendethi = intent.getStringExtra("tendethi");
        setTitle(tendethi);


        tv_high_socre = findViewById(R.id.tv_high_socre);
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

        Quiz_Tienganh10_Helper quizHelper = new Quiz_Tienganh10_Helper(this);
        questionList = quizHelper.getallquestion();
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
                        Toast.makeText(Quiz_Tienganh10_Activity.this, "vui lòng chọn 1 câu trả lời", Toast.LENGTH_LONG).show();

                    }
                } else {
                    shownextquestion();
                }
            }
        });




    }
    private void showsolution() {
        rb1.setTextColor(Color.RED);
        rb2.setTextColor(Color.RED);
        rb3.setTextColor(Color.RED);
        rb4.setTextColor(Color.RED);
        switch (currentQuestion.getAnswer()) {
            case 1:
                rb1.setTextColor(Color.GREEN);
                break;
            case 2:
                rb1.setTextColor(Color.GREEN);
                break;
            case 3:
                rb1.setTextColor(Color.GREEN);
                break;
            case 4:
                rb1.setTextColor(Color.GREEN);
                break;
        }
        if (questioncouter < questionCountTotal) {
            btn_confirm.setText("tiếp tục");
        } else {
            btn_confirm.setText("kết thúc");
        }

    }

    public void shownextquestion() {
        rb1.setTextColor(textColorDefaultRb);
        rb2.setTextColor(textColorDefaultRb);
        rb3.setTextColor(textColorDefaultRb);
        rb4.setTextColor(textColorDefaultRb);
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
            finishquiz();
//            btn_confirm.setText("finish");
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
                timeleftinmilis=0;

//                checkanswer();

            }

        }.start();
    }
    private void updatecountdowntext() {
        int minutes = (int) ((timeleftinmilis / 1000) / 60);
        int seconds = (int) (timeleftinmilis / 1000) % 60;
        String timefomatted = String.format(Locale.getDefault(), "%02d : %02d", minutes, seconds);
        tv_count_down.setText(timefomatted);
        if(timeleftinmilis <10000){
            tv_count_down.setTextColor(Color.RED);

        }else {
            tv_count_down.setTextColor(textColorDefaultcd);
        }

    }
    private void checkanswer() {
        ansWered = true;
//        countDownTimer.cancel();
        RadioButton rbselect = findViewById(radio_droup.getCheckedRadioButtonId());
        int answerNR = radio_droup.indexOfChild(rbselect) + 1;
        if (answerNR == currentQuestion.getAnswer()) {
            score++;
            tv_high_socre.setText("Score:" + score);


        }
        showsolution();

    }
    private void finishquiz() {
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(countDownTimer != null){
            countDownTimer.cancel();
        }

    }
}