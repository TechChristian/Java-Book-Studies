package studies.objetosOO.exercicios;

public class DogtestDrive {
    public static void main(String[] args){
        Dog dog = new Dog(); // <- Cria um objeto Dog

        // Define atributos do objeto Dog
        dog.size = 40;
        dog.name = "Marley";
        dog.bread = "Labrador";

        //Chama metodos que contem dentro do objeto Dog.
        dog.run();
        dog.bark();
    }
}
    class Dog {
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

