package com.poly.tracnghiem12.Tienganh10;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.LayoutInflater;
import android.widget.Toast;

import com.poly.tracnghiem12.Adapter.Dethi_Tienganh10_Adapter;
import com.poly.tracnghiem12.Fragment.DeThi_Tienganh_Fragment;
import com.poly.tracnghiem12.Quiz_Tienganh10_Activity;
import com.poly.tracnghiem12.Tienganh10.Quiz_Tienganh10_Contract.*;

import java.util.ArrayList;
import java.util.List;

public class Quiz_Tienganh10_Helper extends SQLiteOpenHelper {
    Quiz_Tienganh10_Activity quiz_tienganh10_activity;
    public static final String DATABASE_NAME = "quiztienganh10.db";
    public static final int VERSION = 2;
    SQLiteDatabase db;

    public Quiz_Tienganh10_Helper(Context context) {

        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        quiz_tienganh10_activity = new Quiz_Tienganh10_Activity();


        this.db = db;
        String SQL_CREATE_TABLE = "create table " + Question_Table.TABLE_TIENGANH +
                " (" + Question_Table._ID + " integer primary key autoincrement, " + Question_Table.COLUMN_QUESTION + " text, " + Question_Table.COLUMN_OPTION1 + " text, " + Question_Table.COLUMN_OPTION2 + " text, " + Question_Table.COLUMN_OPTION3 + " text , " + Question_Table.COLUMN_OPTION4 + " text , " + Question_Table.COLUMN_ANSWER_NR + " integer)";
        db.execSQL(SQL_CREATE_TABLE);
        fillquestiontable1();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + Question_Table.TABLE_TIENGANH);
        onCreate(db);

    }


    public void fillquestiontable1() {
        Question_Tienganh10 tienganh10_cau1 = new Question_Tienganh10("Choose the letter A, B, C or D", "A. affect ", "B. address ", "C. access ", "D. equal", 4);
        addquestion(tienganh10_cau1);
        Question_Tienganh10 tienganh10_cau2 = new Question_Tienganh10("Choose the letter A, B, C or D ", "A. confuse ", "B. damage  ", "C. access ", "D. deplete ", 2);
        addquestion(tienganh10_cau2);
        Question_Tienganh10 tienganh10_cau3 = new Question_Tienganh10("Choose the word whose stress pattern is different from that of the others.", "A. money ", "B. army  ", "C. afraid ", "D. people ", 3);
        addquestion(tienganh10_cau3);
        Question_Tienganh10 tienganh10_cau4 = new Question_Tienganh10("National park helps to _________________ endangered animals.", "A. protect ", "B. produce  ", "C. threaten ", "D. provide ", 1);
        addquestion(tienganh10_cau4);
        Question_Tienganh10 tienganh10_cau5 = new Question_Tienganh10("If Minh ______________ enough money, he would buy a new house in Ha Noi", "A. has ", "B. had  ", "C. had had ", "D. has had ", 2);
        addquestion(tienganh10_cau5);
        Question_Tienganh10 tienganh10_cau6 = new Question_Tienganh10("I didn’t know your father was in ___________ hospital, so I didn’t come and visit him.", "A. a ", "B. an  ", "C. the ", "D. no article ", 2);
        addquestion(tienganh10_cau6);
        Question_Tienganh10 tienganh10_cau7 = new Question_Tienganh10("Walking 10 miles made him ___________________.", "A. tiring", "B. tired ", "C. tire ", " D. to tire", 2);
        addquestion(tienganh10_cau7);
        Question_Tienganh10 tienganh10_cau8 = new Question_Tienganh10("Every four years young people from all over Asia gather together to ______________ in Asian Games ", "A.compete  ", "B.fight  ", "C.struggle  ", "D.quarrel", 1);
        addquestion(tienganh10_cau8);
        Question_Tienganh10 tienganh10_cau9 = new Question_Tienganh10("It was not until last year ____________ he got a job.", "A. when  ", "B. that ", "C. which  ", "D. where ", 2);
        addquestion(tienganh10_cau9);
        Question_Tienganh10 tienganh10_cau10 = new Question_Tienganh10("Van Cao is one of the most well-known _____________ in Viet Nam ", "A. actors ", "B. authors ", "C. musicians  ", "D.singers  ", 3);
        addquestion(tienganh10_cau10);
        Question_Tienganh10 tienganh10_cau11 = new Question_Tienganh10("A new library ________________ in my village since last January. ", "A. is built ", "B. was built ", "C. has been built ", "D. had been built  ", 3);
        addquestion(tienganh10_cau11);
        Question_Tienganh10 tienganh10_cau12 = new Question_Tienganh10("It would have been a good crop ________________________. ", "A. if the storm didn’t sweep   ", "B. had the storm not swept ", "C. Unless the storm hadn’t swept ", "D. hadn’t the storm swept", 3);
        addquestion(tienganh10_cau12);
        Question_Tienganh10 tienganh10_cau13 = new Question_Tienganh10("Wildlife all over the world is ………………… danger.", "A. to ", "B. for ", "C. with  ", "D. in ", 4);
        addquestion(tienganh10_cau13);
        Question_Tienganh10 tienganh10_cau14 = new Question_Tienganh10("These are the pictures ……………  my son drew when he was young.", "A. who  ", "B. whom ", "C. whose ", "D. which  ", 4);
        addquestion(tienganh10_cau14);
        Question_Tienganh10 tienganh10_cau15 = new Question_Tienganh10("Let's play some music.\n - ............................. ", "A. Thank you.  ", "B. Good idea  ", "C. Yes, please.  ", "D. Certainly  ", 2);
        addquestion(tienganh10_cau15);


//        Question_Tienganh10 tienganh10_cau = new Question_Tienganh10("", "A. ", "B. ", "C. ","D. ",)
//        addquestion(tienganh10_cau );



        Question_Tienganh10 tienganh10_cau16 = new Question_Tienganh10("The cinema changed completely at ………… end of ………………. 1920s.", "A. the/ Ø", "B. the/ the", "C. an/ the ","D. Ø/ the",2);
        addquestion(tienganh10_cau16 );
        Question_Tienganh10 tienganh10_cau17 = new Question_Tienganh10("Yesterday, when I _________at the station, the train _________for 15 minutes.", "A. arrived/ left", "B. arrived / has left ", "C. arrived/ had left","D.had arrived/ left ",3);
        addquestion(tienganh10_cau17 );

        Question_Tienganh10 tienganh10_cau18 = new Question_Tienganh10("It isn't safe for children _________on ladders.", "A.play ", "B. to play", "C. played","D. playing",2);
        addquestion(tienganh10_cau18 );
        Question_Tienganh10 tienganh10_cau19 = new Question_Tienganh10("Jack _________me that he was enjoying his new training course.", "A. spoke ", "B. told", "C. talk","D. said ",2);
        addquestion(tienganh10_cau19 );
        Question_Tienganh10 tienganh10_cau20 = new Question_Tienganh10("_________playing the piano softly, he woke his parents up.", "A. because of", "B. although ", "C. because","D. in spite of ",4);
        addquestion(tienganh10_cau20 );




    }

    public void addquestion(Question_Tienganh10 question_tienganh10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Question_Table.COLUMN_QUESTION, question_tienganh10.getQuestion());
        contentValues.put(Question_Table.COLUMN_OPTION1, question_tienganh10.getOption1());
        contentValues.put(Question_Table.COLUMN_OPTION2, question_tienganh10.getOption2());
        contentValues.put(Question_Table.COLUMN_OPTION3, question_tienganh10.getOption3());
        contentValues.put(Question_Table.COLUMN_OPTION4, question_tienganh10.getOption4());
        contentValues.put(Question_Table.COLUMN_ANSWER_NR, question_tienganh10.getAnswer());
        db.insert(Question_Table.TABLE_TIENGANH, null, contentValues);


    }

    public List<Question_Tienganh10> getallquestion() {
        List<Question_Tienganh10> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from " + Question_Table.TABLE_TIENGANH, null);
        if (cursor.moveToFirst()) {
            do {
                Question_Tienganh10 question_tienganh10 = new Question_Tienganh10();
                question_tienganh10.setQuestion(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_QUESTION)));
                question_tienganh10.setOption1(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_OPTION1)));
                question_tienganh10.setOption2(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_OPTION2)));
                question_tienganh10.setOption3(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_OPTION3)));
                question_tienganh10.setOption4(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_OPTION4)));
                question_tienganh10.setAnswer(cursor.getInt(cursor.getColumnIndex(Question_Table.COLUMN_ANSWER_NR)));
                questionList.add(question_tienganh10);
            } while (cursor.moveToNext());


        }
        cursor.close();
        return questionList;
    }
}
