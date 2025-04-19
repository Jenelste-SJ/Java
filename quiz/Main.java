public class Main {
    public static void main(String[] args) {
       Question[] questions = new Question[] {
    new Question("What is the largest ocean on Earth?", 
        new String[] { "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean" }, 'D'),
        
    new Question("Who painted the Mona Lisa?", 
        new String[] { "Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet" }, 'C'),
        
    new Question("What is the hardest natural substance on Earth?", 
        new String[] { "Gold", "Iron", "Diamond", "Quartz" }, 'C'),
        
    new Question("Which gas do plants absorb from the atmosphere?", 
        new String[] { "Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen" }, 'B'),
        
    new Question("How many continents are there on Earth?", 
        new String[] { "5", "6", "7", "8" }, 'C'),
        
};


        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}

