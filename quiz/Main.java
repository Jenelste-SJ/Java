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
        
    new Question("Which country hosted the 2016 Summer Olympics?", 
        new String[] { "China", "Brazil", "Russia", "Japan" }, 'B'),
        
    new Question("What is the square root of 144?", 
        new String[] { "10", "11", "12", "13" }, 'C'),
        
    new Question("Which is the longest river in the world?", 
        new String[] { "Amazon", "Yangtze", "Mississippi", "Nile" }, 'D'),
        
    new Question("What do you call a shape with eight sides?", 
        new String[] { "Pentagon", "Hexagon", "Octagon", "Decagon" }, 'C'),
        
    new Question("Which element has the chemical symbol 'O'?", 
        new String[] { "Gold", "Oxygen", "Osmium", "Zinc" }, 'B')
};


        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}

