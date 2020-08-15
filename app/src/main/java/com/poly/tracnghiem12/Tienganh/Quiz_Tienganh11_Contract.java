package com.poly.tracnghiem12.Tienganh;

import android.provider.BaseColumns;

public class Quiz_Tienganh11_Contract {
    private Quiz_Tienganh11_Contract() {


    }

    public static class Question_Table implements BaseColumns {
        public  static  final  String TABLE_TIENGANH11 = "quiztienganh11";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_OPTION4 = "option4";
        public static final String COLUMN_ANSWER_NR = "answer_nr";
        public static final String COLUMN_CATEGORY= "category";




    }
}
