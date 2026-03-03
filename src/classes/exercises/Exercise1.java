package classes.exercises;

/**
 * Exercise 1: Basic Class
 * ------------------------
 * TODO:
 * 1. Create a class `Book` with fields: title, author.
 * 2. Add a method `displayInfo()` to print book details.
 * 3. Create objects in main() and call the method.
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        // TODO: Create Book objects and test methods
        book b=new book();
        b.displayInfo("PowerofSubconciousmind","Dr.Joesphmurray");
        System.out.println(b.title);
        System.out.println(b.author);

    }
}

class book{
    String title;
    String author;

   public void displayInfo(String title, String author){
        this.title= title;
        this.author=author;

    }

}

