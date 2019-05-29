package java.codechallenges;

public class ArrayShift {
    public int [] insertShiftArray(int[] inputArray, int numToInsert) {
        if(inputArray.length == 0) {
            return new int[]{numToInsert};
        }

        int middleIndex;
        int[] resultArray = new int[inputArray.length + 1];

        if(inputArray.length % 2 == 0)
            middleIndex = (resultArray.length / 2) - 1;
        else
            middleIndex = (int) (Math.floor(resultArray.length / 2));

        for(int i = 0; i < resultArray.length; i++){
            if(i == middleIndex)
                resultArray[i] = numToInsert;
            else if (i < middleIndex)
                resultArray[i] = inputArray[i];
            else
                resultArray[i] = inputArray[i - 1];
        }

        return resultArray;

    }
}
