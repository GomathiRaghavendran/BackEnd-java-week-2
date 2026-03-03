package arrays.exercises;

/**
 * Exercise 5: Linear Search
 * TODO:
 * 1. Create an array of integers.
 * 2. Ask user for a number.
 * 3. Implement linear search.
 * 4. Print index if found or "Not found".
 */
public class Exercise5
{
    public static void main(String[] args)
    {
        int[] arr={9,10,60,87,90,19,22};
        int key=19;
        int index=-1;

        for(int i=1;i<arr.length;i++){

            if (arr[i] == key)
            {
                index = i;
                break;
            }
        }
        if(index!=1){
            System.out.println("Element found at the index:"+index);
        }else{
            System.out.println("Element not found at the index: "+index);
        }

    }


    }

