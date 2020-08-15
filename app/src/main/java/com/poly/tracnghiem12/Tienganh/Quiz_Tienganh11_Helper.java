package com.poly.tracnghiem12.Tienganh;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.poly.tracnghiem12.Quiz_Tienganh10_Activity;
import com.poly.tracnghiem12.Quiz_Tienganh11_Activity;
import com.poly.tracnghiem12.Tienganh.Quiz_Tienganh11_Contract.*;

import java.util.ArrayList;
import java.util.List;

public class Quiz_Tienganh11_Helper extends SQLiteOpenHelper {
    Quiz_Tienganh11_Activity quiz_tienganh11_activity;
    public static final String DATABASE_NAME1 = "quiztienganh11.db";
    public static final int VERSION = 9;
    SQLiteDatabase db;

    public Quiz_Tienganh11_Helper(Context context) {

        super(context, DATABASE_NAME1, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        quiz_tienganh11_activity = new Quiz_Tienganh11_Activity();


        this.db = db;
        String SQL_CREATE_TABLE = "create table " + Question_Table.TABLE_TIENGANH11 +
                " (" + Question_Table._ID + " integer primary key autoincrement, " +
                Question_Table.COLUMN_QUESTION + " text, " +
                Question_Table.COLUMN_OPTION1 + " text, "
                + Question_Table.COLUMN_OPTION2 + " text, " +
                Question_Table.COLUMN_OPTION3 + " text , " +
                Question_Table.COLUMN_OPTION4 + " text , " +

                Question_Table.COLUMN_ANSWER_NR + " integer , " +
                Question_Table.COLUMN_CATEGORY + " text)";
        db.execSQL(SQL_CREATE_TABLE);
        fillquestiontable1();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + Question_Table.TABLE_TIENGANH11);
        onCreate(db);

    }


    public void fillquestiontable1() {

//        Question_Tienganh11 tienganh11_cau = new Question_Tienganh11("", "A. ", "B. ", "C. ","D. ",)
//        addquestion(tienganh11_cau );


        Question_Tienganh11 tienganh11_cau1 = new Question_Tienganh11("All the guests got dressed in ________ costume.", "A. Nation", "B. national", "C. nationally", "D. nationalize", 2, Question_Tienganh11.CATEGORY_DETHISO1);
        addquestion(tienganh11_cau1);
        Question_Tienganh11 tienganh11_cau2 = new Question_Tienganh11("Tom can run faster than Tim.", "A. Tim can run faster than Tom", "B. Tim can run as fast as Tom.", "C. Tim can not run as fast as Tom.", "D. Tom can run as slowly as Tim", 3, Question_Tienganh11.CATEGORY_DETHISO1);
        addquestion(tienganh11_cau2);
        Question_Tienganh11 tienganh11_cau3 = new Question_Tienganh11("Gold ________ near San Francisco in 1848, and the gold rush started the following year.", "A. discovered ", "B. was discovered", "C. has been discovered", "D. is discovered", 2, Question_Tienganh11.CATEGORY_DETHISO1);

        addquestion(tienganh11_cau3);
        Question_Tienganh11 tienganh11_cau4 = new Question_Tienganh11("Pupils are looking forward to________ on holiday.", "A. go", "B.going ", "C. went ", "D. have gone", 2, Question_Tienganh11.CATEGORY_DETHISO1);
        addquestion(tienganh11_cau4);
        Question_Tienganh11 tienganh11_cau5 = new Question_Tienganh11("________ to have lunch with us today?", "A. Do you like", "B. Would you like ", "C. Will you like ", "D. Have you like", 2, Question_Tienganh11.CATEGORY_DETHISO1);
        addquestion(tienganh11_cau5);
        Question_Tienganh11 tienganh11_cau6 = new Question_Tienganh11("She has decided not to become a professional________.", "A. photograph", "B. photography", "C. photographer ", "D. photographic", 3, Question_Tienganh11.CATEGORY_DETHISO1);
        addquestion(tienganh11_cau6);
        Question_Tienganh11 tienganh11_cau7 = new Question_Tienganh11("A film which is made by photographing a series of changing drawings is called a ________.", "A. comedy ", "B. cartoon ", "C. documentary ", "D. drama ", 2, Question_Tienganh11.CATEGORY_DETHISO1);
        addquestion(tienganh11_cau7);
        Question_Tienganh11 tienganh11_cau8 = new Question_Tienganh11("________the bad condition of the house, it was sold at a high price.", "A. Because ", "B. Because of ", "C.Although ", "D. In spite of", 4, Question_Tienganh11.CATEGORY_DETHISO1);
        addquestion(tienganh11_cau8);
        Question_Tienganh11 tienganh11_cau9 = new Question_Tienganh11("Every time I rent a video, I choose a comedy. It means I __________ choose a comedy to rent.", "A.  usually", "B. sometimes", "C. always ", "D. never", 3, Question_Tienganh11.CATEGORY_DETHISO1);
        addquestion(tienganh11_cau9);
        Question_Tienganh11 tienganh11_cau10 = new Question_Tienganh11("That storm, __________ happened two weeks ago, was very terrible.", "A. that", "B. which", "C. who was", "D. which was", 2, Question_Tienganh11.CATEGORY_DETHISO1);
        addquestion(tienganh11_cau10);

        Question_Tienganh11 tienganh11_cau11 = new Question_Tienganh11("__________ in the village, cars and lorries will get to the village more easily.", "A. Should people widen the roads", "B. Were people widen the roads", "C. Did people widen the roads", "D. If people widened the roads ", 1, Question_Tienganh11.CATEGORY_DETHISO2);
        addquestion(tienganh11_cau11);
        Question_Tienganh11 tienganh11_cau12 = new Question_Tienganh11("What are they laughing at? -John: __________.", "A. Sorry, I can’t tell you", "B. Well, Not at all", "C. Oh, I don’t like them", "D. Oh, Jane’s jokes", 4, Question_Tienganh11.CATEGORY_DETHISO2);
        addquestion(tienganh11_cau12);
        Question_Tienganh11 tienganh11_cau13 = new Question_Tienganh11("Janet __________ for an advertising company but now she works as a tourist guide.", "A. use to work ", "B. got used to working", "C. used to work", "D. was used to working", 3, Question_Tienganh11.CATEGORY_DETHISO2);
        addquestion(tienganh11_cau13);
        Question_Tienganh11 tienganh11_cau14 = new Question_Tienganh11("When we came to the party, the food __________ so we had to have a drink first.", "A. was being prepared", "B. had been prepared", "C.  was prepared", "D. had prepared", 1, Question_Tienganh11.CATEGORY_DETHISO2);
        addquestion(tienganh11_cau14);
        Question_Tienganh11 tienganh11_cau15 = new Question_Tienganh11("The part of a computer that controls all the other parts of the system is called __________.", "A. USB", "B. . VDU", "C. RAM", "D. CPU", 4, Question_Tienganh11.CATEGORY_DETHISO2);
        addquestion(tienganh11_cau15);
        Question_Tienganh11 tienganh11_cau16 = new Question_Tienganh11("Jane looks after her younger brother so well. She’s really __________ for her age.", "A. mature", "B. old", "C. growing", "D. young", 1, Question_Tienganh11.CATEGORY_DETHISO2);
        addquestion(tienganh11_cau16);
        Question_Tienganh11 tienganh11_cau17 = new Question_Tienganh11("From our hotel window we can see a charming landscape of the surrounding mountain.", "A. mysterious", "B. magnificent", "C. picturesque", "D. wonderful", 4, Question_Tienganh11.CATEGORY_DETHISO2);
        addquestion(tienganh11_cau17);
        Question_Tienganh11 tienganh11_cau18 = new Question_Tienganh11("Without the Braille Alphabet it would be very difficult for________.", "A. the deaf", "B. the blind ", "C. disabled", "D. the mute", 2, Question_Tienganh11.CATEGORY_DETHISO2);
        addquestion(tienganh11_cau18);
        Question_Tienganh11 tienganh11_cau19 = new Question_Tienganh11("Ann ________to work, but now she doesn't.", "A. used to cycling ", "B. is used to cycling", "C. use to cycle", "D. used to cycle", 4, Question_Tienganh11.CATEGORY_DETHISO2);
        addquestion(tienganh11_cau19);

        Question_Tienganh11 tienganh11_cau21 = new Question_Tienganh11("They have already opened the museum.", "A. The museum is already opened.  ", "B. The museum was already opened.", "C. The museum has already opened.  ", "D. The museum has already been opened.", 4, Question_Tienganh11.CATEGORY_DETHISO2);
        addquestion(tienganh11_cau21);

        Question_Tienganh11 tienganh11_cau22 = new Question_Tienganh11("I felt better when enjoying the ______ climate on my uncle’s farm.", "A. health ", "B. healthy", "C. healthiness", "D. healthily", 2, Question_Tienganh11.CATEGORY_DETHISO3);
        addquestion(tienganh11_cau22);


        Question_Tienganh11 tienganh11_cau23 = new Question_Tienganh11("The government is a major contributor to the ______ of new technology in many ways.", "A. develop ", "B. developer", "C. developed", "D. development", 4, Question_Tienganh11.CATEGORY_DETHISO3);
        addquestion(tienganh11_cau23);

        Question_Tienganh11 tienganh11_cau24 = new Question_Tienganh11("The tourist guide can ______ English and French fluently.", "A. talk ", "B. ask", "C. speak", "D. say", 3, Question_Tienganh11.CATEGORY_DETHISO3);
        addquestion(tienganh11_cau24);


        Question_Tienganh11 tienganh11_cau20 = new Question_Tienganh11("I will give your regards to her ________I meet her tomorrow.", "A. while", "B. when", "C. even if", "D. if", 4, Question_Tienganh11.CATEGORY_DETHISO3);
        addquestion(tienganh11_cau20);

        Question_Tienganh11 tienganh11_cau25 = new Question_Tienganh11("This computer isn’t capable ______ running this software.", "A. off ", "B. on ", "C. in ", "D. for", 2, Question_Tienganh11.CATEGORY_DETHISO3);
        addquestion(tienganh11_cau25);
        Question_Tienganh11 tienganh11_cau26 = new Question_Tienganh11("The shop has been in business ______ many years. ", "A. during ", "B. for", "C. in", "D. since", 2, Question_Tienganh11.CATEGORY_DETHISO3);
        addquestion(tienganh11_cau26);
        Question_Tienganh11 tienganh11_cau27 = new Question_Tienganh11("I’m afraid my parents do not allow me ______ on a long journey.", "A. to go  ", "B.to going ", "C. going ", "D. will go", 1, Question_Tienganh11.CATEGORY_DETHISO3);
        addquestion(tienganh11_cau27);

        Question_Tienganh11 tienganh11_cau28 = new Question_Tienganh11("We are going on ______ trip to Nha Trang next week.", "A. a two-day’s ", "B. two-day", "C. a two-days", "D. a two-day ", 4, Question_Tienganh11.CATEGORY_DETHISO3);
        addquestion(tienganh11_cau28);

        Question_Tienganh11 tienganh11_cau29 = new Question_Tienganh11("I ______ go swimming when I was a boy.", "A.  am using to  ", "B.was used to  ", "C. used to", "D.use to", 3, Question_Tienganh11.CATEGORY_DETHISO3);
        addquestion(tienganh11_cau29);

        Question_Tienganh11 tienganh11_cau30 = new Question_Tienganh11("Although I do not get a good salary, ______.", "A. that I like my job  ", "B. but I like my job", "C. I like my job ", "D. ", 3, Question_Tienganh11.CATEGORY_DETHISO3);
        addquestion(tienganh11_cau30);


        Question_Tienganh11 tienganh11_cau31 = new Question_Tienganh11("All the guests got dressed in ________ costume.", "A. Nation", "B. national", "C. nationally", "D. nationalize", 2, Question_Tienganh11.CATEGORY_DETHISO4);
        addquestion(tienganh11_cau31);
        Question_Tienganh11 tienganh11_cau32 = new Question_Tienganh11("Tom can run faster than Tim.", "A. Tim can run faster than Tom", "B. Tim can run as fast as Tom.", "C. Tim can not run as fast as Tom.", "D. Tom can run as slowly as Tim", 3, Question_Tienganh11.CATEGORY_DETHISO4);
        addquestion(tienganh11_cau32);
        Question_Tienganh11 tienganh11_cau33 = new Question_Tienganh11("Gold ________ near San Francisco in 1848, and the gold rush started the following year.", "A. discovered ", "B. was discovered", "C. has been discovered", "D. is discovered", 2, Question_Tienganh11.CATEGORY_DETHISO4);

        addquestion(tienganh11_cau33);
        Question_Tienganh11 tienganh11_cau34 = new Question_Tienganh11("If Tom is late again, he _______ his job.", "A. loses ", "B. lost", "C. will lose ", "D. would lose", 3, Question_Tienganh11.CATEGORY_DETHISO4);
        addquestion(tienganh11_cau34);

        Question_Tienganh11 tienganh11_cau35 = new Question_Tienganh11("I remember __________ my mother said the carpets needed __________.", "A. to hear/to clean  ", "B. hear / clean ", "C. hearing/cleaning ", "D. heard /cleaned ", 3, Question_Tienganh11.CATEGORY_DETHISO4);
        addquestion(tienganh11_cau35);

        Question_Tienganh11 tienganh11_cau36 = new Question_Tienganh11("A film which is made by photographing a series of changing drawings is called a _______.", "A. drama ", "B. cartoon", "C.  comedy", "D. documentary ", 2, Question_Tienganh11.CATEGORY_DETHISO4);
        addquestion(tienganh11_cau36);
        Question_Tienganh11 tienganh11_cau37 = new Question_Tienganh11("He didn’t come back home last night, ___________ made his parents really worried.", "A. which ", "B. that ", "C. when ", "D. who", 1, Question_Tienganh11.CATEGORY_DETHISO4);
        addquestion(tienganh11_cau37);
        Question_Tienganh11 tienganh11_cau38 = new Question_Tienganh11("The government is a major contributor to the ______ of new technology in many ways.", "A. develop ", "B. developer", "C. developed", "D. development", 4, Question_Tienganh11.CATEGORY_DETHISO4);
        addquestion(tienganh11_cau38);

        Question_Tienganh11 tienganh11_cau39 = new Question_Tienganh11("The tourist guide can ______ English and French fluently.", "A. talk ", "B. ask", "C. speak", "D. say", 3, Question_Tienganh11.CATEGORY_DETHISO4);
        addquestion(tienganh11_cau39);
        Question_Tienganh11 tienganh11_cau40 = new Question_Tienganh11("The part of a computer that controls all the other parts of the system is called __________.", "A. USB", "B. . VDU", "C. RAM", "D. CPU", 4, Question_Tienganh11.CATEGORY_DETHISO4);
        addquestion(tienganh11_cau40);

        Question_Tienganh11 tienganh11_cau41 = new Question_Tienganh11(" I will give your regards to her ________I meet her tomorrow.", "A. while", "B.when", "C. even of", "D. if", 4, Question_Tienganh11.CATEGORY_DETHISO5);
        addquestion(tienganh11_cau41);

        Question_Tienganh11 tienganh11_cau42 = new Question_Tienganh11("They have already opened the museum.", "A. The museum is already opened.  ", "B. The museum was already opened.", "C. The museum has already opened.  ", "D. The museum has already been opened.", 4, Question_Tienganh11.CATEGORY_DETHISO5);
        addquestion(tienganh11_cau42);

        Question_Tienganh11 tienganh11_cau43 = new Question_Tienganh11("I felt better when enjoying the ______ climate on my uncle’s farm.", "A. health ", "B. healthy", "C. healthiness", "D. healthily", 2, Question_Tienganh11.CATEGORY_DETHISO5);
        addquestion(tienganh11_cau43);


        Question_Tienganh11 tienganh11_cau44 = new Question_Tienganh11("The government is a major contributor to the ______ of new technology in many ways.", "A. develop ", "B. developer", "C. developed", "D. development", 4, Question_Tienganh11.CATEGORY_DETHISO5);
        addquestion(tienganh11_cau44);

        Question_Tienganh11 tienganh11_cau45 = new Question_Tienganh11("The tourist guide can ______ English and French fluently.", "A. talk ", "B. ask", "C. speak", "D. say", 3, Question_Tienganh11.CATEGORY_DETHISO5);
        addquestion(tienganh11_cau45);
        Question_Tienganh11 tienganh11_cau46 = new Question_Tienganh11("________the moon last night?", "A. Do you see ", "B. Was you seeing", "C. Have you seen", "D. Did you see", 4, Question_Tienganh11.CATEGORY_DETHISO5);
        addquestion(tienganh11_cau46);

        Question_Tienganh11 tienganh11_cau47 = new Question_Tienganh11("________provides information and entertainment orally.", "A. Radio ", "B. Newspapers", "C. Books", "D. Magazines", 1, Question_Tienganh11.CATEGORY_DETHISO5);
        addquestion(tienganh11_cau47);
        Question_Tienganh11 tienganh11_cau48 = new Question_Tienganh11("What programme is ________VTV3 ________7:00?", "in/ in ", "B. on/ at", "C. at/ in", "D. on/ on", 2, Question_Tienganh11.CATEGORY_DETHISO5);
        addquestion(tienganh11_cau48);
        Question_Tienganh11 tienganh11_cau49 = new Question_Tienganh11("Mary will tell her mother the truth when she ________back", "A. would come", "B. comes", "C. will come", "D. will have come", 2, Question_Tienganh11.CATEGORY_DETHISO5);
        addquestion(tienganh11_cau49);
        Question_Tienganh11 tienganh11_cau50 = new Question_Tienganh11("Marie Curie was the first woman ________a Ph.D. from the Sorbonne.", "A. to receive ", "B. was received", "C. receive", "D. received", 1, Question_Tienganh11.CATEGORY_DETHISO5);
        addquestion(tienganh11_cau50);


        Question_Tienganh11 tienganh11_cau51 = new Question_Tienganh11("What programme is ________VTV3 ________7:00?", "in/ in ", "B. on/ at", "C. at/ in", "D. on/ on", 2, Question_Tienganh11.CATEGORY_DETHISO6);
        addquestion(tienganh11_cau51);
        Question_Tienganh11 tienganh_cau52 = new Question_Tienganh11("Mary will tell her mother the truth when she ________back", "A. would come", "B. comes", "C. will come", "D. will have come", 2, Question_Tienganh11.CATEGORY_DETHISO6);
        addquestion(tienganh_cau52);

        Question_Tienganh11 tienganh11_cau53 = new Question_Tienganh11("This computer isn’t capable ______ running this software.", "A. off ", "B. on ", "C. in ", "D. for", 2, Question_Tienganh11.CATEGORY_DETHISO6);
        addquestion(tienganh11_cau53);
        Question_Tienganh11 tienganh11_cau54 = new Question_Tienganh11("The shop has been in business ______ many years. ", "A. during ", "B. for", "C. in", "D. since", 2, Question_Tienganh11.CATEGORY_DETHISO6);
        addquestion(tienganh11_cau54);
        Question_Tienganh11 tienganh11_cau55 = new Question_Tienganh11("A film which is made by photographing a series of changing drawings is called a ________.", "A. comedy ", "B. cartoon ", "C. documentary ", "D. drama ", 2, Question_Tienganh11.CATEGORY_DETHISO6);
        addquestion(tienganh11_cau55);
        Question_Tienganh11 tienganh11_cau56 = new Question_Tienganh11("________the bad condition of the house, it was sold at a high price.", "A. Because ", "B. Because of ", "C.Although ", "D. In spite of", 4, Question_Tienganh11.CATEGORY_DETHISO6);
        addquestion(tienganh11_cau56);
        Question_Tienganh11 tienganh11_cau57 = new Question_Tienganh11("I felt better when enjoying the ______ climate on my uncle’s farm.", "A. health ", "B. healthy", "C. healthiness", "D. healthily", 2, Question_Tienganh11.CATEGORY_DETHISO6);
        addquestion(tienganh11_cau57);


        Question_Tienganh11 tienganh11_cau58 = new Question_Tienganh11("Choose the word whose main stress is placed differently from that of the others.", "A. subtract ", "B. effort", "C. primary", "D. suffer", 1, Question_Tienganh11.CATEGORY_DETHISO6);
        addquestion(tienganh11_cau58);
        Question_Tienganh11 tienganh11_cau59 = new Question_Tienganh11("Choose the word whose stress pattern is different from that of the others.", "A. beautiful ", "B. interesting ", "C. wonderful ", "D. development", 4, Question_Tienganh11.CATEGORY_DETHISO6);
        addquestion(tienganh11_cau59);
        Question_Tienganh11 tienganh11_cau60 = new Question_Tienganh11("Choose the word whose stress pattern is different from that of the others.", "A. background  ", "B.  career ", "C.  second ", "D.  private", 2, Question_Tienganh11.CATEGORY_DETHISO6);
        addquestion(tienganh11_cau60);

    }

    public void addquestion(Question_Tienganh11 question_tienganh11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Question_Table.COLUMN_QUESTION, question_tienganh11.getQuestion());
        contentValues.put(Question_Table.COLUMN_OPTION1, question_tienganh11.getOption1());
        contentValues.put(Question_Table.COLUMN_OPTION2, question_tienganh11.getOption2());
        contentValues.put(Question_Table.COLUMN_OPTION3, question_tienganh11.getOption3());
        contentValues.put(Question_Table.COLUMN_OPTION4, question_tienganh11.getOption4());
        contentValues.put(Question_Table.COLUMN_ANSWER_NR, question_tienganh11.getAnswer());
        contentValues.put(Question_Table.COLUMN_CATEGORY, question_tienganh11.getCategory());

        db.insert(Question_Table.TABLE_TIENGANH11, null, contentValues);


    }

    //    public List<Question_Tienganh11> getallquestion() {
//        List<Question_Tienganh11> questionList = new ArrayList<>();
//        db = getReadableDatabase();
//        Cursor cursor = db.rawQuery("select * from " + Question_Table.TABLE_TIENGANH11, null);
//        if (cursor.moveToFirst()) {
//            do {
//                Question_Tienganh11 question_tienganh11 = new Question_Tienganh11();
//                question_tienganh11.setQuestion(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_QUESTION)));
//                question_tienganh11.setOption1(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_OPTION1)));
//                question_tienganh11.setOption2(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_OPTION2)));
//                question_tienganh11.setOption3(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_OPTION3)));
//                question_tienganh11.setOption4(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_OPTION4)));
//                question_tienganh11.setAnswer(cursor.getInt(cursor.getColumnIndex(Question_Table.COLUMN_ANSWER_NR)));
//                questionList.add(question_tienganh11);
//            } while (cursor.moveToNext());
//
//
//        }
//        cursor.close();
//        return questionList;
//    }
    public ArrayList<Question_Tienganh11> getquestiontienganh11(String category) {
        ArrayList<Question_Tienganh11> questionList11 = new ArrayList<>();
        db = getReadableDatabase();
        String projection[] = {
                Question_Table._ID,
                Question_Table.COLUMN_QUESTION,
                Question_Table.COLUMN_OPTION1,
                Question_Table.COLUMN_OPTION2,
                Question_Table.COLUMN_OPTION3,
                Question_Table.COLUMN_OPTION4,
                Question_Table.COLUMN_ANSWER_NR,
                Question_Table.COLUMN_CATEGORY

        };
        String selection = Question_Table.COLUMN_CATEGORY + " = ?";
        String selectArgs[] = {category};

        Cursor cursor = db.query(Question_Table.TABLE_TIENGANH11,
                projection,
                selection,
                selectArgs,
                null,
                null,
                null);


        if (cursor.moveToFirst()) {
            do {
                Question_Tienganh11 question_tienganh11 = new Question_Tienganh11();
                question_tienganh11.setQuestion(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_QUESTION)));
                question_tienganh11.setOption1(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_OPTION1)));
                question_tienganh11.setOption2(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_OPTION2)));
                question_tienganh11.setOption3(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_OPTION3)));
                question_tienganh11.setOption4(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_OPTION4)));
                question_tienganh11.setAnswer(cursor.getInt(cursor.getColumnIndex(Question_Table.COLUMN_ANSWER_NR)));
                question_tienganh11.setCategory(cursor.getString(cursor.getColumnIndex(Question_Table.COLUMN_CATEGORY)));

                questionList11.add(question_tienganh11);
            } while (cursor.moveToNext());


        }
        cursor.close();
        return questionList11;
    }
}
