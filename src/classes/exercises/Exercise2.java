package classes.exercises;

/**
 * Exercise 2: Constructors
 * -------------------------
 * TODO:
 * 1. Create a class `Person` with fields: name, age.
 * 2. Write a default constructor (assign default values).
 * 3. Write a parameterized constructor.
 * 4. Create objects using both constructors and display results.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        // TODO: Create Person objects using both constructors

        //Constructors invoke the method directly
       //Default constructor
        Person p1=new Person();
        //Parameterized constructors
        Person p2=new Person("Gomathi",20);

        p1.display();
        p2.display();


    }
}

class Person{
    String name;
    int age;
    //Default constructor
    public  Person() {
        name="unknown";
        age=0;
    }
    //parameterized constructor
    public Person(String name, int age){
       this.name=name;
       this.age=age;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
}


//Note: No return statement in Constructors