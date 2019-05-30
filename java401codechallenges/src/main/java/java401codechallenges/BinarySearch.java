package java401codechallenges;

public class BinarySearch {

    public static int binarySearch(int[] inputArray, int target) {
        if(inputArray.length == 0)
            return -1;


        if (inputArray.length == 1)
            return target == inputArray[0] ? 0 : -1;

        //beginning index of array/sub array
        int first = 0;

        //last index of array/sub array
        int last = inputArray.length - 1;


        //middle index of array/sub array
        int middle = (int) Math.floor((first + last) / 2);

        while (last > first) {
            if(target == inputArray[middle]) {
                return  middle;
            } else if (target > inputArray[middle]) { //target is in last half of array/sub array
                first = middle + 1;
                middle = (int) Math.floor((first + last) / 2);
            } else { //target is in first half of array / sub array
                last = middle - 1;
                middle = (int) Math.floor((first + last) / 2);
            }
        }

        return  -1;
    }
}
