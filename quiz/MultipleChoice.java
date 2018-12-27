package exercises.quiz;

import java.util.HashMap;
import java.util.Map;

public class MultipleChoice extends Question {

    private HashMap<String, String> answerChoices;
    private String answer;

    public MultipleChoice(String questionBody, HashMap<String, String> answerChoices, String answer) {
        super(questionBody);
        this.answerChoices = answerChoices;
        this.answer = answer;

    }

    @Override
    public HashMap<String, String> getAnswerChoices() {
        return answerChoices;
    }

    @Override
    public String getAnswer(){
        return this.answer;
    }

    @Override
    public void iPrintAnswerChoices(){
        for (Map.Entry<String, String> choice : answerChoices.entrySet()){
            System.out.println(choice.getKey() + ". " + choice.getValue());
        }
    }

        }


