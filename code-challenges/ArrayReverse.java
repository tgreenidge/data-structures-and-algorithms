import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {1,2,3,4,5,10};
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));
  }

  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) {
    //pointer to the end of the array
    int j = inputArray.length - 1;

    // pointer to the beginning of the array
    int i = 0;

    // placeholder for swaps
    int temp;

    while (j > i) {
      temp = inputArray[i];
      inputArray[i] = inputArray[j];
      inputArray[j] = temp;
      j--;
      i++;
    }
    
    // for now, to make sure that it compiles, here is a bad answer
    return inputArray;
  }
    
}