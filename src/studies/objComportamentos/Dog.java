package studies.objComportamentos;

public class Dog {
    String name;

    public static void main(String [] args){

        Dog d = new Dog();
        d.name = "Fred";
        // -> argumento do metodo
        d.bark(3);

    }
    // -> parametro do metodo.
    void bark(int numOfBarks) {
        while(numOfBarks > 0){
            System.out.println("Ruf, Ruf");
            numOfBarks = numOfBarks - 1;
        }
    }
}
