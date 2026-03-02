package studies;

import java.util.Random;

public class WordClass {
    public static void main(String[] args){
        String[] wordListOne = {
                "API REST", "HTTP", "Status", "Code", "Services", "Dtos", "Controller"
        };
        String[] wordListTwo = {
                "Framework", "Java", "Spring", "JVM", "Docker", "Microservices", "Compilador"
        };
        String[] wordListThree = {
                "Python", "JavaScript", "Typescript", "Go", "C#", "C++", "SQL"
        };

        //Numero de palavras em cada Lista
        int oneLength = wordListOne.length;
        int twoLength = wordListOne.length;
        int threeLength = wordListOne.length;

        //Gere tres numeros aleatorios
        Random randomGenerator = new Random();

        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Precisamos de " + phrase);
    }

}
