Write a Java program to find the common elements between two arrays of integers.
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {1};
        int[] array2 = {1, 5, 2, 1};
        
        int[] commonElements = findCommonElements(array1, array2);
        
        System.out.println("Array 1:");
        printArray(array1);
        
        System.out.println("\nArray 2:");
        printArray(array2);
        
        System.out.println("\nCommon Elements:");
        printArray(commonElements);
    }
    
    public static int[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();
        
        for (int element : array1) {
            set1.add(element);
        }
        
        for (int element : array2) {
            if (set1.contains(element)) {
                set2.add(element);
            }
        }
        
        Iterator<Integer> itr = set2.iterator();
	    while (itr.hasNext()) {
            resultList.add(itr.next());
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
