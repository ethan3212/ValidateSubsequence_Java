package org.example;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        System.out.println(isValidSubsequenceTwoPointers(array, sequence));     // O(n) time | O(1) space
        System.out.println(isValidSubsequenceSinglePointer(array, sequence));   // O(n) time | O(1) space
    }

    // O(n) time | O(1) space
    public static boolean isValidSubsequenceTwoPointers(List<Integer> array, List<Integer> sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;
        while(arrayIndex < array.size() && sequenceIndex < sequence.size()) {       // O(n) time
            if(array.get(arrayIndex).equals(sequence.get(sequenceIndex))) {
                sequenceIndex++;
            }
            arrayIndex++;
        }
        return sequenceIndex == sequence.size();
    }

    // O(n) time | O(1) space
    public static boolean isValidSubsequenceSinglePointer(List<Integer> array, List<Integer> sequence) {
        int pointer = 0;
        for(var element : array) {      // O(n) time
            if(pointer == sequence.size()) {
                break;
            }
            if(element.equals(sequence.get(pointer))) {
                pointer++;
            }
        }
        return pointer == sequence.size();
    }
}