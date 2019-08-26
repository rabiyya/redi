
import java.util.ArrayList;

public class Question  {
    String prompt;
    ArrayList<String> answers;
    String answer;
    public Question(String prompt, ArrayList<String> answers, String rightAnswer) {
        this.prompt = prompt;
        this.answers = answers;
        this.answer = rightAnswer;
    }
}
