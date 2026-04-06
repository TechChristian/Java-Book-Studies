package studies.objetosOO.exercicios;

public class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        one.title = "Avengers";
        one.genre = "Action";
        one.rating = 200;

        Movie two = new Movie();
        two.title = "Big people two";
        two.genre = "Comedy";
        two.rating = 500;
        two.playIt();
        two.pause();
    }
}

class Movie{
    String title;
    String genre;
    int rating;

    void playIt(){
        System.out.println("Playing the movie " + title );
    }
    void pause(){
        System.out.println("Pausing the movie " + title);
    }
}