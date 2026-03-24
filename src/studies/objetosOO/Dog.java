package studies.objetosOO;

public class Dog {
    // -> variaveis de instancia (o que a classe conhece)
    int size;
    String bread;
    String name;

    // -> Metodos (o que a classe faz)
    void bark(){
        System.out.println("Ruff! Ruff!");
    }

    void run(){
        System.out.println(name + " Running");
    }

    void sleep(){
        System.out.println(name + " Sleeping");
    }
}
