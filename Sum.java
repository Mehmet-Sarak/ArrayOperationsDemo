public class Sum {
    private int oddSum = 0; 
    private int evenSum = 0;

    Sum(int[] intArray) {
        int arrayLength = intArray.length;
        for (int index = 0; index < arrayLength; index++) {
            if (index % 2 == 0) {
                evenSum += intArray[index];
            } else {
                oddSum += intArray[index];
            }
        }
    }

    public int getOddSum() {
        return oddSum;
    }

    public int getEvenSum() {
        return evenSum;
    }
}
