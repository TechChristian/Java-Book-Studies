package studies.varReferences;

public class CarReferences {
    String model;
    String color;

    public static void main(String[] args){
        CarReferences car1 = new CarReferences();
        car1.model = "Mustang";
        car1.color = "Red";

        CarReferences[] car = new CarReferences[3];
        car[0] = new CarReferences();
        car[1] = new CarReferences();

        car[0].model = "Ferrari";
        car[0].color = "Red";
        car[1].model = "Porsche";
        car[1].color = "White";
        car[2] = car1;

        System.out.println("Last car's model is " + car[2].model + "and color is " + car[2].color);

        int x = 0;

        while(x < car.length){
            car[x].run();
            x = x + 1;
        }
    }

    public void run(){
        System.out.println(model + " Running...");
    }
}
