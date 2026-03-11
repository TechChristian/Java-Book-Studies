package studies.loops.exercicios;

/*
    Exercicios seja o compilador
    Sintaxe errada :

        public static void main(String[] args){
            int x = 1;
            while (x < 10){
                if (x > 3){
                    System.out.println("Big X");
                }
            }
        }
*/
public class Exercicios1 {
    public static void main(String[] args){
        int x = 1;
        while (x < 10){
            x = x + 1; //adiciona 1 ao X, isso não torna o loop infinito
            if (x > 3){
                System.out.println("Big X");
            }
        }
    }
}
