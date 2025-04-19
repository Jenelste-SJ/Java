public class Main {
    public static void main(String[] args) {
        Question[] questions = new Question[] {
            new Question("What is the capital of France?", new String[] { "Berlin", "Paris", "Rome", "Madrid" }, 'B'),
            new Question("Which planet is known as the Red Planet?", new String[] { "Earth", "Mars", "Jupiter", "Venus" }, 'B'),
            new Question("Who developed the theory of relativity?", new String[] { "Newton", "Einstein", "Tesla", "Darwin" }, 'B'),
            new Question("Which language runs in a web browser?", new String[] { "Java", "Python", "C++", "JavaScript" }, 'D'),
            new Question("Which number is a prime number?", new String[] { "4", "6", "7", "9" }, 'C')
        };

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}

