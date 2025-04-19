public class Question {
    private String prompt;
    private String[] options;
    private char correctAnswer;

    public Question(String prompt, String[] options, char correctAnswer) {
        this.prompt = prompt;
        this.options = options;
        this.correctAnswer = Character.toUpperCase(correctAnswer);
    }

    public void display() {
        System.out.println(prompt);
        char optionLabel = 'A';
        for (String option : options) {
            System.out.println(optionLabel + ". " + option);
            optionLabel++;
        }
    }

    public boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == correctAnswer;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }
}

