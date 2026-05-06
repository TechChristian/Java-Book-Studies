package studies.varReferences;

class Books {
    String tittle;
    String author;
}

public class BookTestDrive{
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].tittle = "The Grapes of Java";
        myBooks[1].tittle = "The Java Gatsby";
        myBooks[2].tittle = "The Java CookBook";

        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        int x = 0;
        while (x < myBooks.length) {
            System.out.print(myBooks[x].tittle);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
