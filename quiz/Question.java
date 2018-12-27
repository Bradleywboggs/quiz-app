package exercises.quiz;

abstract class Question {
    private String questionBody;
    private Object answerChoices;
    private Object answer;

    public Question(String questionBody) {
        this.questionBody = questionBody;
        this. answerChoices = "";
        this.answer = "";
    }


    public String getQuestionBody() {
        return questionBody;
    }
    public Object getAnswerChoices() {
        return answerChoices;
    }

    public Object getAnswer() {
        return answer;

    }

    public void iPrintAnswerChoices() {
        System.out.println(answerChoices);
    }
}
