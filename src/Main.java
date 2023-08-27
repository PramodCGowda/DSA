import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Get the array size
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] elements = new int[n];


        //Get the array elements
        System.out.println("Enter the elements of the array: ");
        for ( int i = 0; i < n; i++) {
            elements[i] = sc.nextInt();
        }

        //Get the element to be searched
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();

        //Choose the search algorithm
        int index = 0; //store the element index found from the search
        System.out.println("Choose the search algorithm: \n 1. linear \n 2. binary");
        int option = sc.nextInt();
        switch(option) {
            case 1:
                LinearSearch ls = new LinearSearch();
                index = ls.linearSearch(elements, target);
                break;

            case 2:
                BinarySearch bs = new BinarySearch();
                index = bs.binarySearch(elements, target);
                break;
            default:
                System.out.println("Invalid choice, choose from the given options");
        }

        //Display the index of the element
        if ( index != -1) {
            System.out.println("Element found at index : " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}