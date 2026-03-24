package studies.objetosOO;

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
