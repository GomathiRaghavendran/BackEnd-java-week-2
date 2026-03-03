package arrays.exercises;

/**
 * Exercise 1: Single-Dimensional Array
 * TODO:
 * 1. Create an array of 5 integers.
 * 2. Traverse and print elements.
 * 3. Find sum of all elements.
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise

        int[] num={10,20,30,40,50};
        int sum =0;
        for(int i=0;i< num.length;i++){
            System.out.println("Array elements are: "+num[i]);
            sum=sum+num[i];

        }
        System.out.println("Total elements: "+sum);
    }
}
