Program to remove all repeated elements from an array                                                                                         
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveRepeatedElements {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 1, 5, 6, 7, 7, 8, 9, 9, 10};
        int[] result = removeRepeatedElements(array);
        
        System.out.println("Original Array:");
        printArray(array);
        
        System.out.println("\nArray without Repeated Elements:");
        printArray(result);
    }
    
    public static int[] removeRepeatedElements(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();
        
        for (int element : array) {
            if (!uniqueElements.contains(element)) {
                uniqueElements.add(element);
                resultList.add(element);
            }
        }
        
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        
        return resultArray;
    }
    
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
