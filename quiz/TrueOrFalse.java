package exercises.quiz;

public class TrueOrFalse extends Question {

    private String answer;
    private String answerChoices;


    public TrueOrFalse(String questionBody, String answer) {
        super(questionBody);
        this.answer = answer;
        this.answerChoices = "True or False?";


    }

    @Override
    public String getAnswerChoices() {
        return answerChoices;
    }

    @Override
    public void iPrintAnswerChoices() {
        System.out.println(this.answerChoices);
        }




    @Override
    public String getAnswer() {
        return this.answer;

    }
}


