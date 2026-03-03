package projects;

public class BookDemo {
    public static void main(String[] args) {
        BookInfo b = new BookInfo("Power Of Sub Conscious Mind", "DR.Joseph Morphy", 1987);
        b.printDetails();
        BookInfo b1 = new BookInfo();
        b1.printDetails();

    }
}

class BookInfo {
    String title;
    String author;
    int year;

    //Integer year-Wrapper class since if we are unaware of year, then we can write it as null instead of Zero

    //Default constructor-No args constructor
    public BookInfo() {
        title = "Empty Title";
        author = " ";
        year = 0;
    }

    public BookInfo(String t, String a, int y) {
        this.title = t;
        this.author = a;
        this.year = y;
    }
    public void printDetails() {
        System.out.printf("Title: %s, Author: %s, Year: %d\n", this.title, this.author, this.year);
        //System.out.println("Name of the Author: "+author);
        //System.out.println("year of published: "+year);

    }

}
