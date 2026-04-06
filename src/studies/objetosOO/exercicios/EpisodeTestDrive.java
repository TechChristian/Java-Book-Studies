package studies.objetosOO.exercicios;

public class EpisodeTestDrive {
    public static void main(String[] args){
        Episode episode = new Episode();

        episode.seriesName = "Dexter";
        episode.episodeNumber = 84;

        episode.play();
        episode.skipInto();
        episode.skipToNext();
    }
}

class Episode{
    String seriesName;
    int episodeNumber;

    void play(){
        System.out.println("Starting the series : " + seriesName);
    }

    void skipInto(){
        System.out.println("Skipping into...");
    }

    void skipToNext(){
        episodeNumber = episodeNumber + 1;
        System.out.println("Loading next episode... " + episodeNumber );
    }
}