package arrays.exercises;

/**
 * Exercise 3: Jagged Array
 * TODO:
 * 1. Create a jagged array with 3 rows.
 * 2. Assign values manually.
 * 3. Traverse and print array.
 * 4. Find total number of elements.
 */
public class Exercise3 {
    public static void main(String[] args) {
        // TODO: Implement exercise

            //Jagged
            int[][] arr = new int[3][];
            arr[0] = new int[]{1, 2};
            arr[1] = new int[]{3, 4, 5};
            arr[2]= new int[]{8};

            int sum=0;



            for(int i=0;i<arr.length;i++){

                for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+ " ");
                sum=sum+arr[i][j];
                }
                System.out.println();
            }
            System.out.println(sum);
        }
    }

