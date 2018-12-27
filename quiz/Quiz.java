package exercises.quiz;

import java.util.ArrayList;
import java.util.Optional;

public class Quiz {

    public enum Grade {
        A (4.0, "A"),
        B (3.0, "B"),
        C (2.0, "C"),
        D (1.0, "D"),
        F (0.0, "F");

        private final double gpa;
        private final String grade;
        Grade(double gpa, String grade) {
            this.gpa = gpa;
            this.grade = grade;
        }
    }
    // Fields //
    ArrayList<Question> quizQuestions;
    ArrayList<Question> correctlyAnsweredQuestions;
    ArrayList<Question> incorrectlyAnsweredQuestions;
    Grade grade;


    //Constructors
    public Quiz() {

    }

    public Quiz(ArrayList quizQuestions) {
        this.quizQuestions = quizQuestions;
        this.correctlyAnsweredQuestions = new ArrayList<>();
        this.incorrectlyAnsweredQuestions = new ArrayList<>();

    }


    // Getters //
    public ArrayList<Question> getQuizQuestions() {
        return quizQuestions;
    }

    public ArrayList<Question> getCorrectlyAnsweredQuestions() {
        return correctlyAnsweredQuestions;
    }

    public ArrayList<Question> getIncorrectlyAnsweredQuestions() {
        return incorrectlyAnsweredQuestions;
    }

    public Grade getGrade(){
        if (getPercentCorrect() >= 0 && getPercentCorrect() <= 59) {
                this.grade = Grade.F;
                return grade;
        } else if (getPercentCorrect() >= 60 && getPercentCorrect() <= 69) {
                this.grade = Grade.D;
                return grade;
        } else if (getPercentCorrect() >= 70 && getPercentCorrect() <= 79) {
               this.grade = Grade.C;
               return grade;
        } else if (getPercentCorrect() >= 80 && getPercentCorrect() <= 89) {
               this.grade = Grade.B;
               return grade;
        } else {
                this.grade = Grade.A;
                return grade;
            }
        }


    // Instance Methods //
    public void iAddQuestion(Question question) {
        this.quizQuestions.add(question);
    }

    public Optional<ArrayList<Question>> correct(Question question) {
        this.correctlyAnsweredQuestions.add(question);
        return Optional.of(this.correctlyAnsweredQuestions);
    }

    public Optional<ArrayList<Question>> incorrect(Question question) {
        this.incorrectlyAnsweredQuestions.add(question);
        return Optional.of(this.incorrectlyAnsweredQuestions);
    }

    public double getPercentCorrect() {
        double percentCorrect = (this.correctlyAnsweredQuestions.size()/this.quizQuestions.size()) * 100;
        return percentCorrect;
    }

}

