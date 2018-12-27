package exercises.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        HashMap<String, String> MCAnswerChoices = new HashMap<>();
        MCAnswerChoices.put("A", "implements");
        MCAnswerChoices.put("B", "extends");
        MCAnswerChoices.put("C", "uses");

        HashMap<String, String> checkBoxAnswerChoices = new HashMap<>();
        checkBoxAnswerChoices.put("A", "Encapsulation");
        checkBoxAnswerChoices.put("B", "Extension");
        checkBoxAnswerChoices.put("C", "Polymorphism");
        checkBoxAnswerChoices.put("D", "Inheritance");
        checkBoxAnswerChoices.put("E", "Assimilation");


        ArrayList<Question> questions = new ArrayList<>();

        TrueOrFalse questionOne = new TrueOrFalse("OOP stands for Object Oriented Procedures", "false");

        MultipleChoice questionTwo = new MultipleChoice("In order to create a subclass, what keyword must follow the name of the subclass?",
                MCAnswerChoices, "b");

        CheckBox questionThree = new CheckBox("What are the pillars of OOP?", checkBoxAnswerChoices, "acd");

        questions.add(questionOne);
        questions.add(questionTwo);
        questions.add(questionThree);

        Quiz quiz = new Quiz(questions);


        printQuiz(quiz.getQuizQuestions(),quiz, in);

            // TODO #1: Ask if they want to try the missed questions again.
            // TODO #2: Make it possible to repeat until the user wants to quit
            // TODO #3: Enable multiple inputs for checkbox answers.



        Quiz.Grade yourGrade = quiz.getGrade();
        System.out.println("Correct Answers: " + quiz.correctlyAnsweredQuestions.size() + " out of " + quiz.getQuizQuestions().size() + ". Your Grade: " + yourGrade);

        if (quiz.getIncorrectlyAnsweredQuestions().size() > 0) {
            System.out.println("Let's take another whack at the questions you missed: ");
            printQuiz(quiz.getIncorrectlyAnsweredQuestions(), quiz, in);

            }


        }




    public static void printQuiz(ArrayList<Question> qs, Quiz quiz, Scanner in) {
        for (Question q : qs) {
            System.out.println(q.getQuestionBody());
            q.iPrintAnswerChoices();
            String questionResponse = in.nextLine();
            if (questionResponse.toLowerCase().equals(q.getAnswer())) {
                quiz.correct(q);
            } else {
                quiz.incorrect(q);


            }
        }
    }
}





