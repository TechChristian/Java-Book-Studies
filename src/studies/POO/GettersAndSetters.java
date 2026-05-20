package studies.POO;
// -> Getters - Obtem o valor de um atributo
// -> Setters - Define o valor de um atributo

public class GettersAndSetters {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;


    String getBrand(){
        return brand;
    }

    void setBrand(String aBrand){
        brand = aBrand;
    }

    int getNumOfPickups(){
        return numOfPickups;
    }

    void setNumOfPickups(int aNumOfPickups){
        numOfPickups = aNumOfPickups;
    }

    boolean getRockStarUsesIt(){
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean aRockStarUsesIt){
        rockStarUsesIt = aRockStarUsesIt;
    }
}
