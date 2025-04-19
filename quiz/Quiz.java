import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Advanced Java Quiz!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ":");
            questions[i].display();

            char userAnswer = getValidAnswer(scanner);
            if (questions[i].isCorrect(userAnswer)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + questions[i].getCorrectAnswer() + "\n");
            }
        }

        System.out.println("🎉 Quiz Completed! Your score: " + score + "/" + questions.length);
        scanner.close();
    }

    private char getValidAnswer(Scanner scanner) {
        while (true) {
            System.out.print("Your answer (A/B/C/D): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.matches("[A-D]")) {
                return input.charAt(0);
            } else {
                System.out.println("Invalid input. Please enter A, B, C, or D.");
            }
        }
    }
}

