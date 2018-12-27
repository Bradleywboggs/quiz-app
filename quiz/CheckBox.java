package exercises.quiz;

import java.util.HashMap;
import java.util.Map;

public class CheckBox extends Question {

    private HashMap<String,String> answerChoices;
    private String answers;


    public CheckBox(String questionBody, HashMap<String,String> answerChoices, String answers){
        super(questionBody);
        this.answerChoices = answerChoices;
        this.answers = answers;

    }

   @Override
    public HashMap<String,String> getAnswerChoices() {
        return answerChoices;
    }

   @Override
    public String getAnswer() {
        return answers;
    }

    @Override
    public void iPrintAnswerChoices() {
        for (Map.Entry<String, String> choice : answerChoices.entrySet()){
            System.out.println(choice.getKey() + ". " + choice.getValue());
        }
    }


}
