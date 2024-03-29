public class BinarySearch {

    public int search(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == x) {
                return mid;
            }
            if(x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int result = bs.search(new int[]{1,10,20,47,59,65,75,88,99}, 65);
        System.out.println(result);
    }
}
