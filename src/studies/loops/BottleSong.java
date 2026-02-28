package studies.loops;

public class BottleSong {
    public static void main(String[] args){
        int bottlesNum = 10;
        String word = "bottles";

        //enquanto for maior que 0
        while (bottlesNum > 0){
            // quando for bottlesNum valer: 1 a palavra será bottle
            if (bottlesNum ==1){
                word = "bottle";
            }
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall, ");
            bottlesNum = bottlesNum - 1; // looping roda e tira 1 de bottlesNum toda vez que for true
            if(bottlesNum > 0){
                System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall"); // quando for 0, o else entra em pratica.
            }
        }
    }
}
