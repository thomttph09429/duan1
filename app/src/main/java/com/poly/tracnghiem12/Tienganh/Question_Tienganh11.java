package com.poly.tracnghiem12.Tienganh;

public class Question_Tienganh11 {
    public static final String CATEGORY_DETHISO1 = "dethiso1";
    public static final String CATEGORY_DETHISO2 = "dethiso2";
    public static final String CATEGORY_DETHISO3 = "dethiso3";
    public static final String CATEGORY_DETHISO4 = "dethiso4";
    public static final String CATEGORY_DETHISO5 = "dethiso5";
    public static final String CATEGORY_DETHISO6 = "dethiso6";

    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int answer;
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Question_Tienganh11(String question, String option1, String option2, String option3, String option4, int answer, String category) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.category = category;
    }

    public Question_Tienganh11() {
    }

    public Question_Tienganh11(String question, String option1, String option2, String option3, String option4, int answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }


}
