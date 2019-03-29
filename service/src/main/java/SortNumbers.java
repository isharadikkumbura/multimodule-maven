
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number of items to be sorted");
//        int numberOfItems = scan.nextInt();

        System.out.println("Enter Items to be sorted");
       // int itemArray[] = new int[numberOfItems];
//        for (int i = 0; i < numberOfItems; i++) {
//            itemArray[i] = scan.nextInt();
//        }

        String numberString = scan.nextLine();
        List<Integer> list = Stream.of(numberString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        int[] itemArray  = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Choose the Sorting algorithm > Type 1 for Selection, Type 2 for Insertion, Type 3 for Bubble");
        int typeNumber = scan.nextInt();

        if (typeNumber == 1) {
            executeSelectionSort(itemArray);
        }
        if (typeNumber == 2) {
            executeInsertionSort(itemArray);
        }
        if (typeNumber == 3) {
            executeBubbleSort(itemArray);
        }


    }

    public static void executeSelectionSort(int[] itemArray) {


        Sort sortObject = new SelectionSort();
        sortObject.sort(itemArray);

    }
    public static void executeInsertionSort(int[] itemArray) {


        Sort sortObject = new InsertionSort();
        sortObject.sort(itemArray);

    }
    public static void executeBubbleSort(int[] itemArray) {


        Sort sortObject = new BubbleSort();
        sortObject.sort(itemArray);

    }
}
