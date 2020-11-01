/*
 *  Guido Asbun
 *
 */


import java.util.Random;

public class VoidMethods
{
    public static void main(String[] args)
    {
        //***************** Initialize three arrays as test cases *****************
        // Note that each of three these arrays has a corresponding numOfElem variable.
        // Thus, we may consider them as "paritally-filled arrays" and we should use
        // the variables numOfElem1, numOfElem2, and numOfElem3 INSTEAD OF array1.length,
        // array2.length, and array3.length.

        int array1[] = {23,43,12,45,75,32,12};
        int numOfElem1 = array1.length;

        int array2[] = {34,54,23,34,98,45,76,98,42,48,61,44};
        int numOfElem2 = array2.length;

        // next array will have random numbers
        Random generator = new Random(19580427);
        int array3[] = new int[20];
        int numOfElem3 = 10;    // will insert 10 elements only
        for (int i = 0; i < numOfElem3; ++i)
        {
            array3[i] = generator.nextInt(90) + 10;
        }

        //***************** Your code goes in this section below *****************
        // Write your 13 method calls under the 13 comments below, respectively.
        // Call method printLargest for array1.
        print(array1, numOfElem1);
        printLargest(array1, numOfElem1);

        // Call method printLargest for array2.
        print(array2, numOfElem2);
        printLargest(array2, numOfElem2);

        // Call method printLargest for array3.
        print(array3, numOfElem3);
        printLargest(array3, numOfElem3);

        System.out.println();

        // Call method printAllEvens for array1.
        print(array1, numOfElem1);
        printAllEvens(array1, numOfElem1);

        // Call method printAllEvens for array2.
        print(array2, numOfElem2);
        printAllEvens(array2, numOfElem2);

        // Call method printAllEvens for array3.
        print(array3, numOfElem3);
        printAllEvens(array3, numOfElem3);

        System.out.println();

        // Call method printSum for array1.


        // Call method printSum for array2.


        // Call method printSum for array3.


        System.out.println();

        // Call method search to search 100 in array1.


        // Call method search to search 44 in array2.


        // Call method search to search 78 in array3.


        // Call method search to search 45 in array1.

    }


    // Definition of method print
    // Your code here...

    public static void print(int[] array,int length) {
        System.out.print("\nArray: ");
        for(int i = 1; i < length; i++){
            System.out.print(array[i] + " ");
        }
    }

    // Definition of method printLargest
    // Your code here...

    public static void printLargest(int[] array, int length) {
        int largest = array[0];
        System.out.print("\nLargest element: ");
        for(int i = 1; i < length; i++){
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        System.out.print(largest);
    }


    // Definition of method printAllEvens
    // Your code here...
    public static void printAllEvens(int[] array, int length){
        System.out.print("\nEven numbers: ");
        for(int i = 0; i < length; i++){
            if(array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
    }

    // Definition of method printSum
    // Your code here...





    // Definition of method search
    // Your code here...





}
