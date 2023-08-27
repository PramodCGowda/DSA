public class BinarySearch {

    public int binarySearch(int[] elements, int target) {

        int start =  0; //start index
        int end = elements.length - 1; //end index

        while(start <= end) {
            int mid = (start + end) / 2;
            if(elements[mid] == target) {
                return mid;
            } else if(elements[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}