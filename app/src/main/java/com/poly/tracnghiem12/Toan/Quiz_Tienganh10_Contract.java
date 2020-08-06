package com.poly.tracnghiem12.Toan;

import android.provider.BaseColumns;

public class Quiz_Tienganh10_Contract {
    private Quiz_Tienganh10_Contract() {


    }

    public static class Question_Table implements BaseColumns {
        public  static  final  String TABLE_TIENGANH = "quiztienganh";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_OPTION4 = "option4";
        public static final String COLUMN_ANSWER_NR = "answer_nr";

    }
}
