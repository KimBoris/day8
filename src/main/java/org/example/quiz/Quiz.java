package org.example.quiz;

//인터페이스는 실체가 아니다.
//인터페이스도 하나의 타입이다.
public interface Quiz {
    String getText();

    boolean checkAnswer(String userAnswer);
}
