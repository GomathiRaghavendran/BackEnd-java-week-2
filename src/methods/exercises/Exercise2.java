package methods.exercises;

public class Exercise2 {
    /**
     * Exercise 2: Modifiers
     * ----------------------
     * TODO:
     * 1. Create one method with each access modifier:
     *    - public, protected, default, private
     * 2. Create one static method and one final method.
     * 3. Try calling them inside main().
     */


        public static void main(String[] args)
        {
         Exercise2 obj = new Exercise2();

            // Example usage
            obj.publicMethod();

            // TODO: Call other methods here
        }
        // Example: public method
        public void publicMethod()
        {
            System.out.println("Public method called");
        }

        // Example usage
       // obj.publicMethod();

        // TODO: Add protectedMethod()
        public void protectMethod()
        {
            System.out.println("protected method called");
        }

        // Example usage
        //obj.protectMethod();
        //TODO: Add defaultMethod()
        public void defaultMethod()
        {
            System.out.println("default method called");
        }
        // Example usage
        //obj.defaultMethod();

        // TODO: Add privateMethod()
        public void privateMethod()
        {
            System.out.println("private method called");
        }

        // Example usage
       // obj.privateMethod();


        // TODO: Add staticMethod()
        public void staticMethod()
        {
            System.out.println("static method called");
        }


        // Example usage
       // staticMethod();
        // TODO: Add finalMethod()  //Without instance - meaning invoking methodname directly
        public void finalMethod(){System.out.println("final method called");
        }


        // Example usage
       // finalMethod();   // without instance- meaning invoking methodname directly
    }

