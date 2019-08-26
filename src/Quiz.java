import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        String q1 = "What is the capital of Turkey??";
        ArrayList<String> a1 = new ArrayList<>(Arrays.asList("Ankara", "Istanbul", "Batman"));
        String q2 = "What is the national animal of China?";
        ArrayList<String> a2 = new ArrayList<>(Arrays.asList("Cow", "Giant panda", "snake"));
        String q3 = "What is a very cold part of Russia?";
        ArrayList<String> a3 = new ArrayList<>(Arrays.asList("Tver", "Krasnodar", "Siberia"));
        String q4 = "Which is the largest desert on earth?";
        ArrayList<String> a4 = new ArrayList<>(Arrays.asList("Sahara", "Sonora", "Kalahari"));
        String q5 = "What is the second largest country in Europe after Russia?";
        ArrayList<String> a5 = new ArrayList<>(Arrays.asList("Germany", "Aserbaijan", "France"));
        String q6 = "What do the Japanese people call their own country?";
        ArrayList<String> a6 = new ArrayList<>(Arrays.asList("Yahoo", "Akon", "Nippon"));
        String q7 = "In which country is Krakow located?";
        ArrayList<String> a7 = new ArrayList<>(Arrays.asList("Germany", "Poland", "France"));
        String q8 = "What is the capital city of Australia?";
        ArrayList<String> a8 = new ArrayList<>(Arrays.asList("Canberra", "Berlin", "Kiew"));
        String q9 = "What is the capital of the American state Hawaii?";
        ArrayList<String> a9 = new ArrayList<>(Arrays.asList("Haylululo", "Baku", "Honolulu"));
        String q10 = "How many time zones are there in the world?";
        ArrayList<String> a10 = new ArrayList<>(Arrays.asList("20", "23", "24"));
        ArrayList<Question> questionList = new ArrayList<>();
        questionList.add(new Question(q1, a1, "a"));
        questionList.add(new Question(q2, a2,"b"));
        questionList.add(new Question(q3, a3,"c"));
        questionList.add(new Question(q4, a4,"a"));
        questionList.add(new Question(q5, a5,"c"));
        questionList.add(new Question(q6, a6,"c"));
        questionList.add(new Question(q7, a7,"b"));
        questionList.add(new Question(q8, a8,"a"));
        questionList.add(new Question(q9, a9,"c"));
        questionList.add(new Question(q10, a10,"c"));
        Collections.shuffle(questionList);
        playGame(questionList);
    }
    public static void playGame(ArrayList<Question> questions) {
        int score = 0;
        int wrongs = 0;
        int remaining =5 ;
        Scanner sc = new Scanner(System.in);
        for (Question q : questions) {
            System.out.println(q.prompt);
            char letter = 'a';
            for (int j = 0; j < 3; j++) {
                System.out.println("(" + letter + ")" + q.answers.get(j));
                letter++;
            }
            String answer= sc.nextLine();
            if (answer.equals("skip")) {
                score--;
                remaining--;
                if (remaining==0){
                    break;
                }
            } else if (answer.equals(q.answer)) {
                score += 5;
            } else {
                score -= 2;
                wrongs++;
            }
            System.out.println(score);
        }
        System.out.println("You got " + score + "points\n" + questions.size() + " questions");
        System.out.println("The number of wrong answers : " + wrongs);
        if (score>=45){
            System.out.println("Excellent");
        }else if (score>=35){
            System.out.println("Good");
        }else if (score>=25){
            System.out.println("Satisfactory");
        }else {
            System.out.println("Poor");
        }
    }
}