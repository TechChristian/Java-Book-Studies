package studies.loops.exercicios;

public class Saidas {
    public static void main(String[] args) {

        // Ache a Saida : 0 2 1 4 3 6 4 8

        int x = 0;
        int y = 0;

        while (x < 5 ) {
             if(y < 5) {
                x = x + 1;
                if ( y < 3){
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + " " + y + " ");
            x = x + 1;
        }
    }
}

/*
    Questão 1 :
    Ache a saida : 0 0 1 1 2 1 3 2 4 2

    int x = 0;
        int y = 0;
        while(x < 5){
             y = x - y;
            System.out.print(x + " " + y + " ");
            x = x + 1;
}
     Questão 2 :
     Ache a saida : 0 0 1 1 2 3 3 6 4 10

      int x = 0;
        int y = 0;

        while (x < 5 ) {
            y = y + x;
            System.out.print(x + " " + y + " ");
            x = x + 1;
 }
    Questão 3 :
    Ache a saida : 0 2 1 4 2 5 3 6 4 7

     int x = 0;
        int y = 0;
        while (x < 5 ) {
            y = y + 2;
            if (y > 4){
                y = y - 1;
            }
            System.out.print(x + " " + y + " ");
            x = x + 1;
}

    Questão 4 :
    Ache a saida : 1 1 3 4 5 9

      int x = 0;
        int y = 0;
        while (x < 5 ) {

            x = x + 1;
            y = y + x;

            System.out.print(x + " " + y + " ");
            x = x + 1;
        }

 */
