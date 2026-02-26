package studies.loops;

public class Loop {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the loop");
        // Enquanto x for menor que 4, as instruções serão executadas
        while (x < 4){
            System.out.println("in the loop");
            System.out.println("Value of x is " + x);
            x = x + 1; // a cada loop "True" será adicionado 1 ao X
        }
        System.out.println("This is after the loop " + x);
    }
}
