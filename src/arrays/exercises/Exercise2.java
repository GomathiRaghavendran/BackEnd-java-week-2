package arrays.exercises;

/**
 * Exercise 2: Multi-Dimensional Array
 * TODO:
 * 1. Create a 2x3 array.
 * 2. Assign values.
 * 3. Traverse and print matrix.
 * 4. Calculate sum of elements.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise

        int[][] arr = new int[2][3];
        arr[0] = new int[]{1, 2};
        arr[1] = new int[]{3, 4, 5};

        int sum=0;


        for(int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(
                        arr[i][j] + " ");
                sum = sum + arr[i][j];

            }
            System.out.println();

        }
        System.out.println(sum);



    }
}
