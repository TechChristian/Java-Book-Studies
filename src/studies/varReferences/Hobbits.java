package studies.varReferences;

public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = - 1 ;

        while (z < 2) {
            z = z + 1; // -> Arrays initialize element by : 0
            h[z] = new Hobbits(); // -> loop initial : 0
            h[z].name = "jon";

            if(z == 1){ // -> loop initial : 1
                h[z].name = "bob";
            }
            if(z == 2){ // -> loop initial : 2
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}
