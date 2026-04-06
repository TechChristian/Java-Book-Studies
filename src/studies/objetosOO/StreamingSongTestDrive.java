package studies.objetosOO;

class StreamingSong {
    String title;
    String artist;
    int duration;

    void play(){
        System.out.println("Playing song");
    }
    void printDetails(){
        System.out.println("This is " + title + " by " + artist);
    }
}

public class StreamingSongTestDrive{
    public static void main(String[] args){
        StreamingSong song = new StreamingSong();
        song.title = "Raindance";
        song.artist = "Dave";
        song.duration = 3;
        song.printDetails();
    }
}
