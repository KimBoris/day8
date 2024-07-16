package org.example.quiz2;

import java.util.Scanner;

public class QuizUI {
    private Scanner scanner;

    public QuizUI(Scanner scanner) {
        this.scanner = scanner;
    }

    public void show() {
        while (true) {
            QuizVO quiz = QuizService.INSTANCE.getNext();

            if (quiz == null) {
                System.out.println(("The End"));
                break;
            }

            System.out.println(quiz.getText());

            System.out.println("Insert Your Answer");

            String userAnswer = scanner.nextLine();

            boolean result = quiz.checkAnswer(userAnswer);

            if (result) {
                System.out.println("Correct");
            } else {
                System.out.println("Wrong");
                break;
            }

        }
    }
}
