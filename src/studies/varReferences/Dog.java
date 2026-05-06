package studies.varReferences;

public class Dog {
    String name;

    public static void main(String[] args){
        // -> cria um objeto Dog e acessa.
        Dog dog1 = new Dog();
        dog1.bark(); // -> valor padrao caso a variavel nao for inicializada
        dog1.name = "Bart";

        // -> cria um array Dog para 3 posicoes.
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // -> acessa dogs usando as referencias do array
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.print("Last dog's name is ");
        System.out.println(myDogs[2].name);

        // -> itera um loop e instrui cada dog da lista a latir.(bark)
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark(){
        System.out.println(name + " says Ruff!");
    }

    public void eat(){}

    public void chaseCat(){}
}
