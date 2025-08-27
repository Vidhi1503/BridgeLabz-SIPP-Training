package Workshop;
import java.util.*;

enum Difficulty { EASY, MEDIUM, HARD }
class Question<T> {
    String text;
    Difficulty level;
    List<T> options;
    T correctAnswer;





























    Question(String text, Difficulty level, List<T> options, T correctAnswer) {
        this.text = text;
        this.level = level;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
    boolean isCorrect(T answer) {
        return correctAnswer.equals(answer);
    }
}
class Subject<T> {
    String name;
    List<Question<T>> questions = new ArrayList<>();
    Subject(String name) {
        this.name = name;
    }
    void addQuestion(Question<T> q) {
        questions.add(q);
    }
}
class Student {
    String name;
    String roll;
    Map<String, List<Object>> submittedAnswers = new HashMap<>(); // Subject → answers

    Student(String name, String roll) {
        this.name = name;
        this.roll = roll;
    }
    <T> void takeExam(Subject<T> subject, Scanner sc) {
        List<Object> answers = new ArrayList<>();
        for (Question<T> q : subject.questions) {
            System.out.println(q.text);
            int i = 0;
            for (T opt : q.options) System.out.println((char)('A' + i++) + ". " + opt);
            String input = sc.next();
            answers.add(q.options.get(input.charAt(0) - 'A'));
        }
        submittedAnswers.put(subject.name, answers);
    }
    <T> int calculateScore(Subject<T> subject) {
        int score = 0;
        List<Object> answers = submittedAnswers.get(subject.name);
        for (int i = 0; i < subject.questions.size(); i++) {
            Question<T> q = subject.questions.get(i);
            T ans = (T) answers.get(i);
            if (q.isCorrect(ans)) score++;
        }
        return score;
    }
}
public class OnlineExamSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Subject<String> java = new Subject<>("Java");
        java.addQuestion(new Question<>("What is JVM?", Difficulty.EASY, List.of("Tool", "Machine", "Virtual Machine", "None"), "Virtual Machine"));
        java.addQuestion(new Question<>("int + float = ?", Difficulty.MEDIUM, List.of("int", "float", "double", "error"), "float"));

        Student s = new Student("Vidhi", "123");
        s.takeExam(java, sc);
        int score = s.calculateScore(java);
        System.out.println("Score: " + score);
    }
}
