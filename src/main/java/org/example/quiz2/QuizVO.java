package org.example.quiz2;

public class QuizVO {
    protected String text;
    protected String answer;

    public QuizVO(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }
    
    public String getText()//문제 보여주는 메서드
    {//지금 현재 내가 가진 문제
        //객관식은 문제 뿐만 아니라 보기도 MQuizVO
        return this.text;
    }
    
    public boolean checkAnswer(String answer) {
        return this.answer.equals(answer);
    }
}
