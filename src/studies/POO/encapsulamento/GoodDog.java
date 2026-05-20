package studies.POO.encapsulamento;
 //- > encapsulamento é o processo de esconder os detalhes de implementação de uma classe e mostrar apenas a funcionalidade para o usuário.
public class GoodDog {
    private int size;

    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;
    }

    void bark(){
        if(size > 60){
            System.out.println("Woof, Woof");
        }else if ( size > 14){
            System.out.println("Ruff!, Ruff!");
        }else {
            System.out.println("Yip!, Yip!");
        }
    }
}

class GoodDogTestDrive{
    public static void main(String[] args){

        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(8);

        GoodDog three = new GoodDog();
        three.setSize(15);

        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        System.out.println("Dog three: " + three.getSize());

        one.bark();
        two.bark();
        three.bark();
    }
}
