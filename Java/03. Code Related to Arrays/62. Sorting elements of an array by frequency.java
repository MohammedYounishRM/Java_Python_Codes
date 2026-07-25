import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of elements of the Array: ");
        int size = userInput.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = userInput.nextInt();
        }
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : array) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);

        Arrays.sort(boxedArray, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            
            if (freqA != freqB) {
                return Integer.compare(freqB, freqA);
            } else {
                return Integer.compare(a, b);
            }
        });
        System.out.println(Arrays.toString(boxedArray));
        userInput.close();
    }
}