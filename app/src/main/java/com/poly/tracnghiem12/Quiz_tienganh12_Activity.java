package com.poly.tracnghiem12;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
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

import com.poly.tracnghiem12.Tienganh.Question_tienganh12;
import com.poly.tracnghiem12.Tienganh.Quiz_tienganh12_Helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Quiz_tienganh12_Activity extends AppCompatActivity {
    TextView tv_question_count, tv_count_down, tv_question;
    RadioButton rb1, rb2, rb3, rb4;
    RadioGroup radio_group;
    Button btn_confirm12;

    Quiz_tienganh12_Helper quiz_tienganh12_helper;
    ArrayList<Question_tienganh12> questiontienganh12list;
    private long timeleftinmilis;
    CountDownTimer countDownTimer;
    private ColorStateList textColorDefaultcd;


    private static final long COUNTDOWN_IN_MILIS = 1200000;
    String category;
    Question_tienganh12 currentquestion;
    int questioncoutTotal;
    int questioncouter;
    boolean answered;
    int tongdiem;
    int caudung = 0;
    int causai = 0;
    String title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_tienganh12_);


        tv_count_down = findViewById(R.id.tv_count_down);
        tv_question_count = findViewById(R.id.tv_question_count);
        tv_question = findViewById(R.id.tvquestion);
        rb1 = findViewById(R.id.option1);
        rb2 = findViewById(R.id.option2);
        rb3 = findViewById(R.id.option3);
        rb4 = findViewById(R.id.option4);
        radio_group = findViewById(R.id.radio_group);
        btn_confirm12 = findViewById(R.id.btn_confirm12);


        textColorDefaultcd = tv_count_down.getTextColors();

        Intent intent = getIntent();
         title = intent.getStringExtra("1");
//         String title=intent.getStringExtra("title");
//         setTitle(title);

        category = intent.getStringExtra("category");
        setTitle(title);

        quiz_tienganh12_helper = new Quiz_tienganh12_Helper(this);
        questiontienganh12list = quiz_tienganh12_helper.getallquestionWithCategory(category);
        questioncoutTotal = questiontienganh12list.size();
        Collections.shuffle(questiontienganh12list);
        shownextquestion();

        timeleftinmilis = COUNTDOWN_IN_MILIS;
        startcountdown();
        btn_confirm12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!answered) {


                    if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked()) {
                        checkanswer();

                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Quiz_tienganh12_Activity.this);
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

    private void startcountdown() {
        countDownTimer = new CountDownTimer(timeleftinmilis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeleftinmilis = millisUntilFinished;
                updatecountdownText();

            }

            @Override
            public void onFinish() {
                timeleftinmilis = 0;

            }
        }.start();
    }

    public void updatecountdownText() {
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

    public void checkanswer() {

        answered = true;
        RadioButton rbselect = findViewById(radio_group.getCheckedRadioButtonId());

        int answer = radio_group.indexOfChild(rbselect) + 1;
        if (answer == currentquestion.getAnswer()) {
            caudung++;
            tongdiem++;
        }
            causai++;
            showsolution();


    }

    private void showsolution() {
        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_optionred));
        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_optionred));
        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_optionred));
        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_optionred));

        switch (currentquestion.getAnswer()) {
            case 1:

                rb1.setBackground(ActivityCompat.getDrawable(getApplicationContext(), R.drawable.defaulgreen_optionred));
                break;
            case 2:

                rb2.setBackground(ActivityCompat.getDrawable(getApplicationContext(), R.drawable.defaulgreen_optionred));
                break;
            case 3:

                rb3.setBackground(ActivityCompat.getDrawable(getApplicationContext(), R.drawable.defaulgreen_optionred));
                break;
            case 4:

                rb4.setBackground(ActivityCompat.getDrawable(getApplicationContext(), R.drawable.defaulgreen_optionred));
                break;
        }
        if (questioncouter < questioncoutTotal) {
            btn_confirm12.setText("Tiếp tục");
        } else {
            btn_confirm12.setText("Kết thúc");
        }


    }


    public void shownextquestion() {
        rb1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_option));
        rb2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_option));
        rb3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_option));
        rb4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.defaul_option));

        radio_group.clearCheck();
        if (questioncouter < questioncoutTotal) {
            currentquestion = questiontienganh12list.get(questioncouter);
            tv_question.setText(currentquestion.getQuestion());
            rb1.setText(currentquestion.getOption1());
            rb2.setText(currentquestion.getOption2());
            rb3.setText(currentquestion.getOption3());
            rb4.setText(currentquestion.getOption4());
            questioncouter++;
            tv_question_count.setText("Câu:" + questioncouter + "/" + questioncoutTotal);
            answered = false;
            btn_confirm12.setText("Tiếp");
        } else {

            sendata();
        }
    }

    public void sendata() {
        btn_confirm12.setText("Kết thúc");

        Intent intent = new Intent(Quiz_tienganh12_Activity.this, ketquatienganh12_Activity.class);
        intent.putExtra("tongsocau", questioncoutTotal);
        intent.putExtra("caudung", caudung);
        intent.putExtra("causai", causai);
        intent.putExtra("tongdiem", tongdiem);
        intent.putExtra("category", category);
        intent.putExtra("title", title);
        startActivity(intent);

    }
}