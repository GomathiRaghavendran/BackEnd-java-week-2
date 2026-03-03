/**
 * Student Report (Arrays + Objects)
 * Concepts used: Arrays of objects, loops, classes.
 * <p>
 * Create a Student class with fields: name, age, marks.
 * Create an array of Student objects.
 * Use a loop to display each student’s information.
 * Add a method isPassed() that checks if marks ≥ 40.
 * Print whether each student passed or failed.
 */
package projects;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        //Creating array for the classes and invoking a method for each object

//        Students[] s = new Students[3];
//
//        Students s1 = new Students("Navin", 35, 35);
//        Students s2 = new Students("Raghav",30, 85);
//        Students s3 = new Students("Eeshaan",10,100);
//        s[0] = s1;
//        s[1] = s2;
//        s[2] = s3;

        //Another way of writing arrays is below

        Students[] s={new Students("Navin", 35, 35),
                      new Students("Raghav",30, 85),
                      new Students("Eeshaan",10,100)
        };

       // normal for loop
        for(int i=0;i<s.length;i++){
            s[i].displayResults();

        }
        //Enhanced for loop
//        for(Students st:s){
//            st.displayResults();
//        }
    }
}


class Students {

    public int length;
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int marks;

  public Students(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void displayResults() {
        String result = isPassed() ? "Passed" : "Failed";//(if(is paased)---> true- then its passed else its failed
        System.out.println("Name: " + name + "  Age: " + age + "  Marks: " + marks + "  results: " + name+" is "+result);

    }

    public boolean isPassed() {
        if(marks>=40){
           return true;
        }else{
            return false;
        }
    }
}





















