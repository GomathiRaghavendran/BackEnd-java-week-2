package methods.exercises;

public class Exercise4 {


    /**
     * Exercise 4: Special Methods
     * ----------------------------
     * TODO:
     * 1. Create a constructor that prints "Object created".
     * 2. Create a varargs method `printStrings(String... words)` that prints all words.
     * 3. Create an abstract class Shape with abstract method `draw()`.
     * 4. Create a subclass Rectangle that implements draw().
     */



        // TODO: Constructor prints "Object created"

        // TODO: Varargs method printStrings()

        public static void main(String[] args)
        {
            // TODO: Test constructor

            Exercise4 obj = new Exercise4();

            // TODO: Call printStrings with multiple arguments

            Shape s1 = new Circle();
//        s1.draw();

            // TODO: Create Rectangle object and call draw()
            Shape s2= new Rectangle();
        }
    }


    abstract class Shape
    {
        // TODO: declare abstract method draw()
    }

    class Circle extends Shape
    {
        //    @Override
        public void draw()
        {
            System.out.println("Drawing a Circle");
        }
    }

// TODO: Create Rectangle class that implements draw()

    class Rectangle extends Shape
    {
        //    @Override
        public void draw()
        {
            System.out.println("Drawing a rectangle");
        }
    }



