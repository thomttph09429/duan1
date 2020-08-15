package com.poly.tracnghiem12.Tienganh;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.poly.tracnghiem12.Tienganh.Quiz_Tienganh12_Contract.*;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Quiz_tienganh12_Helper extends SQLiteOpenHelper {
    public static final String DATABASE_TIENGANH12 = "quiztienganh_12.db";
    public static final int VERSION = 8;
    SQLiteDatabase db;

    public Quiz_tienganh12_Helper(Context context) {
        super(context, DATABASE_TIENGANH12, null, VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        String SQL_CREATE_TABLE = "create table " + Quiz_Tienganh12_Contract.Question_Table12.TABLE_TIENGANH12 +
                " (" + Question_Table12._ID + " integer primary key autoincrement, " +
                Question_Table12.COLUMN_QUESTION + " text, " +
                Question_Table12.COLUMN_OPTION1 + " text, "
                + Question_Table12.COLUMN_OPTION2 + " text, " +
                Question_Table12.COLUMN_OPTION3 + " text , " +
                Question_Table12.COLUMN_OPTION4 + " text , " +

                Question_Table12.COLUMN_ANSWER_NR + " integer , " +
                Question_Table12.COLUMN_CATEGORY + " text)";
        db.execSQL(SQL_CREATE_TABLE);
        fillquestiontable1();


    }


//    Question_tienganh12 question_tienganh12 = new Question_tienganh12(" My teacher (have).................. long hair.", "A. have", "B. has", "C. ", "D. ", 1, Category.CATEGORY_1);

    public void fillquestiontable1() {
        Question_tienganh12 question_tienganh12cau1 = new Question_tienganh12(" My teacher (have).................. long hair.", "A. have", "B. has", "C. have had", "D. had", 2, Category.CATEGORY_1);
        addquestion(question_tienganh12cau1);
        Question_tienganh12 question_tienganh12cau2 = new Question_tienganh12("  My father __________ excuses when I feel like going to the cinema.", "A. makes always", "B. make always", "C. always makes", "D. alwayes makes", 4, Category.CATEGORY_1);
        addquestion(question_tienganh12cau2);
        Question_tienganh12 question_tienganh12cau3 = new Question_tienganh12(" His students ________ (not, speak) German in class.", "A. don’t speak", "B. doesn’t speak", "C.  not speak", "D. not speaks", 1, Category.CATEGORY_1);
        addquestion(question_tienganh12cau3);
        Question_tienganh12 question_tienganh12cau4 = new Question_tienganh12(" John ________ (work) in a supermarket.", "A. works", "B.  working", "C. work", "D. workes", 1, Category.CATEGORY_1);
        addquestion(question_tienganh12cau4);
        Question_tienganh12 question_tienganh12cau5 = new Question_tienganh12("The flowers _______________ (be, normally) watered by Bob.", "A. are normally", "B. normally are", "C.  normally is", "D. is normally", 2, Category.CATEGORY_1);
        addquestion(question_tienganh12cau5);
        Question_tienganh12 question_tienganh12cau6 = new Question_tienganh12(" John ________ very hard in class, but I don't think he'll pass the course.", "A. try", "B. trys", "C. tryes", "D. tries", 2, Category.CATEGORY_1);
        addquestion(question_tienganh12cau6);
        Question_tienganh12 question_tienganh12cau7 = new Question_tienganh12(" It ________ almost every day in Manchester.", "A. rain", "B. rains", "C. raines", "D. rainning", 2, Category.CATEGORY_1);
        addquestion(question_tienganh12cau7);
        Question_tienganh12 question_tienganh12cau8 = new Question_tienganh12(" Jo is so smart that she ________ every exam without even trying.", "A. pass", "B. passed", "C. passes", "D. is passes", 2, Category.CATEGORY_1);
        addquestion(question_tienganh12cau8);
        Question_tienganh12 question_tienganh12cau9 = new Question_tienganh12(" My parents normally __________ breakfast at 7:00 a.m.", "A. eat", "B. eating", "C. is eating", "D. are eating", 1, Category.CATEGORY_1);
        addquestion(question_tienganh12cau9);
        Question_tienganh12 question_tienganh12cau10 = new Question_tienganh12(" My best friend ________ to me every week.", "A. write", "B. writes", "C. writies", "D. is write", 2, Category.CATEGORY_1);
        addquestion(question_tienganh12cau10);
//
        Question_tienganh12 question_tienganh122cau1 = new Question_tienganh12("My teacher (have).................. long hair.  ", "A. have ", "B. has", "C.have had ", "D. had", 2, Category.CATEGORY_5);
        addquestion(question_tienganh122cau1);
        Question_tienganh12 question_tienganh122cau2 = new Question_tienganh12(" Peter disconnected the phone ................................................................ .", "A.so as not to be disturbed ", "B. to disturb", "C. to be disturbed ", "D.in order to disturb ", 1, Category.CATEGORY_2);
        addquestion(question_tienganh122cau2);
        Question_tienganh12 question_tienganh122cau3 = new Question_tienganh12("  They (not want )………to play the love games, but they (play)…...…..now.", "A. isn't want, plays", "B. doesn't want, plays", "C. not want, are playing", "D. don’t want, are playing ", 4, Category.CATEGORY_2);
        addquestion(question_tienganh122cau3);
        Question_tienganh12 question_tienganh122cau4 = new Question_tienganh12("  Look! The man (climb)……..up the tree.", "A.is climbing", "B. climbs", "C. are climbing", "D. climb", 1, Category.CATEGORY_2);
        addquestion(question_tienganh122cau4);
        Question_tienganh12 question_tienganh122cau5 = new Question_tienganh12("The new comers (not know)…...............…… the rules of the club. ", "A.doesn't know ", "B. don’t know", "C.isn't knowing ", "D. aren't knowing", 2, Category.CATEGORY_2);
        addquestion(question_tienganh122cau5);
        Question_tienganh12 question_tienganh122cau6 = new Question_tienganh12(" Martin (live)………..in a small flat. He and his wife always (get)……….up early to water flowers. ", "A. is living, get", "B. lives, get", "C. lives, gets", "D. is living, gets", 1, Category.CATEGORY_2);
        addquestion(question_tienganh122cau6);
        Question_tienganh12 question_tienganh122cau7 = new Question_tienganh12(" What is the new chairman (do)…………now. I (see)…………that he (be)……..very busy. ", "A. doing, am seeing, is", "B. do, see, is", "C. doing, see, is", "D. doing, sees, is ", 3, Category.CATEGORY_2);
        addquestion(question_tienganh122cau7);
        Question_tienganh12 question_tienganh122cau8 = new Question_tienganh12(" ................... Tom (be) mad? He ( throw)………all his books and (cry) ………..now.", "A. s, are throwing, crying", "B.Is, is throwing, crying ", "C. Is, throws, cries", "D. Is, is throw, cry", 2, Category.CATEGORY_2);
        addquestion(question_tienganh122cau8);
        Question_tienganh12 question_tienganh122cau9 = new Question_tienganh12("  My neighbours __________________ around Europe now.", "A. travel", "B. are traveling", "C.is traveling ", "D. are travel", 3, Category.CATEGORY_2);
        addquestion(question_tienganh122cau9);
        Question_tienganh12 question_tienganh122cau10 = new Question_tienganh12(" Listen! Our teacher __________________ .", "A. speaks", "B. speaking", "C.is speaking ", "D. are speaking", 2, Category.CATEGORY_2);
        addquestion(question_tienganh122cau10);
        //
        Question_tienganh12 question_tienganh123cau1 = new Question_tienganh12("My granny _______________ that detective novel. ", "A. has already read", "B.  has yet read", "C. readed", "D.is reading", 1, Category.CATEGORY_3);
        addquestion(question_tienganh123cau1);
        Question_tienganh12 question_tienganh123cau2 = new Question_tienganh12(" There _______________ a lot of changes in Vietnam since the 1990s. ", "A. was", "B.have been ", "C.  has been", "D.are ", 1, Category.CATEGORY_3);
        addquestion(question_tienganh123cau2);
        Question_tienganh12 question_tienganh123cau3 = new Question_tienganh12(" My dog _______________ my cat since I came home.", "A. is chasing", "B. has chased", "C. chased ", "D. chases ", 1, Category.CATEGORY_3);
        addquestion(question_tienganh123cau3);
        Question_tienganh12 question_tienganh123cau4 = new Question_tienganh12("It isn't safe for children _________on ladders.", "A.play ", "B. to play", "C. played", "D. playing", 2, Category.CATEGORY_3);
        addquestion(question_tienganh123cau4);
        Question_tienganh12 question_tienganh123cau5 = new Question_tienganh12("Jack _________me that he was enjoying his new training course.", "A. spoke ", "B. told", "C. talk", "D. said ", 2, Category.CATEGORY_3);
        addquestion(question_tienganh123cau5);
        Question_tienganh12 question_tienganh123cau6 = new Question_tienganh12("_________playing the piano softly, he woke his parents up.", "A. because of", "B. although ", "C. because", "D. in spite of ", 4, Category.CATEGORY_3);
        addquestion(question_tienganh123cau6);
        Question_tienganh12 question_tienganh123cau7 = new Question_tienganh12(" Martin (live)………..in a small flat. He and his wife always (get)……….up early to water flowers. ", "A. is living, get", "B. lives, get", "C. lives, gets", "D. is living, gets", 1, Category.CATEGORY_3);
        addquestion(question_tienganh123cau7);
        Question_tienganh12 question_tienganh123cau8 = new Question_tienganh12(" John ________ very hard in class, but I don't think he'll pass the course.", "A. try", "B. trys", "C. tryes", "D. tries", 2, Category.CATEGORY_3);
        addquestion(question_tienganh123cau8);
        Question_tienganh12 question_tienganh123cau9 = new Question_tienganh12(" It ________ almost every day in Manchester.", "A. rain", "B. rains", "C. raines", "D. rainning", 2, Category.CATEGORY_3);
        addquestion(question_tienganh123cau9);
        Question_tienganh12 question_tienganh123cau10 = new Question_tienganh12(" The _________were taken to the nearest hospital by an ambulance.", "A.  injures", "B. injured", "C. injury", "D. injuring", 2, Category.CATEGORY_3);
        addquestion(question_tienganh123cau10);
        //
        Question_tienganh12 question_tienganh124cau1 = new Question_tienganh12("My parents prefer tea _________coffee.",
                "  A.than", "B.more ", "C.to", "D.rather", 3, Category.CATEGORY_4
        );
        addquestion(question_tienganh124cau1);
        Question_tienganh12 question_tienganh124cau2 = new Question_tienganh12(" This program must be new. I have _________seen it before.", "A. ever", "B. never", "C. since", "D. yet", 2, Category.CATEGORY_4);
        addquestion(question_tienganh124cau2);
        Question_tienganh12 question_tienganh124cau3 = new Question_tienganh12("I _________television a lot but now I don’t any more..", "A.  was watching", "B. are used to watch", "C. am watching", "D. used to watch", 4, Category.CATEGORY_4);
        addquestion(question_tienganh124cau3);
        Question_tienganh12 question_tienganh124cau4 = new Question_tienganh12("My teacher (have).................. long hair.  ", "A. have ", "B. has", "C.have had ", "D. had", 2, Category.CATEGORY_2);
        addquestion(question_tienganh124cau4);
        Question_tienganh12 question_tienganh124cau5 = new Question_tienganh12(" Peter disconnected the phone ................................................................ .", "A.so as not to be disturbed ", "B. to disturb", "C. to be disturbed ", "D.in order to disturb ", 1, Category.CATEGORY_4);
        addquestion(question_tienganh124cau5);
        Question_tienganh12 question_tienganh124cau6 = new Question_tienganh12("  They (not want )………to play the love games, but they (play)…...…..now.", "A. isn't want, plays", "B. doesn't want, plays", "C. not want, are playing", "D. don’t want, are playing ", 4, Category.CATEGORY_4);
        addquestion(question_tienganh124cau6);
        Question_tienganh12 question_tienganh124cau7 = new Question_tienganh12("The new comers (not know)…...............…… the rules of the club. ", "A.doesn't know ", "B. don’t know", "C.isn't knowing ", "D. aren't knowing", 2, Category.CATEGORY_4);
        addquestion(question_tienganh124cau7);
        Question_tienganh12 question_tienganh124cau8 = new Question_tienganh12(" Martin (live)………..in a small flat. He and his wife always (get)……….up early to water flowers. ", "A. is living, get", "B. lives, get", "C. lives, gets", "D. is living, gets", 1, Category.CATEGORY_4);
        addquestion(question_tienganh124cau8);
        Question_tienganh12 question_tienganh124cau9 = new Question_tienganh12(" What is the new chairman (do)…………now. I (see)…………that he (be)……..very busy. ", "A. doing, am seeing, is", "B. do, see, is", "C. doing, see, is", "D. doing, sees, is ", 3, Category.CATEGORY_4);
        addquestion(question_tienganh124cau9);
        Question_tienganh12 question_tienganh124cau10 = new Question_tienganh12("When we came to the party, the food __________ so we had to have a drink first.", "A. was being prepared", "B. had been prepared", "C.  was prepared", "D. had prepared", 1, Category.CATEGORY_4);
        addquestion(question_tienganh124cau10);
        Question_tienganh12 question_tienganh124cau11 = new Question_tienganh12("The part of a computer that controls all the other parts of the system is called __________.", "A. USB", "B. . VDU", "C. RAM", "D. CPU", 4, Category.CATEGORY_4);
        addquestion(question_tienganh124cau11);
        //

        Question_tienganh12 c = new Question_tienganh12("The part of a computer that controls all the other parts of the system is called __________.", "A. USB", "B. . VDU", "C. RAM", "D. CPU", 4, Category.CATEGORY_5);
        addquestion(c);
        Question_tienganh12 cc = new Question_tienganh12("It isn't safe for children _________on ladders.", "A.play ", "B. to play", "C. played", "D. playing", 2, Category.CATEGORY_5);
        addquestion(cc);
        Question_tienganh12 vv = new Question_tienganh12("Jack _________me that he was enjoying his new training course.", "A. spoke ", "B. told", "C. talk", "D. said ", 2, Category.CATEGORY_5);
        addquestion(vv);
        Question_tienganh12 bb = new Question_tienganh12("_________playing the piano softly, he woke his parents up.", "A. because of", "B. although ", "C. because", "D. in spite of ", 4, Category.CATEGORY_5);
        addquestion(bb);
        Question_tienganh12 ll = new Question_tienganh12(" Martin (live)………..in a small flat. He and his wife always (get)……….up early to water flowers. ", "A. is living, get", "B. lives, get", "C. lives, gets", "D. is living, gets", 1, Category.CATEGORY_5);
        addquestion(ll);
        //
        Question_tienganh12 kkkk = new Question_tienganh12(" My teacher (have).................. long hair.", "A. have", "B. has", "C. have had", "D. had", 2, Category.CATEGORY_6);
        addquestion(kkkk);
        Question_tienganh12 kkk = new Question_tienganh12("  My father __________ excuses when I feel like going to the cinema.", "A. makes always", "B. make always", "C. always makes", "D. alwayes makes", 4, Category.CATEGORY_6);
        addquestion(kkk);
        Question_tienganh12 kk = new Question_tienganh12(" His students ________ (not, speak) German in class.", "A. don’t speak", "B. doesn’t speak", "C.  not speak", "D. not speaks", 1, Category.CATEGORY_6);
        addquestion(kk);
        Question_tienganh12 k = new Question_tienganh12(" John ________ (work) in a supermarket.", "A. works", "B.  working", "C. work", "D. workes", 1, Category.CATEGORY_6);
        addquestion(k);
        Question_tienganh12 nn = new Question_tienganh12("The flowers _______________ (be, normally) watered by Bob.", "A. are normally", "B. normally are", "C.  normally is", "D. is normally", 2, Category.CATEGORY_6);
        addquestion(nn);
        Question_tienganh12 m = new Question_tienganh12(" John ________ very hard in class, but I don't think he'll pass the course.", "A. try", "B. trys", "C. tryes", "D. tries", 2, Category.CATEGORY_6);
        addquestion(m);
        Question_tienganh12 l = new Question_tienganh12(" It ________ almost every day in Manchester.", "A. rain", "B. rains", "C. raines", "D. rainning", 2, Category.CATEGORY_6);
        addquestion(l);
        Question_tienganh12 n = new Question_tienganh12(" Jo is so smart that she ________ every exam without even trying.", "A. pass", "B. passed", "C. passes", "D. is passes", 2, Category.CATEGORY_6);
        addquestion(n);
        Question_tienganh12 v = new Question_tienganh12(" My parents normally __________ breakfast at 7:00 a.m.", "A. eat", "B. eating", "C. is eating", "D. are eating", 1, Category.CATEGORY_6);
        addquestion(v);
        Question_tienganh12 ng = new Question_tienganh12(" My best friend ________ to me every week.", "A. write", "B. writes", "C. writies", "D. is write", 2, Category.CATEGORY_6);
        addquestion(ng);
        Question_tienganh12 lh= new Question_tienganh12("My teacher (have).................. long hair.  ", "A. have ", "B. has", "C.have had ", "D. had", 2, Category.CATEGORY_8);
        addquestion(lh);
        Question_tienganh12 j = new Question_tienganh12(" Peter disconnected the phone ................................................................ .", "A.so as not to be disturbed ", "B. to disturb", "C. to be disturbed ", "D.in order to disturb ", 1, Category.CATEGORY_8);
        addquestion(j);
        Question_tienganh12 g = new Question_tienganh12("  They (not want )………to play the love games, but they (play)…...…..now.", "A. isn't want, plays", "B. doesn't want, plays", "C. not want, are playing", "D. don’t want, are playing ", 4, Category.CATEGORY_8);
        addquestion(g);
        Question_tienganh12 h = new Question_tienganh12("  Look! The man (climb)……..up the tree.", "A.is climbing", "B. climbs", "C. are climbing", "D. climb", 1, Category.CATEGORY_8);
        addquestion(h);
        Question_tienganh12 hhh = new Question_tienganh12("The new comers (not know)…...............…… the rules of the club. ", "A.doesn't know ", "B. don’t know", "C.isn't knowing ", "D. aren't knowing", 2, Category.CATEGORY_8);
        addquestion(hhh);
        Question_tienganh12 uu6 = new Question_tienganh12(" Martin (live)………..in a small flat. He and his wife always (get)……….up early to water flowers. ", "A. is living, get", "B. lives, get", "C. lives, gets", "D. is living, gets", 1, Category.CATEGORY_8);
        addquestion(uu6);
        Question_tienganh12 u7 = new Question_tienganh12(" What is the new chairman (do)…………now. I (see)…………that he (be)……..very busy. ", "A. doing, am seeing, is", "B. do, see, is", "C. doing, see, is", "D. doing, sees, is ", 3, Category.CATEGORY_8);
        addquestion(u7);
        Question_tienganh12 o8 = new Question_tienganh12(" ................... Tom (be) mad? He ( throw)………all his books and (cry) ………..now.", "A. s, are throwing, crying", "B.Is, is throwing, crying ", "C. Is, throws, cries", "D. Is, is throw, cry", 2, Category.CATEGORY_8);
        addquestion(o8);
        Question_tienganh12 o9 = new Question_tienganh12("  My neighbours __________________ around Europe now.", "A. travel", "B. are traveling", "C.is traveling ", "D. are travel", 3, Category.CATEGORY_8);
        addquestion(o9);
        Question_tienganh12 oo = new Question_tienganh12(" Listen! Our teacher __________________ .", "A. speaks", "B. speaking", "C.is speaking ", "D. are speaking", 2, Category.CATEGORY_8);
        addquestion(oo);
        //
        Question_tienganh12 p9 = new Question_tienganh12("My granny _______________ that detective novel. ", "A. has already read", "B.  has yet read", "C. readed", "D.is reading", 1, Category.CATEGORY_7);
        addquestion(p9);
        Question_tienganh12 p0 = new Question_tienganh12(" There _______________ a lot of changes in Vietnam since the 1990s. ", "A. was", "B.have been ", "C.  has been", "D.are ", 1, Category.CATEGORY_7);
        addquestion(p0);
        Question_tienganh12 ug7 = new Question_tienganh12(" My dog _______________ my cat since I came home.", "A. is chasing", "B. has chased", "C. chased ", "D. chases ", 1, Category.CATEGORY_7);
        addquestion(ug7);
        Question_tienganh12 i99 = new Question_tienganh12("It isn't safe for children _________on ladders.", "A.play ", "B. to play", "C. played", "D. playing", 2, Category.CATEGORY_7);
        addquestion(i99);
        Question_tienganh12 i0 = new Question_tienganh12("Jack _________me that he was enjoying his new training course.", "A. spoke ", "B. told", "C. talk", "D. said ", 2, Category.CATEGORY_7);
        addquestion(i0);
        Question_tienganh12 i9 = new Question_tienganh12("_________playing the piano softly, he woke his parents up.", "A. because of", "B. although ", "C. because", "D. in spite of ", 4, Category.CATEGORY_7);
        addquestion(i9);
        Question_tienganh12 u8 = new Question_tienganh12(" Martin (live)………..in a small flat. He and his wife always (get)……….up early to water flowers. ", "A. is living, get", "B. lives, get", "C. lives, gets", "D. is living, gets", 1, Category.CATEGORY_7);
        addquestion(u8);
        Question_tienganh12 ui = new Question_tienganh12(" John ________ very hard in class, but I don't think he'll pass the course.", "A. try", "B. trys", "C. tryes", "D. tries", 2, Category.CATEGORY_7);
        addquestion(ui);
        Question_tienganh12 g7 = new Question_tienganh12(" It ________ almost every day in Manchester.", "A. rain", "B. rains", "C. raines", "D. rainning", 2, Category.CATEGORY_7);
        addquestion(g7);
        Question_tienganh12 q1 = new Question_tienganh12(" The _________were taken to the nearest hospital by an ambulance.", "A.  injures", "B. injured", "C. injury", "D. injuring", 2, Category.CATEGORY_7);
        addquestion(q1);
//
        Question_tienganh12  cau1= new Question_tienganh12("I remember _______you about this before.", "A. to tell ", "B. told ", "C.tell ", "D.telling ", 4, Category.CATEGORY_9);
        addquestion(cau1);
        Question_tienganh12  cau2= new Question_tienganh12("The blind _______unable to see anything.", "A.  am ", "B. have ", "C.is ", "D.are ", 4, Category.CATEGORY_9);
        addquestion(cau2);
        Question_tienganh12  cau12= new Question_tienganh12("Their school trip was ____________ ..", "A. great   ", "B. terrible   ", "C. wonderful ", "D. exciting", 2, Category.CATEGORY_9);
        addquestion(cau12);
        Question_tienganh12  cau21= new Question_tienganh12("If the weather ______ worse, we will not go to the beach.", "A.  gets ", "B.got  ", "C. will get ", "D. would get", 1, Category.CATEGORY_9);
        addquestion(cau21);
        Question_tienganh12  cau22= new Question_tienganh12("By the time he arrived, his classmates ______.", "A. have left  ", "B. left ", "C. had left", "D. were leaving ", 3, Category.CATEGORY_9);
        addquestion(cau22);
        Question_tienganh12  cau2222= new Question_tienganh12("A new hospital ______ in this area lately.", "A. built  ", "B. was built ", "C. has built ", "D. has been built", 4, Category.CATEGORY_9);
        addquestion(cau2222);
        Question_tienganh12  cau222= new Question_tienganh12("Nam: “How often do you go to school?” -Mai: “_____________.”", "A. I go there early  ", "B. Every day except Sunday ", "C. I don’t think so ", "D. I go there by bus", 2, Category.CATEGORY_9);
        addquestion(cau222);
        Question_tienganh12  cau24= new Question_tienganh12("Minh: “Did you study all last night?” -Nga: “___________. I watched TV and went to bed.”", "A.  Yes, I did ", "B.  Of course I did ", "C. I not do that ", "D. No, of course not ", 4, Category.CATEGORY_9);
        addquestion(cau24);
        Question_tienganh12  cau244= new Question_tienganh12("If you take a map with you, ______.", "A.  A. you will not get lost ", "B. . you will get lost ", "C.you get lost ", "D.you got lost ", 1, Category.CATEGORY_9);
        addquestion(cau244);
        Question_tienganh12  cau2445= new Question_tienganh12("They have already opened the museum.", "A.  The museum is already opened.  ", "B. The museum was already opened. ", "C.The museum has already opened.  ", "D.The museum has already been opened. ", 4, Category.CATEGORY_9);
        addquestion(cau2445);
///
        Question_tienganh12  y7= new Question_tienganh12("If the weather ______ worse, we will not go to the beach.", "A.  gets ", "B.got  ", "C. will get ", "D. would get", 1, Category.CATEGORY_10);
        addquestion(y7);
        Question_tienganh12  y6= new Question_tienganh12("By the time he arrived, his classmates ______.", "A. have left  ", "B. left ", "C. had left", "D. were leaving ", 3, Category.CATEGORY_10);
        addquestion(y6);
        Question_tienganh12  t5= new Question_tienganh12("A new hospital ______ in this area lately.", "A. built  ", "B. was built ", "C. has built ", "D. has been built", 4, Category.CATEGORY_10);
        addquestion(t5);
        Question_tienganh12 r4= new Question_tienganh12("My granny _______________ that detective novel. ", "A. has already read", "B.  has yet read", "C. readed", "D.is reading", 1, Category.CATEGORY_10);
        addquestion(r4);
        Question_tienganh12 r5 = new Question_tienganh12(" There _______________ a lot of changes in Vietnam since the 1990s. ", "A. was", "B.have been ", "C.  has been", "D.are ", 1, Category.CATEGORY_10);
        addquestion(r5);
        Question_tienganh12 r6 = new Question_tienganh12(" My teacher (have).................. long hair.", "A. have", "B. has", "C. have had", "D. had", 2, Category.CATEGORY_10);
        addquestion(r6);
        Question_tienganh12 r7 = new Question_tienganh12("  My father __________ excuses when I feel like going to the cinema.", "A. makes always", "B. make always", "C. always makes", "D. alwayes makes", 4, Category.CATEGORY_10);
        addquestion(r7);
        Question_tienganh12 r8 = new Question_tienganh12(" His students ________ (not, speak) German in class.", "A. don’t speak", "B. doesn’t speak", "C.  not speak", "D. not speaks", 1, Category.CATEGORY_10);
        addquestion(r8);
        Question_tienganh12 r9 = new Question_tienganh12(" John ________ (work) in a supermarket.", "A. works", "B.  working", "C. work", "D. workes", 1, Category.CATEGORY_10);
        addquestion(r9);
        Question_tienganh12  t8= new Question_tienganh12("They have already opened the museum.", "A.  The museum is already opened.  ", "B. The museum was already opened. ", "C.The museum has already opened.  ", "D.The museum has already been opened. ", 4, Category.CATEGORY_10);
        addquestion(t8);
        Question_tienganh12 t4 = new Question_tienganh12(" ................... Tom (be) mad? He ( throw)………all his books and (cry) ………..now.", "A. s, are throwing, crying", "B.Is, is throwing, crying ", "C. Is, throws, cries", "D. Is, is throw, cry", 2, Category.CATEGORY_10);
        addquestion(t4);
        Question_tienganh12 g6 = new Question_tienganh12("  My neighbours __________________ around Europe now.", "A. travel", "B. are traveling", "C.is traveling ", "D. are travel", 3, Category.CATEGORY_10);
        addquestion(g6);

//
        Question_tienganh12 h7 = new Question_tienganh12(" John ________ (work) in a supermarket.", "A. works", "B.  working", "C. work", "D. workes", 1, Category.CATEGORY_11);
        addquestion(h7);
        Question_tienganh12 h1 = new Question_tienganh12("The flowers _______________ (be, normally) watered by Bob.", "A. are normally", "B. normally are", "C.  normally is", "D. is normally", 2, Category.CATEGORY_11);
        addquestion(h1);
        Question_tienganh12 h47 = new Question_tienganh12("My father didn’t _______ coffee for breakfast.", "A. used to have", "B.  use to have", "C. use to having", "D. use be having", 2, Category.CATEGORY_11);
        addquestion(h47);
        Question_tienganh12 h14 = new Question_tienganh12("I don’t think the rich _______ bad. Actually, most of them work very hard.", "A. is", "B.  are", "C. was", "D. were", 2, Category.CATEGORY_5);
        addquestion(h14);
        Question_tienganh12 hh = new Question_tienganh12(" Listen! Our teacher __________________ .", "A. speaks", "B. speaking", "C.is speaking ", "D. are speaking", 2, Category.CATEGORY_11);
        addquestion(hh);
        //
        Question_tienganh12 hhgh = new Question_tienganh12("My granny _______________ that detective novel. ", "A. has already read", "B.  has yet read", "C. readed", "D.is reading", 1, Category.CATEGORY_5);
        addquestion(hhgh);
        Question_tienganh12 y = new Question_tienganh12(" There _______________ a lot of changes in Vietnam since the 1990s. ", "A. was", "B.have been ", "C.  has been", "D.are ", 1, Category.CATEGORY_5);
        addquestion(y);
        Question_tienganh12  rr= new Question_tienganh12("I remember _______you about this before.", "A. to tell ", "B. told ", "C.tell ", "D.telling ", 4, Category.CATEGORY_5);
        addquestion(rr);
        Question_tienganh12  rrr= new Question_tienganh12("The blind _______unable to see anything.", "A.  am ", "B. have ", "C.is ", "D.are ", 4, Category.CATEGORY_11);
        addquestion(rrr);
        Question_tienganh12 yyy = new Question_tienganh12(" It ________ almost every day in Manchester.", "A. rain", "B. rains", "C. raines", "D. rainning", 2, Category.CATEGORY_11);
        addquestion(yyy);
        Question_tienganh12 yu = new Question_tienganh12(" Jo is so smart that she ________ every exam without even trying.", "A. pass", "B. passed", "C. passes", "D. is passes", 2, Category.CATEGORY_11);
        addquestion(yu);
        Question_tienganh12  rtrr= new Question_tienganh12("Nowadays, more and more young people want to have a university _______.", "A.  educate ", "B. education ", "C.educator ", "D.educational ", 2, Category.CATEGORY_11);
        addquestion(rtrr);
        Question_tienganh12 yy9y = new Question_tienganh12(" Thuy’s class is different _______ other classes because the children are disabled.", "A. on", "B. from", "C. in", "D. at", 2, Category.CATEGORY_11);
        addquestion(yy9y);
        Question_tienganh12 y0u = new Question_tienganh12("There is a good drama on TV tonight.", "A. play", "B. comedy", "C.  film", "D. movie", 1, Category.CATEGORY_11);
        addquestion(y0u);
        //
        Question_tienganh12 ccc = new Question_tienganh12("My granny _______________ that detective novel. ", "A. has already read", "B.  has yet read", "C. readed", "D.is reading", 1, Category.CATEGORY_12);
        addquestion(ccc);
        Question_tienganh12 cccc = new Question_tienganh12(" There _______________ a lot of changes in Vietnam since the 1990s. ", "A. was", "B.have been ", "C.  has been", "D.are ", 1, Category.CATEGORY_12);
        addquestion(cccc);
        Question_tienganh12  ccccc= new Question_tienganh12("I remember _______you about this before.", "A. to tell ", "B. told ", "C.tell ", "D.telling ", 4, Category.CATEGORY_12);
        addquestion(ccccc);
        Question_tienganh12  bbb= new Question_tienganh12("The blind _______unable to see anything.", "A.  am ", "B. have ", "C.is ", "D.are ", 4, Category.CATEGORY_12);
        addquestion(bbb);
        Question_tienganh12  tienganh10_cau12 = new  Question_tienganh12 ("It would have been a good crop ________________________. ", "A. if the storm didn’t sweep   ", "B. had the storm not swept ", "C. Unless the storm hadn’t swept ", "D. hadn’t the storm swept", 3, Category.CATEGORY_12);
        addquestion(tienganh10_cau12);
        Question_tienganh12  tienganh10_cau13 = new  Question_tienganh12 ("Wildlife all over the world is ………………… danger.", "A. to ", "B. for ", "C. with  ", "D. in ", 4, Category.CATEGORY_12);
        addquestion(tienganh10_cau13);
        Question_tienganh12  tienganh10_cau14 = new  Question_tienganh12 ("These are the pictures ……………  my son drew when he was young.", "A. who  ", "B. whom ", "C. whose ", "D. which  ", 4, Category.CATEGORY_12);
        addquestion(tienganh10_cau14);
        Question_tienganh12  tienganh10_cau15 = new  Question_tienganh12 ("Let's play some music.\n - ............................. ", "A. Thank you.  ", "B. Good idea  ", "C. Yes, please.  ", "D. Certainly  ", 2, Category.CATEGORY_12);
        addquestion(tienganh10_cau15);
        Question_tienganh12 tienganh11_cau25 = new Question_tienganh12("This computer isn’t capable ______ running this software.", "A. off ", "B. on ", "C. in ", "D. for", 2, Category.CATEGORY_12);
        addquestion(tienganh11_cau25);
        Question_tienganh12 tienganh11_cau26 = new Question_tienganh12("The shop has been in business ______ many years. ", "A. during ", "B. for", "C. in", "D. since", 2, Category.CATEGORY_12);
        addquestion(tienganh11_cau26);
        Question_tienganh12 tienganh11_cau27 = new Question_tienganh12("I’m afraid my parents do not allow me ______ on a long journey.", "A. to go  ", "B.to going ", "C. going ", "D. will go", 1, Category.CATEGORY_12);
        addquestion(tienganh11_cau27);

    }

    public void addquestion(Question_tienganh12 question_tienganh12) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Question_Table12.COLUMN_QUESTION, question_tienganh12.getQuestion());
        contentValues.put(Question_Table12.COLUMN_OPTION1, question_tienganh12.getOption1());
        contentValues.put(Question_Table12.COLUMN_OPTION2, question_tienganh12.getOption2());
        contentValues.put(Question_Table12.COLUMN_OPTION3, question_tienganh12.getOption3());
        contentValues.put(Question_Table12.COLUMN_OPTION4, question_tienganh12.getOption4());
        contentValues.put(Question_Table12.COLUMN_ANSWER_NR, question_tienganh12.getAnswer());
        contentValues.put(Question_Table12.COLUMN_CATEGORY, question_tienganh12.getCategory());

        db.insert(Question_Table12.TABLE_TIENGANH12, null, contentValues);


    }

    public ArrayList<Question_tienganh12> getallquestionWithCategory(String category) {
        ArrayList<Question_tienganh12> tienganh12list = new ArrayList<>();
        db = getReadableDatabase();
        String projection[] = {
                Question_Table12._ID,
                Question_Table12.COLUMN_QUESTION,
                Question_Table12.COLUMN_OPTION1,
                Question_Table12.COLUMN_OPTION2,
                Question_Table12.COLUMN_OPTION3,
                Question_Table12.COLUMN_OPTION4,
                Question_Table12.COLUMN_ANSWER_NR,
                Question_Table12.COLUMN_CATEGORY,


        };
        String selection = Question_Table12.COLUMN_CATEGORY + "= ?";
        String selectionArgs[] = {category};

        Cursor cursor = db.query(Question_Table12.TABLE_TIENGANH12,
                projection,
                selection
                , selectionArgs,
                null,
                null,
                null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Question_tienganh12 question_tienganh12 = new Question_tienganh12();
                question_tienganh12.setQuestion(cursor.getString(cursor.getColumnIndex(Question_Table12.COLUMN_QUESTION)));
                question_tienganh12.setOption1(cursor.getString(cursor.getColumnIndex(Question_Table12.COLUMN_OPTION1)));
                question_tienganh12.setOption2(cursor.getString(cursor.getColumnIndex(Question_Table12.COLUMN_OPTION2)));
                question_tienganh12.setOption3(cursor.getString(cursor.getColumnIndex(Question_Table12.COLUMN_OPTION3)));
                question_tienganh12.setOption4(cursor.getString(cursor.getColumnIndex(Question_Table12.COLUMN_OPTION4)));
                question_tienganh12.setAnswer(cursor.getInt(cursor.getColumnIndex(Question_Table12.COLUMN_ANSWER_NR)));
                question_tienganh12.setCategory(cursor.getString(cursor.getColumnIndex(Question_Table12.COLUMN_CATEGORY)));
                tienganh12list.add(question_tienganh12);
                cursor.moveToNext();
            }
        }
        cursor.close();
        return tienganh12list;


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + Question_Table12.TABLE_TIENGANH12);
        onCreate(db);
    }
}
