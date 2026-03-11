package studies;

import java.util.Random;

public class wordPetClass {
    public static void main(String[] args){
        String[] dogs = {
                "Pinscher", "Pit Bull", "Vira-lata"
        };
        String[] cor = {
            "Branco", "Preto", "Marrom"
        };

        int wordOne = dogs.length;
        int wordTwo = cor.length;

        Random randomGenerator = new Random();

        int rand1 = randomGenerator.nextInt(wordOne);
        int rand2 = randomGenerator.nextInt(wordTwo);

          System.out.println(dogs[rand1] + " " + cor[rand2]);
    }
}
