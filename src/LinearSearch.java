public class LinearSearch {

    public int linearSearch(int[] elements, int target) {
        for (int i = 0; i < elements.length; i++) {
            if ( elements[i] == target) {
                return i;
            }
        }
        return -1;
    }
}