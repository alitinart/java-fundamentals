import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * **11.16 Quiz

 * Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user
 * if an answer is entered again.
 *
 */
public class Quiz {
    public static void main(String[] args) {
        ArrayList<String> answers = new ArrayList<>();
        ArrayList<Question> questions = new ArrayList<>(Arrays.asList(
                new Question("What is 5 + 9 ?", "14"),
                new Question("What is 10 + 9 ?", "19"),
                new Question("What is 2 + 9 ?", "11"),
                new Question("What is 1000 + 200?", "1200")
        ));

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println(q.getText());
            String answer = scanner.next();
            if(answers.contains(answer)) {
                System.out.println("You already entered that answer !");
                i--;
                continue;
            }
            answers.add(answer);

            if(!q.getAnswer().equalsIgnoreCase(answer)) {
                System.out.println("Answer is wrong");
                i--;
                continue;
            } else {
                answers.removeAll(answers);
                System.out.println("Answer is right !");
            }
        }
    }
}

class Question {
    private final String text;
    private final String answer;

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }
}