package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        // 인덱스와 데이터 동기화
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));
        
        int searchValue = 8;

        // O(1)
        System.out.println("searchValue = " + inputArray[searchValue]);
    }
}
